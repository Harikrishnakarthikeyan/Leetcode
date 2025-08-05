# Write your MySQL query statement below
SELECT * FROM Users
WHERE REGEXP_LIKE(email, '^[a-zA-Z0-9_]+@[a-zA-Z]+[.]+[com]') 
and right(email,2)='om';