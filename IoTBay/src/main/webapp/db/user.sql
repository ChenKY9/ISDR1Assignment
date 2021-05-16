drop table users;

create table USERS
(
	ID INTEGER not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	USERNAME VARCHAR(100) not null,
        PASSWORD VARCHAR(100) not null,
	EMAIL VARCHAR(300) not null,
	PHONE VARCHAR(50),
        ROLE VARCHAR(50) DEFAULT 'Customer'
);

insert into USERS (username, password, email, phone, role) values('user1', '123456','user1@test.com', '12345678', 'Customer');
insert into USERS (username, password, email, phone, role) values('user2', '123456','user2@test.com', '12345678', 'Customer');
insert into USERS (username, password, email, phone, role) values('user3', '123456','user3@test.com', '12345678', 'Customer');
insert into USERS (username, password, email, phone, role) values('user4', '123456','user4@test.com', '12345678', 'Customer');
insert into USERS (username, password, email, phone, role) values('user5', '123456','user5@test.com', '12345678', 'Customer');
insert into USERS (username, password, email, phone, role) values('user6', '123456','user6@test.com', '12345678', 'Customer');
insert into USERS (username, password, email, phone, role) values('user7', '123456','user7@test.com', '12345678', 'Customer');
insert into USERS (username, password, email, phone, role) values('user8', '123456','user8@test.com', '12345678', 'Customer');
insert into USERS (username, password, email, phone, role) values('user9', '123456','user9@test.com', '12345678', 'Customer');
insert into USERS (username, password, email, phone, role) values('user10', '123456','user10@test.com', '12345678', 'Customer');
insert into USERS (username, password, email, phone, role) values('user11', '123456','user11@test.com', '12345678', 'Customer');
insert into USERS (username, password, email, phone, role) values('staff1', '123456','staff1@test.com', '8765434567', 'Staff');
insert into USERS (username, password, email, phone, role) values('staff2', '123456','staff2@test.com', '8765434567', 'Staff');
insert into USERS (username, password, email, phone, role) values('staff3', '123456','staff3@test.com', '8765434567', 'Staff');
insert into USERS (username, password, email, phone, role) values('staff4', '123456','staff4@test.com', '8765434567', 'Staff');
insert into USERS (username, password, email, phone, role) values('staff5', '123456','staff5@test.com', '8765434567', 'Staff');
insert into USERS (username, password, email, phone, role) values('staff6', '123456','staff6@test.com', '8765434567', 'Staff');
insert into USERS (username, password, email, phone, role) values('staff7', '123456','staff7@test.com', '8765434567', 'Staff');
insert into USERS (username, password, email, phone, role) values('staff8', '123456','staff8@test.com', '8765434567', 'Staff');
insert into USERS (username, password, email, phone, role) values('staff9', '123456','staff9@test.com', '8765434567', 'Staff');
insert into USERS (username, password, email, phone, role) values('staff10', '123456','staff10@test.com', '8765434567', 'Staff');
insert into USERS (username, password, email, phone, role) values('staff11', '123456','staff11@test.com', '8765434567', 'Staff');
