drop table PAYMENT;

create table PAYMENT
(
	ID INTEGER not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 10000, INCREMENT BY 1),
	ORDERID INTEGER not null,
	USERID INTEGER not null,
	AMOUNT DOUBLE not null,
	METHOD VARCHAR(100) default 'Credit Card' not null,
	CARD_NUMBER VARCHAR(100) not null,
	CARD_NAME VARCHAR(100) not null,
	CVV VARCHAR(10) not null,
        STATUS VARCHAR(100) not null default 'Pending',
	PAY_DATE TIMESTAMP not null default current_timestamp
);

insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(1, 1, 99.80, 'Credit Card', '54323456543', 'tester', '123');