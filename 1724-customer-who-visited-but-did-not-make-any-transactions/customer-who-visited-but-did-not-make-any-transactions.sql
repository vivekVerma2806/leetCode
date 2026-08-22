# Write your MySQL query statement below
SELECT customer_id,COUNT(*) AS count_no_trans
FROM Visits AS t1 
LEFT JOIN Transactions t2
ON t1.visit_id=t2.visit_id
WHERE t2.visit_id IS NULL

-- Har customer ka alag group banao
GROUP BY customer_id;