# Write your MySQL query statement below
# <30000 and lft this compay of that manager 

SELECT e.employee_id
FROM Employees e
WHERE e.salary < 30000 AND e.manager_id NOT IN 
 
 (SELECT e.employee_id
 FROM Employees e
 JOIN Employees m
 ON e.employee_id=m.manager_id
 )
 ORDER BY e.employee_id ASC;