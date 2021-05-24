create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
sessao varchar(125) not null,
descricao_sessao varchar(250) not null,
em_estoque boolean,
primary key(id)
);

insert into tb_categoria(sessao,descricao_sessao,em_estoque) values ("Aves","Um cardápio diversificado de aves",false);
insert into tb_categoria(sessao,descricao_sessao,em_estoque) values ("Carne de porco","O melhor da carne de porco para você", true);
insert into tb_categoria(sessao,descricao_sessao,em_estoque) values("Carne de boi", "Os melhores cortes", true);
insert into tb_categoria(sessao,descricao_sessao,em_estoque) values("Outros", "Não encontrou o que estava procurando nas outras sessões? Vem pra cá", false);


create table  tb_produto(
id bigint auto_increment,
nome_produto varchar(125) not null,
preco_produto decimal(5,2) not null,
marca_produto varchar(125) not null,
qtda_produto decimal(5,2) not null,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_produto(nome_produto,preco_produto,marca_produto,qtda_produto ,categoria_id) values ("Coxa de frango",60.00,"Friboi",4.5,1);
insert into tb_produto(nome_produto,preco_produto,marca_produto,qtda_produto ,categoria_id) values ("Figado",25.00,"Friboi",1.5,3);
insert into tb_produto(nome_produto,preco_produto,marca_produto,qtda_produto ,categoria_id) values ("Linguça",30.00,"Sadia",2,2);
insert into tb_produto(nome_produto,preco_produto,marca_produto,qtda_produto ,categoria_id) values ("Costela de porco",50.00,"Friboi",3,2);
insert into tb_produto(nome_produto,preco_produto,marca_produto,qtda_produto ,categoria_id) values ("Asa de frango", 40.00,"Sadia",4,1);
insert into tb_produto(nome_produto,preco_produto,marca_produto,qtda_produto ,categoria_id) values ("Coração",30.00,"Friboi",2,1);
insert into tb_produto(nome_produto,preco_produto,marca_produto,qtda_produto ,categoria_id) values ("Picanha",80.00,"Friboi",5,3);
insert into tb_produto(nome_produto,preco_produto,marca_produto,qtda_produto ,categoria_id) values ("Maminha",60.00,"Friboi",5,3);

select * from tb_produto where preco_produto>50;
select * from tb_produto where preco_produto between 3 and 60;
select * from tb_produto where nome_produto like "%C%";

select*from tb_produto inner join tb_categoria on tb_produto.id=tb_categoria.id;

select tb_produto.nome_produto,tb_produto.preco_produto
from tb_produto
inner join tb_categoria on  tb_produto.id=tb_categoria.id
where tb_categoria.sessao= "Aves";
