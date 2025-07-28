# 📚 Library Management System (OOP Java Project)

## 🧾 Project Overview

This project involves building a Library Management System in Java with real-world features:

- The library holds **Books, Magazines, and Journals**.
- Some items can be **loaned**, others are **read-only** within the library.
- Users (Students, Professors) can **borrow/return items**.
- Books have categories like **Fiction, Non-fiction, Academic**.
- A **Loan Management System** keeps track of issued books.
- Additional features include **late fees** and **borrowing limits**.

---

## ✅ Milestone A: User Structure

### 🔹 Task 1: Create the Base User Class

- Define a `User` class with private attributes:
    - `String userId`
    - `String name`
    - `String contactInfo`
- Add `getters` and `setters` for `name` and `contactInfo`.
- Use **encapsulation**.

### 🔹 Task 2: Add Constructors to User

- Add:
    - A **default constructor** initializing `userId` via `generateUniqueId()` (return `0` for now).
    - A **parameterized constructor**.
    - A **copy constructor**.
- Test all constructors in a test class.

### 🔹 Task 3: Make User an Abstract Class

- Mark `User` as `abstract`.
- Add abstract methods:
    - `void displayDashboard()`
    - `boolean canBorrowBooks()`
- Enables **runtime polymorphism**.

### 🔹 Task 4: Create a Subclass Member

- Create a `Member` subclass:
    - Private attribute: `int borrowedBooksCount`
    - Constant: `MAX_BORROW_LIMIT = 5`
- Override abstract methods:
    - `displayDashboard()`
    - `canBorrowBooks()`
- Add constructors.

### 🔹 Task 5: Create a Subclass Librarian

- Create a `Librarian` subclass:
    - Attribute: `String employeeNumber`
- Override abstract methods:
    - `displayDashboard()`
    - `canBorrowBooks()` (always return `true`)
- Add methods (commented out for now):
    - `addNewBook(Book book)`
    - `removeBook(Book book)`

### 🔹 Task 6: Static and Final Concepts

- Add static `int totalUsers` and method `getTotalUsers()`.
- Implement `final` method `generateUniqueId()`:
    - Ensures it **can’t be overridden**.
- Validate uniqueness of userId and correct `totalUsers` tracking.

---

## ✅ Milestone B: Book Lending System

### 🔹 Task 1: Create the `Lendable` Interface

- Define methods:
    - `boolean lend(User user)`
    - `void returnBook(User user)`
    - `boolean isAvailable()`
- Demonstrates **compile-time polymorphism**.

### 🔹 Task 2: Implement the Abstract `Book` Class

- Implement `Lendable` in `Book`.
- Attributes:
    - `String isbn`
    - `String title`
    - `String author`
    - `boolean isAvailable`
- Implement methods:
    - `lend(User user)`
    - `returnBook(User user)`
    - `isAvailable()`
- Add abstract method:
    - `void displayBookDetails()`

---

## ✅ Milestone C: Full System Integration

### 🔹 Task 1: Set Up Collections

- Create `LibraryManagementSystem` class:
    - `List<Book> bookInventory`
    - `List<User> registeredUsers`
- Add methods:
    - `addBook(Book book)`
    - `registerUser(User user)`
- Test by adding books/users and printing them.

### 🔹 Task 2: Implement Search Functionality

- Add static method:
    - `searchBooks(String criteria)`
- Overload method:
    - `searchBooks(String criteria, String type)`
- Demonstrates method **overloading** (compile-time polymorphism).

### 🔹 Task 3: Integrate Book and User Management

- In `main`:
    - Create `TextBook` and `NovelBook` instances.
    - Add to inventory.
    - Create and register `Member` and `Librarian`.
- Print details of all books and users.

### 🔹 Task 4: Demonstrate Lending Functionality

- Simulate:
    - Lending a `TextBook` to a `Member`.
- Add logic:
    - Check availability
    - Check borrow limit
- Print success/failure messages.

### 🔹 Task 5: Manage Returns

- Simulate returning books:
    - Call `returnBook(User user)`
- Ensure:
    - Books become available
    - Re-lending works correctly

### 🔹 Task 6: Advanced Features

- Add:
    - `displayAllBooks()`
    - `displayRegisteredUsers()`
- Demonstrate `searchBooks()` usage:
    - By title/author
    - By book type (`TextBook`, `NovelBook`)

---

## 🛠️ Additional: Book Class Constructor Tasks

### 🔹 Task: Constructor Overloading

- Add to `Book`:
    - Default constructor (`isAvailable = true`)
    - Parameterized constructor
    - Copy constructor

---

## 📘 Book Subclass: TextBook

- Attributes:
    - `String subject`
    - `int edition`
- Add parameterized constructor.
- Override `displayBookDetails()`.

---

## 📕 Book Subclass: NovelBook

- Attribute:
    - `String genre`
- Add parameterized constructor.
- Override `displayBookDetails()`.

---

## 🧠 Concepts Demonstrated

- **OOP Principles**: Abstraction, Encapsulation, Inheritance, Polymorphism
- **Java Features**: Abstract Classes, Interfaces, Static/Final Keywords, Constructor Overloading
- **Collections**: List interface for dynamic storage
- **Design Practices**: Modular architecture, clean class hierarchy, separation of concerns

---

> 💡 Tip: You can extend this system to include real-time due dates, fines, and an admin dashboard in future versions.
