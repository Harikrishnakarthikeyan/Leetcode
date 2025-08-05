# Write your MySQL query statement below
select u.name NAME,sum(t.amount) BALANCE 
from Users as u 
join Transactions as t
on u.account = t.account
group by t.account
HAVING BALANCE  > 10000;