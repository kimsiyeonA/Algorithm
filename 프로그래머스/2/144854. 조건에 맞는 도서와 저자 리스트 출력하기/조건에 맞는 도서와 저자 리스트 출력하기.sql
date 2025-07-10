-- 코드를 입력하세요
SELECT `BOOK_ID`,`AUTHOR_NAME`,date_format(`PUBLISHED_DATE`,"%Y-%m-%d") as `PUBLISHED_DATE`
from `BOOK` as B
join `AUTHOR` as A
on B.`AUTHOR_ID` = A.`AUTHOR_ID`
where `CATEGORY` = '경제'	
order by `PUBLISHED_DATE`