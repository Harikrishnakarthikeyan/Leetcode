# Write your MySQL query statement below
select u.name,Sum(t.amount) as balance
from Users u
join transactions t
on u.account=t.account
group by t.account
having balance>10000;