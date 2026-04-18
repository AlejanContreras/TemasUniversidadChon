CREATE DATABASE ejem_conexionLenguaje_javaPOO;
USE ejem_conexionLenguaje_javaPOO;

-- TABLA USUARIOS
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    tipo VARCHAR(20) NOT NULL  -- admin / lector
);

-- TABLA AUTORES
CREATE TABLE autores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

-- TABLA LIBROS
CREATE TABLE libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    id_autor INT,
    disponible BOOLEAN DEFAULT TRUE,

    FOREIGN KEY (id_autor) REFERENCES autores(id)
);

-- TABLA PRESTAMOS
CREATE TABLE prestamos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    id_libro INT,
    fecha_prestamo DATE,

    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY (id_libro) REFERENCES libros(id)
);

-- datos de prueba desde el sql
INSERT INTO usuarios(nombre, tipo) VALUES
('Juan', 'lector'),
('Admin', 'admin');

INSERT INTO autores(nombre) VALUES
('Gabriel Garcia Marquez'),
('J.K. Rowling');

INSERT INTO libros(titulo, id_autor) VALUES
('Cien Años de Soledad', 1),
('Harry Potter', 2);

SELECT * FROM usuarios;
SELECT * FROM autores;
SELECT * FROM libros;
SELECT * FROM prestamos;


-- ver datos ya despues del insert con java
