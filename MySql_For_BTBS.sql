
create database busproject;

create table bus(
id int primary key,
ac boolean,
capacity int);

create table booking(
cosname varchar(255),
busno int,
travel_date date 
);

insert into bus values(1,1,2),(2,0,2),(3,1,2);

select * from bus;
select * from booking;

truncate bus;
truncate booking;

