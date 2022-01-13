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
