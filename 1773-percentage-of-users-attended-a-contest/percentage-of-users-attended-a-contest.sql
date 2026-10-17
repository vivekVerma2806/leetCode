# Write your MySQL query statement below
# mujhe Users ifd aur Register diya gaya hain kya chaiye 

SELECT r.contest_id ,  ROUND(COUNT(u.user_id)/(
    SELECT  COUNT(DISTINCT t1.user_id) FROM Users t1
)*100 ,2)AS  percentage
FROM Register r JOIN Users u ON r.user_id=u.user_id
GROUP BY r.contest_id ORDER BY percentage DESC , contest_id ASC 
;