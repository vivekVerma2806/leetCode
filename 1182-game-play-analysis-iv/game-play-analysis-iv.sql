# Write your MySQL query statement below
# combination of col with unique value play_id and event_date
# hame dekhna hain  kitne id hain  hain id ko ak grp bana lo aur ush grp main jake 
#jake dekhe ke congtive hain  ke nhi 

SELECT ROUND((COUNT(DISTINCT player_id))/(SELECT COUNT(DISTINCT player_id) FROM Activity ),2) AS fraction
FROM Activity 
WHERE ( player_id , DATE_SUB(event_date,INTERVAL 1  DAY ))
IN
(
SELECT player_id ,MIN(event_date) as first_login
FROM  Activity a
GROUP BY player_id
);

