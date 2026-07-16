-- Last updated: 7/16/2026, 10:17:25 AM
# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;