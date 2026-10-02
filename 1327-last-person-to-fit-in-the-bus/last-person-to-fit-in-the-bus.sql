# Write your MySQL query statement below

SELECT q.person_name
FROM (
     
     SELECT person_name, SUM(weight) OVER (ORDER BY turn ASC) AS total_sum
     FROM Queue    
) q
WHERE total_sum<=1000
ORDER BY total_sum DESC
LIMIT 1;
