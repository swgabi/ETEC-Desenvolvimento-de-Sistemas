CREATE DATABASE bdLojaSimples
GO

USE bdLojaSimples
GO

--Tabela Cliente
CREATE TABLE tbCliente (
    idCliente INT PRIMARY KEY IDENTITY(1,1)
    ,nomeCliente VARCHAR(60)
    ,telefoneCliente VARCHAR(15)
);

--Tabela Produto
CREATE TABLE tbProduto (
    idProduto INT  PRIMARY KEY IDENTITY(1,1)
    ,nomeProduto VARCHAR(50)
    ,precoProduto MONEY
    ,estoqueAtual INT
);

--Tabela Caixa
CREATE TABLE tbCaixa (
    idCaixa INT PRIMARY KEY IDENTITY(1,1)
    ,dataAbertura DATE
	,horaAbertura TIME
	,valorAbertura MONEY
	,dataFechamento DATE
	,horaFechamento TIME
	,valorFechamento MONEY
);

--Tabela Venda
CREATE TABLE tbVenda (
    idVenda INT PRIMARY KEY IDENTITY(1,1)
    ,dataVenda DATE
    ,valorTotal MONEY
	,idCliente INT FOREIGN KEY (idCliente) REFERENCES tbCliente(idCliente)
	,idCaixa INT FOREIGN KEY REFERENCES tbCaixa(idCaixa)
    
);

--Tabela ItensVenda
CREATE TABLE tbItensVenda(
	idItensVenda INT PRIMARY KEY IDENTITY(1,1)
	,idProduto INT FOREIGN KEY REFERENCES tbProduto(idProduto)
	,idVenda INT FOREIGN KEY REFERENCES tbVenda(idVenda)
);

--Tabela Forma de Pagamento
CREATE TABLE tbFormaPagamento(
	idFormaPagamento INT PRIMARY KEY IDENTITY(1,1)
	,descricaoFormaPagamento VARCHAR(40)
);

--Tabela Parcela
CREATE TABLE tbParcela(
	idParcela INT PRIMARY KEY IDENTITY(1,1)
	,idVenda INT FOREIGN KEY REFERENCES tbVenda(idVEnda)
	,idFormaPagamento INT FOREIGN KEY REFERENCES tbFormaPagamento(idFormaPagamento)
);

-- Dados Cliente --

INSERT INTO tbCliente (nomeCliente,telefoneCliente)
VALUES ('Ricardo Mendes', '1194444-6060');

SELECT * FROM tbCliente;

-- Dados Produto --

INSERT INTO tbProduto (nomeProduto, precoProduto, estoqueAtual)
VALUES ('Notebook Dell Inspiron', '4200.00', '5');

SELECT * FROM tbProduto;

-- Dados Caixa --

INSERT INTO tbCaixa (dataAbertura, horaAbertura, valorAbertura, dataFechamento, horaFechamento, valorFechamento)
VALUES ('2025-11-07', '08:00', '450.00', '2025-11-07', '18:20', '2800.00');

SELECT * FROM tbCaixa;

-- Dados Venda --

INSERT INTO tbVenda (dataVenda, valorTotal, idCliente, idCaixa)
VALUES ('2025-11-06', '129.90', '7', '6');

SELECT * FROM tbVenda;

-- Dados Intens da Venda -- 

INSERT INTO tbItensVenda (idProduto, idVenda)
VALUES ('6', '6');

SELECT * FROM tbItensVenda;

-- Dados Forma de Pagamento --

INSERT INTO tbFormaPagamento (descricaoFormaPagamento)
VALUES ('Vale Presente');

SELECT * FROM tbFormaPagamento;

-- Dados Parcela --

INSERT INTO tbParcela(idVenda, idFormaPagamento)
VALUES ('7', '3');

SELECT * FROM tbParcela;

-- EXERCÍCIOS --

-- 1. O cliente João Silva trocou seu número de telefone. Atualize o campo telefone para '1199000-1111'.

SELECT * FROM tbCliente;

UPDATE tbCliente
SET telefoneCliente = '1199000-1111'
WHERE idCliente = 1

-- 2. O produto “Pendrive 64GB” estava com erro no nome. Corrija para “Pendrive 64GB Sandisk”.

SELECT * FROM tbProduto;

UPDATE tbProduto
SET nomeProduto = 'Pendrive 64GB Sandisk'
WHERE idProduto = 6

-- 3. Remova da tabela tbProduto o produto que nunca foi vendido.

/*	vendidos com certeza: 5, 7, 2, 
	acho que foi vendido (produto + produto): 4 e 6 (id6 + id4 + id4), 1 (id1 + (id4 * 6)
	Sobrou: id 3 */

SELECT * FROM tbProduto;

DELETE FROM tbProduto
WHERE idProduto = 3

-- 4. A loja reajustou o preço de todos os produtos em 5%. Atualize.

/* p * % = r
   r + p = novoP */

UPDATE tbProduto
SET precoProduto = '4410.00'
WHERE  idProduto = 7

SELECT * FROM tbProduto;

-- 5. O produto “Cabo HDMI 2m” recebeu um novo lote. Aumente o estoque em 10 unidades.

UPDATE tbProduto
SET estoqueAtual = '32'
WHERE idProduto = 4

SELECT * FROM tbProduto;

-- 6. Exclua da tabela tbFormaPagamento todas as formas que ainda não aparecem em tbParcela.

-- id5, id6, id7

SELECT * FROM tbFormaPagamento;
SELECT * FROM tbParcela;

DELETE FROM tbFormaPagamento
WHERE idFormaPagamento = 7

-- 7. A venda de id = 3 teve seu pagamento alterado de cartão de crédito para PIX (idFormaPagamento = 4). Faça a devida alteração.

SELECT * FROM tbParcela;

UPDATE tbParcela
SET idFormaPagamento = '4'
WHERE idParcela = 4

-- 8. Na venda de idVenda = 1, o valor total estava errado. Corrija para R$ 350,00.

SELECT * FROM tbVenda;

UPDATE tbVenda
SET valorTotal = '350.00'
WHERE idVenda = 1

-- 9 . O caixa idCaixa = 5 foi fechado 15 minutos mais tarde do que registrado. Atualize horaFechamento para '18:15'.

SELECT * FROM tbCaixa;

UPDATE tbCaixa
SET horaFechamento = '18:15'
WHERE idCaixa = 5

-- 10. Exclua o cliente idCliente = 7, que ainda não realizou nenhuma compra.

SELECT * FROM tbCliente;
SELECT * FROM tbVenda;
SELECT * FROM tbParcela;

DELETE FROM tbParcela
WHERE idParcela = 7

DELETE FROM tbVenda
WHERE idVenda = 7

DELETE FROM tbCliente
WHERE idCliente = 7

-- 11. A venda de idVenda = 2 foi cancelada. Exclua seus itens de venda antes de excluir a própria venda.

SELECT * FROM tbVenda;
SELECT * FROM tbItensVenda;
SELECT * FROM tbParcela;

DELETE FROM tbItensVenda
WHERE idItensVenda = 3

DELETE FROM tbParcela
WHERE idParcela = 2

DELETE FROM tbVenda
WHERE idVenda = 2

-- 12. O caixa aberto em 2025-11-07 foi um teste. Exclua-o da tabela tbCaixa.

SELECT * FROM tbCaixa;

DELETE FROM tbCaixa
WHERE idCaixa = 7

-- 13. Remova todas as parcelas cujas vendas tenham valor superior a R$ 3000,00.

-- id4

SELECT * FROM tbParcela;
SELECT * FROM tbVenda; 

DELETE FROM tbParcela
WHERE idParcela = 4

-- 14. Apague da tabela tbProduto todos os produtos que estão com estoqueAtual = 0.

	/*
		id5 = 17, id7 = 4, id2 = 14
		id6 = 24, id4 = 22, id1 = 19
	*/

SELECT * FROM tbParcela;
SELECT * FROM tbVenda;
SELECT * FROM tbProduto;

-- ACHO que todos os produtos ainda tem estoque

-- 15. Exclua da tabela tbCliente o cliente de nome: Maria Oliveira. 

SELECT * FROM tbCliente;

DELETE FROM tbCliente
WHERE idCliente = 2