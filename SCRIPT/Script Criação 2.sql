CREATE TABLE endereco (
  id_endereco INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  numeroCasa INTEGER UNSIGNED NULL,
  bairro VARCHAR(20) NULL,
  cidade VARCHAR(20) NOT NULL,
  uf VARCHAR(20) NOT NULL,
  cep VARCHAR(8) NULL,
  logradouro  VARCHAR(50) NOT NULL,
  PRIMARY KEY(id_endereco)
);

CREATE TABLE produto (
  id_produto INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  descricao VARCHAR(30) NULL,
  quantidadeEstoque INTEGER UNSIGNED NULL,
  valorCompra DECIMAL(3,2) NULL,
  tipo VARCHAR(30) NULL,
  valorVenda DECIMAL(3,2) NULL,
  PRIMARY KEY(id_produto)
);

CREATE TABLE pessoa (
  id_pessoa INTEGER NOT NULL AUTO_INCREMENT,
  endereco_id_endereco INTEGER UNSIGNED NOT NULL,
  nome VARCHAR(40) NOT NULL,
  dataNasc DATE NULL,
  sexo CHAR(1) NULL,
  PRIMARY KEY(id_pessoa),
  INDEX pessoa_FKIndex1(endereco_id_endereco)
);

CREATE TABLE Venda (
  id_venda INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  pessoa_id_pessoa INTEGER NOT NULL,
  dataVenda DATE NULL,
  valor DECIMAL(5,2) NULL,
  PRIMARY KEY(id_venda),
  INDEX notaFiscalVenda_FKIndex1(pessoa_id_pessoa)
);

CREATE TABLE debito (
  Venda_id_venda INTEGER UNSIGNED NOT NULL,
  dataPagamento DATE NOT NULL,
  tipoCartao VARCHAR(20) NOT NULL,
  PRIMARY KEY(Venda_id_venda),
  INDEX debito_FKIndex1(Venda_id_venda)
);

CREATE TABLE credito (
  Venda_id_venda INTEGER UNSIGNED NOT NULL,
  numeroParcela INTEGER UNSIGNED NOT NULL,
  tipoCartao VARCHAR(20) NOT NULL,
  dataVencimento DATE NOT NULL,
  PRIMARY KEY(Venda_id_venda),
  INDEX credito_FKIndex1(Venda_id_venda)
);

CREATE TABLE funcionario (
  pessoa_id_pessoa INTEGER NOT NULL,
  cpf VARCHAR(11) NOT NULL,
  cargo VARCHAR(30) NOT NULL,
  rg VARCHAR(7) NULL,
  dataAdmissao DATE NULL,
  salario DECIMAL(5,2) NULL,
  PRIMARY KEY(pessoa_id_pessoa),
  INDEX funcionario_FKIndex1(pessoa_id_pessoa)
);

CREATE TABLE fornecedor (
  pessoa_id_pessoa INTEGER NOT NULL,
  cnpj VARCHAR(14) NOT NULL,
  PRIMARY KEY(pessoa_id_pessoa),
  INDEX fornecedor_FKIndex1(pessoa_id_pessoa)
);

CREATE TABLE itensV (
  produto_id_produto INTEGER UNSIGNED NOT NULL,
  Venda_id_venda INTEGER UNSIGNED NOT NULL,
  quantidade INTEGER UNSIGNED NOT NULL,
  valorTotalItem DECIMAL(5,2) NULL,
  valorUnitario DECIMAL(3,2) NULL,
  INDEX itensV_FKIndex2(Venda_id_venda),
  INDEX itensV_FKIndex2(produto_id_produto)
);

CREATE TABLE telefone (
  telefone VARCHAR(11) NOT NULL,
  pessoa_id_pessoa INTEGER NOT NULL,
  PRIMARY KEY(telefone, pessoa_id_pessoa),
  INDEX telefone_FKIndex1(pessoa_id_pessoa)
);

CREATE TABLE notaFiscalCompra (
  id_notaFiscalCompra INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  pessoa_id_pessoa INTEGER NOT NULL,
  valor DECIMAL(6,2) NULL,
  hora TIMESTAMP NULL,
  dataEmissao DATE NULL,
  PRIMARY KEY(id_notaFiscalCompra),
  INDEX notaFiscalCompra_FKIndex1(pessoa_id_pessoa)
);

CREATE TABLE itensNF (
  produto_id_produto INTEGER UNSIGNED NOT NULL,
  notaFiscalCompra_id_notaFiscalCompra INTEGER UNSIGNED NOT NULL,
  nome VARCHAR(20) NOT NULL,
  valorUnitario DECIMAL(3,2) NOT NULL,
  valorTotalItens DECIMAL(5,2) NOT NULL,
  quantidade INTEGER UNSIGNED NOT NULL,
  INDEX itensNF_FKIndex1(notaFiscalCompra_id_notaFiscalCompra),
  INDEX itensNF_FKIndex2(produto_id_produto)
);


