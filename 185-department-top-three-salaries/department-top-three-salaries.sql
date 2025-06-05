# Write your MySQL query statement below
with tempss as (Select d.name Department, 
e.name Employee, 
e.salary Salary,
dense_rank() over( partition by e.departmentId order by e.salary DESC) as 'ranksa'
from Employee e
Join Department d
on e.departmentId = d.id)

Select ss.Department, 
ss.Employee, 
ss.Salary from tempss ss
where ss.ranksa < 4