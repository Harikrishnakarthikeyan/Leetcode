# Write your MySQL query statement below
with cte as (
    select employee_id,salary bonus
from Employees
where employee_id % 2 <> 0 and name not like 'm%'
),
cte2 as 
(
select employees.employee_id, IFNULL(cte.bonus, 0) bonus
 from cte 
right join employees
on employees.employee_id =cte.employee_id
)
select * 
from cte2
order by employee_id;