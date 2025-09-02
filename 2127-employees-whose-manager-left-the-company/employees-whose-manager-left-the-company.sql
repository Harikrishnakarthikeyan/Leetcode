# Write your MySQL query statement below
select distinct  e1.employee_id 
from Employees e1
where e1.manager_id not in (select employee_id from Employees)  and e1.salary < 30000 
order by employee_id;