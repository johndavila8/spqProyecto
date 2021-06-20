# spqProyecto
CREATE DATABASE recuperacionDB;
USE recuperacionDB;
CREATE USER IF NOT EXISTS 'spq'@'localhost' IDENTIFIED BY 'spq';
GRANT ALL ON recuperacionDB.* TO 'spq'@'localhost';
