import os
import re
from collections import defaultdict

LANG_MAP = {
    ".c": "C",
    ".java": "Java",
    ".py": "Python",
    ".js": "JS",
    ".cpp": "C++"
}

# (site, level, problem) -> {lang: True}
results = defaultdict(lambda: defaultdict(bool))

def scan_baekjoon(root):
    # 구조: 백준 / Bronze / 1000. A+B / 1000.c
    for level in os.listdir(root):
        level_path = os.path.join(root, level)
        if not os.path.isdir(level_path):
            continue

        for problem in os.listdir(level_path):
            prob_path = os.path.join(level_path, problem)
            if not os.path.isdir(prob_path):
                continue

            for f in os.listdir(prob_path):
                name, ext = os.path.splitext(f)
                if ext in LANG_MAP:
                    lang = LANG_MAP[ext]
                    results[("백준", level, problem)][lang] = True


def scan_programmers(root):
    # 구조: 프로그래머스 / level 0 / 숫자 비교하기 / solution.java
    for level in os.listdir(root):
        level_path = os.path.join(root, level)
        if not os.path.isdir(level_path):
            continue

        for problem in os.listdir(level_path):
            prob_path = os.path.join(level_path, problem)
            if not os.path.isdir(prob_path):
                continue

            for f in os.listdir(prob_path):
                name, ext = os.path.splitext(f)
                if ext in LANG_MAP:
                    lang = LANG_MAP[ext]
                    results[("프로그래머스", level, problem)][lang] = True


# 스캔 실행
if os.path.exists("백준"):
    scan_baekjoon("백준")

if os.path.exists("Baekjoon"):
    scan_baekjoon("Baekjoon")

if os.path.exists("프로그래머스"):
    scan_programmers("프로그래머스")


# 표 생성
lines = []
lines.append("## 🧠 Algorithm Language Tracker (by Site & Level)\n")
lines.append("| 사이트 | 레벨 | 문제 | 🟡 C | 🔵 Java | 🟢 Python | 🟣 JS | 🔴 C++ |")
lines.append("|--------|------|------|------|---------|-----------|-------|--------|")

for (site, level, problem), langs in sorted(results.items()):
    row = [
        site,
        level,
        problem,
        "✅" if langs.get("C") else "❌",
        "✅" if langs.get("Java") else "❌",
        "✅" if langs.get("Python") else "❌",
        "✅" if langs.get("JS") else "❌",
        "✅" if langs.get("C++") else "❌",
    ]
    lines.append("| " + " | ".join(row) + " |")

table = "\n".join(lines)

# README 자동 영역 덮어쓰기
with open("README.md", "r", encoding="utf-8") as f:
    content = f.read()

start = "<!-- LANGUAGE_TRACKER_START -->"
end = "<!-- LANGUAGE_TRACKER_END -->"

new_block = start + "\n\n" + table + "\n\n" + end

content = re.sub(
    start + ".*?" + end,
    new_block,
    content,
    flags=re.DOTALL
)

with open("README.md", "w", encoding="utf-8") as f:
    f.write(content)

print("✅ Language tracker updated (grouped by site & level)")
