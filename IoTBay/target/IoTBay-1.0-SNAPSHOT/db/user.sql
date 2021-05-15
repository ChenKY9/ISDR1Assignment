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

insert into USERS (username, password, email, phone, role) values('user1', '1111111','user1@test.com', '8765434567', 'Customer');
insert into USERS (username, password, email, phone, role) values('staff1', '1111111','staff1@test.com', '8765434567', 'Staff');
