# Student Management System  

A simple full-stack application built using **Spring Boot** for the backend and **React.js** for the frontend. This project provides functionality to add students and view all students, demonstrating basic CRUD operations.  

---

## Features  
- **Add Student**: Input student details and store them in the database.  
- **View All Students**: Fetch and display the list of all students.  

---

## Technologies Used  

### Backend  
- **Spring Boot**  
- **MySQL** (Database)  
- **Spring Data JPA** for database interactions  
- REST APIs for communication with the frontend  

### Frontend  
- **React.js**  
- **Fetch API** for making HTTP requests to the backend  

---

## Getting Started  

### Prerequisites  
- Java (JDK 17 or higher recommended)  
- Node.js and npm  
- MySQL  

### Setup  

#### Backend (Spring Boot):  
1. Clone the repository.  
2. Navigate to the backend folder.  
3. Update the `application.properties` file to configure the MySQL database:  
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/student_management
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
