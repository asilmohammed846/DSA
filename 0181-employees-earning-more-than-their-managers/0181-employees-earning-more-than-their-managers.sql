# Write your MySQL query statement belowse
 select  e1.name as Employee
  from Employee e1

  join Employee e2 on e1.managerId = e2.id
   WhERE   e1.salary > e2.salary;
