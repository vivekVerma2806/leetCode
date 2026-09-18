# Write your MySQL query statement below
  SELECT DATE_FORMAT(t.trans_date,'%Y-%m') month ,t.country country,   COUNT(t.state) AS trans_count, SUM(t.state="approved") AS approved_count, SUM(t.amount) AS trans_total_amount,
  SUM(CASE
      WHEN t.state="approved" THEN amount
      ELSE 0
      END
   ) approved_total_amount 
  FROM Transactions t
  GROUP BY DATE_FORMAT(t.trans_date,'%Y-%m'),t.country;