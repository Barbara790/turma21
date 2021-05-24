create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
sessao varchar(125) not null,
com_receita boolean,
descricao_sessao varchar(250) not null,
primary key(id)
);

insert into tb_categoria(sessao,descricao_sessao,com_receita) values ("Produtos de beleza","Aqui você encontra tudo para se sentir bem consigo mesmo",false);
insert into tb_categoria(sessao,descricao_sessao,com_receita) values ("Remédios do dia-a-dia","Remédios que não precisam de receita", false);
insert into tb_categoria(sessao,descricao_sessao,com_receita) values("Balcão", "Peça seu remádio com receita aqui", true);
insert into tb_categoria(sessao,descricao_sessao,com_receita) values("Caixa", "Produtos variados", false);

create table  tb_produto(
id bigint auto_increment,
nome_produto varchar(125) not null,
preco_produto decimal(5,2) not null,
marca_produto varchar(125) not null,
tipo_produto varchar(125) not null,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_produto(nome_produto,preco_produto,marca_produto,tipo_produto,categoria_id) values ("Amoxilina",50.00,"Pfiezer","antibiótico",3);
insert into tb_produto(nome_produto,preco_produto,marca_produto,tipo_produto,categoria_id) values ("Shampoo",25.00,"Salon Line","higiene pessoal",1);
insert into tb_produto(nome_produto,preco_produto,marca_produto,tipo_produto,categoria_id) values ("Tilenol",30.00,"Ultrafarma","remédio para dor",2);
insert into tb_produto(nome_produto,preco_produto,marca_produto,tipo_produto,categoria_id) values ("chiclete",2.50,"Trident","doces",4);
insert into tb_produto(nome_produto,preco_produto,marca_produto,tipo_produto,categoria_id) values ("Advil",25.00,"Ultrafarma","remédio para dor",2);
insert into tb_produto(nome_produto,preco_produto,marca_produto,tipo_produto,categoria_id) values ("Mel",15.00,"Mel fo céu","mel",4);
insert into tb_produto(nome_produto,preco_produto,marca_produto,tipo_produto,categoria_id) values ("Condicionador",30.00,"Pantene","higiene pessoal",1);
insert into tb_produto(nome_produto,preco_produto,marca_produto,tipo_produto,categoria_id) values ("Nimesulida",60.00,"Pfiezer","antibiótico",3);

select * from tb_produto where preco_produto>50;
select * from tb_produto where preco_produto between 3 and 60;
select * from tb_produto where nome_produto like "%B%";

select*from tb_produto inner join tb_categoria on tb_produto.id=tb_categoria.id;

select tb_produto.nome_produto,tb_produto.preco_produto
from tb_produto
inner join tb_categoria on  tb_produto.id=tb_categoria.id
where tb_categoria.com_receita=false;
