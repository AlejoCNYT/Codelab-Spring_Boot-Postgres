# Spring Boot + PostgreSQL Example

This project is a simple REST API built with Spring Boot 3, Spring Data JPA, and PostgreSQL.

## Features
- Create and retrieve users via REST endpoints.
- Persistence with PostgreSQL database.
- Example of DTO, Entity, Repository, Controller, and Exception handling.

## Requirements
- Java 21+ (Corretto or OpenJDK)
- Maven 3.8+
- PostgreSQL 12+
- Git

## Setup

### 1. Clone the repository
```bash
git clone https://github.com/your-username/demo-postgres.git
cd demo-postgres
```

### 2. Configure PostgreSQL
Create a database and user in PostgreSQL:
```sql
CREATE ROLE demo_user WITH LOGIN PASSWORD 'YourPassword123!';
CREATE DATABASE demo_db OWNER demo_user;
GRANT ALL ON SCHEMA public TO demo_user;
```

### 3. Application properties
Edit `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/demo_db
spring.datasource.username=demo_user
spring.datasource.password=YourPassword123!
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### 4. Run the application
#### Windows (PowerShell)
```powershell
./mvnw spring-boot:run
```

#### Linux/macOS (bash/zsh)
```bash
./mvnw spring-boot:run
```

### 5. Test the API
Create a user:
```bash
curl -X POST http://localhost:8080/v1/user   -H "Content-Type: application/json"   -d '{"name":"Ada Lovelace","email":"ada@computing.org"}'
```

Get a user by ID:
```bash
curl http://localhost:8080/v1/user/1
```

---

# Ejemplo Spring Boot + PostgreSQL

Este proyecto es una API REST simple construida con Spring Boot 3, Spring Data JPA y PostgreSQL.

## Características
- Crear y consultar usuarios vía endpoints REST.
- Persistencia con base de datos PostgreSQL.
- Ejemplo de DTO, Entidad, Repositorio, Controlador y Manejo de Excepciones.

## Requisitos
- Java 21+ (Corretto u OpenJDK)
- Maven 3.8+
- PostgreSQL 12+
- Git

## Configuración

### 1. Clonar el repositorio
```bash
git clone https://github.com/tu-usuario/demo-postgres.git
cd demo-postgres
```

### 2. Configurar PostgreSQL
Crear una base de datos y usuario en PostgreSQL:
```sql
CREATE ROLE demo_user WITH LOGIN PASSWORD 'TuClaveSegura123!';
CREATE DATABASE demo_db OWNER demo_user;
GRANT ALL ON SCHEMA public TO demo_user;
```

### 3. Propiedades de la aplicación
Editar `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/demo_db
spring.datasource.username=demo_user
spring.datasource.password=TuClaveSegura123!
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### 4. Ejecutar la aplicación
#### Windows (PowerShell)
```powershell
./mvnw spring-boot:run
```

#### Linux/macOS (bash/zsh)
```bash
./mvnw spring-boot:run
```

### 5. Probar la API
Crear un usuario:
```bash
curl -X POST http://localhost:8080/v1/user   -H "Content-Type: application/json"   -d '{"name":"Ada Lovelace","email":"ada@computing.org"}'
```

Obtener un usuario por ID:
```bash
curl http://localhost:8080/v1/user/1
```
