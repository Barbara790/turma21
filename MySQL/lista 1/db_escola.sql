create database db_escola;
use db_escola;

create table tb_alunos(
id bigint auto_increment,
nome varchar(50) not null,
matricula varchar(50) not null,
rg varchar(50) not null,
serie varchar(20) not null,
nota decimal(9,2) not null,
primary key(id)
);

insert into tb_alunos(nome,matricula,rg,serie,nota) values ("Sabrina", "007987", "12.334.355", "5ª série", 7.5);
insert into tb_alunos(nome,matricula,rg,serie,nota) values ("Nneka", "216484", "45.645.547", "8ª série", 5.5);
insert into tb_alunos(nome,matricula,rg,serie,nota) values ("Sue", "468866", "32.567.980", "7ª série", 8.5);
insert into tb_alunos(nome,matricula,rg,serie,nota) values ("Napheesa", "667689", "99.977.000", "4ª série", 10);
insert into tb_alunos(nome,matricula,rg,serie,nota) values ("Stewie", "987955", "70.117.234", "1ª série", 8);


select nota from tb_alunos where nota < 7;
select nota from tb_alunos where nota> 7;

update tb_produtos
set nota=10 where id=5;


