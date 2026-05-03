# University Management System

A comprehensive Java-based CLI application designed to demonstrate core Object-Oriented Programming (OOP) principles and fundamental Java concepts.

## 📋 Academic Requirements Implemented

This project satisfies the following academic requirements as specified in the assignment:

1.  **Object-Oriented Design**: Modeled real-world university entities using well-structured classes and proper encapsulation.
2.  **Constructors**: Implemented overloaded constructors in the `Person` class for flexible object initialization.
3.  **Methods**: Utilized overloaded methods (`addMember`) to handle different types of university members.
4.  **Access Control**: Applied `public`, `private`, and `protected` modifiers to enforce data hiding and controlled access.
5.  **Inheritance**: Established a class hierarchy: `Person` (Base) -> `Student` & `Teacher` (Derived).
6.  **Method Overriding**: Provided specialized implementations of `displayInfo()` and `getDetails()` in derived classes.
7.  **Final Keyword**: Used `final` for immutable variables (role) and methods to prevent modification.
8.  **Keywords & Type Checking**: 
    - `this`: Referenced current object instances.
    - `super`: Accessed parent class members and constructors.
    - `instanceof`: Performed runtime type checking for specialized actions.
9.  **Exception Handling**: Implemented robust error management using `try-catch-finally` and a custom `InvalidDataException`.
10. **Collections Framework**: Utilized `ArrayList` to manage dynamic data for university members.
11. **Polymorphism**: Demonstrated through the `UniversityMember` interface and method overriding, allowing objects to be treated as their parent types.
12. **Static Members**: Included static variables and methods to represent shared class-level data (total member count).
13. **File Handling (Bonus)**: Implemented automated file input/output operations for data persistence.

---

## 🚀 Features & Implementation Details

### 1. Interactive CLI Menu
The application features a Command Line Interface that allows users to:
- Add new Students (validating GPA between 0.0 - 4.0).
- Add new Teachers (validating salary).
- List all university members with their specialized roles.
- View the total count of members in the system.

### 2. Automatic Data Persistence
We implemented an **Auto-Save** feature. Every time a member is added, the system immediately updates the `university_data.txt` file. This ensures that data is never lost, even if the program is closed unexpectedly. The system also automatically loads existing data from this file upon startup.

### 3. Clean Architecture
The project follows a modular design:
- `UniversityMember`: The interface defining the contract.
- `Person`: The abstract base class providing shared logic.
- `Student/Teacher`: Concrete implementations with specialized behaviors.
- `UniversitySystem`: The controller managing the CLI and data flow.

---

## 🛠️ How to Run

1.  **Compile the project**:
    ```bash
    javac -d . university/*.java
    ```

2.  **Run the application**:
    ```bash
    java university.UniversitySystem
    ```

## 📂 Project Structure
```text
university/
├── UniversityMember.java      # Interface (Ability)
├── Person.java                # Abstract Base Class (Identity)
├── Student.java               # Derived Class
├── Teacher.java               # Derived Class
├── InvalidDataException.java  # Custom Exception
└── UniversitySystem.java      # Main Application & CLI
university_data.txt            # Persistent Data Storage
```
