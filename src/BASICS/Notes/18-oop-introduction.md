# Object-Oriented Programming - Introduction

## What is OOP?

OOP (Object-Oriented Programming) is a way of writing programs by organizing code around objects.

Simple definition: in OOP, code is grouped into classes and objects instead of being just a long list of steps.

## Why OOP?

Imagine writing a very large bank program as one long list of instructions. Nobody could understand or fix it.

OOP fixes this by splitting the program into small, organized pieces. Each piece is a class. Each class looks like a real-world thing. This makes large programs easier to write, read, debug, and reuse.

## Real-World Analogy

Think of a car factory.

A car blueprint (design document) shows how every car will look: engine, wheels, doors. The blueprint itself is not a car. Then the factory produces actual cars from the blueprint.

- Blueprint = class.
- Actual car = object.

One blueprint produces many cars. One class produces many objects.

## Class

A class is a blueprint (template) that defines data and behavior.

Simple definition: a class describes what things of this kind have and what they can do.

A Student class says: every student has a name, roll number, and a way to study.

## Object

An object is the actual thing created from a class.

Simple definition: an object is a real instance of the class, with real values inside.

"Rahul with roll number 7" is an object of the Student class.

## Relationship: Class to Object

```text
╔════════════════════════════════════════════════════════════════════════╗
║                         CLASS CREATES OBJECTS                          ║
╠════════════════════════════════════════════════════════════════════════╣
║                       ┌────────────────────────┐                       ║
║                       │ Class - the blueprint  │                       ║
║                       └────────────────────────┘                       ║
║                                   ▼                                    ║
║ ┌────────────────────┐  ┌────────────────────┐  ┌────────────────────┐ ║
║ │  Object 1 - Rahul  │  │  Object 2 - Priya  │  │  Object 3 - Aman   │ ║
║ └────────────────────┘  └────────────────────┘  └────────────────────┘ ║
╚════════════════════════════════════════════════════════════════════════╝
```

Class is one template. Objects are many real copies.

Example in daily life:

- Car design sheet (class) creates Car A, Car B, Car C (objects).
- Recipe (class) creates many cakes (objects).

## State and Behavior

Every object has two parts:

1. State - the data (what it has).
2. Behavior - the actions (what it can do).

For a student object:

- State: name, roll number, marks.
- Behavior: study(), play(), attendClass().

In Java:

- State becomes variables (fields).
- Behavior becomes methods.

```text
╔════════════════════════════════════════════════════════════════════════╗
║                           STATE AND BEHAVIOR                           ║
╠════════════════════════════════════════════════════════════════════════╣
║                       ┌────────────────────────┐                       ║
║                       │     Student object     │                       ║
║                       └────────────────────────┘                       ║
║                                   ▼                                    ║
║ ┌────────────────────────────────┐  ┌────────────────────────────────┐ ║
║ │State - name, rollNumber, marks │  │     Behavior - study, play     │ ║
║ └────────────────────────────────┘  └────────────────────────────────┘ ║
╚════════════════════════════════════════════════════════════════════════╝
```

## The Pillars of OOP

Four big ideas form OOP. Each is explained in detail in later files, but here is the simple introduction.

1. Encapsulation
   Keep data safe inside an object and control access to it.

2. Inheritance
   A new class takes properties from an existing class.

3. Polymorphism
   One thing can behave in different ways.

4. Abstraction
   Hide the complex details, show only the needed parts.

## Why Java Uses OOP

Java is designed around classes. Almost every Java file starts with a class. Even the simplest program has a class with a main method.

So in Java:

- Every program is organized in classes.
- Objects are created from classes with the keyword `new`.
- Data and behavior live together.

## How This Changes the Way We Code

Before OOP, a program looked like this (procedural thinking):

```
read numbers
add numbers
print numbers
```

With OOP, the same program is grouped into things:

```
Calculator class:
    has: no state needed
    can: add(numbers), print()

main:
    let calc = new Calculator()
    calc.add(...)
    calc.print(...)
```

Both solve the same problem. OOP just organizes it better.

## Simple Java Preview

```java
class Student {
    String name;      // state
    int rollNumber;   // state

    void study() {    // behavior
        System.out.println(name + " is studying");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();   // object creation
        s.name = "Rahul";
        s.rollNumber = 7;
        s.study();                   // Rahul is studying
    }
}
```

Do not worry about every detail now. The next files explain every line of this program step by step.

## Important Points

- Class = blueprint.
- Object = real thing made from the blueprint.
- State = data (fields).
- Behavior = actions (methods).
- One class can create many objects.
- Encapsulation, inheritance, polymorphism, abstraction are the four pillars.

## Common Interview Questions

Q. What is a class and what is an object?

A. A class is a blueprint with state and behavior. An object is an actual instance of a class created at runtime.

Q. How many objects can one class create?

A. As many as needed. Creating an object costs some memory for each one.

Q. Difference between state and behavior?

A. State is the data an object holds. Behavior is the actions it can perform.

Next: Classes and objects - writing them in Java.