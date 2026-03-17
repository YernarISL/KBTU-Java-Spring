# SIS-4: Production-Ready Event Management API
## 1. Architecture and Structure
The project is divided into layers to ensure low coupling:
- **Controller**: Processing HTTP requests and validating incoming data.
- **Service**: Application business logic.
- **Repository**: Interaction with PostgreSQL via Spring Data JPA.
- **DTO & MapStruct**: Complete isolation of database entities from the client.
- **Exception**: Handling Errors
- **Entity**: Event.java
Flyway migrations are used instead of `ddl-auto: update`. This ensures data integrity and change tracking.

## Validation and Error Handling
Global exception handling is implemented using `@ControllerAdvice`. All error-handling logic is located in a separate “exception” directory, which ensures the application remains organized and structured. The GlobalExceptionHandler file uses `@ControllerAdvice` to properly handle errors by consolidating error-handling methods into a single, unified structure. 

## Getting Started Guide
1. Clone the repository.
2. Start PostgreSQL (via Docker or locally).
3. Configure `application.yml` (database URL, username, password).
4. Run the application

# SIS-5: Working with Swagger, Student Management System
## 1. Architecture and Structure
The project is divided into layers to ensure low coupling:
- **Controller**: Processing HTTP requests and validating incoming data.
- **Service**: Application business logic.
- **Repository**: Interaction with PostgreSQL via Spring Data JPA.
- **DTO & MapStruct**: Complete isolation of database entities from the client.
- **Exception**: Handling Errors
- **Entity**: Student.java, Course.java, Teacher.java
### Service logic:
We have 3 interfaces: StudentService, CourseService and TeacherService. Each of them have their own required methods and Implementation, where main logic written.

## 2. Swagger UI Interface (localhost:8080)
**Интерфейс Swagger UI (localhost:8080):**
![Swagger UI](/screenshots/chrome_9Xk151vvKQ.png)

## 3. Example of a query with pagination:
![Pagination](/screenshots/Postman_vpO78QzOMm.png)

## Getting Started Guide
1. Clone the repository.
2. Start PostgreSQL (via Docker or locally).
3. Configure `application.properties` (database URL, username, password).
4. Run the application: `./mvnw spring-boot:run`.
5. Open: `http://localhost:8080/swagger-ui.html`.

Note to self & reviewer: This project is an important milestone in my learning journey. Although the current version focuses on the REST API and documentation, I recognize that integration with Apache Kafka (SIS-6) requires a deeper dive.
My plan for the near future:
Phase 1: Full implementation of event-driven interaction between the post-service and feed-service.
Phase 2: Configuring fault tolerance (retry logic) for Kafka consumers.
Phase 3: Covering the entire event chain with integration tests.
