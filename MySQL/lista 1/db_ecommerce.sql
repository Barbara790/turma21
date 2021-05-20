create database db_ecommerce;
use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
nome varchar(50),
preco decimal(10,2),
marca varchar(20),
loja varchar(20),
codigo varchar (10),
primary key(id)
);


insert into tb_produtos(nome,preco,marca,loja,codigo) values ("Video-game", 5000.00, "Xbox", "SOS", "07.898.96");
insert into tb_produtos(nome,preco,marca,loja,codigo) values ("Televisão", 7000.00, "LG", "SOS", "23.898.55");
insert into tb_produtos(nome,preco,marca,loja,codigo) values ("Celular", 1000.00, "Motorola", "SOS", "43.567.06");
insert into tb_produtos(nome,preco,marca,loja,codigo) values ("Urso de pelúcia", 100.00, "Brinquedinhos", "SOS", "33.347.85");
insert into tb_produtos(nome,preco,marca,loja,codigo) values ("Panela de pressão", 499.00, "Tramontina", "SOS", "01.227.56");
insert into tb_produtos(nome,preco,marca,loja,codigo) values ("Xícara", 29.00, "Artesanias S.A", "SOS", "11.237.76");

select preco from tb_produtos where preco < 500;
select preco from tb_produtos where preco>500;

update tb_produtos
set preco=700.00 where id=5;

select preco from tb_produtos where preco < 500;










