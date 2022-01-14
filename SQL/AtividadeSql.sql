/* DDL */ 

/* Criação da tabela utilizando o comando 'create table', uso do tipo 'varchar/char' para tipos caracteres 
tipo 'int' para números, tipo 'decimal' para salario e tipo 'bit' para boolean. */

create table tab_ficha_profissional(
id int not null auto_increment,
nome varchar (50) not null,
email varchar (50) not null,
telefone varchar (20) not null,
logradouro varchar (50) not null,
numero int not null,
bairro varchar (30) not null,
cidade varchar (30) not null,
estado char (2) not null,
salario_minimo decimal (15,2) not null,
salario_maximo decimal (15, 2) not null,
estrangeiro bit not null,
primary key(id)
);

-- Alteração da tabela com 'alter table' e 'add' utilizando 'after' para designar posição da nova coluna --

alter table tab_ficha_profissional add profissao varchar (30) not null after estado;

-- Alteração do comprimento do varchar para a coluna email --

alter table tab_ficha_profissional modify column email varchar(100) not null; 

/* DML */

-- Inserindo o primeiro registro, setando o id como número 1 e colocando a opção de profissão vazia com aspas simples --

insert into tab_ficha_profissional 
values 
('1','Dom Barbosa','dom@gmail.com','11942244268','rua b',70,'centro','igaratexas','sp',2000,3000,0);

-- Inserindo demais registros inseridos sem o preenchimento do campo 'profissao' --

insert into tab_ficha_profissional 
values 
(default, 'Debora Bueno','debs@gmail.com','12987897766','rua c', 45,'flow','jacarei','sp','',1800, 3000, 0),
(default, 'Murilo Kaff', 'mull@gmail.com','11988996209','rua d',76,'kappa','limeira','sp','',1500,2000, 0),
(default, 'Ulysses Vince','ull@gmail.com','11956734455','rua h',22,'off','atibaia','sp','',1100,1900,1),
(default, 'Bruno Will','will@gmail.com','12965497655','rua x', 45,'ogg','taubate','sp','',3000,5000, 1),
(default, 'Silvia Olaf', 'olaf@gmail.com','32977659843','rua s',76,'babum','formiga','mg','',7000,9000, 0),
(default, 'Sabrina Iato','iato@gmail.com','51978334906','rua e', 88,'gits','lajeado','rs','',2500,3500, 1),
(default, 'Hillbert Juno', 'juno@gmail.com','12966498066','rua m',32,'core','atibaia','sp','',6000,8000, 0),
(default, 'Carol Trimm','trimm@gmail.com','21989770989','rua u', 41,'mills','meier','rj','',5000,10000, 0),
(default, 'Esdras Indy', 'indy@gmail.com','11955486675','rua o',66,'lapa','sao paulo','sp','',1300,2000, 0);

-- Definição das profissões individualmente, utilizando o id --

update tab_ficha_profissional set profissao = 'dev fullstack jr' where id = 1;
update tab_ficha_profissional set profissao = 'dev jr' where id = 2;
update tab_ficha_profissional set profissao = 'dev jr' where id = 3;
update tab_ficha_profissional set profissao = 'estagiario dev' where id = 4;
update tab_ficha_profissional set profissao = 'dev js pleno' where id = 5;
update tab_ficha_profissional set profissao = 'po' where id = 6;
update tab_ficha_profissional set profissao = 'analista jr' where id = 7;
update tab_ficha_profissional set profissao = 'dev js pleno' where id = 8;
update tab_ficha_profissional set profissao = 'dev java pleno' where id = 9;
update tab_ficha_profissional set profissao = 'qa jr' where id = 10;

-- Verificação do banco da tabela --

select * from tab_ficha_profissional;

-- Exclusão de campos com determinada característica, foi necessário acessar uma configuração do mysql para liberação do delete-- 

delete from tab_ficha_profissional where estrangeiro = 1;

-- Verificação da tabela --

select * from tab_ficha_profissional;

-- Minha configuração inicial era de int para o campo de numero, por isso precisei usar o modify para alterar esse campo para varchar --
-- Alteração dos dados inseridos no id 3 --

alter table tab_ficha_profissional modify
numero varchar (20) not null;

update tab_ficha_profissional
set
logradouro= 'praca da se',
numero= 's/n',
bairro= 'centro',
cidade='sao paulo',
estado='sp'
where id = 3;

/* DQL */

-- Seleção ordenada por nome e profissão utilizando o select, from e order by  --
select nome, email, profissao, salario_minimo, salario_maximo 
from tab_ficha_profissional
order by nome, profissao;

-- Seleção ordenada do maior salário máximo para o menor e profissão --
select nome, email, profissao, salario_minimo, salario_maximo 
from tab_ficha_profissional
order by salario_maximo desc, profissao;

-- Selecionando e concatenando nome e profissão, usando o select e concat
select concat(nome, ' - ',profissao) as nome_profissao from tab_ficha_profissional;

-- Primeira tentativa de seleção das profissões --
select count(profissao) as profissao from tab_ficha_profissional;

-- Após pesquisar, cheguei no resultado esperado de seleção de profissão, mostrando o número de cada uma --
select profissao, count(*) as total_por_profissao
from tab_ficha_profissional group by profissao;

-- Tentando executar o select de menor salario percebi um erro, se eu colocar espaço entre os valores, o resultado fica errado --
select min(salario_minimo) from tab_ficha_profissional;

-- Seleção utilizando 4 condições: nome parecido com: marcos paulo, salario maximo entre 1200 e 2000. --
select * from tab_ficha_profissional
where nome like '%marcos paulo%' and salario_minimo > 1200 and salario_maximo <= 2000 and estado in ('sp','rj','sc');

-- Inclusão de registros para o teste de 4 condições -- 
insert into tab_ficha_profissional 
values 
(default, 'marcos paulo','marcos@gmail.com','11966775566','rua v', 98,'vixxx','jacarei','sp','',1800, 3000, 0),
(default, 'marcos paulo', 'marcao@gmail.com','12966587345','rua l',21,'ottr','caragua','sp','',1900,2000, 1),
(default, 'marcos paulo','mish@gmail.com','11944332277','rua z',99,'galak','tubarao','sc','',1000,1202,0);

select * from tab_ficha_profissional;

select * from tab_ficha_profissional
where nome like '%marcos paulo%' and salario_minimo > 1200 and salario_maximo <= 2000 and estado in ('sp','rj','sc');









































