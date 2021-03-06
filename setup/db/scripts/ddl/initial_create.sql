PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE reporter(first_name varchar(20),last_name varchar(20),email_id varchar(40) primary key, phone_no varchar(20), login_channel varchar(20), last_updated datetime default current_timestamp);
CREATE TABLE item_primary(item_id integer primary key autoincrement,category varchar(20),sub_category varchar(20),public_description varchar(400),
secret_description varchar(300), item_found_date datetime default current_timestamp, item_reported_date datetime default current_timestamp, street_address varchar(100), lat varchar(20), lng varchar(20),
 loc_type varchar(10), city varchar(50), country varchar(50), state varchar(80),reporter_id varchar(40), colour varchar(100),FOREIGN KEY(reporter_id) REFERENCES reporter(email_id));
create TABLE APP_CONFIG (config_id integer primary key autoincrement, config_type varchar(50), config_parent integer, config_key varchar(50), config_value varchar(50),order_num integer );
COMMIT;


