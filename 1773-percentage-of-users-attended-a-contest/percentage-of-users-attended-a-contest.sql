# Write your MySQL query statement below
with cte as(
    
    select contest_id,round((count(distinct r.user_id)/cnt.c_user)*100,2) as  percentage
    from Register r,
    (select count(distinct u.user_id) c_user
    from Users u
    )
    as cnt
    group by r.contest_id
    order by percentage desc,contest_id asc
)
select * from cte;