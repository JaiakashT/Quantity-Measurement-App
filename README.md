# 📏 Quantity Measurement App

## 📌 Overview

The **Quantity Measurement App** is a Java-based console application designed to compare, convert, and perform arithmetic operations on different measurable quantities such as **length and weight**.

This project is built incrementally using multiple use cases (UC1–UC9), demonstrating how simple equality checks evolve into a scalable and extensible system using **Core Java, Data Structures, and Object-Oriented Design**.

---

## 🎯 Objective

The objective of this project is to:

* Apply **real-world measurement logic**
* Understand **unit conversion and comparison**
* Implement **clean and reusable design (DRY principle)**
* Use **TDD + DDT hybrid development approach**
* Build a **scalable quantity system**

---

## 🧠 Concepts Covered

### 🔹 Core Java

* Classes & Objects
* Encapsulation
* Immutability (`final` fields)
* Method Overriding (`equals()`)

### 🔹 Data Structures & Design

* Enum-based unit modeling
* Value Object Pattern
* DRY Principle (Avoid code duplication)
* Separation of Concerns

### 🔹 Mathematical Concepts

* Unit Conversion
* Floating-point precision handling
* Base unit normalization

### 🔹 Advanced Concepts

* TDD (Test Driven Development)
* Clean Code Practices
* Extensible Architecture

---

## ⚙️ Use Cases Implemented (UC1–UC9)

| Use Case | Description                        |
| -------- | ---------------------------------- |
| UC1      | Feet Measurement Equality          |
| UC2      | Feet & Inches Equality             |
| UC3      | Generic Quantity (DRY Refactor)    |
| UC4      | Added Yards & Centimeters          |
| UC5      | Unit Conversion                    |
| UC6      | Quantity Addition                  |
| UC7      | Addition with Target Unit          |
| UC8      | Refactored Unit to Standalone Enum |
| UC9      | Weight Measurement Support         |

---

## 🏗️ Project Structure

```
Quantity-Measurement-App/
│
├── src/
│   └── QuantityMeasurementApp.java
│
└── README.md
```

---

## ▶️ How to Run

### 🔹 Compile

```bash
javac src/QuantityMeasurementApp.java
```

### 🔹 Run

```bash
java -cp src QuantityMeasurementApp
```

---

## 💡 Sample Output

```
===== Quantity Measurement App =====

UC1 & UC2:
true

UC3 & UC4:
true

UC5 Conversion:
12.0 INCHES

UC6 Add:
2.0 FEET

UC7 Add Target:
0.666 YARDS

UC9 Weight:
true
2.0 KILOGRAM
```

---

## 🚀 Key Highlights

✔ Incremental development (UC1 → UC9)
✔ Real-world unit conversion logic
✔ Clean and reusable design
✔ Eliminates code duplication (DRY principle)
✔ Supports multiple measurement domains
✔ Easy to extend (Temperature, Volume, etc.)

---

## 🔄 Development Approach

This project follows a **Hybrid Development Model**:

### 🔹 TDD (Test Driven Development)

* Write tests before implementation
* Ensures correctness and reliability

### 🔹 DDT (Design → Develop → Test)

* High-level system design first
* Incremental feature addition

---

## 📚 Learning Outcomes

By completing this project, you will:

* Understand **how to model real-world systems**
* Learn **unit conversion logic**
* Apply **OOP principles effectively**
* Improve **problem-solving skills**
* Gain confidence in **technical interviews**

---

## 👨‍💻 Author

**Jai Akash T**
---
## ⭐ If you like this project

Give it a ⭐ on GitHub!
