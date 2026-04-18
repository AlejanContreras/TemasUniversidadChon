CREATE DATABASE ejem_trigger;
USE ejem_trigger;
-- Tabla principal
CREATE TABLE personas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT
);
-- Tabla historial (para guardar cambios)
CREATE TABLE historial (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    accion VARCHAR(50)
);
INSERT INTO personas(nombre, edad) VALUES
("Juan", 20),
("Ana", 25);

SELECT * FROM personas;
SELECT * FROM historial;

-- AFTER INSERT. despues de insertar,nuevo valor
DELIMITER //
	CREATE TRIGGER trg_insert_persona
    AFTER INSERT ON personas 
    FOR EACH ROW 
    BEGIN
		INSERT INTO historial(nombre, accion)
        VALUES (NEW.nombre, "INSERT");
	END //
DELIMITER ;

INSERT INTO personas(nombre, edad)
VALUES("Carlos",30);
SELECT * FROM historial;
SELECT * FROM personas;


-- after delete. despues de eliminar,valor anterior
DELIMITER //
	CREATE TRIGGER trg_delete_persona
    AFTER DELETE ON personas
    FOR EACH ROW
    BEGIN
		INSERT INTO historial(nombre, accion)
        VALUES (OLD.nombre, "DELETE");
	END //
DELIMITER ;

DELETE FROM personas
WHERE id = 1;

SELECT * FROM historial;


-- before update. antes de modificar,nuevo valor
DELIMITER //
	CREATE TRIGGER trg_update_persona
    BEFORE UPDATE ON personas 
    FOR EACH ROW
    BEGIN
		SET NEW.nombre = UPPER(NEW.nombre);
	END //
DELIMITER ;

UPDATE personas SET nombre = "luis" WHERE id = 2;

SELECT * FROM personas;


