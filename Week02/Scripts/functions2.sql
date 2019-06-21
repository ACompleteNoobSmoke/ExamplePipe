--Thus far, we've just simply selected everything when we want
--view our tables. That's no fun. We can be very specific about
--how the results of our queries are ordered or displayed...

--This is the "order by" keyword. It orders the results
--of our query by the value of some column. It defaults
--to ascending order.
select * from movie order by movie_name desc;

--We can also use the "like" keyword to use pattern matching
--to find records where certain columns' data matches
--particular patterns.

select * from movie where movie_name like 'A%m%i%e';

--Let's work with some scalar and aggregate functions now.

--A scalar function is a function that mutates the data in
--a column in some way.

select upper(movie_name) from movie;
select lower(movie_name) from movie;

select sqrt(movie_id) from movie;
select cos(movie_id) from movie;
select sin(movie_id) from movie;

select concat(movie_name, ' sucks') from movie;
select concat(movie_name, movie_id) from movie;

--We can also use aggregate functions. These functions take
--all of the values from a column and aggregate that data into
--a single value.

select count(movie_name) from movie where movie_name = 'Break It Ben';

select sum(movie_id) from movie;

select avg(movie_id) from movie;

select stddev(movie_id) from movie;

select max(movie_id) from movie;

select min(movie_id) from movie;

--Let's play around with the "GROUP BY" and "HAVING" keywords.
--"GROUP BY" is used when we want to aggregate some columns'
--data. It will allow you to group your aggregated data by
--some other column's data.

--This query groups the results by movie_genre (which means that the number of rows
--that will be returned will correspond to the number of movie_genres that are
--returned. It also uses a having clause (which is used with group by in order
--to impose conditions on the returned results). This works like a where clause.
select avg(movie_id), movie_genre from movie group by movie_genre having movie_genre > 1;

--Subqueries
--Subqueries are aptly named because they are queries within
--queries. like queryception.

--You'll sometimes see subqueries used with "exists" and "in".

--"EXISTS" vs "IN"
--"Exists" takes a subquery as its argument. This subquery is
--then evaluated, and this evaluation determins whether or not
--your outer query returns any rows.

select * from movie where movie_id > 1 
and exists (select * from movie where movie_id > 1);

--"IN" works slightly differently from exists. "IN" is composed
--of two components:
--an expression (such as a row constructor) and a subquery.
--The lefthand side is evaluated and compared to each row of
--the subquery's result. The result of in is true "if" any
--of the subquery's records matches the left hand side.

--This is called a row constructor. We construct a row that
--we then use to compare all of the records in our subquery.
--Constructing this row DOESN'T insert into our table.

--It's always TRUE or FALSE
select row(4, 'Break It Ben') in (select movie_id, movie_name from movie);