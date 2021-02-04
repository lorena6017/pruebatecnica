# Prueba Técnica
- Fecha: 02/04/21
- Presentado por: Lorena Chaparro

# Instalación de la Base de Datos

1. Iniciar el psql
psql -U postgres

2. Crear la base de datos
CREATE DATABASE pruebadb;

3. Crear el usuario
create user rick with encrypted password 'rick';

4. Dar permisos
grant all privileges on database pruebadb to rick;

5. Correr el seed
resources/static/sql/pruebadb.sql

# Ejecución

Iniciar la APP.

### Punto 1:
http://localhost:8080/episode/1

### Punto 2:
Ver carpeta de recursos 

### Punto 3:
http://localhost:8080/ishappy?numList=82,89
 
### Punto 4:
http://localhost:8080/calc/5

# Nota
Por favor ver las pruebas unitarias

