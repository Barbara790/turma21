create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
numero_classe varchar(250) not null,
qtd_alunos int not null,
nome_alunos varchar(250) not null,
primary key(id)
);

insert into tb_classe(numero_classe,qtd_alunos,nome_alunos) values ("21",34,"José dos Santos");
insert into tb_classe(numero_classe,qtd_alunos,nome_alunos) values ("22",34,"Maria da Silva");
insert into tb_classe(numero_classe,qtd_alunos,nome_alunos) values ("23",34,"Lucas Oliveira");
insert into tb_classe(numero_classe,qtd_alunos,nome_alunos) values ("24",34,"Megan Rapinoe");
insert into tb_classe(numero_classe,qtd_alunos,nome_alunos) values ("25",34,"Sue Bird");

create table tb_personagens(
id bigint auto_increment,
nome_personagem varchar(250) not null,
poder_ataque int not null,
poder_defesa int not null,
qtd_avidas int not null,
classe_id bigint,
primary key(id),
foreign key(classe_id) references tb_classe(id)
);

insert into tb_personagens(nome_personagem,poder_ataque,poder_defesa,qtd_avidas,classe_id) values ("Naruto99",1000,2000,1,1);
insert into tb_personagens(nome_personagem,poder_ataque,poder_defesa,qtd_avidas,classe_id) values ("Gezebel0",2000,4000,3,2);
insert into tb_personagens(nome_personagem,poder_ataque,poder_defesa,qtd_avidas,classe_id) values ("SuperChoque",500,1000,4,3);
insert into tb_personagens(nome_personagem,poder_ataque,poder_defesa,qtd_avidas,classe_id) values ("Superman",400,3000,1,5);
insert into tb_personagens(nome_personagem,poder_ataque,poder_defesa,qtd_avidas,classe_id) values ("MulherMaravilha",4000,2000,0,1);
insert into tb_personagens(nome_personagem,poder_ataque,poder_defesa,qtd_avidas,classe_id) values ("Coringa",5000,300,1,4);
insert into tb_personagens(nome_personagem,poder_ataque,poder_defesa,qtd_avidas,classe_id) values ("SuperMulher",2000,2000,1,2);
insert into tb_personagens(nome_personagem,poder_ataque,poder_defesa,qtd_avidas,classe_id) values ("MulherInvisível",300,100,0,3);

select * from tb_personagens where poder_ataque>2000;
select * from tb_personagens where poder_ataque between 1000 and 2000;
select * from tb_personagens where nome_personagem like "%C%";

select*from tb_personagens inner join tb_classe on tb_personagens.id=tb_classe.id;

update tb_classe
set qtd_alunos=30 where id=2;
update tb_classe
set qtd_alunos=31 where id=1;
update tb_classe
set qtd_alunos=33 where id=4;

select tb_personagens.nome_personagem,tb_personagens.qtd_avidas 
from tb_personagens 
inner join tb_classe on tb_personagens.id=tb_classe.id
where tb_classe.qtd_alunos=34;
