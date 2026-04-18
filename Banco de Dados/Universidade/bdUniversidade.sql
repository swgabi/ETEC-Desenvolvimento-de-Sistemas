CREATE DATABASE bdUniversidade
GO

USE bdUniversidade;
CREATE TABLE tbCampus(
	idCampus INT PRIMARY KEY IDENTITY(1,1),
	nomeCampus VARCHAR(60) NOT NULL,
	cidadeCampus VARCHAR(60) NOT NULL,
	enderecoCampus VARCHAR(100) NOT NULL,
	estadoCampus CHAR(2) NOT NULL
	)

CREATE TABLE tbCurso(
    idCurso INT PRIMARY KEY IDENTITY(1,1),
	nomeCurso VARCHAR(60) NOT NULL,
	semestreCurso INT NOT NULL,
	idCampus INT FOREIGN KEY 
		REFERENCES tbCampus(idCampus),
	)

CREATE TABLE tbTurma(
	idTurma INT PRIMARY KEY IDENTITY(1,1),
	formacaoTurma VARCHAR(60) NOT NULL,
	numsalaTurma CHAR(2) NOT NULL,
	idCurso INT FOREIGN KEY 
		REFERENCES tbCurso(idCurso),
	idCampus INT FOREIGN KEY 
		REFERENCES tbCampus(idCampus),
	)

CREATE TABLE tbDiciplina(
	idDiciplina INT PRIMARY KEY IDENTITY(1,1),
	nomeDiciplina VARCHAR(60) NOT NULL,
	horaDiciplina INT NOT NULL,
	idCurso INT FOREIGN KEY 
		REFERENCES tbCurso(idCurso),
	)

CREATE TABLE tbProfessor(
    idProfessor INT PRIMARY KEY IDENTITY(1,1),
	nomeProfessor VARCHAR(60) NOT NULL,
	cpfProfessor VARCHAR(14) NOT NULL,
	numProfessor VARCHAR(11) NOT NULL,
	idCampus INT FOREIGN KEY 
		REFERENCES tbCampus(idCampus),
	)

CREATE TABLE tbProfessorDiciplina(
	idProfessorDiciplina INT PRIMARY KEY IDENTITY(1,1),
	idProfessor INT FOREIGN KEY 
		REFERENCES tbProfessor(idProfessor),
	idDiciplina INT FOREIGN KEY 
		REFERENCES tbDiciplina(idDiciplina),
	)

CREATE TABLE tbAluno(
	idAluno INT PRIMARY KEY IDENTITY(1,1),
	nomeAluno VARCHAR(60) NOT NULL,
	enderecoAluno VARCHAR(100) NOT NULL,
	cidadeAluno VARCHAR(60) NOT NULL,
	estadoAluno CHAR(2) NOT NULL,
	dtnascAluno SMALLDATETIME,
	idCurso INT FOREIGN KEY 
		REFERENCES tbCurso(idCurso),
	idTurma INT FOREIGN KEY 
		REFERENCES tbTurma(idTurma),
	)

CREATE TABLE tbMatricula(
	idMatricula INT PRIMARY KEY IDENTITY(1,1),
	idAluno INT FOREIGN KEY 
		REFERENCES tbAluno(idAluno),
	idDiciplina INT FOREIGN KEY 
		REFERENCES tbDiciplina(idDiciplina),
	idTurma INT FOREIGN KEY 
		REFERENCES tbTurma(idTurma),
	dtMatricula SMALLDATETIME,
	)

CREATE TABLE tbDiciplinacurso(
    idDiciplinacurso INT PRIMARY KEY IDENTITY(1,1),
    idDiciplina INT FOREIGN KEY 
		REFERENCES tbDiciplina(idDiciplina),
	idCurso INT FOREIGN KEY 
		REFERENCES tbCurso(idCurso),
	)