# Write your MySQL query statement below

select  u.user_id,
    round(avg(case when  u.activity_type ='free_trial'then u.activity_duration end),2) as trial_avg_duration,
        round(avg( case when u.activity_type ='paid'then u.activity_duration  end),2) as paid_avg_duration  
from UserActivity u
where u.activity_type IN ('free_trial','paid') 
group by u.user_id
HAVING COUNT(DISTINCT u.activity_type) = 2



