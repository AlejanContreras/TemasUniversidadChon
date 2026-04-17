CREATE DATABASE ejem_funcionesAgregado;
USE ejem_funcionesAgregado;
CREATE TABLE personas(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT,
    ciudad VARCHAR(50),
    salario INT
);
INSERT INTO personas(nombre, edad, ciudad, salario) VALUES
("Juan", 20, "Bogota", 1000),
("Ana", 25, "Bogota", 1500),
("Luis", 30, "Medellin", 2000),
("Sofia", 22, "Cali", 1200),
("Pedro", 30, "Bogota", 1800),
("Maria", 28, "Cali", 1600),
("Carlos", 25, "Medellin", 1400);


SELECT COUNT(*) AS total_personas FROM personas;

SELECT SUM(salario) AS suma_salarios FROM personas;

SELECT AVG(salario) AS promedio_salario FROM personas;

SELECT MAX(salario) AS salario_min FROM personas;

SELECT MIN(salario) AS salario_min FROM personas;


-- mas completo
SELECT ciudad, COUNT(*) AS total_personas FROM personas
GROUP BY ciudad;

-- completisimo
SELECT ciudad, COUNT(*) AS total,
	SUM(salario) AS total_salario,
	AVG(salario) AS promedio,
    MAX(salario) AS maximo,
    MIN(salario) AS minimo
FROM personas GROUP BY ciudad;