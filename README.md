# Portal Services

Backend service for the Portal application, providing REST APIs and business logic for managing application data and communicating with the persistence layer.

The project is built with **Spring Boot** and uses **PostgreSQL** as the relational database.

## 🛠️ Tech Stack

* Java 25
* Spring Boot 3.5.7
* Spring Web
* Spring Data JPA
* PostgreSQL
* Maven
* JUnit / Spring Boot Test

---

## 📋 Requirements

Before running the application locally, make sure you have installed:

* **JDK 25**
* **Maven 3.9+**
* **PostgreSQL 15+**
* Git

Check your versions:

```bash
java -version
mvn -version
psql --version
```

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/WojciechKesek/portal-services.git
cd portal-services
```

### 2. Configure PostgreSQL

Create a database and a dedicated user:

```sql
CREATE DATABASE portal_services;

CREATE USER portal_services_user WITH PASSWORD 'portal_services_password';

GRANT ALL PRIVILEGES ON DATABASE portal_services
TO portal_services_user;
```

Connect to the database and grant schema permissions if required:

```sql
\c portal_services

GRANT ALL ON SCHEMA public TO portal_services_user;
```

### 3. Configure the application

Configure the database connection in the application's configuration file, for example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/portal_services
spring.datasource.username=portal_services_user
spring.datasource.password=portal_services_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true
```

For local development it is recommended to keep credentials outside the repository and provide them using environment variables or a local configuration file.

Example:

```bash
export DB_URL=jdbc:postgresql://localhost:5432/portal_services
export DB_USERNAME=portal_services_user
export DB_PASSWORD=portal_services_password
```

> Never commit production credentials, API keys or other secrets to the repository.

---

## ▶️ Running the Application

Build the project:

```bash
mvn clean install
```

Run the application:

```bash
mvn spring-boot:run
```

Alternatively, build and run the generated JAR:

```bash
mvn clean package
java -jar target/*.jar
```

After startup, the application should be available at:

```text
http://localhost:8080
```

The actual port can be changed in the Spring Boot configuration.

---

## 🗄️ Database

The application uses **PostgreSQL** for persistent data storage.

The typical local configuration is:

| Property | Example                    |
| -------- | -------------------------- |
| Host     | `localhost`                |
| Port     | `5432`                     |
| Database | `portal_services`          |
| Username | `portal_services_user`     |
| Password | local development password |

### Database schema

Database entities are managed through Spring Data JPA/Hibernate.

Depending on the active Spring profile and project configuration, schema management can be controlled using:

```properties
spring.jpa.hibernate.ddl-auto=update
```

For production environments, prefer an explicit database migration mechanism rather than relying on automatic schema updates.

---

## 📁 Project Structure

The project follows a standard Spring Boot structure:

```text
portal-services/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ...
│   │   │       ├── controller/       # REST API endpoints
│   │   │       ├── service/          # Business logic
│   │   │       ├── repository/       # Database access
│   │   │       ├── entity/            # JPA entities
│   │   │       ├── dto/               # Data transfer objects
│   │   │       └── config/             # Application configuration
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       └── ...
│   │
│   └── test/
│       └── java/
│           └── ...
│
├── pom.xml
├── .gitignore
└── README.md
```

> The exact package structure may differ depending on the current implementation. The structure above describes the recommended responsibility of each layer.

---

## 🔌 API

The application exposes REST endpoints through Spring Web controllers.

API endpoints are implemented in the controller layer.

### Example endpoint structure

```text
GET    /api/...
GET    /api/{id}
POST   /api/...
PUT    /api/{id}
PATCH  /api/{id}
DELETE /api/{id}
```

### Example request

```bash
curl -X GET \
  http://localhost:8080/api/example \
  -H "Accept: application/json"
```

### Example POST request

```bash
curl -X POST \
  http://localhost:8080/api/example \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Example"
  }'
```

### API documentation

If OpenAPI/Swagger is enabled in the project, the documentation can typically be accessed through:

```text
http://localhost:8080/swagger-ui/index.html
```

OpenAPI JSON:

```text
http://localhost:8080/v3/api-docs
```

> These URLs are available only if the corresponding OpenAPI/Swagger dependency and configuration are present in the application.

---

## 🧪 Testing

Run the complete test suite with:

```bash
mvn test
```

Run tests with a clean build:

```bash
mvn clean test
```

Run a specific test class:

```bash
mvn -Dtest=YourTestClass test
```

For a specific test method:

```bash
mvn -Dtest=YourTestClass#yourTestMethod test
```

### Test types

Tests should cover, where applicable:

* service/business logic,
* REST controllers,
* repository/database access,
* validation,
* error handling,
* integration between application layers.

---

## 🔧 Development

### Recommended workflow

1. Create a feature branch:

```bash
git checkout -b feature/my-feature
```

2. Make your changes.

3. Run the tests:

```bash
mvn clean test
```

4. Verify that the application starts correctly:

```bash
mvn spring-boot:run
```

5. Commit your changes:

```bash
git add .
git commit -m "Add my feature"
```

6. Push the branch:

```bash
git push origin feature/my-feature
```

7. Open a Pull Request.

### Code style

When contributing:

* follow existing project conventions,
* keep controllers focused on HTTP/API concerns,
* keep business logic in services,
* use repositories for persistence operations,
* avoid exposing database entities directly when DTOs are appropriate,
* add tests for new functionality,
* avoid committing secrets or local configuration.

---

## 🤝 Contributing

Contributions are welcome.

Before opening a Pull Request:

* make sure the project builds successfully,
* make sure all tests pass,
* add tests for new functionality where appropriate,
* keep the scope of a PR focused,
* document API or configuration changes,
* do not commit credentials or sensitive configuration.

### Pull Request checklist

* [ ] Code compiles successfully
* [ ] Tests pass
* [ ] New functionality has appropriate tests
* [ ] API changes are documented
* [ ] No secrets or credentials were committed
* [ ] Existing functionality was not unintentionally broken

---

## 🐛 Issues

If you find a bug or have an idea for an improvement, create an issue in the GitHub repository:

https://github.com/WojciechKesek/portal-services/issues

When reporting a bug, include:

* a description of the problem,
* steps to reproduce it,
* expected behavior,
* actual behavior,
* relevant logs or stack traces,
* Java and Maven versions.
