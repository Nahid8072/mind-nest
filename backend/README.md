# Backend README.md

# Full Stack Application - Backend

This is the backend part of the Full Stack Application built with Spring Boot. 

## Table of Contents
- [Technologies](#technologies)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)

## Technologies
- Spring Boot
- Java
- Maven
- Spring Data JPA

## Setup Instructions
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the backend directory:
   ```
   cd full-stack-app/backend
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Configure your database settings in `src/main/resources/application.properties`.

## Usage
To run the application, use the following command:
```
mvn spring-boot:run
```
The application will start on `http://localhost:8080`.

## API Endpoints
- `GET /api/example`: Fetches example data.
- `POST /api/example`: Creates new example data.

## Testing
To run the tests, use the following command:
```
mvn test
```
This will execute all unit tests defined in the project.