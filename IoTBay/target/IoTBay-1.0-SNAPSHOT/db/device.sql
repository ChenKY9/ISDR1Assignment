drop table device;

create table DEVICE
(
	ID INTEGER not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	TYPE VARCHAR(100) not null,
	NAME VARCHAR(200) not null,
	PRICE DOUBLE not null,
	STOCK INTEGER not null default 0
);

insert into device (type, name, price, stock) values('Appliance', 'Smart Light', 120, 100);
insert into device (type, name, price, stock) values('Watch', 'iWatch', 620, 300);
