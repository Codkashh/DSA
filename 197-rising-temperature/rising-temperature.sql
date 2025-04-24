# Write your MySQL query statement below
SELECT id
FROM Weather W1
WHERE temperature > (
    SELECT temperature
    FROM Weather W2
    WHERE w2.recordDate = DATE_SUB(w1.recordDate, INTERVAL 1 DAY)
)