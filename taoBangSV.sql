create table Student (
	id serial not NULL primary key,
	first_name varchar[50] not NULL,
	last_name varchar[50] not NULL,
	dob DATE not NULL,
	gpa float not NULL
)

INSERT INTO student (first_name, last_name, dob, gpa)
VALUES 
('Tran Kim', 'Hoang', '2003-10-17', 9.8),
('Não Nữ Thái', 'Minh', '2003-6-30', 9),
('Lê Trung', 'Cường', '2003-8-18', 8.5);


	