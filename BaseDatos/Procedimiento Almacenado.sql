CREATE DATABASE ejem_procedimientoAlmacenado;
USE ejem_procedimientoAlmacenado;
CREATE TABLE personas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT
);
INSERT INTO personas(nombre, edad) VALUES
("Juan", 17),
("Ana", 20),
("Carlos", 25);


-- PROCEDURE BASICO (ver todo)
DELIMITER //
	CREATE PROCEDURE ver_personas()
    BEGIN
		SELECT * FROM personas;
END //
DELIMITER ;

CALL ver_personas();

-- procedure con parametro in
DELIMITER //
	CREATE PROCEDURE buscar_persona(IN nombreBuscado VARCHAR(50))
	BEGIN
		SELECT * FROM personas
		WHERE nombre = nombreBuscado;
	END //
DELIMITER ;

CALL buscar_persona("Juan");

-- procedure con insert
DELIMITER //
	CREATE PROCEDURE insertar_persona(
		IN nombreNuevo VARCHAR(50),
		IN edadNueva INT
	)	
	BEGIN
		INSERT INTO personas(nombre, edad)
		VALUES (nombreNuevo, edadNueva);
	END //

DELIMITER ;

CALL insertar_persona("Luis", 30);


-- procedure con logica (if)
DELIMITER //
	CREATE PROCEDURE verificar_mayoria(IN edadPersona INT)
	BEGIN
		IF edadPersona >= 18 THEN
			SELECT "Es mayor de edad";
		ELSE
			SELECT "Es menor de edad";
		END IF;
	END //
DELIMITER ;
CALL verificar_mayoria(20);


-- procedure con retorno (out)
DELIMITER //
	CREATE PROCEDURE contar_personas(OUT total INT)
 	BEGIN
		SELECT COUNT(*) INTO total
        FROM personas;
	END //
DELIMITER ;

CALL contar_personas(@resultado);
SELECT @resultado;