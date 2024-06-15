/*CREATE DATABASE sistemaCastrado;*/
USE sistemaCadastro;

CREATE TABLE cadastroinstutor(
id_cliente int auto_increment primary key not null,
primeironome varchar(25) not null, 
sobrenome varchar(20) not null,
cpf int not null auto_increment,
endereço varchar (30),
telefone varchar(12),
datanascimento date not null,
idade int,
);
