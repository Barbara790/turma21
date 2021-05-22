create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
avaliacoes_ifood int not null,
descricao_ifood varchar(100) not null,
qtd_pizzas_cardapio varchar(100) not null,
primary key(id)
);

insert into tb_categoria(avaliacoes_ifood,descricao_ifood,qtd_pizzas_cardapio) values (5,"a melhor pizza","55");
insert into tb_categoria(avaliacoes_ifood,descricao_ifood,qtd_pizzas_cardapio) values (3,"a melhor pizza","55");
insert into tb_categoria(avaliacoes_ifood,descricao_ifood,qtd_pizzas_cardapio) values (2,"a melhor pizza","55");
insert into tb_categoria(avaliacoes_ifood,descricao_ifood,qtd_pizzas_cardapio) values (4,"a melhor pizza","55");
insert into tb_categoria(avaliacoes_ifood,descricao_ifood,qtd_pizzas_cardapio) values (3,"a melhor pizza","55");

create table tb_pizza(
id bigint auto_increment,
sabor varchar(125) not null,
preco decimal(3,2) not null,
com_borda boolean not null,
tamanho varchar(50),
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

Alter table tb_pizza change column preco preco decimal(5,2) not null;

insert into tb_pizza(sabor,preco,com_borda,tamanho,categoria_id) values ("Quatro queijos",55.00,true,"medio",1);
insert into tb_pizza(sabor,preco,com_borda,tamanho,categoria_id) values ("Mussarela",35.00,false,"grande",2);
insert into tb_pizza(sabor,preco,com_borda,tamanho,categoria_id) values ("Calabresa",35.00,true,"medio",3);
insert into tb_pizza(sabor,preco,com_borda,tamanho,categoria_id) values ("Milho",30.00,true,"medio",4);
insert into tb_pizza(sabor,preco,com_borda,tamanho,categoria_id) values ("Brigadeiro",55.00,true,"brotinho",5);
insert into tb_pizza(sabor,preco,com_borda,tamanho,categoria_id) values ("Palmnito",45.00,false,"grande",1);
insert into tb_pizza(sabor,preco,com_borda,tamanho,categoria_id) values ("Carne",25.00,false,"pequena",2);
insert into tb_pizza(sabor,preco,com_borda,tamanho,categoria_id) values ("Carne Seca",45.00,true,"grande",5);

select * from tb_pizza where preco>45;
select * from tb_pizza where preco between 29 and 60;
select * from tb_pizza where sabor like "%C%";

select*from tb_pizza inner join tb_categoria on tb_pizza.id=tb_categoria.id;

select tb_pizza.sabor,tb_pizza.tamanho
from tb_pizza 
inner join tb_categoria on tb_pizza.id=tb_categoria.id
where tb_categoria.avaliacoes_ifood=5;