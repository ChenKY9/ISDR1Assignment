drop table access_log;

create table ACCESS_LOG
(
	ID INTEGER not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	USERID INTEGER not null,
	ACCESS_TIME TIMESTAMP not null default current_timestamp
)
