# ⚙️ Portfolio Backend API

This repository contains the backend service powering my personal portfolio website.

The backend manages contact form submissions and provides an authenticated admin dashboard to view and manage messages.

---

# 🌐 Live Backend

https://portfolio-backend-7lkz.onrender.com

---

# 🧩 System Architecture

Visitor  
↓  
React Portfolio (Frontend)  
↓  
Spring Boot REST API  
↓  
PostgreSQL Database

Frontend Repository  
👉 https://github.com/Deekshitha-089/portfolio-frontend

---

# ✨ Features

• Contact form API  
• Store visitor messages in PostgreSQL  
• Admin dashboard to view messages  
• Mark messages as contacted  
• Basic authentication for admin routes  
• REST API design  

---

# 🛠 Tech Stack

Backend

Spring Boot  
Spring Security  
Spring Data JPA  
Database - PostgreSQL (Render)
Deployment - Render

---

# 📡 API Endpoints

Submit Contact Message

POST /api/contact

Retrieve Messages (Admin)

GET /api/contacts

Update Contact Status

PUT /api/contacts/{id}

---

# 🔐 Security

Admin routes are protected using **Basic Authentication**.

Environment variables are used for:

Database credentials  
Admin login credentials

This prevents sensitive information from being exposed in the repository.

---

# 📘 What I Learned

While building this backend I gained experience with:

• Building REST APIs using Spring Boot  
• Connecting frontend applications to backend services  
• Managing database persistence with JPA  
• Implementing authentication with Spring Security  
• Handling CORS between frontend and backend  
• Deploying backend services on cloud infrastructure  

---

# 👩‍💻 Author

Deekshitha Puppala  
Frontend Developer • React • UI Design
