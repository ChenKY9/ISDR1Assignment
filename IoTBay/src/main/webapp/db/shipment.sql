drop table SHIPMENT;

create table SHIPMENT
(
	ID INTEGER not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	ORDERID INTEGER not null,
	NAME VARCHAR(200) not null,
	ADDRESS VARCHAR(200) not null,
	PHONE VARCHAR(200) not null,
        USERID INTEGER not null,
	STATUS VARCHAR(200) not null,
        SHIPMENT_DATE TIMESTAMP not null default current_timestamp
);

insert into SHIPMENT (ORDERID, NAME, ADDRESS,PHONE,USERID, STATUS) values(15, 'Mike', '6 Nancarrow AVE', '12345678', 1,'Pending');