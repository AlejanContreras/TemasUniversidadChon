CREATE DATABASE ejem_ddl;
USE ejem_ddl;

-- CREATE
CREATE TABLE personas (
	id INT auto_increment PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT
);

INSERT INTO personas(nombre, edad)
VALUES ("alejan" , 18);

-- ALTER
ALTER TABLE personas
-- agregar campo
ADD apellido VARCHAR(50);
--  modificar columna
ALTER TABLE personas
MODIFY edad INT NOT NULL;

INSERT INTO personas(nombre, edad, apellido)
VALUES ("Juan", 17, "Perez");

-- TRUNCATE
TRUNCATE TABLE personas;


INSERT INTO personas(nombre, edad, apellido)
VALUES ("Luis", 33, "Valencia");


USE ejem_ddl;
CREATE TABLE borrar (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero INT
);
INSERT INTO borrar(numero)
VALUES (24);


-- DROP
DROP TABLE borrar;

-- ver tablas
SHOW TABLES;
-- ver tabla de personas
SELECT * FROM personas;