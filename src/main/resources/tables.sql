drop table if exists roles;
create table roles (
id serial primary key,
name varchar(255));

drop table if exists users;
create table users (
id serial primary key,
login varchar(255),
password varchar(255),
role_id int references roles(id));

drop table if exists questions;
create table questions (
id serial primary key,
question text);

drop table if exists answers;
create table answers (
id serial primary key,
question_id int,
answer text,
is_correct int);