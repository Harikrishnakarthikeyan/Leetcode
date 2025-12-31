# Write your MySQL query statement below
with count as (
Select count(state) approved_count
  from transactions
   where state like "approved"
   group by country
            
)


Select Date_Format(trans_date,'%Y-%m') as month,
        country,count(state) trans_count,
        sum(case when state ='approved' then 1 
        else 0 
        end) as approved_count,
        sum(amount) as trans_total_amount,
        sum(case when state='approved' then amount else 0 end) as approved_total_amount
        from transactions
        group by month,country;                        