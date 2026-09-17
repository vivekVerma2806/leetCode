# Write your MySQL query statement below
SELECT r.contest_id, ROUND((COUNT(DISTINCT u.user_id)*100/(SELECT COUNT(*) FROM Users)),2) AS percentage
FROM Users u 
JOIN Register r
ON u.user_id = r.user_id
GROUP BY r.contest_id
ORDER BY percentage DESC ,r.contest_id  ;

#conets ko koun karo kitne hain  
# mujhe count karna hain kitne bar reg_table main  kitne bar aaya hain  / aur ush main kitne diff user ne reg ke hain 
