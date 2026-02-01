/*crear base de datas y usarla para creacion de talbas*/
CREATE DATABASE crear_DB;
USE crear_DB;

/*crear tabla*/
CREATE TABLE personas(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT
);

/*insertar datos*/
INSERT INTO personas(nombre, edad)
VALUES ("Juan", 17),
("Pedro", 22);

/*ver datos*/
SELECT * FROM personas;
