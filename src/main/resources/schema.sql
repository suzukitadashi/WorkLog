CREATE TABLE reservation (
  id   IDENTITY,
  NAME VARCHAR(50)
);
CREATE TABLE project (
	project_code VARCHAR(20) NOT NULL,
	project_title VARCHAR(100)
);
ALTER TABLE project ADD CONSTRAINT project_pk PRIMARY KEY(project_code);
CREATE TABLE project_item (
	project_code VARCHAR(20) NOT NULL,
	item_code VARCHAR(20) NOT NULL,
	item_title VARCHAR(100) NOT NULL,
	item_status CHAR(1) NOT NULL,
	item_type  CHAR(1) NOT NULL,
	item_owner  VARCHAR(100) NOT NULL
);
ALTER TABLE project_item ADD CONSTRAINT project_item_pk PRIMARY KEY(project_code, item_code);
CREATE TABLE project_item_record (
	project_code VARCHAR(20) NOT NULL,
	item_code VARCHAR(20) NOT NULL,
	work_date DATE,
	user_id VARCHAR(50),
	work_time DECIMAL(2,1)
);
ALTER TABLE project_item_record ADD CONSTRAINT project_item_record_pk PRIMARY KEY(project_code, item_code);
CREATE TABLE users (
	user_id VARCHAR(50) NOT NULL,
	encoded_password VARCHAR(255),
	user_name VARCHAR(100)
);
ALTER TABLE users ADD CONSTRAINT users_pk PRIMARY KEY(user_id);
