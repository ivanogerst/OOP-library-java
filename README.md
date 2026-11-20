# Library Management System (Java, OOP)

A simple object-oriented library management system built with Java, designed to demonstrate core OOP principles and basic application structure.

This is a console-based application that simulates basic library operations.

## Features

- Add and manage physical books and ebooks
- Track book availability
- Register library patrons
- Checkout and return books
- Display library collection and patron information
- Search for books by title or author
- Manage borrowed books using Java collections

## Object-Oriented Concepts

The project demonstrates the following OOP concepts:

- **Encapsulation** – Private fields and public methods for controlled access to data
- **Inheritance** – `Ebook` extends the `Book` class
- **Polymorphism** – Overriding the `toString()` method
- **Composition** – The `Library` class manages collections of books and patrons
- **Constructors** – Initializing objects with defined attributes

## Project Structure

```text
java-library/
├── Book.java
├── Ebook.java
├── Patron.java
├── Library.java
├── Main.java
└── README.md
```

## Technologies

- Java
- Object-Oriented Programming (OOP)
- ArrayList Collections

## How to Run

Make sure Java JDK is installed.

1. Clone the repository:

```bash
git clone https://github.com/ivanogerst/library-management-system-java.git
```

2. Navigate to the project directory:

```bash
cd library-management-system-java
```

3. Compile the source files:

```bash
javac *.java
```

4. Run the application:

```bash
java Main
```

## Example Operations

The application demonstrates:

1. Creating books and ebooks
2. Registering library patrons
3. Adding books to the library
4. Checking out a book to a patron
5. Searching for books by author
6. Returning a borrowed book
