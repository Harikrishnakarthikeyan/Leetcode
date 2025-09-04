# Write your MySQL query statement below
with cte as (
select max(salary) as SecondHighestSalary
from employee
where salary < (select max(salary) as SecondHighestSalary
from employee)

)
select * from cte;