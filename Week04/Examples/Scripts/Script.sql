--create schema servlets;

set
search_path to servlets;

drop table servlets.genre cascade;
create table
	servlets.genre( genre_id serial primary key,
	genre_name varchar not null);

drop table servlets.movie cascade;
create table
	servlets.movie( movie_id serial primary key,
	title varchar unique not null,
	rating integer,
	url varchar,
	genre_id integer references servlets.genre (genre_id) );

drop table servlets.users cascade;
create table
	servlets.users( user_id serial primary key,
	username varchar not null,
	password varchar not null);

drop table servlets.user_movie_jt cascade;
create table
	servlets.user_movie_jt( user_id integer references servlets.users(user_id),
	movie_id integer references servlets.movie(movie_id) );
	
select * from servlets.movie;

select * from servlets.movie where url = '';

insert into servlets.genre values(0, 'Not Specified');
insert into servlets.genre values(default, 'comedy');
insert into servlets.genre values(default, 'horror');
insert into servlets.genre values(default, 'action');
insert into servlets.genre values(default, 'suspsense');
insert into servlets.genre values(default, 'fantasy');
insert into servlets.genre values(default, 'animated');
insert into servlets.genre values(default, 'sci-fi');

insert into servlets.movie values(default, 'Next Thursday', 9, 'https://m.media-amazon.com/images/M/MV5BZTg4NTkzMDEtM2MzOS00MDE1LWJmYWItYzdiMGRiNTdmZmFkXkEyXkFqcGdeQXVyNjUwNzk3NDc@._V1_.jpg', 1);
insert into servlets.movie values(default, 'Giant Reptile Destroys City. Again.', 10, 'https://m.media-amazon.com/images/M/MV5BOGFjYWNkMTMtMTg1ZC00Y2I4LTg0ZTYtN2ZlMzI4MGQwNzg4XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg', 2);
insert into servlets.movie values(default, 'Star Battles', 6, 'https://upload.wikimedia.org/wikipedia/en/a/a2/Star_Wars_The_Force_Awakens_Theatrical_Poster.jpg', 7);
insert into servlets.movie values(default, 'Jasper the Friendly Spectre', 7, 'https://img.buzzfeed.com/buzzfeed-static/static/2017-10/14/14/asset/buzzfeed-prod-fastlane-03/sub-buzz-9417-1508004015-1.jpg?downsize=700%3A%2A&output-quality=auto&output-format=auto&output-quality=auto&output-format=auto&downsize=360:*', 1);
insert into servlets.movie values(default, 'Drive Cars Really Fast', 2, 'https://upload.wikimedia.org/wikipedia/en/thumb/8/8f/Fast_and_Furious_Poster.jpg/220px-Fast_and_Furious_Poster.jpg', 3);
insert into servlets.movie values(default, 'Elven Creature Becomes Obsessed With Ring', 4, 'https://is3-ssl.mzstatic.com/image/thumb/Video118/v4/49/9e/98/499e9858-b07a-2d70-0966-547c2ab1fefc/pr_source.lsr/268x0w.png', 5);
commit;


insert into servlets.users values(default, 'christina', 'pass');
insert into servlets.users values(default, 'canisha', 'pass2');
insert into servlets.users values(default, 'dashawn', 'pass3');

select * from servlets.users;

select * from servlets.genre;

commit;

select * from users;

select * from user_movie_jt;