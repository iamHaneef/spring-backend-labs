# Spring Framework & Spring Boot Labs

A structured, hands-on repository documenting my progression from **Spring Framework fundamentals to Java backend development using Spring Boot**.

This repository contains independent projects covering dependency injection, application configuration, REST API development, layered architecture, and database persistence.

Each module focuses on implementing concepts through working code rather than simply documenting theory.

---

## 🧭 Learning Roadmap

| No. | Module | Concepts | Status |
|---|---|---|---|
| 01 | `spring-core-xml-config` | IoC and Dependency Injection using XML | Completed |
| 02 | `java-boilerplate-with-lombok` | Lombok annotations and boilerplate reduction | Completed |
| 03 | `spring-core-java-config` | IoC and Dependency Injection using Java configuration | Completed |
| 04 | `spring-boot-fundamentals` | Spring Boot startup, IoC and auto-configuration | Completed |
| 05 | `spring-boot-rest-api` | REST API fundamentals and layered architecture | Completed |
| 06 | `spring-boot-rest-crud` | HTTP methods and CRUD endpoint implementation | Completed |
| 07 | `spring-boot-jpa-hibernate-crud` | JPA, Hibernate, MySQL and database persistence | In Progress |

---

## 📚 Concepts & Implementations

### 01 — Spring Core: XML Configuration

Understanding how the Spring IoC container creates, configures, and manages objects.

- Inversion of Control (IoC)
- Dependency Injection (DI)
- Spring Beans
- XML-based bean configuration
- `ApplicationContext`
- `ClassPathXmlApplicationContext`
- Retrieving Spring-managed objects

```java
ApplicationContext context =
    new ClassPathXmlApplicationContext("springconfig.xml");
```

### 02 — Java Boilerplate with Lombok

Exploring how Lombok reduces repetitive Java code.

- `@Getter` and `@Setter`
- `@Data`
- Constructor-related annotations
- Maven dependency configuration
- IDE annotation processing

### 03 — Spring Core: Java-Based Configuration

Implementing Spring Core concepts using Java configuration instead of XML.

- `@Configuration`
- `@Bean`
- Java-based bean definitions
- Dependency Injection
- `AnnotationConfigApplicationContext`
- Comparing XML and Java-based configuration

```java
ApplicationContext context =
    new AnnotationConfigApplicationContext(MyConfiguration.class);
```

### 04 — Spring Boot Fundamentals

Understanding how Spring Boot simplifies application configuration and startup.

- Spring Boot project structure
- `@SpringBootApplication`
- `SpringApplication.run()`
- IoC and Dependency Injection
- Auto-configuration
- Maven dependency management

```java
ApplicationContext context =
    SpringApplication.run(FirstSpringBootApplication.class, args);
```

### 05 — REST API Development

Understanding how a backend application handles HTTP requests and generates responses.

- REST principles
- HTTP request and response
- Controllers and request mappings
- Service layer and business logic
- Layered architecture
- Request-to-response flow

### 06 — REST API CRUD Operations

Implementing CRUD operations through HTTP endpoints.

- GET — Retrieve resources
- POST — Create resources
- PUT — Update resources
- DELETE — Remove resources
- HTTP status codes and response handling

### 07 — JPA & Hibernate: Database-Backed CRUD

Connecting Spring Boot applications to a relational database and implementing persistent CRUD operations.

- Java Persistence API (JPA)
- Hibernate ORM
- MySQL database integration
- Entity mapping
- `@Entity` and `@Id`
- Repository layer
- Database operations
- Spring Data JPA
- CRUD operations with persistent storage

---

## 🔄 Backend Request Flow

The target architecture for database-backed REST applications:

```text
Client
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
Hibernate / JPA
  |
  v
MySQL Database
```

---

## 🛠️ Tech Stack

- **Language:** Java
- **Framework:** Spring Framework, Spring Boot
- **ORM:** Hibernate
- **Persistence:** Spring Data JPA / JPA
- **Database:** MySQL
- **Build Tool:** Maven
- **Library:** Lombok
- **IDE:** IntelliJ IDEA
- **Version Control:** Git and GitHub

---

## 📂 Repository Structure

Each numbered module is maintained as an independent project.

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
│
├── .gitignore
└── README.md
```

---

## ▶️ How to Run

1. Clone the repository.
2. Open the required module in IntelliJ IDEA.
3. Load the module's Maven configuration.
4. Configure the required database where applicable.
5. Run the module's main application class.

For modules containing Maven Wrapper:

**Windows**

```bash
.\mvnw.cmd test
```

**macOS / Linux**

```bash
./mvnw test
```

---

## 🎯 Learning Objectives

- Understand Spring IoC and Dependency Injection.
- Compare XML-based and Java-based configuration.
- Understand Spring Boot startup and auto-configuration.
- Build REST APIs using layered architecture.
- Integrate relational databases using JPA and Hibernate.
- Develop maintainable backend applications through practical implementation.

---

## 📌 Project Status

**Actively evolving.**

New modules and implementations will be added as I progress through Spring Framework and Spring Boot concepts.