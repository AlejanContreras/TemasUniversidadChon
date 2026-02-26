CREATE DATABASE ejem_dcl;
USE ejem_dcl;

CREATE TABLE personas (
	id INT auto_increment PRIMARY KEY,
    nombre VARCHAR(50)
);

-- crear usuario
CREATE USER "usuario1"@"localhost" IDENTIFIED BY "1234";
CREATE USER "usuario2"@"localhost" IDENTIFIED BY "5678";

-- GRANT
-- solo permiso para consultar
GRANT SELECT ON ejem_dcl.personas TO "usuario1"@"localhost";
GRANT SELECT ON ejem_dcl.personas TO "usuario2"@"localhost";

-- REVOKE
REVOKE SELECT ON ejem_dcl.personas FROM "usuario2"@"localhost";