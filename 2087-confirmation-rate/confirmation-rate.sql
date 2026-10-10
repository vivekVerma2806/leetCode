# Write your MySQL query statement below

SELECT t1.user_id,  IFNULL(ROUND (SUM(
    CASE WHEN t2.action="confirmed" THEN 1 ELSE 0 END
) /COUNT(t2.action),2) ,0.00) AS  confirmation_rate
FROM Signups t1 LEFT JOIN Confirmations t2 ON t1.user_id=t2.user_id
GROUP BY t1.user_id;