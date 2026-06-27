# Write your MySQL query statement below
/* delete   from person
where id not in (
    select id from (
        select min(id) as id
        from person
        group by email
    ) as temp
); */



delete p1 from person p1,person p2 
where p1.email=p2.email and p1.id>p2.id;
