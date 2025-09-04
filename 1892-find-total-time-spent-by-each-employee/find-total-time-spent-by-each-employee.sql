# Write your MySQL query statement below
with cte as(
select event_day as day,emp_id, sum(out_time)-sum(in_time) as total_time
from Employees 
group by event_day,emp_id
)
select * from cte;