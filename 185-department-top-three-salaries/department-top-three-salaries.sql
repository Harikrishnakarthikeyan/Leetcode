# Write your MySQL query statement belo
with cte as (
    select d.name as Department,e.name as Employee ,e.salary as Salary 
    ,dense_rank() over(partition by d.name order by salary desc) as rnk
     from department as d
    join employee as e
    on e.departmentId =d.id
)
     select Department,Employee,Salary from cte 
     where rnk <= 3 ;