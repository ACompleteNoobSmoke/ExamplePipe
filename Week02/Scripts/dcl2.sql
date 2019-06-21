--Let's do some DCL (Data Control Language)

--This is how we create a user and assign that user a password in
--Postgres.

create user chris with password 'pass';

--We can also drop users like this:

drop user chris;

--Now let's GRANT our user some privileges.

grant connect on database postgres to chris;
--Be careful with this. Granting create on a database is
--different from granting create on a schema. Granting create
--on a database allows a user to create a schema whereas
--granting create on a schema allows a user to create tables,
--etc. on that schema.
grant create on database postgres to chris;
grant create on schema public to chris;

grant select, insert, update, delete, trigger on all tables in schema public to chris;
grant all on all tables in schema public to chris; --DON'T DO THIS
revoke all on all tables in schema public from chris; --This revokes all of the privileges a user has

revoke select, insert, update, delete, trigger on all tables in schema public from chris;

commit;

--Interestingly enough, you can't drop a user who owns tables, etc. on
--a schema. If the user owns anything, you must either delete all of
--the objects the user owns, or alter the ownership of those
--objects.

