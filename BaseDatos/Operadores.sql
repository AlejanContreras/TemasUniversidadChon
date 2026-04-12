CREATE DATABASE ejem_operadores;
USE ejem_operadores;
CREATE TABLE personas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT,
    ciudad VARCHAR(50),
    apellido VARCHAR(50)
);
INSERT INTO personas(nombre, edad, ciudad, apellido) VALUES
("Juan", 17, "Bogota", "Perez"),
("Ana", 20, "Bogota", NULL),
("Luis", 25, "Medellin", "Gomez"),
("Sofia", 22, "Cali", "Lopez"),
("Pedro", 30, "Bogota", NULL),
("Maria", 28, "Cali", "Ramirez"),
("Carlos", 19, "Medellin", "Torres");
SELECT * FROM personas;

-- OPERADORES
SELECT * FROM personas Where ciudad IN ("Bogota","Cali");

SELECT * FROM personas WHERE edad BETWEEN 18 AND 25;

-- empienza con A. (obligatorio el %)
SELECT * FROM personas WHERE nombre LIKE "A%";
-- contiene "ar". (obligatiorio los %X%)
SELECT * FROM personas WHERE nombre LIKE "%ar%";

SELECT * FROM personas WHERE apellido IS NULL;


SELECT * FROM personas WHERE ciudad IN ("Bogota", "Medellin") AND edad BETWEEN 18 AND 30;
SELECT * FROM personas WHERE ciudad IN ("Bogota", "Medellin") AND edad BETWEEN 18 AND 30 AND apellido IS NULL;