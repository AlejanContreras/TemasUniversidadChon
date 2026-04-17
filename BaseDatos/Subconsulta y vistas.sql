CREATE DATABASE ejem_subconsulta_Y_vistas;
USE ejem_subconsulta_Y_vistas;
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50)
);
CREATE TABLE libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(50)
);
CREATE TABLE prestamos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT,
    libro_id INT
);
INSERT INTO usuarios(nombre) VALUES
("Juan"), ("Ana"), ("Carlos");
INSERT INTO libros(titulo) VALUES
("SQL"), ("Java"), ("Python");
INSERT INTO prestamos(usuario_id, libro_id) VALUES
(1,1),
(1,2),
(2,3);

-- SUBCONSULTA
-- usuarios con prestamos
SELECT nombre FROM usuarios
WHERE id IN(
		SELECT usuario_id FROM prestamos
);

-- VISTA O VIEW
-- crear vista
CREATE VIEW vista_prestamos AS SELECT u.nombre, l.titulo FROM usuarios u
INNER JOIN prestamos p ON u.id = p.usuario_id
INNER JOIN libros l ON p.libro_id = l.id;
-- usar vista
SELECT * FROM vista_prestamos;

-- subconsulta + view
SELECT nombre FROM vista_prestamos
WHERE nombre IN(
	SELECT nombre FROM vista_prestamos
);

-- subconsulta + join
SELECT u.nombre, l.titulo FROM usuarios u
INNER JOIN prestamos p ON u.id = p.usuario_id
INNER JOIN libros l ON p.libro_id = l.id
WHERE u.id IN (
	SELECT usuario_id FROM prestamos
);