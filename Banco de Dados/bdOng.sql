CREATE DATABASE bdOngEtec
GO

USE bdOngEtec;
CREATE TABLE tbStatusCrianca(
	idStatusCrianca INT PRIMARY KEY IDENTITY(1,1),
	descricaoStatus VARCHAR(30) NOT NULL
	)
CREATE TABLE tbCrianca(
	idCrianca INT PRIMARY KEY IDENTITY(1,1),
	nomeCrianca VARCHAR(60) NOT NULL,
	dtNascCrianca SMALLDATETIME,
	sexoCrianca CHAR(1) NOT NULL,
	idStatusCrianca INT FOREIGN KEY 
		REFERENCES tbStatusCrianca(idStatusCrianca),
		)

CREATE TABLE tbGenitor(
	idGenitor INT PRIMARY KEY IDENTITY(1,1),
	nomeGenitor VARCHAR(60) NOT NULL,
	cpfGenitor VARCHAR(14) NOT NULL,
	)

CREATE TABLE tbfiliacao(
    idfiliacao INT PRIMARY KEY IDENTITY(1,1),
	idCrianca INT FOREIGN KEY 
		REFERENCES tbCrianca(idCrianca),
	idGenitor INT FOREIGN KEY
	    REFERENCES tbGenitor(idGenitor),
	)

CREATE TABLE tbObservacaoCrianca(
	idObservacaoCrianca INT PRIMARY KEY IDENTITY(1,1),
	idCrianca INT FOREIGN KEY 
		REFERENCES tbCrianca(idCrianca),
	dtObservacaoCrianca SMALLDATETIME,
	ObservacaoObservacaoCrianca VARCHAR(200) NOT NULL
	)

CREATE TABLE tbPadrinho(
	idPadrinho INT PRIMARY KEY IDENTITY(1,1),
	nomePadrinho VARCHAR(60) NOT NULL,
	cpfPadrinho VARCHAR(14) NOT NULL,
	)

CREATE TABLE tbAPADRINHAMENTO(
	idApadrinhamento INT PRIMARY KEY IDENTITY(1,1),
	idCrianca INT FOREIGN KEY 
		REFERENCES tbCrianca(idCrianca),
	idPadrinho INT FOREIGN KEY
		REFERENCES tbPadrinho(idPadrinho),
	dtApadrinhamento SMALLDATETIME,
	)

CREATE TABLE tbProntuario(
	idProntuario INT PRIMARY KEY IDENTITY(1,1),
	idCrianca INT FOREIGN KEY 
		REFERENCES tbCrianca(idCrianca),
	descricaoProntuario VARCHAR(200) NOT NULL
	)

CREATE TABLE tbDoenca(
	idDoenca INT PRIMARY KEY IDENTITY(1,1),
	nomeDoenca VARCHAR(30) NOT NULL,
	cidDoenca VARCHAR(10) NOT NULL,
	)

CREATE TABLE tbProntuarioDoenca(
    idProntuarioDoenca INT PRIMARY KEY IDENTITY(1,1),
	idProntuario INT FOREIGN KEY 
		REFERENCES tbProntuario(idProntuario),
	idDoenca INT FOREIGN KEY
	    REFERENCES tbDoenca(idDoenca),
	dataAcometimentoProntuarioDoenca SMALLDATETIME,
	)
