# Write your MySQL query statement below
# find the tweet_id of invalid mtb 15 size se jade ho char 

SELECT tweet_id FROM Tweets
WHERE LENGTH(content)>15;