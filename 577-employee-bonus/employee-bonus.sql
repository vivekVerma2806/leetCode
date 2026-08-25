# Write your MySQL query statement below
SELECT name ,bonus
FROM Employee  t1  
LEFT JOIN Bonus t2
ON t1.empID=t2.empId
WHERE t2.bonus<1000
OR t2.bonus IS NULL;