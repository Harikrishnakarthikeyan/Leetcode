# Write your MySQL query statement below
with cte as(
select distinct Salary  as SecondHighestSalary
from Employee
order by Salary  desc limit 1,1)
Select 
Case 
when count(SecondHighestSalary) > 0 then SecondHighestSalary
else Null
end as SecondHighestSalary
from cte;
