# Spring Framework & Spring Boot Labs

A structured, hands-on repository documenting my journey from **Spring Framework fundamentals to backend application development with Spring Boot**.

This repository contains independent Maven projects, each focused on a specific concept or development milestone. The goal is to understand how Spring works internally, apply its core features, and progressively build applications using maintainable backend architecture.

---

## 🧭 Learning Roadmap

The projects are organized in the order I’m learning the concepts.


| No. | Project | Concepts |
|---|---|---|
| 01 | spring-core-xml-config | IoC and Dependency Injection using XML |
| 02 | java-boilerplate-with-lombok | Lombok annotations and boilerplate reduction |
| 03 | spring-core-java-config | IoC and Dependency Injection using Java configuration |
| 04 | spring-boot-fundamentals | Spring Boot fundamentals, IoC and auto-configuration |
| 05 | spring-boot-rest-api | REST API fundamentals and layered architecture |
| 06 | spring-boot-rest-crud | CRUD endpoints using GET, POST, PUT and DELETE |
| 07 | spring-boot-jpa-hibernate-crud | Database integration, ORM, JPA, Hibernate and persistent CRUD operations |

---

## 📚 Concepts & Learning Focus

### 01 — Spring Core: XML Configuration

Understanding how the Spring IoC container creates, configures, and manages objects.

- Inversion of Control (IoC)
- Dependency Injection (DI)
- Spring Beans
- XML-based bean configuration
- `ApplicationContext`
- `ClassPathXmlApplicationContext`
- Retrieving and using Spring-managed objects

```java
ApplicationContext context =
    new ClassPathXmlApplicationContext("springconfig.xml");
```

### 02 — Java Boilerplate with Lombok

Exploring how Lombok reduces repetitive Java code and improves readability.

- `@Getter` and `@Setter`
- `@Data`
- Constructor-related annotations
- Lombok dependency configuration
- IDE annotation processing and build support

### 03 — Spring Core: Java-Based Configuration

Applying Spring Core concepts using Java configuration instead of XML.

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

Moving from manually configured Spring applications to Spring Boot.

- Spring Boot application structure
- `@SpringBootApplication`
- Application startup
- `SpringApplication.run()`
- IoC and DI in Spring Boot
- Auto-configuration
- Spring Boot project setup and Maven dependencies

```java
ApplicationContext context =
    SpringApplication.run(FirstSpringBootApplication.class, args);
```

### 05 — Building REST APIs with Spring Boot

Learning how a backend application receives a request, processes it, and returns a response.

- REST API fundamentals
- HTTP request and response
- Controllers and request mapping
- Service layer and business logic
- Layered application structure
- Repository layer and database integration *(upcoming)*
- CRUD operations *(upcoming)*

Planned request flow:

```text
Client
  │
  ▼
Controller
  │
  ▼
Service
  │
  ▼
Repository
  │
  ▼
Database
```

---

## 🛠️ Tech Stack

- **Language:** Java
- **Framework:** Spring Framework, Spring Boot
- **Build Tool:** Maven
- **Libraries:** Lombok
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub

---

## 📂 Repository Structure

Each numbered module is maintained as an independent project.

```text
spring-boot-learning/
│
├── 01-spring-core-xml-config/
├── 02-java-boilerplate-with-lombok/
├── 03-spring-core-java-config/
├── 04-spring-boot-fundamentals/
├── 05-spring-boot-rest-api/
│
├── .gitignore
└── README.md
```

---

## ▶️ How to Run

Each module is an independent project. Open the required module in IntelliJ IDEA and run its main class.

For projects configured with Maven Wrapper:

**Windows**
```bash
.\mvnw.cmd test
```

**macOS / Linux**
```bash
./mvnw test
```

For Maven projects without the wrapper, use IntelliJ IDEA's Maven tool window to run lifecycle goals such as `compile` or `test`.

---

## 🎯 Learning Objectives

- Understand Spring IoC and Dependency Injection beyond annotations.
- Compare XML-based and Java-based Spring configuration.
- Understand what Spring Boot simplifies and how its startup process works.
- Build REST APIs using clear separation of responsibilities.
- Progress toward database integration and complete CRUD applications.
- Develop practical backend skills through consistent implementation.

---

## 📌 Project Status

**In progress.** This repository evolves as I learn and implement new Spring concepts. Modules may be expanded with additional examples, exercises, and implementation notes over time.
