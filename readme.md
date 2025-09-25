
# Campus Course & Records Manager (CCRM)

## Project Overview
The Campus Course & Records Manager (CCRM) is a console-based Java SE application for managing students, courses, enrollments, grades, and transcripts. It also provides utilities for import/export, backups, and recursive directory processing.

This project demonstrates:
- Object-Oriented Programming (OOP) principles
- Modern Java features (Streams, NIO.2, Date/Time API, Lambdas, Enums, Design Patterns)
- A menu-driven CLI workflow

## Features
### Student Management
- Add, list, update, and deactivate students
- Each student: `id`, `regNo`, `fullName`, `email`, `status`, `enrolledCourses`, date fields
- Print student profile and transcript

### Course Management
- Add, list, update, and deactivate courses
- Each course: `code`, `title`, `credits`, `instructor`, `semester`, `department`
- Search/filter by instructor, department, and semester (Streams API)

### Enrollment & Grading
- Enroll/unenroll students with business rules (e.g., max credits/semester)
- Record marks, compute letter grades (S–F), calculate GPA
- Enum usage for `Semester` and `Grade`
- Transcript generation with `toString()` overrides & polymorphism

### File Operations (NIO.2 + Streams)
- Import students/courses from CSV-like files
- Export current data to files
- Backup system with timestamped folder creation
- Recursive utilities: compute total backup size, list files by depth

### CLI Workflow
- Menu-driven interface for all operations
- Demonstrates use of `switch`, `if/else`, loops (`for`, `while`, `do-while`, enhanced-for), and jump controls (`break`, `continue`, labeled jumps)

## Technical Stack
- **Language:** Java SE
- **IDE:** Eclipse IDE
- **Java Version:** JDK 17+ recommended
- **Concepts Used:**
  - Encapsulation, Inheritance, Abstraction, Polymorphism
  - Streams API, Date/Time API, NIO.2 I/O
  - Enums, Interfaces, Abstract Classes, Lambdas
  - Singleton & Builder Design Patterns
  - Exception Handling (checked, unchecked, custom exceptions)
  - Recursion and Assertions

## Suggested Package Structure
```text
edu.ccrm
 ├─ cli/        → Menu & Input Handling
 ├─ domain/     → Person (abstract), Student, Instructor, Course, Enrollment, Grade, Semester
 ├─ service/    → StudentService, CourseService, EnrollmentService, TranscriptService
 ├─ io/         → ImportExportService, BackupService (NIO.2)
 ├─ util/       → Validators, Comparators, Recursive Utilities
 └─ config/     → AppConfig (Singleton), Builders
```

## How to Run
1. Install Java JDK 17+
2. Verify installation:
	```sh
	java -version
	```
3. Clone the repository:
	```sh
	git clone https://github.com/your-repo/ccrm.git
	cd ccrm
	```
4. Compile and run:
	```sh
	javac -d bin src/edu/ccrm/cli/Main.java
	java -cp bin edu.ccrm.cli.Main
	```
5. Use the CLI menu to manage students, courses, enrollments, grades, and backups.

## Evolution of Java (Short Timeline)
- 1995: Java 1.0 released (Sun Microsystems)
- 1998: Java 2 introduced (J2SE, J2ME, J2EE)
- 2004: Java 5 (Generics, Enums, Annotations)
- 2011: Java 7 (NIO.2, try-with-resources)
- 2014: Java 8 (Lambdas, Streams, Date/Time API)
- 2017+: Modular system (Java 9), Local-variable type inference (Java 10+)
- 2021–2023: Latest LTS versions: Java 17 & Java 21

## Java Editions Comparison
| Edition      | Use Case           | Example                        |
|-------------|--------------------|--------------------------------|
| Java ME     | Mobile/Embedded    | Smartcards, IoT                |
| Java SE     | Core Java          | Desktop apps, CLI apps         |
| Java EE (Jakarta EE) | Enterprise apps | Web servers, distributed systems |

## Java Architecture
- **JDK (Java Development Kit):** Tools + JRE + compiler (`javac`)
- **JRE (Java Runtime Environment):** Libraries + JVM. Runs Java apps
- **JVM (Java Virtual Machine):** Executes Java bytecode on any platform

## Installation & Setup
### Windows (JDK):
1. Download JDK from [Oracle](https://www.oracle.com/java/technologies/downloads/)
2. Install and configure `JAVA_HOME` environment variable
3. Verify installation:
	```sh
	java -version
	```

### Eclipse IDE Setup
1. Install Eclipse IDE for Java Developers
2. Create a new project → Campus Course & Records Manager (CCRM)
3. Configure run settings and execute the `Main` class

## Sample Workflow
- Start application → AppConfig loads
- Menu options: Manage Students/Courses/Enrollments/Grades
- Import/Export Data
- Backup with recursive size calculation
- Reports (GPA distribution, top students)
- Demonstrate enrollment, grading, transcript generation, and backup

## Mapping Table (Topics → Code)
| Topic              | File/Class                                             |
|--------------------|-------------------------------------------------------|
| Encapsulation      | Student.java (private fields, getters/setters)        |
| Inheritance        | Person.java → Student.java / Instructor.java           |
| Polymorphism       | TranscriptService.java                                 |
| Singleton          | AppConfig.java                                         |
| Builder            | Course.Builder.java                                    |
| Custom Exceptions  | DuplicateEnrollmentException.java, MaxCreditLimitExceededException.java |
| Recursion          | BackupService.java (recursive size listing)            |

## Notes
- Enable assertions at runtime with:
  ```sh
  java -ea edu.ccrm.cli.Main
  ```
- Assertions are used for invariants like non-null IDs and credit limits

## Deliverables
- `README.md` (this file)
- Source code (with packages as above)
- `Screenshots/` folder:
  - JDK installation verification
  - Eclipse project setup
  - CLI running sample
  - Backup folder structure
- `Test-Data/` folder with sample CSVs
- Optional demo video link

## Acknowledgements
- Java SE Documentation
- Oracle Java Tutorials
- Eclipse IDE

