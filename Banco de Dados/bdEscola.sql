CREATE DATABASE bdEscola

GO

USE bdEscola

CREATE TABLE tbAluno (
	idAluno INT PRIMARY KEY IDENTITY (1,1),
	nomeAluno VARCHAR (50),
	dtNascAluno DATE,
	rgAluno VARCHAR (12),
	naturalidadeAluno VARCHAR (2),
);

CREATE TABLE tbCurso (
	idCurso INT PRIMARY KEY IDENTITY (1,1),
	nomeCurso VARCHAR (50),
	cargaHoraria VARCHAR (5),
	valorCurso VARCHAR (50),
);


CREATE TABLE tbTurma (
	idTurma INT PRIMARY KEY IDENTITY (1,1),
	nomeTurma VARCHAR (50),
	horarioTurma DATETIME,
	idCurso INT FOREIGN KEY REFERENCES tbCurso (idCurso),
);

CREATE TABLE tbMatricula (
	idMatricula INT PRIMARY KEY IDENTITY (1,1),
	dataMatricula DATETIME,
	idAluno INT FOREIGN KEY REFERENCES tbAluno (idAluno),
	idTurma INT FOREIGN KEY REFERENCES tbTurma (idTurma),
);

-- INSERT DE DADOS 

SELECT * FROM tbCurso

INSERT INTO tbCurso (nomeCurso, cargaHoraria, valorCurso)
	VALUES ('Inglês', '2000', '356.00'),
		   ('Alemâo', '3000', '478.00');

SELECT * FROM tbAluno

INSERT INTO tbAluno (nomeAluno, dtNascAluno, rgAluno, naturalidadeAluno)
	VALUES ('Paulo Santos', '03/10/2000', '82.292.122-0', 'SP'),
		   ('Maria da Glória', '10/03/1999', '45.233.123-0', 'SP'),
		   ('Perla Nogueira Silva', '04/04/1998', '23.533.211-9', 'SP'),
		   ('Gilson Barros Silva', '09/09/1995', '34.221.111-x', 'PE'),
		   ('Mariana Barbosa Santos', '10/10/2010', '54.222.122-9', 'RJ');

SELECT * FROM tbTurma

INSERT INTO tbTurma (nomeTurma, horarioTurma, idCurso)
	VALUES ('1|A', '01/01/1900 12:00:00', '1'),
		   ('1|B', '01/01/1900 18:00:00', '1'),
		   ('1AA', '01/01/1900 19:00:00', '1');

SELECT * FROM tbMatricula

INSERT INTO tbMatricula(dataMatricula, idAluno, idTurma)
	VALUES ('10/03/2015', '1', '1'),
		   ('05/04/2014', '2', '1'),
		   ('05/03/2012', '3', '2'),
		   ('03/03/2016', '1', '3'),
		   ('05/07/2015', '4', '2'),
		   ('07/05/2015', '4', '3'),
		   ('06/06/2015', '5', '1'),
		   ('05/05/2015', '5', '3');


--Listar o nome, rg e data de aniversário dos alunos nascidos em SP

SELECT nomeAluno, rgAluno, dtNascAluno FROM tbAluno
	WHERE naturalidadeAluno = 'SP';

--Listar o nome e o rg dos alunos com o nome começado com P

SELECT nomeAluno, rgAluno FROM tbAluno
	WHERE nomeAluno like 'P%';

--Listar o nome dos cursos cuja carga horária seja superior a 2000 horas

SELECT nomeCurso FROM tbCurso
	WHERE cargaHoraria = '2000';

--Listar o nome e o rg de todos os alunos que possuem o sobrenome Silva

SELECT nomeAluno, rgAluno FROM tbAluno
	WHERE nomeAluno like '%Silva';

--Listar o nome dos alunos e a data de nascimento que fazem aniversário em março

SELECT nomeAluno, dtNascAluno FROM tbAluno
	WHERE MONTH (dtNascAluno) = 3;

--Listar o código dos alunos e a data de matrícula dos alunos matriculados em maio de qualquer ano

SELECT idAluno, dataMatricula FROM tbMatricula
	WHERE MONTH (dataMatricula) = 5;

--Listar o código dos alunos matriculados no curso de inglês

SELECT idAluno FROM tbMatricula
	WHERE idAluno = 1 OR idAluno = 2;

--Listar o código dos alunos matriculados na turma 1AA

SELECT idAluno FROM tbMatricula
	WHERE idAluno = 1 OR idAluno = 2;

--Listar todos os dados de todos os alunos

SELECT * FROM tbAluno

--Listar todos os dados de todas as turmas

SELECT * FROM tbTurma