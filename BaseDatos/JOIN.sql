CREATE DATABASE ejem_join;
USE ejem_join;
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
CREATE TABLE multas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT,
    valor INT
);
INSERT INTO usuarios(nombre) VALUES
("Juan"),
("Ana"),
("Carlos"),
("Sofia");
INSERT INTO libros(titulo) VALUES
("SQL"),
("Java"),
("Python");
INSERT INTO prestamos(usuario_id, libro_id) VALUES
(1,1),
(1,2),
(2,3);
INSERT INTO multas(usuario_id, valor) VALUES
(1,100),
(3,200);

-- unir tabla usuarios con prestamos
SELECT u.nombre, p.libro_id
FROM usuarios u
INNER JOIN prestamos p
ON u.id = p.usuario_id;

-- inner join con 3 tablas
SELECT u.nombre, l.titulo
FROM usuarios u
INNER JOIN prestamos p ON u.id = p.usuario_id
INNER JOIN libros l ON p.libro_id = l.id;

-- left join
SELECT u.nombre, p.libro_id
FROM usuarios u
LEFT JOIN prestamos p
ON u.id = p.usuario_id;

-- left join con libros
SELECT u.nombre, l.titulo
FROM usuarios u
LEFT JOIN prestamos p ON u.id = p.usuario_id
LEFT JOIN libros l ON p.libro_id = l.id;

-- left con multas
SELECT u.nombre, m.valor
FROM usuarios u
LEFT JOIN multas m
ON u.id = m.usuario_id;

-- inner con multas
SELECT u.nombre, m.valor
FROM usuarios u
INNER JOIN multas m
ON u.id = m.usuario_id;