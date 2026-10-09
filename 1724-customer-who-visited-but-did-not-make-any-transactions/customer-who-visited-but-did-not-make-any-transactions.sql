# Write your MySQL query statement below
# Visits hain  aur Transactions hain  mujhe 
SELECT t1.customer_id,COUNT(*) as count_no_trans
FROM Visits t1
WHERE visit_id NOT IN (
    SELECT visit_id
    FROM Transactions 
)
GROUP BY t1.customer_id;