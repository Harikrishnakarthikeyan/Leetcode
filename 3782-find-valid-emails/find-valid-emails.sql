select * from Users

WHERE email REGEXP '^[a-zA-Z0-9_]+@[a-zA-Z]+[.]com' and right (email,2) ='om';