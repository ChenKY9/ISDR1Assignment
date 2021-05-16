drop table device;

create table DEVICE
(
	ID INTEGER not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	TYPE VARCHAR(100) not null,
	NAME VARCHAR(200) not null,
	PRICE DOUBLE not null,
	STOCK INTEGER not null default 0
);

insert into device (type, name, price, stock) values('Appliance', 'Smart Light', 119, 100);
insert into device (type, name, price, stock) values('Appliance', 'Smart Fan', 149, 300);
insert into device (type, name, price, stock) values('Appliance', 'Smart Fridge', 499, 300);
insert into device (type, name, price, stock) values('Appliance', 'Smart Washer', 499, 300);
insert into device (type, name, price, stock) values('Appliance', 'Smart Cam', 199, 300);
insert into device (type, name, price, stock) values('Smart Home', 'Smart Lock', 99, 300);
insert into device (type, name, price, stock) values('Smart Home', 'Smart Door', 299, 300);
insert into device (type, name, price, stock) values('Smart Home', 'Smart Curtain', 199, 300);
insert into device (type, name, price, stock) values('Watch', 'iWatch', 619, 300);
insert into device (type, name, price, stock) values('Watch', 'iWatch 2', 799, 300);
insert into device (type, name, price, stock) values('Phone', 'iPhone 12', 1399, 500);
insert into device (type, name, price, stock) values('Phone', 'Galaxy S21', 1199, 200);
insert into device (type, name, price, stock) values('Tablet', 'iPad Air', 799, 300);
insert into device (type, name, price, stock) values('Tablet', 'iPad Pro', 1099, 200);
insert into device (type, name, price, stock) values('Laptop', 'Macbook Air', 1199, 300);
insert into device (type, name, price, stock) values('Laptop', 'Macbook Pro', 1899, 300);
insert into device (type, name, price, stock) values('Router', 'Asus 10000M Router', 199, 200);
insert into device (type, name, price, stock) values('Router', 'Asus 1000M Router', 99, 200);
insert into device (type, name, price, stock) values('Drone', 'DJI', 1599, 100);
insert into device (type, name, price, stock) values('Drone', 'DJI 2', 2299, 25);
insert into device (type, name, price, stock) values('Health', 'Temperature Sensor', 59, 200);
insert into device (type, name, price, stock) values('Health', 'Heartbeat Sensor', 620, 300);



