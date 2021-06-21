# spqProyecto

***BASE DE DATOS:***

  CREATE DATABASE recuperacionDB;
  USE recuperacionDB;
  CREATE USER IF NOT EXISTS 'spq'@'localhost' IDENTIFIED BY 'spq';
  GRANT ALL ON recuperacionDB.* TO 'spq'@'localhost';

**El comando para compilar**:
  *mvn clean compile*
**Los comandos para crear la base de datos:**
  *mvn datanucleus:enhance
  mvn datanucleus:schema-create*
  
**El comando para ejecutar el servidor:**
  *mvn exec:java*
**El comando para ejecutar el cliente:**
  *mvn -Pcliente exec:java*
  

  
