# Write your MySQL query statement below
select  distinct actor_id,director_id
from ActorDirector 
group by director_id,actor_id 
having count(director_id = actor_id) > 2;
