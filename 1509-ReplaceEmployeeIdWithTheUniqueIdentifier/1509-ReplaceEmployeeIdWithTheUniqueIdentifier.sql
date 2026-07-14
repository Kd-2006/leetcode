-- Last updated: 7/14/2026, 3:59:17 PM
SELECT euni.unique_id, e.name 
FROM Employees e  
LEFT JOIN EmployeeUNI euni  
ON e.id = euni.id;