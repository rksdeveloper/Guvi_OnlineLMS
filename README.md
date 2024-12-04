# Online Learning Management System (LMS)

An online learning management system designed to facilitate course management, student enrollment, and system oversight. Built using **Java**, **JSP/Servlets**, **MySQL**, **JDBC**, **HTML**, **CSS**, and **Bootstrap**.

---

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Database Schema](#database-schema)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [License](#license)

---

## Features

### Admin
- Manage users, courses, and system settings.
- View performance analytics and generate reports.

### Instructor
- Create and manage courses, quizzes, and assignments.
- Monitor and evaluate student performance.

### Student
- Enroll in courses and access materials.
- Submit assignments and track progress.

---

## Technologies Used

- **Backend:** Java (JSP/Servlets), JDBC
- **Frontend:** HTML, CSS, Bootstrap, JavaScript
- **Database:** MySQL
- **Testing:** JUnit
- **Build Tool:** Apache Tomcat

---

## Project Structure



---

## Database Schema

- **Users Table:**
  - `user_id` (Primary Key)
  - `name`
  - `email`
  - `password`
  - `role` (Admin/Instructor/Student)

- **Courses Table:**
  - `course_id` (Primary Key)
  - `title`
  - `description`
  - `syllabus`
  - `instructor_id` (Foreign Key)

- **Enrollments Table:**
  - `enrollment_id` (Primary Key)
  - `student_id` (Foreign Key)
  - `course_id` (Foreign Key)

- **Assignments Table:**
  - `assignment_id` (Primary Key)
  - `course_id` (Foreign Key)
  - `content`

---

## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/Online-LMS.git
   cd Online-LMS

Configure Database

Create a MySQL database named lms_db.
Execute the SQL script provided in database/lms_schema.sql.
Set Up Project

Open the project in VS Code.
Configure the db.properties file with your MySQL credentials.
Run the Project

Use Apache Tomcat to deploy the application.
Access the application at http://localhost:8080/LMS_Project.
Usage
Admin:
Login to manage users, courses, and view system analytics.
Instructor:
Create and manage courses, assignments, and quizzes.
Student:
Enroll in courses, access materials, and submit assignments.
Screenshots
Add screenshots here, e.g., dashboard, course management, etc.

