# Write your MySQL query statement below
select e.name
from employee as e
join employee as em
on e.id=em.managerid
group by e.department,e.Id
having count(em.managerId)>4;