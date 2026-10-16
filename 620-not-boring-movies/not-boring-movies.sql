# Write your MySQL query statement below

SELECT t1.id , t1.movie,t1.description,t1.rating
FROM Cinema t1 
WHERE t1.description <> "boring"  AND id%2=1 ORDER BY t1.rating  DESC;