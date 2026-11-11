# Spring Framework & Spring Boot Labs

A hands-on collection of Java backend development projects documenting my journey from **Spring Framework fundamentals to building database-driven applications with Spring Boot**.

This repository contains nine independent learning modules covering Spring Core, Inversion of Control (IoC), Dependency Injection (DI), Java configuration, Spring Boot, RESTful APIs, CRUD operations, JPA, Hibernate, MySQL, and frontend-backend integration.

Rather than focusing only on theory, each module translates concepts into practical implementations, progressively building an understanding of how modern Java backend applications are designed and developed.

---

## Learning Roadmap

The modules are organized in the order of learning and implementation.

| No. | Module | Concepts & Implementation | Status |
|---|---|---|---|
| 01 | `spring-core-xml-config` | Spring IoC container, Dependency Injection and XML-based bean configuration | Completed |
| 02 | `java-boilerplate-with-lombok` | Lombok annotations, constructors, getters, setters and boilerplate reduction | Completed |
| 03 | `spring-core-java-config` | Java-based configuration, `@Configuration`, `@Bean` and Dependency Injection | Completed |
| 04 | `spring-boot-fundamentals` | Spring Boot application lifecycle, startup, IoC and auto-configuration | Completed |
| 05 | `spring-boot-rest-api` | REST API fundamentals, HTTP requests, controllers and layered architecture | Completed |
| 06 | `spring-boot-rest-crud` | CRUD operations and HTTP methods: GET, POST, PUT and DELETE | Completed |
| 07 | `spring-boot-jpa-hibernate-crud` | Spring Data JPA, Hibernate, MySQL and database persistence | Completed |
| 08 | `spring-boot-frontend-integration` | Connecting HTML, CSS and JavaScript frontends with Spring Boot REST APIs | Completed |
| 09 | `course-registration-system` | Full-stack Course Registration System using Spring Boot, Spring Data JPA, MySQL and frontend technologies | In Progress |

---

## Technical Stack

### Backend Development
- Java
- Spring Framework
- Spring Boot
- Spring Core
- Spring Web
- Spring Data JPA
- Hibernate ORM
- RESTful API development
- Lombok

### Database
- MySQL
- SQL
- Database integration and persistence
- Object-Relational Mapping (ORM)

### Frontend
- HTML5
- CSS3
- JavaScript
- HTTP communication with backend REST APIs

### Development Tools
- IntelliJ IDEA
- Apache Maven
- Maven Wrapper
- Git
- GitHub

---

## Core Concepts Practised

### 1. Spring Framework Fundamentals
- Inversion of Control (IoC)
- Dependency Injection (DI)
- Spring Beans and the IoC container
- XML-based configuration
- Java-based configuration
- `ApplicationContext`
- `@Configuration` and `@Bean`

### 2. Spring Boot Development
- Spring Boot project structure
- `@SpringBootApplication`
- Application startup using `SpringApplication.run()`
- Auto-configuration
- Dependency management with Maven
- Building and running Spring Boot applications

### 3. REST API Development
- HTTP request and response handling
- REST controllers and request mappings
- GET, POST, PUT and DELETE operations
- Request parameters and request handling
- Separation of controller and service responsibilities
- Layered application architecture

### 4. Database Integration
- Relational database connectivity
- Spring Data JPA
- Hibernate ORM
- Entity mapping
- Repository interfaces
- CRUD operations with persistent storage
- MySQL integration

### 5. Frontend and Backend Integration
- Connecting browser-based interfaces to REST APIs
- HTML forms and JavaScript
- Sending HTTP requests to backend endpoints
- Handling API responses
- Integrating frontend operations with backend CRUD functionality

---

## Architecture & Development Approach

The repository progresses from fundamental Spring concepts to practical backend application development.

For REST API modules, the application follows a layered structure:

```text
Client / Frontend
       |
       v
   Controller
       |
       v
    Service
       |
       v
  Repository
       |
       v
    Database
```

Each layer has a distinct responsibility:

- **Controller:** Handles incoming HTTP requests and responses.
- **Service:** Contains application and business logic.
- **Repository:** Handles database operations.
- **Database:** Stores persistent application data.

The structure helps maintain separation of concerns and makes backend applications easier to understand, maintain and extend.

---

## Repository Structure

Each numbered module is maintained as an independent project within one Git repository.

```text
spring-backend-labs/
│
├── 01 - spring-core-xml-config/
├── 02 - java-boilerplate-with-lombok/
├── 03 - spring-core-java-config/
├── 04 - spring-boot-fundamentals/
├── 05 - spring-boot-rest-api/
├── 06 - spring-boot-rest-crud/
├── 07 - spring-boot-jpa-hibernate-crud/
├── 08 - spring-boot-frontend-integration/
├── 09 - course-registration-system/
│
├── .gitignore
└── README.md
```

Each module focuses on a specific concept or implementation milestone. Maven configuration and dependencies are maintained independently wherever applicable.

---

## Running the Projects

### Prerequisites

- Java Development Kit (JDK) compatible with the selected module.
- IntelliJ IDEA or another Java IDE.
- MySQL for modules that require database connectivity.
- Git for cloning the repository.

### Clone the Repository

```bash
git clone https://github.com/iamHaneef/spring-backend-labs.git

cd spring-backend-labs
```

### Run a Maven Project

Navigate into the required module:

**Windows PowerShell**

```powershell
cd "09 - course-registration-system"

.\mvnw.cmd spring-boot:run
```

**macOS / Linux**

```bash
cd "09 - course-registration-system"

./mvnw spring-boot:run
```

Alternatively, open the selected module in IntelliJ IDEA, import its `pom.xml` as a Maven project, and run its Spring Boot application class.

Note: Not every module is a Spring Boot application. Use the appropriate entry point and Maven lifecycle goals for each project.

---

## Configuration & Security

Projects requiring a database connection must be configured with the appropriate local database settings.

Before running those projects:

- Create the required MySQL database.
- Configure the database URL, username and password.
- Keep real credentials and environment-specific configuration out of version control.
- Use environment variables or local configuration files for sensitive values.
- Never commit API keys, passwords, tokens or other secrets.

The repository's `.gitignore` excludes common IDE files, build outputs, logs and local environment configuration.


---

## Project Status

**Actively evolving.**

This repository represents an ongoing practical learning journey in Java and Spring backend development.

New modules, implementations and improvements will be added as I progress toward building more complete, maintainable and production-oriented backend applications.

---

**Author:** Haneef  
**Focus:** Java | Spring Framework | Spring Boot | REST APIs | Backend Development