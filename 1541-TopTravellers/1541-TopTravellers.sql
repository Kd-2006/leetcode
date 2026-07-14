-- Last updated: 7/14/2026, 3:59:14 PM
# Write your MySQL query statement below
SELECT 
    u.name,
    IFNULL(SUM(r.distance), 0) AS travelled_distance
FROM 
    Users u
LEFT JOIN 
    Rides r ON u.id = r.user_id
GROUP BY 
    u.id, u.name
ORDER BY 
    travelled_distance DESC,
    u.name ASC;