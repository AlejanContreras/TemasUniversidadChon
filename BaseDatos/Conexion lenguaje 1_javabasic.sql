CREATE DATABASE ejem_conexionLenguaje_javabasic;
USE ejem_conexionLenguaje_javabasic;

CREATE TABLE personas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT
);

-- antes de ejecutar el java
SELECT * FROM personas;
-- todo aparece en null


-- despues de ejecutar el java
SELECT * FROM personas;
-- aparecen los tados correctamente