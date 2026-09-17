# Write your MySQL query statement below
SELECT q.query_name ,ROUND(AVG(q.rating/q.position),2)  quality ,
 ROUND(SUM(q.rating<3)*100/ COUNT(*),2) as poor_query_percentage
# yaha par count karna hain  3 se kam koun koun hain then count grup main row kitne hain 
FROM Queries q
GROUP BY q.query_name;