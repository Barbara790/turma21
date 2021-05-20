create database db_rh;
use db_rh;
create table tb_funcionaries(
id bigint(5) auto_increment,
nome varchar(20) not null,
salario decimal(10,2) not null,
idade integer(2),
cargo varchar(20) not null,
primary key (id)
);


ALTER TABLE tb_funcionaries ADD codigo VARCHAR(5) not NULL;

insert into tb_funcionaries(nome,salario,idade,cargo,codigo) values ("Sophia", '15.000', 40, "gerente", "00789");
insert into tb_funcionaries(nome,salario,idade,cargo,codigo) values ("Maria", '2.000', 22, "assistente", "78977");
insert into tb_funcionaries(nome,salario,idade,cargo,codigo) values ("João", '1.000', 20, "estagiário", "98977");
insert into tb_funcionaries(nome,salario,idade,cargo,codigo) values ("Josefa",'700.00', 27, "jovem-aprendiz", "93425");

select salario from tb_funcionaries where salario>2000;
select salario from tb_funcionaries where salario<2000;

update tb_funcionaries
set salario=15000.00 where id=1;
update tb_funcionaries
set salario=2000.00 where id=2;
update tb_funcionaries
set salario=1000.00 where id=3;

select salario from tb_funcionaries where salario>2000;
select salario from tb_funcionaries where salario<2000;




