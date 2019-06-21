--Let's start by creating a simple table. This falls under the
--DDL (Data Definition Language) sublanguage.

--This starts a transaction block.
begin transaction;

--I always drop my table before creating it just in case I
--want to run my entire script again to do a hard reset. Note
--that we can use the "cascade" keyword to drop a table that has
--records that are referenced elsewhere.

--There are several different data types available to us in
--Postgres

drop table public.datatypes;
--We can refer tables by using their schema name + the table
--name.
create table public.datatypes(
type_id numeric,
another_num integer,
type_name text,
varchar_guys varchar,
the_date date,
dat_money money,
time_stamp timestamp,
rest json,
true_or_false bool,
binary_data bytea
);

drop table users cascade;
create table users(
--Within these parentheses, we will define all of the table's
--columns (and those columns' data types).
users_id serial primary key, --inline way of creating pks
username text,
pass text
);

drop table public.movie;
create table public.movie(
movie_id serial,
movie_name text unique not null, --references public.genre (genre_id),
movie_genre integer check(movie_genre > 2), --this is now a foreign key
--This names a costraint "movie_pk" and specifies
--what type of constraint it is as well which column
--abides by that constraint
constraint movie_pk primary key (movie_id),
constraint genre_fk foreign key (movie_genre) references public.genre (genre_id)
);

drop table public.genre;
create table public.genre(
genre_id serial,
genre_name text,
constraint genre_pk primary key (genre_id)
);

--Let's so DML to insert things into our tables.

--Double quotes signify column names
insert into public.genre("genre_name") values('the worst type of movie');
insert into public.genre values(default, 'an okay movie', 'djskdajflks');
insert into public.genre values(default, 'good movie');
insert into genre values(default, 'movie of the year');
insert into genre values(default, null);

select * from genre;

insert into movie values(default, 'Best Movie', 8);
insert into movie values(default, 'Break It Ben', 7);
insert into movie values(default, 'American Cake', 3);
insert into movie values(default, 'Apple Express', 4);
insert into movie values(default, 'The Feline King', 5);
insert into movie values(default, 'Bio Brothers', 2);
insert into movie values(default, 'Bad People Wear Prada', 4);
insert into movie values(default, 'I Remember What You Did Last Winter', 1);

select * from movie;

--Let's insert a user(s) into our users table:

insert into users values(default, 'chris', 'pass');
insert into users values(default, 'john wick', 'password');
insert into users values(4, 'sfskl');
insert into users values(default, 'whaddup', 'ayeee!');

--This is how we delete a record from a table.
delete from users where users_id = 2;

--DO NOT DO THIS. It deletes all of the records from the table.
delete from users;

--This is how we retrieve all of the records from our table. Note
--that the "*" indicates that we're selecting all of the columns,
--but we don't have to select all of the columns.
select * from users;

--For example, I can just select 2 columns.
select users_id, pass from users;

--If we want to update a record, we can use the "update"
--keyword. Make sure you use the "where" clause or you'll
--apply this DML to every single record.

update users set pass = 'the password' where users_id = 1;

--This will roll back to any uncommitted changes we've attempted
--to make to our database.
rollback;

--This creates a savepoint that we can roll back to.
savepoint before_my_shenanigans;

commit;
