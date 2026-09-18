**Study Smart – An Intelligent Student Assistant**

=======================================================================================================


An intelligent Java-based student study management system designed to help students organize their studies, practice through quizzes, analyze their performance, receive personalized study recommendations, and manage study notes.

The project demonstrates the application of Object-Oriented Programming, Java Collections, file handling, exception handling, modular programming, and Java Swing in the development of a student-focused application.


-----------------------------------------------------------------------------------------------------



**##  Author:**


-Name: ANANYA SINHA

-Registration Number: 25BAI11375

-University: VIT BHOPAL UNIVERSITY

-Branch: COMPUTER SCIENCE AND ENGINEERING

-Program: CSE-AIML

-Course Title: PROGRAMMING IN JAVA (CSE-2006)


-----------------------------------------------------------------------------------------------------


**## Objectives:**


• Develop a Java-based student study management application

• Apply Object-Oriented Programming concepts in a real-world project

• Create a study planner for organizing academic tasks

• Develop an interactive quiz system for student practice

• Analyze quiz performance and identify weak subjects

• Generate rule-based study recommendations

• Implement file handling for storing and retrieving notes

• Develop a graphical user interface using Java Swing

• Build a well-structured and modular Java project


------------------------------------------------------------------------------------------------------


**## Key Features:**


* Study task management using the Study Planner
* Add, complete, and remove study tasks
* Multiple-choice quiz system
* Automatic answer checking and score calculation
* Performance analysis based on quiz results
* Identification of the weakest subject
* Rule-based study recommendations
* Study notes creation and storage
* File-based data persistence using notes.txt
* Interactive graphical user interface using Java Swing
* Clean and modular code structure
* Extendable design for future enhancements


---------------------------------------------------------------------------------------------------


**## Technologies Used:**


1. Programming Language:- Java


2. Libraries and Tools:-

   Java Swing - developing the graphical user interface

   Java Collections - managing tasks, questions and results

   Java I/O - reading and writing study notes

   Exception Handling - managing invalid input and file errors

   VS Code - development environment

   JDK - compiling and executing the Java application

   GitHub - version control and project hosting


--------------------------------------------------------------------------------------------


**## Project Structure:**


Study Smart

│

├── src

│   └── study smart

│       ├── model

│       │   ├── Student.java

│       │   ├── Subject.java

│       │   ├── Study Task.java

│       │   ├── QuizQuestion.java

│       │   └── QuizResult.java

│       │

│       ├── service

│       │   ├── StudyPlanner.java

│       │   ├── QuizManager.java

│       │   ├── PerformanceAnalyzer.java

│       │   ├── RecommendationEngine.java

│       │   └── NotesManager.java

│       │

│       ├── gui

│       │   ├── Dashboard Frame.java

│       │   ├── PlannerPanel.java

│       │   ├── QuizPanel.java

│       │   ├── PerformancePanel.java

│       │   └── NotesPanel.java

│       │

│       └── Main.java

│

├── data

│   └── notes.txt

│

├── screenshots

│   ├── 01_main_setup.png

│   ├── 02_student_profile.png

│   ├── 03_subject_performance.png

│   ├── 04_study_planner.png

│   ├── ...

│   └── 17_final_application.png

│

├── documentation

│   ├── 01_system_architecture.png

│   ├── 02_application_workflow.png

│   ├── 03_uml_class_diagram.png

│   └── 04_data_storage_diagram.png

│

├── README.md

├── statement.md

└── Project_Report.pdf


---------------------------------------------------------------------------------------


**## Installation Process:**


Step 1 – Clone or download the project repository


Step 2 – Open the project folder in Visual Studio Code


Step 3 – Make sure Java JDK is installed


Step 4 – Open the terminal in the Study Smart project folder


Step 5 – Compile the Java source files


* javac src\studysmart\Main.java src\studysmart\model\*.java src\study smart\service\*.java src\studysmart\gui\*.java -d out


Step 6 – Execute the main application


* java -cp out studysmart.Main


--------------------------------------------------------------------------------------------


**## Working Methodology:**


1. The user launches the Study Smart application.

2. The Dashboard provides access to the major application modules.

3. The user can select the Study Planner to create and manage study tasks.

4. The user can select the Quiz module and answer multiple-choice questions.

5. The Quiz Manager checks the submitted answers and calculates the quiz result.

6. The Performance Analyzer processes quiz results and calculates the average performance.

7. The system identifies the weakest subject based on the available quiz results.

8. The Recommendation Engine generates a study recommendation using the student's score, topic difficulty, and available study time.

9. The Notes module allows the user to write and save study notes.

10. The Notes Manager stores the notes in the data/notes.txt file.

11. The user can view previously saved notes whenever the application is executed.


-----------------------------------------------------------------------------------------------


**## Example Execution:**


### Study Planner

Input:

* Subject → Java

* Topic → Inheritance

* Duration → 60 minutes

* Difficulty → Hard


Output:

* Java | Inheritance | 60 minutes | Hard | Pending


After selecting the task and marking it completed:

* Java | Inheritance | 60 minutes | Hard | Completed


### Quiz

Example result:

* Total Questions → 5

* Correct Answers → 4

* Score → 80.0%


### Performance

Example:

* Java → 80.0%

* DSA → 40.0%

* DBMS → 60.0%

* Average Score → 60.0%

* Weakest Subject → DSA


### Notes

Example:

* Subject → Java

* Topic → Inheritance

* Note → Inheritance allows a class to acquire properties and methods of another class.


-------------------------------------------------------------------------------------------------


**## Project Modules:**


The Study Smart application consists of the following major modules:


### 1. Student and Subject Management

Stores student information and subject performance details.


### 2. Study Planner

Allows students to create, manage and complete study tasks.


### 3. Quiz System

Provides multiple-choice questions and automatically calculates quiz results.


### 4. Performance Analyzer

Analyzes quiz results, calculates average performance and identifies weak subjects.


### 5. Recommendation Engine

Generates rule-based study recommendations according to performance and topic difficulty.


### 6. Notes Manager

Allows students to save and retrieve study notes using file handling.


### 7. Graphical User Interface

Provides a user-friendly interface using Java Swing.


----------------------------------------------------------------------------------------


**## Java Concepts Implemented:**


The following Java programming concepts were implemented:


• Classes and Objects

• Encapsulation

• Constructors

• Getters and Setters

• Methods

• Conditional Statements

• Loops

• Array List and List Collections

• Exception Handling

• File Handling

• Packages

• Modular Programming

• Java Swing

• Event Handling


----------------------------------------------------------------------------------------------


**## Learning Outcomes:**


Through this project, the following concepts were understood and implemented:


• Object-Oriented Programming fundamentals

• Java classes and objects

• Encapsulation and modular design

• Collections and data structures

• File input and output

• Exception handling

• GUI development using Java Swing

• Event-driven programming

• Building rule-based recommendation logic

• Connecting different modules into a complete Java application

• Structuring Java projects professionally


--------------------------------------------------------------------------------------------------


**## Future Enhancements:**


• Integration with a database for permanent storage

• User login and authentication

• Addition of more quiz subjects

• Personalized study schedules

• Graphical performance charts

• Study reminders and notifications

• Export of performance reports

• Cloud-based note storage

• Advanced recommendation algorithms

• Development of a web or mobile version


-----------------------------------------------------------------------------------------


**## Project Diagrams:**


The documentation folder contains the following diagrams:


• System Architecture Diagram

• Application Workflow Diagram

• UML Class Diagram

• Data Storage Diagram


These diagrams explain the architecture, workflow, class relationships and storage structure of the Study Smart application.


-----------------------------------------------------------------------------------


**## Screenshots:**


Screenshots included in the repository demonstrate:


• Main Java program setup

• Student profile implementation

• Subject performance

• Study planner functionality

• Quiz system

• Performance analyzer

• Recommendation engine

• Notes manager

• Graphical user interface

• Final Study Smart application


Screenshots are available in the screenshots folder.


-----------------------------------------------------------------------------------------


**## Conclusion:**


Study Smart demonstrates how Java programming concepts can be combined to develop a complete student-focused application. The project integrates study planning, quizzes, performance analysis, recommendations and note management through a graphical interface.

The project provides practical implementation of Object-Oriented Programming, collections, file handling, exception handling, modular programming and GUI development in Java.


------------------------------------------------------------------------------------------


**## Author:**


ANANYA SINHA

VIT BHOPAL UNIVERSITY

CSE-AIML


---------------------------------------------------------------------------------------------


**END OF FILE**

---------------------------------------------------------------------------------------------