-- Last updated: 7/14/2026, 4:00:50 PM
SELECT 
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;