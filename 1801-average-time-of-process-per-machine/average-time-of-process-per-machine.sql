# Write your MySQL query statement below
SELECT t1.machine_id , ROUND(SUM(
      CASE WHEN activity_type="end" THEN  timestamp
            ELSE -timestamp END) /COUNT(DISTINCT process_id ),3)   processing_time
FROM Activity t1 GROUP BY t1.machine_id;