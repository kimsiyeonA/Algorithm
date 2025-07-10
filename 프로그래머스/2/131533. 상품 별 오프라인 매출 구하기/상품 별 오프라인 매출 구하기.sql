-- 코드를 입력하세요
SELECT r.PRODUCT_CODE, (r.price * sum(o.sales_amount))as SALES 
from `PRODUCT` as r
join `OFFLINE_SALE` as o
on r.PRODUCT_ID	 = o.PRODUCT_ID
group by r.	product_code
order by `SALES` desc, r.`product_code` asc