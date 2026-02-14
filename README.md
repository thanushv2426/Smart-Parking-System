# 🚗 Smart Parking System (Spring Boot)

A backend application built using **Java and Spring Boot** to manage parking slots in a smart parking system.  
This project provides RESTful APIs to create parking slots, allocate and release vehicles, and check slot availability.  
It follows a clean **Controller–Service–Repository** layered architecture and uses an **H2 in-memory database** for quick setup and testing.

---

## ✨ Features

- Create parking slots  
- Park a vehicle in a slot  
- Remove a vehicle from a slot  
- View all parking slots  
- View available parking slots  
- In-memory database using H2  
- RESTful APIs using Spring Boot  

---

## 🛠 Tech Stack

- **Language:** Java  
- **Framework:** Spring Boot  
- **Database:** H2 (in-memory)  
- **ORM:** Spring Data JPA (Hibernate)  
- **Build Tool:** Maven  
- **Server:** Embedded Tomcat  

---

## 🧩 Project Structure

src/main/java/com/smartparking/smartparkingapp

├── controller # REST Controllers

├── service # Business Logic

├── repository # Data Access Layer

├── model # JPA Entities

└── SmartparkingappApplication.java


---

## ▶️ How to Run the Project

### Prerequisites
- Java 17 or above  
- Git (optional)  

### Steps

 Clone the repository :
git clone https://github.com/thanushv2426/smart-parking-system.git

 Navigate to project folder : 
cd smart-parking-system

 Run using Maven Wrapper : 
./mvnw spring-boot:run



---

## The application will start on:
http://localhost:8080
---
## H2 Database console :
 - http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:parkingdb
- Username: smartparkingapp
- Password: 123456789

---
##  API Endpoints : 
| Method | Endpoint               | Description           |
| ------ | ---------------------- | --------------------- |
| POST   | /api/parking/slot      | Create a parking slot |
| GET    | /api/parking/slots     | Get all parking slots |
| GET    | /api/parking/available | Get available slots   |
| POST   | /api/parking/park      | Park a vehicle        |
| POST   | /api/parking/remove    | Remove a vehicle      |


---

👨‍💻 Author

Thanush
B.Tech Graduate |  Aspiring Java & Spring Boot Developer

- 🔗 GitHub: https://github.com/thanushv2426
- 🔗 Email: thanushv2426@gmail.com





