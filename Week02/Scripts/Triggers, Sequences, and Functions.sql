--We only made this table so that we could write a sequence
--manually. 
create table movie3(
movie_id integer primary key,
movie_name text);

--Let's first create a sequence. A sequence creates a
--sequence which we can use to keep count, etc. when we
--use the serial data type, it creates a sequence for us
--under the hood.

drop sequence movie_id_seq;
create sequence movie_id_seq
--this specifies that we want our sequence 
--to increase by 1 each time we call it
increment by 1
--this is the minimum value of our 
--sequence -- NOT to be confused with the starting value
minvalue 0
--this is the maximum value of our sequence
maxvalue 5
--this is the value at which our sequence starts
start with 1;

--But the sequence alone isn't exactly useful. We must pair
--it with a function or trigger in order to make use of it
--(or directly call it).

--So let's make a function. In order to make a function, we
--must use what is called "PL/PgSQL", which stands for
--"Procedural Language" or "Postgres Sequential Query
--Language". PL/PgSQL allows us to create functions (also
--known as stored procedures) in PostgreSQL. These functions
--allow us to carry out several operations at once (many of
--these operations would usually take several queries).

--This creates a function that takes no arguments
create or replace function increment_movie_id()
--This is our return statement. This function returns
--a trigger.
returns trigger as

--When we return this trigger, we must return it as a string.
--In order to do so, we must wrap the trigger we're returning
--in "dollar quotes". Dollar quotes provide a way of allowing
--more readable queries that contain strings. This is called
--"dollar quoting", and it is used to write string constants.

--EXAMPLES of how dollar quotes are used:
--$$This is a string.$$
--$Tag Name$This is also a string, but one that has a tag name.$Tag Name$

--One benefit of these dollar quotes is that we can use
--single quotes inside of them.
$$
begin
new.movie_id = nextval('movie_id_seq');
--For inserts and updates, the return type should be "new"
return new;
end;
$$
--We must specify that this function is written in PL/pgSQL
language 'plpgsql';

--Now let's create a trigger! Almost done! 
create trigger movie_id_trigger
--This trigger is triggered each time someone attempts
--to insert a record into the table "movie3"
before insert on movie3
--This specifies that this is triggered for each row that
--is inserted.
for each row
--This calls the function we spent so much time creating.
execute procedure increment_movie_id();

select * from movie3;

insert into movie3 values(6, 'Going home.');

--Because Syed asked, I'll show you how to create a view.
--...on another day. LOL.