# Write your MySQL query statement below
SELECT t1.employee_id, IFNULL((SELECT  e.department_id
FROM Employee e
WHERE  e.employee_id=t1.employee_id AND e.primary_flag="Y"
),t1.department_id) AS department_id
FROM Employee t1 
GROUP BY t1.employee_id 
;