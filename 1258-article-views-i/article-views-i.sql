# Write your MySQL query statement below
  # mujhe id return Assecn oreder main  karna hain  jo aapne atrices ko ak  bar view kiya ho  

  SELECT DISTINCT author_id AS id FROM Views
  WHERE author_id=viewer_id ORDER BY id ASC ;