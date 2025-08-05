# Write your MySQL query statement below
select distinct p.product_id,p.product_name  
from Product as p 
join Sales as s
on p.product_id=s.product_id
group by s.product_id
HAVING MIN(sale_date) >= CAST('2019-01-01' AS DATE) AND
       MAX(sale_date) <= CAST('2019-03-31' AS DATE);