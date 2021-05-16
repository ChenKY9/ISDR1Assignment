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

insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(1, 1, 99.80, 'Credit Card', '123421232133', 'tester1', '100');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(2, 1, 99.80, 'Credit Card', '123421232133', 'tester2', '101');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(3, 1, 99.80, 'Credit Card', '123421232133', 'tester3', '102');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(4, 1, 99.80, 'Credit Card', '123421232133', 'tester4', '103');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(5, 1, 99.80, 'Credit Card', '123421232133', 'tester5', '104');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(6, 1, 99.80, 'Credit Card', '123421232133', 'tester6', '105');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(7, 1, 99.80, 'Credit Card', '123421232133', 'tester7', '106');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(8, 1, 99.80, 'Credit Card', '123421232133', 'tester8', '107');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(9, 1, 99.80, 'Credit Card', '123421232133', 'tester9', '108');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(10, 1, 99.80, 'Credit Card', '123421232133', 'tester10', '109');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(11, 1, 99.80, 'Credit Card', '123421232133', 'tester11', '110');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(12, 1, 99.80, 'Credit Card', '123421232133', 'tester12', '111');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(13, 1, 99.80, 'Credit Card', '123421232133', 'tester13', '112');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(14, 1, 99.80, 'Credit Card', '123421232133', 'tester14', '113');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(15, 1, 99.80, 'Credit Card', '123421232133', 'tester15', '114');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(16, 1, 99.80, 'Credit Card', '123421232133', 'tester16', '115');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(17, 1, 99.80, 'Credit Card', '123421232133', 'tester17', '116');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(18, 1, 99.80, 'Credit Card', '123421232133', 'tester18', '117');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(19, 1, 99.80, 'Credit Card', '123421232133', 'tester19', '118');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(20, 1, 99.80, 'Credit Card', '123421232133', 'tester20', '119');
insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(21, 1, 99.80, 'Credit Card', '123421232133', 'tester21', '120');

