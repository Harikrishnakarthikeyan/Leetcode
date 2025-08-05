select u.name NAME,sum(t.amount) BALANCE from Users as u join Transactions as t
on u.account = t.account group by t.account having BALANCE  > 10000;