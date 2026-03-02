# Student Management System

A simple **Java console application** to manage student records.  
This project allows you to **add, view, search, update, and delete student information** from the console.

---

## Features

- Add new students (Name, Roll Number, Grade)  
- View all students  
- Search students by Roll Number  
- Update student details  
- Delete students  
- Exit the application  

---

## Project Structure


Student-Management-System/
├── Student.java
├── StudentManagementSystem.java
└── README.md


- `Student.java` – Class representing a student  
- `StudentManagementSystem.java` – Main program with menu and functionality  
- `README.md` – This file  

---

## How to Run

1. Download or clone the repository.  
2. Open terminal/PowerShell in the project folder.  
3. Compile the Java files:

```bash
javac Student.java StudentManagementSystem.java

Run the program:

java StudentManagementSystem

Follow the menu options displayed in the console.

Example Output
===== Student Management System =====
1. Add Student
2. View All Students
3. Search Student by Roll Number
4. Delete Student
5. Exit
6. Update Student
Enter your choice: 1
Enter Name: Rupa
Enter Roll Number: 1953
Enter Grade: A
Student added successfully!

===== Student Management System =====
1. Add Student
2. View All Students
3. Search Student by Roll Number
4. Delete Student
5. Exit
6. Update Student
Enter your choice: 2
Name: Rupa
Roll Number: 1953
Grade: A
----------------------
