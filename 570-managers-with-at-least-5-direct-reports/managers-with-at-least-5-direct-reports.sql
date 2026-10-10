# Write your MySQL query statement below

SELECT t1.name
FROM  Employee t1 JOIN Employee t2 ON t1.id=t2.managerId GROUP BY t1.name,t1.id 
HAVING COUNT(t2.managerId)>=5;