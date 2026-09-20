# Portal Services

Backend application built with **Java 25 and Spring Boot**, providing a REST API for managing portal data.

The project demonstrates a clean, layered backend architecture with **Spring Web, Spring Data JPA and PostgreSQL**, together with automated tests and environment-based configuration.

## 🚀 Tech Stack

* **Java 25**
* **Spring Boot 3.5.7**
* **Spring Web**
* **Spring Data JPA**
* **Hibernate**
* **PostgreSQL**
* **Maven**
* **JUnit / Spring Boot Test**

## 🏗️ Architecture

The application follows a layered architecture with a clear separation of responsibilities:

```text
src/main/java
├── config
├── controller
├── dto
├── entity
├── repository
└── service
```

### Main layers

* **Controller** — exposes REST API endpoints
* **Service** — contains application and business logic
* **Repository** — handles database access through Spring Data JPA
* **Entity** — represents persisted domain objects
* **DTO** — separates API models from persistence models
* **Config** — application configuration

This structure keeps responsibilities separated and makes the application easier to test and maintain.

## 🔗 REST API

The application exposes REST endpoints for managing portal resources.

The API follows standard REST principles and uses:

* HTTP methods such as `GET`, `POST`, `PUT` and `DELETE`
* JSON request and response bodies
* DTOs for API communication
* HTTP status codes
* Spring MVC

## 🗄️ Database

The application uses **PostgreSQL** as its relational database.

Data access is implemented using:

* Spring Data JPA
* Hibernate
* Repository pattern
* JPA entity mapping

Database configuration is externalized through Spring Boot application properties.

## 🧪 Testing

The project includes automated tests using:

* **JUnit**
* **Spring Boot Test**

The test structure is designed to verify application behaviour while keeping business logic separated from infrastructure concerns.

## ⚙️ Running the Application

### Prerequisites

Make sure you have installed:

* Java 25
* PostgreSQL
* Git

### 1. Clone the repository

```bash
git clone https://github.com/WojciechKesek/portal-services.git
cd portal-services
```

### 2. Configure PostgreSQL

Create a PostgreSQL database and configure the connection in:

```text
src/main/resources/application.properties
```

Set the required database properties:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/<database-name>
spring.datasource.username=<username>
spring.datasource.password=<password>
```

### 3. Run the application

Using Maven:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The application will start using the configured Spring Boot environment.

## 📁 Project Structure

```text
portal-services/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ...
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## 🎯 Project Goals

The main goals of the project are to demonstrate practical backend development with:

* Java and Spring Boot
* REST API design
* Layered application architecture
* Spring Data JPA and Hibernate
* PostgreSQL persistence
* DTO-based API design
* Automated testing
* Clean and maintainable code

## 🔮 Possible Future Improvements

Potential future improvements include:

* Authentication and authorization with Spring Security
* API documentation with OpenAPI / Swagger
* Docker support
* Integration testing with Testcontainers
* Global exception handling
* Improved validation and error responses
* CI/CD pipeline
* Additional observability and monitoring

## 👨‍💻 Author

**Wojciech Kesek**

Java Backend Developer focused on **Java, Spring Boot, REST APIs, microservices, databases and cloud technologies**.

* GitHub: [WojciechKesek](https://github.com/WojciechKesek)
* LinkedIn: [Wojciech Kesek](https://www.linkedin.com/in/wojciech-kesek/)
