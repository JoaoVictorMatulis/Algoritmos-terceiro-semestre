create database mydb;
use mydb;
create table aluno (
   id int primary key auto_increment,
   nome varchar(40) not null
);
insert into aluno (nome) VALUES("Gilson Nascimento"), ("Jonas Perreira"),("Thomas Souza"),("Leandro Filho"),("João Victor");
select * from aluno;