CREATE DATABASE ejem_tcl;
USE ejem_tcl;

CREATE TABLE cuentas (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    saldo INT
);
INSERT INTO cuentas(nombre, saldo)
VALUES ("Juan", 1000),
("pedro", 500);
SELECT * FROM cuentas;

-- inicio transacion o uso del tcl
START TRANSACTION;

-- juan pierde 200
UPDATE cuentas
SET saldo = saldo - 200
WHERE id = 1;

SELECT * FROM cuentas;
-- savepoint
SAVEPOINT punto1;

-- pedro gana 200
UPDATE cuentas
SET saldo = saldo + 200
WHERE id = 2;

SELECT * FROM cuentas;
-- savepoint
SAVEPOINT punto2;

-- error simulado
UPDATE cuentas
SET saldo = saldo -1000
WHERE id = 2;

SELECT * FROM cuentas;

-- volver al punto 2 o deshacer erro
ROLLBACK TO punto2;

SELECT * FROM cuentas;

-- guardar
COMMIT;

SELECT * FROM cuentas;