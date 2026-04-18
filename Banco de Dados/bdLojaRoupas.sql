CREATE DATABASE bdLojaRoupas

GO

USE bdLojaRoupas

CREATE TABLE tbCliente (
	idCliente INT PRIMARY KEY IDENTITY (1,1),
	nomeCliente VARCHAR (50) NOT NULL,
	idadeCliente INT NOT NULL,
);

CREATE TABLE tbVendedor (
	idVendedor INT PRIMARY KEY IDENTITY (1,1),
	nomeVendedor VARCHAR (50) NOT NULL,
);

CREATE TABLE tbFabricante (
	idFabricante INT PRIMARY KEY IDENTITY (1,1),
	nomeFabricante VARCHAR (50) NOT NULL,
);

CREATE TABLE tbFuncionario (
	idFuncionario INT PRIMARY KEY IDENTITY (1,1),
	nomeFuncionario VARCHAR (50) NOT NULL,
	idadeFuncionario VARCHAR (50) NOT NULL,
	dtAdimissaoFuncionario DATE NOT NULL,
	salarioFuncionario VARCHAR (50),
);

CREATE TABLE tbVenda (
	idVenda INT PRIMARY KEY IDENTITY (1,1),
	dtVenda DATE,
	totalVenda INT,
	idCliente INT FOREIGN KEY REFERENCES tbCliente (idCliente),
);