 Tutorial 4 – Java OOP

This project is a simple Java console application that models a project team in a small software company.

The main purpose of this project is to practice and demonstrate key Object-Oriented Programming (OOP) concepts in Java through a realistic example.

 Project idea

A company has different types of employees such as developers and testers.
All employees share some common data, but each role has its own behavior and responsibilities.

This application allows storing different types of employees in one structure and working with them in a unified way.

 What is implemented

* Inheritance (Employee → Developer, Tester)
* Polymorphism using a common parent type
* Method overriding with @Override
* Safe casting using instanceof
* A final method in the parent class
* Overridden toString() for readable output
* Overridden equals() for object comparison
* Storing objects in ArrayList<Employee>

 How it works

The program creates several employees of different types and stores them in one list.
Then it processes them using polymorphism, which allows calling the same methods on different object types.

Each class provides its own implementation of certain methods, so the behavior depends on the actual object type.

The program also:

* prints a readable list of team members
* calculates the total team cost
* demonstrates casting after instanceof check
* compares objects using equals()

Classes

* Employee
  Base class that contains shared fields like id, name and salary.

* Developer
  Extends Employee and adds information about programming language and repositories.

* Tester
  Extends Employee and adds testing-related data like automation and number of test scenarios.

* ProjectTeam
  Manages a list of employees and provides methods for operations on the team.

* Main
  Contains a simple test scenario showing how the system works.

 Run

Run the `Main` class to execute the example scenario and see the results in the console.

