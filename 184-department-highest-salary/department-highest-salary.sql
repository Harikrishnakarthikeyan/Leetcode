# Write your MySQL query statement below
with cte as (
    select d.name as Department,e.name as Employee,
    e.salary as salary,dense_rank() over(partition by d.name order by salary desc) as rnk
    from Employee  as e
    join Department as d 
    on e.departmentId =d.id
)
select Department,Employee,salary
from cte 
where rnk<=1;