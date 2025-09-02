# Write your MySQL query statement below
select eu.unique_id,
em.name
from EmployeeUNI eu
right join Employees em
on eu.id=em.id;