# Write your MySQL query statement below

SELECT t1.query_name,ROUND(SUM(t1.rating/t1.position)/COUNT(*) ,2)AS quality,ROUND( SUM( CASE 
    WHEN t1.rating <3 THEN 1 ELSE 0 END
 ) /COUNT(*)*100 ,2)
AS poor_query_percentage
FROM Queries t1 
GROUP BY query_name;