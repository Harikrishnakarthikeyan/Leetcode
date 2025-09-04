# Write your MySQL query statement below
select distinct num ConsecutiveNums 
from 
(select 
num,  
lead(num,1) over() num1,
lead(num,2) over() num2
from Logs) as tmp 
where (num = num1) and (num = num2);