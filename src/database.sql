-- 1. Criar a base de dados (caso não exista) e defini-la para uso
CREATE DATABASE IF NOT EXISTS arenadeobjetos;
USE arenadeobjetos;

DROP TABLE IF EXISTS pessoa;

CREATE TABLE pessoa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    olho VARCHAR(50),
    cabelo VARCHAR(50),
    pele VARCHAR(50),
    sexo BOOLEAN,                    
    armamento VARCHAR(100) NULL,      
    planoDeFuga VARCHAR(100) NULL,    
    pontosDeVida INT NOT NULL         
);

INSERT INTO pessoa (nome, olho, cabelo, pele, sexo, armamento, planoDeFuga, pontosDeVida) 
VALUES ('Arthur', 'Azul', 'Loiro', 'Clara', 1, 'Espada Longa', NULL, 100);

-- Inserir um Ladrão (tem planoDeFuga, armamento é NULL)
INSERT INTO pessoa (nome, olho, cabelo, pele, sexo, armamento, planoDeFuga, pontosDeVida) 
VALUES ('Gatuno', 'Verde', 'Castanho', 'Parda', 1, NULL, 'Bomba de Fumo', 80);

-- Inserir uma Vítima (armamento e planoDeFuga são NULL)
INSERT INTO pessoa (nome, olho, cabelo, pele, sexo, armamento, planoDeFuga, pontosDeVida) 
VALUES ('Aldeão', 'Castanho', 'Preto', 'Escura', 1, NULL, NULL, 50);