--DROP DATABASE bdEstoque
--GO

CREATE DATABASE bdEstoque

GO

USE bdEstoque;

CREATE TABLE tbCliente (
	idCliente INT PRIMARY KEY IDENTITY (1,1),
	nomeCliente VARCHAR (50) NOT NULL, 
	cpfCliente VARCHAR (11) UNIQUE, 
	emailCliente VARCHAR (100),
	sexoCliente CHAR (1),
	datNascCliente DATETIME, 
);

CREATE TABLE tbFabricante (
	idFabricante INT PRIMARY KEY IDENTITY (1,1),
	nomeFabricante VARCHAR (50),
);

CREATE TABLE tbFornecedor (
	idFornecedor INT PRIMARY KEY IDENTITY (1,1),
	nomeFornecedor VARCHAR (50),
	contatoFornecedor VARCHAR (100),
);


CREATE TABLE tbProduto (
	idProduto INT PRIMARY KEY IDENTITY (1,1),
	descProduto VARCHAR (100),
	valorProduto DECIMAL (10,2),
	quantProduto VARCHAR (50),
	idFabricante INT FOREIGN KEY REFERENCES tbFabricante (idFabricante),
	idFornecedor INT FOREIGN KEY REFERENCES tbFornecedor (idFornecedor),
);

CREATE TABLE tbVenda (
	idVenda INT PRIMARY KEY IDENTITY (1,1),
	dataVenda DATETIME,
	valorTotalVenda DECIMAL (10,2),
	idCliente INT FOREIGN KEY REFERENCES tbCliente (idCliente),
);

CREATE TABLE tbItensVenda (
	idItensVenda INT PRIMARY KEY IDENTITY (1,1),
	quantItensVenda VARCHAR (50),
	subTotalItensVenda DECIMAL (10,2),
	idVenda INT FOREIGN KEY REFERENCES tbVenda (idVenda),
	idProduto INT FOREIGN KEY REFERENCES tbProduto (idproduto),
);

--INSERT

SELECT * FROM tbCliente;

INSERT INTO tbCliente (nomeCliente, cpfCliente, emailCliente, sexoCliente, datNascCliente)
	VALUES ('Sheila Carvalho Leal', '45678909823', 'scarvalho@ig.com.br', 'f', '13/09/1978'),
		   ('Carlos Henrique Souza', '76598278299', 'chenrique@ig.com.br', 'm', '08/09/1981'),
		   ('Maria Aparecida Souza', '87365309899', 'mapdasouza@outlook.com', 'f', '07/07/1962'),
		   ('Adriana Nogueira Silva', '76354309388', 'drica1977@ig.com.br', 'F', '09/04/1987'),
		   ('Paulo Henrique Silva', '87390123111', 'phsilva80@hotmail.com', 'm', '02/02/1987');

SELECT * FROM tbFabricante

INSERT INTO tbFabricante(nomeFabricante)
	VALUES
		('Unilever'),
		('P&G'),
		('Bunge');

SELECT * FROM tbFornecedor

INSERT INTO tbFornecedor(nomeFornecedor, contatoFornecedor)
	VALUES
		('Atacadão', 'Carlos Santos'),
		('Assaí', 'Maria Stella'),
		('Roldão', 'Paulo Cesar');

SELECT * FROM tbProduto

INSERT INTO tbProduto(descProduto, valorProduto,quantProduto, idFabricante, idFornecedor)
	VALUES
	    ('Amaciante Downy', '5.76', '1500', '2', '1'),
		('Amaciante Confort', '5.45', '2300', '1', '1'),
		('Sabão em pó OMO', '5.99', '1280', '1', '2'),
		('Margarina Qualy', '4.76', '2500', '3', '1'),
		('Salsicha Hot Dog Sadia', '6.78', '2900', '3', '2'),
		('Mortadela Perdigão', '2.50', '1200', '3', '3'),
		('Hamburger Sadia', '9.89', '1600', '3', '1'),
		('Fralda Pampes', '5.89', '340', '2', '3'),
		('Xampu Seda', '5.89', '800', '1', '2'),
		('Condicionador Seda', '6.50', '700', '1', '3');

SELECT * FROM tbVenda

INSERT INTO tbVenda(dataVenda, valorTotalVenda, idCliente)
	VALUES
		('01/02/2014', '4500.00', '1'),
		('03/02/2014', '3400.00', '1'),
		('10/02/2014', '2100.00', '2'),
		('15/02/2014', '2700.00', '3'),
		('17/03/2014', '560.00', '3'),
		('09/04/2014', '1200.00', '4'),
		('07/05/2014', '3500.00', '5'),
		('07/05/2014', '3400.00', '1'),
		('05/05/2014', '4000.00', '2');

SELECT * FROM tbItensVenda

INSERT INTO tbItensVenda(quantItensVenda, subTotalItensVenda, idVenda, idProduto)
	VALUES
		('200', '1500.00', '1', '1'),
		('300', '3000.00', '1', '2'),
		('120', '1400.00', '2', '4'),
		('200', '1000.00', '2', '2'),
		('130', '1000.00', '2', '3'),
		('200', '2100.00', '3', '5'),
		('120', '1000.00', '4', '4'),
		('450', '700.00', '4', '5'),
		('200', '560.00', '5', '5'),
		('200', '600.00', '6', '7'),
		('300', '600.00', '6', '6');

