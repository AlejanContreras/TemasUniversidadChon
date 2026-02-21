CREATE DATABASE ejem_dml;
USE ejem_dml;

CREATE TABLE personas (
	id INT auto_increment PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT,
    apellido VARCHAR(50)
);

-- INSERT
INSERT INTO personas(nombre, edad, apellido)
VALUES ("alejan" , 18, "contreras");
INSERT INTO personas(nombre, edad, apellido)
VALUES ("juan" , 17, "perez");

-- SELECT
SELECT * FROM personas;
-- ver solo ciertas columnas
SELECT nombre, edad FROM personas;
-- condicion
SELECT * FROM personas
WHERE edad >= 18;

-- UPDATE
UPDATE personas
SET edad = 18
WHERE nombre = "juan";

SELECT * FROM personas;


-- DELETE
DELETE FROM personas
WHERE nombre = "juan";

SELECT * FROM personas;