# 💎 **WealthCare** - Hospital Management Platform 🌟

**WealthCare** is a comprehensive and innovative hospital management and information platform designed to streamline hospital operations while providing accessible healthcare services to patients. This project bridges the gap between medical professionals and patients, enabling efficient management of hospital resources and improving patient care. 💼👨‍⚕️

![Hospital Management](https://github.com/Tushar4140/WellCare_Hospital_Management-_System-/blob/WellCare/Backend/Screenshot%202024-12-24%20140146.png?raw=true)

---

## 🏥 **Project Overview** 🚀

**WealthCare** is designed to revolutionize **hospital resource management** while providing a sleek, user-friendly interface for patients and medical professionals. Key features include:

- **💼 Efficient Hospital Resource Management**: Simplify tracking and managing patients, appointments, and medicines.
- **👩‍⚕️ Seamless User Interfaces**: Three specialized dashboards (Doctor, Admin, and Patient) for optimal usability.
- **🌍 Public Website**: A one-stop hub for medical services, health education, and resources.

🎥 **Watch the Project Overview Video**:  
[Click here to view the overview video](https://drive.google.com/file/d/1pKn4ELTmb_coMIvnrWd_K8ZLt8rqoT1k/view).

---

## ✨ **Key Features** 🔑

### 🌐 **Public Website Features** 📱

- **Homepage**:  
  - 🎯 **Consult Today**: One-click access to immediate medical consultations.
  - 💡 **Services Section**: Explore a range of services including doctor searches, pharmacy consultations, and emergency care.
  
- **Help Providers**:  
  - Reach out for expert advice and support with ease.

- **Latest Articles**:  
  - Stay informed with the latest healthcare articles, medical tips, and insights.

- **About Page**:  
  - Discover the mission, vision, and values that drive **WealthCare** in revolutionizing healthcare.

---

### 👨‍⚕️ **Doctor's Dashboard** 💉

- **Patient Management**:  
  - Effortlessly add, edit, or delete detailed patient records (name, age, medical history).
  - **Track Patient Records**: Easily update and manage patient histories.
  
- **Medicine Inventory**:  
  - **Track Inventory**: Monitor medicine stock, expiry dates, and details.
  - **Expired Medicines**: Remove expired medicines with a click.

- **Patient List**:  
  - View and manage a comprehensive list of all patients and their medical histories.  
  ![Patient List](https://github.com/Tushar4140/WellCare_Hospital_Management-_System-/blob/WellCare/Backend/dsv%20(11).png?raw=true)

---

### 🔑 **Admin Dashboard** 🛠️

- **Patient Record Management**:  
  - View and delete outdated or unnecessary patient records with ease.

- **Appointment System**:  
  - Efficiently schedule, track, and manage patient appointments.

  ![Admin Dashboard](https://github.com/Tushar4140/WellCare_Hospital_Management-_System-/blob/WellCare/Backend/dsv%20(6).png?raw=true)

---

## 🖥 **Technology Stack** 💻

| **Frontend**     | **Backend**            | **Database**   | **Tools**            |
|------------------|------------------------|----------------|----------------------|
| **Angular**      | **Spring Boot** (REST API) | **MySQL**     | **Hibernate, JDBC**  |

---

## 🏗 **System Architecture** 🔧

- **Frontend (Angular)**:  
  - **Dynamic UI**: Built with Angular, offering a responsive, real-time user experience.  
  - **API Integration**: Seamless communication between frontend and backend via REST APIs.
  
- **Backend (Spring Boot)**:  
  - **RESTful APIs**: Handles backend operations for patient record management, appointment scheduling, and medicine inventory updates.
  - **Business Logic**: Ensures smooth data flow and security.

- **Database (MySQL)**:  
  - **Structured Data**: Manages all patient, medicine, and appointment data with high efficiency.
  - **Hibernate ORM**: Simplifies database interaction and enhances performance.

---

# 🔧 **Setup Guide** 🛠️

### 🖥 **Frontend Setup (Angular)**

1. **Clone the Repository** and navigate to the frontend folder:
    ```bash
    git clone <repository-url>
    cd wealthcare-frontend
    ```

2. **Install Dependencies**:
    ```bash
    npm install
    ```

3. **Run the Application**:
    ```bash
    ng serve
    ```
    🌐 **The app will be available at**: [http://localhost:4200](http://localhost:4200)

---

### ⚙️ **Backend Setup (Spring Boot)**

1. **Clone the Repository** and navigate to the backend folder:
    ```bash
    git clone <repository-url>
    cd wealthcare-backend
    ```

2. **Import the Project into Your IDE** (e.g., IntelliJ IDEA, Eclipse).

3. **Configure Database Connection** in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/wealthcare
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    spring.jpa.hibernate.ddl-auto=update
    ```

4. **Run the Application**:
    ```bash
    mvn spring-boot:run
    ```
    🌐 **The backend will be running at**: [http://localhost:8080](http://localhost:8080)

---

### 🗄️ **Database Setup (MySQL)**

1. **Create the Database**:
    ```sql
    CREATE DATABASE wealthcare;
    ```

2. **Ensure your Database Credentials Match** those in the `application.properties` file.

---

# 💡 **Usage Guide** 🚀

### 💼 **Doctor's Dashboard**:

- **Manage Patients**: Easily add, edit, or delete patient records.
- **Medicine Inventory**: Track and update medicines.
- **Patient View**: Access and manage patient medical histories.

### 🛠️ **Admin Dashboard**:

- **Manage Appointments**: Schedule and track appointments efficiently.
- **Delete Patient Records**: Admins can remove outdated records.

### 🌐 **Public Website**:

- **Explore Services**: Use the "Consult Today" feature to access healthcare services.

---

## 🚀 **Future Enhancements** 🔮

- **Advanced Search Filters**: Powerful search filters for patients and medicines (e.g., by age, disease type).
- **User Authentication**: Implement role-based access control (RBAC) for different user types.
- **Analytics & Reporting**: Provide insights into hospital performance and patient data.
- **Mobile App Integration**: Enhance accessibility with a mobile app.

---

## 📜 **License** 📄

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for more details.

---

## 📬 **Contact** 📨

For any questions, suggestions, or feedback, feel free to reach out:

- **Email**: [tp99011@gmail.com](mailto:your-email@example.com)

---
