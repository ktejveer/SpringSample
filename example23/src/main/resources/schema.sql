create table contact_msg(
    contact_id int auto_increment primary key,
    name varchar(100) not null,
    mobile_num varchar(10) not null,
    email varchar(100) not null,
    subject varchar(100) not null,
    message varchar(100) not null,
    status varchar(20) not null,
    created_at timestamp not null,
    created_by varchar(50) not null,
    updated_at timestamp default null,
    update_by varchar(50) default null
);

