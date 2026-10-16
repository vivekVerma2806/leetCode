# Write your MySQL query statement below

SELECT t1.customer_id,COUNT(t1.visit_id) AS count_no_trans
FROM Visits t1
WHERE t1.visit_id NOT IN  (
    SELECT t2.visit_id 
    FROM Transactions t2 
) 
GROUP BY t1.customer_id