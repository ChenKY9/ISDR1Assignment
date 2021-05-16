drop table orders;

create table ORDERS
(
	ID INTEGER not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
       
        DEVICEID INTEGER not null,
	DEVICENAME VARCHAR(200) not null,
	PRICE DOUBLE not null,
	QUANTITY INTEGER not null,
        NAME VARCHAR(200) not null,
        ADDRESS VARCHAR(200) not null,
        PHONE VARCHAR(200) not null,
        USERID INTEGER not null,
        STATUS VARCHAR(200) not null
);

insert into ORDERS (DEVICEID, DEVICENAME, PRICE, QUANTITY, NAME, ADDRESS,PHONE, USERID,STATUS) values(5, 'laptop',120.0, 1, 'Mike', '6 Nancarrow AVE', '12345678', 1,'Pending');
