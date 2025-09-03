SELECT *
FROM Users
WHERE mail REGEXP '^[A-Za-z][A-Za-z0-9._-]*@leetcode\\.com$'
  AND SUBSTRING_INDEX(mail, '@', -1) = BINARY 'leetcode.com';