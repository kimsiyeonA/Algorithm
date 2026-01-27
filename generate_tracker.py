#!/usr/bin/env python3
import os
from collections import defaultdict

# =========================
# 설정 영역
# =========================

LANG_ICONS = {
    "c": "🟡",
    "java": "🔵",
    "py": "🟢",
    "js": "🟣",
    "cpp": "🔴",
    "sql": "🟤",
}

EXT_TO_LANG = {
    ".c": "c",
    ".java": "java",
    ".py": "py",
    ".js": "js",
    ".cpp": "cpp",
    ".cc": "cpp",
    ".cxx": "cpp",
    ".sql": "sql",
}

START_MARK = "<!-- LANGUAGE_TRACKER_START -->"
END_MARK = "<!-- LANGUAGE_TRACKER_END -->"

# =========================
# 유틸 함수
# =========================

def extract_title(folder_name):
    # "120583. 중복된 숫자 개수" → "중복된 숫자 개수"
    if "." in folder_name:
        return folder_name.split(".", 1)[1].strip()
    return folder_name.strip()

def detect_info(path_parts):
    """
    구조:
    Algorithm/프로그래머스/0/120583. 중복된 숫자 개수/중복된 숫자 개수.java
    """
    if len(path_parts) < 5:
        return None, None, None

    # path_parts[0] = Algorithm
    site = path_parts[1]
    level = path_parts[2]
    title_folder = path_parts[3]

    title = extract_title(title_folder)

    return site, level, title

# =========================
# 메인 로직
# =========================

# (site, level) -> list of { title, langs }
groups = defaultdict(list)

for root, dirs, files in os.walk("."):
    for file in files:
        ext = os.path.splitext(file)[1].lower()
        if ext not in EXT_TO_LANG:
            continue

        lang = EXT_TO_LANG[ext]

        rel = os.path.relpath(os.path.join(root, file), ".")
        parts = rel.split(os.sep)

        site, level, title = detect_info(parts)
        if not site:
            continue

        # 같은 문제 찾기
        found = None
        for item in groups[(site, level)]:
            if item["title"] == title:
                found = item
                break

        if not found:
            found = {
                "title": title,
                "langs": {k: False for k in LANG_ICONS.keys()}
            }
            groups[(site, level)].append(found)

        found["langs"][lang] = True

# =========================
# HTML 테이블 생성
# =========================

html = []
html.append("<table>\n")
html.append("<tr>")
headers = ["사이트", "레벨", "문제", "🟡 C", "🔵 Java", "🟢 Python", "🟣 JS", "🔴 C++", "🟤 SQL"]
for h in headers:
    html.append(f'<th style="font-size:12px">{h}</th>')
html.append("</tr>\n")

for (site, level), problems in sorted(groups.items()):
    problems = sorted(problems, key=lambda x: x["title"])
    rowspan = len(problems)

    for i, prob in enumerate(problems):
        html.append("<tr>")

        # 첫 줄에만 사이트 / 레벨 출력
        if i == 0:
            html.append(f'<td rowspan="{rowspan}" style="font-size:12px">{site}</td>')
            html.append(f'<td rowspan="{rowspan}" style="font-size:12px">{level}</td>')

        # 문제 제목 (8px)
        html.append(f'<td style="font-size:8px">{prob["title"]}</td>')

        # 언어 컬럼
        for key in ["c", "java", "py", "js", "cpp", "sql"]:
            if prob["langs"][key]:
                html.append(f'<td style="font-size:12px">{LANG_ICONS[key]}</td>')
            else:
                html.append(f'<td style="font-size:12px"></td>')

        html.append("</tr>\n")

html.append("</table>\n")

new_table = "".join(html)

# =========================
# README 갱신
# =========================

with open("README.md", "r", encoding="utf-8") as f:
    readme = f.read()

if START_MARK not in readme or END_MARK not in readme:
    print("Tracker markers not found in README.md")
    exit(1)

before = readme.split(START_MARK)[0]
after = readme.split(END_MARK)[1]

new_readme = before + START_MARK + "\n" + new_table + END_MARK + after

with open("README.md", "w", encoding="utf-8") as f:
    f.write(new_readme)

print("Language tracker updated successfully!")
