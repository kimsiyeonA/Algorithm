-- 코드를 입력하세요
SELECT RI.`REST_ID`,RI.`REST_NAME`,RI.`FOOD_TYPE`,RI.`FAVORITES`,RI.`ADDRESS`,round(avg(`REVIEW_SCORE`),2) as `SCORE`
from `REST_INFO` as RI
join `REST_REVIEW` as RR
on RI.`REST_ID` = RR.`REST_ID`
where RI.`ADDRESS` like '서울%'
group by RI.`REST_NAME`
order by `SCORE` desc, RI.`FAVORITES`desc