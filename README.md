# Student Management System

A console-based Student Management System built with Java Core to practice object-oriented programming, data management, input validation, and exception handling.

## Features

- Add new students
- Remove students by student ID
- Search for students by ID
- Display all students
- Find the student with the highest GPA
- Validate student IDs using Regular Expressions
- Validate GPA values within the range of 0–10
- Prevent duplicate student IDs
- Handle invalid input and exceptions
- Use custom exceptions for duplicate student IDs

## Technologies

- **Java 17**
- Object-Oriented Programming (OOP)
- `ArrayList` for student data management
- Exception Handling (`try-catch`, `throw`, `throws`)
- Custom Exceptions
- Regular Expressions (Regex)
- `Scanner` for console input

## Project Structure

```text
StudentManagementSystem/
├── src/
│   └── StudentManagementSystem/
│       ├── Main.java
│       ├── Student.java
│       ├── StudentManager.java
│       └── DuplicateStudentException.java
├── .gitignore
├── .classpath
├── .project
└── README.md
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or later
- Spring Tools for Eclipse, Eclipse IDE, or another Java IDE

### Installation and Execution

1. Clone the repository:

   ```bash
   git clone https://github.com/HaoNguyen2005/Student-Management-System.git
   ```

2. Open Spring Tools for Eclipse or Eclipse IDE.

3. Import the project as an existing Java project.

4. Open `Main.java`.

5. Run the program and follow the console menu to manage students.

## Learning Objectives

This project was developed to strengthen my understanding of Java Core fundamentals, including:

- Encapsulation and object-oriented design
- Collections and `ArrayList`
- Constructors, getters, and setters
- Input validation using Regular Expressions
- Exception handling and custom exceptions
- Basic CRUD operations
- Organizing Java classes into packages

## Future Improvements

- Persist student data using a database
- Add unit tests with JUnit
- Integrate Spring Boot and REST APIs
- Connect to MySQL or PostgreSQL

## Author

**Nguyen Cong Hao**

Aspiring Java Backend Developer | Java Backend Intern/Fresher

GitHub: [HaoNguyen2005](https://github.com/HaoNguyen2005)
