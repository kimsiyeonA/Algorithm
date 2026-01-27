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

HEADER = "| 사이트 | 레벨 | 🟡 C | 🔵 Java | 🟢 Python | 🟣 JS | 🔴 C++ | 🟤 SQL |\n"
SEPARATOR = "|---|---|---|---|---|---|---|---|\n"

START_MARK = "<!-- LANGUAGE_TRACKER_START -->"
END_MARK = "<!-- LANGUAGE_TRACKER_END -->"

# =========================
# 유틸 함수
# =========================

def detect_site_and_level(path_parts):
    """
    예시 구조:
      백준/Bronze/1000. A+B/1000.c
      프로그래머스/level 0/숫자 비교하기/solution.py
    """
    if not path_parts:
        return None, None

    site = path_parts[0]
    level = "-"

    # 백준
    if site == "백준" and len(path_parts) >= 2:
        level = path_parts[1]

    # 프로그래머스
    elif site == "프로그래머스" and len(path_parts) >= 2:
        level = path_parts[1]

    return site, level

# =========================
# 메인 로직
# =========================

# (site, level) -> { lang -> True }
result = defaultdict(lambda: {k: False for k in LANG_ICONS.keys()})

for root, dirs, files in os.walk("."):
    for file in files:
        ext = os.path.splitext(file)[1].lower()
        if ext not in EXT_TO_LANG:
            continue

        lang = EXT_TO_LANG[ext]

        rel = os.path.relpath(os.path.join(root, file), ".")
        parts = rel.split(os.sep)

        site, level = detect_site_and_level(parts)
        if not site:
            continue
          
        result[(site, level)][lang] = True

# =========================
# 표 생성
# =========================

lines = []
lines.append(HEADER)
lines.append(SEPARATOR)

for (site, level), langs in sorted(result.items()):
    row = [site, level]

    for key in ["c", "java", "py", "js", "cpp", "sql"]:
        if langs[key]:
            row.append(LANG_ICONS[key])
        else:
            row.append("⚪")

    lines.append("| " + " | ".join(row) + " |\n")

new_table = "".join(lines)

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
