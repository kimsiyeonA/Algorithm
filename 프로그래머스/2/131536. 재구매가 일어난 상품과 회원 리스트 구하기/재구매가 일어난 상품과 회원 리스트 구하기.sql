-- 코드를 입력하세요
SELECT `user_id`, `product_id` from `ONLINE_SALE`
group by `user_id`,`product_id`
having count(`sales_amount`) > 1
order by `user_id`,`product_id` desc