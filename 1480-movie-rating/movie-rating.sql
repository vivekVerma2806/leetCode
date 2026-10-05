# Write your MySQL query statement below
(
SELECT u.name  AS results
FROM Users u INNER JOIN MovieRating r 
ON u.user_id = r.user_id
GROUP BY u.name
ORDER BY COUNT(r.rating) DESC, u.name ASC LIMIT 1)

UNION ALL 
(
SELECT m.title AS results
FROM Movies m INNER JOIN MovieRating r
ON m.movie_id=r.movie_id
WHERE MONTH(created_at)=02 AND YEAR(created_at)=2020
GROUP BY m.title
ORDER BY AVG(r.rating) DESC ,m.title ASC LIMIT 1)

