/*
SELECT columnas o lo q quiero ver
FROM de q talbas
WHERE condicion o filtrar filas
GROUP BY columna o agrupacion de datos
HAVING condicion o filtrar grupos
ORDER BY ordenar columna 
*/
CREATE DATABASE ejem_clausula;
USE ejem_clausula;
CREATE TABLE personas(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT,
    ciudad VARCHAR(50)
);
INSERT INTO personas(nombre, edad, ciudad) VALUES
("Juan", 17, "Bogota"),
("Ana", 20, "Bogota"),
("Luis", 25, "Medellin"),
("Sofia", 20, "Cali"),
("Pedro", 25, "Bogota"),
("Maria", 30, "Cali"),
("Carlos", 17, "Medellin");

-- CONSULTAS (CLAUSULAS)
SELECT * FROM personas;

SELECT nombre, edad FROM personas;

SELECT * FROM personas
WHERE edad >= 18;

SELECT * FROM personas WHERE edad >= 18
AND ciudad = "Bogota";

SELECT * FROM personas
ORDER BY edad ASC;
-- ASC significa ascendente

SELECT edad, COUNT(*) AS cantidad FROM personas GROUP BY edad;

SELECT edad, COUNT(*) AS cantidad FROM personas GROUP BY edad
HAVING cantidad > 1;

SELECT ciudad, COUNT(*) AS total FROM personas
GROUP BY ciudad
ORDER BY total DESC;
-- DESC significa descendente 