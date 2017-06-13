CREATE DATABASE "poo"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;
    
Create table "aluno"
(
	"idaluno" Serial NOT NULL,
	"nome" Varchar(100) NOT NULL,
	"idade" Integer NOT NULL,
	"curso" Varchar(100) NOT NULL,
 primary key ("idtipooperacao")
);    