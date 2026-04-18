CREATE DATABASE bdRecursosHumanos

GO

USE bdRecursosHumanos

CREATE TABLE tbDepartamento(
	idDepartamento INT PRIMARY KEY IDENTITY (1,1),
	nomeDepartamento VARCHAR (50),
);

CREATE TABLE tbFuncionario(
	idFuncionario INT PRIMARY KEY IDENTITY (1,1),
	nomeFuncionario VARCHAR (50),
	cpfFuncionario	VARCHAR (11),
	sexoFuncionario VARCHAR (1),
	dtNascFuncionario DATE,
	salarioFuncionario MONEY,
	idDepartamento INT FOREIGN KEY REFERENCES tbDepartamento (idDepartamento),
);

CREATE TABLE tbDependente (
	idDependente INT PRIMARY KEY IDENTITY (1,1),
	nomeDependente VARCHAR (50),
	dtNascDependente DATE,
	sexoDependente VARCHAR (1),
	idFuncionario INT FOREIGN KEY REFERENCES tbFuncionario (idFuncionario),
);

--Inserts

SELECT * FROM tbDepartamento

INSERT INTO tbDepartamento (nomeDepartamento) 
VALUES	('Recursos Humanos'),
		('Financeiro'),
		('TI'),
		('Marketing'),
		('Vendas'),
		('Logística'),
		('Jurídico'),
		('Produção'),
		('Compras'),
		('Atendimento');

SELECT * FROM tbFuncionario

INSERT INTO tbFuncionario (nomeFuncionario, cpfFuncionario, sexoFuncionario, dtNascFuncionario, salarioFuncionario, idDepartamento) 
VALUES	('Ana Silva', '11111111111', 'F', '1990-05-10', '3500.00', '1'),
		('Carlos Souza', '22222222222', 'M', '1985-03-22', '5000.00', '2'),
		('Mariana Lima', '33333333333', 'F', '1992-07-15', '4200.00', '3'),
		('João Pereira', '44444444444', 'M', '1988-11-30', '4500.00', '4'),
		('Fernanda Alves', '55555555555', 'F', '1995-01-05', '3000.00', '5'),
		('Ricardo Gomes', '66666666666', 'M', '1983-09-17', '5500.00', '6'),
		('Juliana Rocha', '77777777777', 'F', '1991-06-25', '3900.00', '7'),
		('Bruno Martins', '88888888888', 'M', '1987-12-12', '4700.00', '8'),
		('Patrícia Costa', '99999999999', 'F', '1993-04-08', '4100.00', '9'),
		('Lucas Fernandes', '10101010101', 'M', '1996-08-19', '2800.00', '10');

SELECT * FROM tbDependente

INSERT INTO tbDependente (nomeDependente, dtNascDependente, sexoDependente, idFuncionario) 
VALUES	('Pedro Silva', '2015-02-10', 'M', '1'),
		('Laura Souza', '2012-09-18', 'F', '2'),
		('Mateus Lima', '2018-03-25', 'M', '3'),
		('Sofia Pereira', '2016-07-11', 'F', '4'),
		('Gabriel Alves', '2014-01-30', 'M', '5'),
		('Beatriz Gomes', '2017-10-05', 'F', '6'),
		('Rafael Rocha', '2013-06-22', 'M', '7'),
		('Manuela Martins', '2019-12-14', 'F', '8'),
		('Lucas Costa', '2011-08-03', 'M', '9'),
		('Isabela Fernandes', '2020-05-27', 'F', '10');

--Atividade

--O total de dependentes do funcionário de código 01

SELECT COUNT(idFuncionario) 'Total de dependentes' FROM tbDependente;

--A média dos salários agrupados pelo código do departamento excluindo o departamento de código 10

SELECT idDepartamento, AVG(salarioFuncionario) 'Salarios por departamento' FROM tbFuncionario
	WHERE idDepartamento != 10
	GROUP BY idDepartamento

--A soma dos salários do departamento de código 09

SELECT SUM(salarioFuncionario) 'Soma dos salarios' FROM tbFuncionario
	WHERE idDepartamento = 9 


--A quantidade de dependentes do sexo masculino

SELECT COUNT(sexoDependente) 'Dependentes do sexo masculino' FROM tbDependente
	WHERE sexoDependente  = 'M'

--A quantidade de dependentes que nasceram no ano de 2000

SELECT COUNT(dtNascDependente) 'Dependentes que nasceram no ano de 2000' FROM tbDependente
	WHERE YEAR(dtNascDependente)  = 2000

--A quantidade de funcionários do departamento 03

SELECT COUNT(idDepartamento) 'Funcionários no departamento 3' FROM tbFuncionario
	WHERE idDepartamento = 3

--A média dos salários do departamento 02

SELECT AVG(salarioFuncionario) 'Média dos salários no departamento 2' FROM tbFuncionario
	WHERE idDepartamento = 2

--O total de dependentes nascidos em junho que sejam do funcionário 01 ou 02

SELECT COUNT(dtNascDependente) 'Dependentes nascidos em Junho' FROM tbDependente
	WHERE MONTH(dtNascDependente) = 6 AND (idFuncionario = 1 AND idFuncionario = 2)

--O total de dependentes do sexo masculino que tenham nascido antes do ano 2000

SELECT COUNT(sexoDependente) 'Dependentes do sexo masculino nascidos no ano 2000' FROM tbDependente
	WHERE sexoDependente  = 'M' AND YEAR(dtNascDependente) = 2000

--A quantidade de dependentes do sexo feminino e que não sejam do funcionário de código 02

SELECT COUNT(sexoDependente) 'Dependentes do sexo feminino que não são do funcionário 2' FROM tbDependente
	WHERE sexoDependente  = 'F' AND idFuncionario != 2

--A quantidade de dependentes do funcionário de código 3

SELECT COUNT(idFuncionario) 'Dependentes do funcionário 03' FROM tbDependente
	WHERE idFuncionario = 3

--A soma dos salários agrupados pelo código do departamento

SELECT idDepartamento, SUM(salarioFuncionario) 'Soma dos salarios' FROM tbFuncionario
	GROUP BY idDepartamento
	
--A média de salários agrupados pelo código do departamento

SELECT idDepartamento, AVG(salarioFuncionario) 'Soma dos salarios' FROM tbFuncionario
	GROUP BY idDepartamento

--A quantidade de funcionários do departamento de 03

SELECT COUNT(idDepartamento) 'Funcionários no departamento 3' FROM tbFuncionario
	WHERE idDepartamento = 3 --A senhora colocou 2 exercícios iguais (exercício F e N) 

--O nome dos funcionários (em ordem alfabética) e a data de nascimento dos funcionários no formato DD/MM/AAAA

SELECT nomeFuncionario 'Nome', FORMAT(dtNascFuncionario, 'dd/MM/yyyy ') FROM tbFuncionario
	ORDER BY nomeFuncionario

--O maior salário

SELECT MAX(salarioFuncionario) 'Maior salário' FROM tbFuncionario

--O menor salário

SELECT MIN(salarioFuncionario) 'Maior salário' FROM tbFuncionario