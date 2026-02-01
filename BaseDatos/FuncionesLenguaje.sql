CREATE DATABASE funciones_lenguaje;
USE funciones_lenguaje;

CREATE TABLE informacion(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    edad INT,
    fecha_nacimiento DATE,
    carrera TEXT
);
INSERT INTO informacion(nombre, apellido, edad, fecha_nacimiento, carrera)
VALUES ("Alejandro", "Contreras", 18, "2007-11-24", "Ingeniera de software");
SELECT * FROM informacion;
