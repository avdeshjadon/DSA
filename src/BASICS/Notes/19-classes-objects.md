# Classes and Objects in Java

## Creating a Class

A class is written with the `class` keyword followed by a name and a body of curly braces.

```java
class Student {
    String name;
    int rollNumber;

    void study() {
        System.out.println(name + " is studying");
    }
}
```

Inside the class:

- Fields: the variables `name` and `rollNumber`. These are the state.
- Methods: `study()`. This is the behavior.

## Fields

Fields are variables declared inside a class but outside any method. They store the state of an object.

```java
class Student {
    String name;    // field
    int age;        // field
}
```

## Methods

Methods are the actions the object can perform. A method named study is declared like this:

```java
void study() {
    System.out.println("Studying");
}
```

Full details on methods are in the Methods file.

## Creating an Object

The `new` keyword creates an object from a class.

```java
Student student1 = new Student();
```

What happens on this line:

| Part | Meaning |
| --- | --- |
| Student | the type (the class name) |
| student1 | the variable holding the object |
| new | creates the actual object in memory |
| Student() | calls the constructor to set up the object |

The object lives in memory. The variable `student1` stores its location, called a reference.

## Object Reference

The object is created in memory (on the heap). The variable is simply a pointer to it.

```text
╔════════════════════════════════════════════════════════════════╗
║             REFERENCE - VARIABLE POINTS TO OBJECT              ║
╠════════════════════════════════════════════════════════════════╣
║    ┌──────────────────────┐     ┌────────────────────────────┐ ║
║    │  Variable student1   │     │      Object in memory      │ ║
║    └──────────────────────┘     └────────────────────────────┘ ║
║                               ▼                                ║
║                    ┌──────────────────────┐                    ║
║                    │   name, rollNumber   │                    ║
║                    └──────────────────────┘                    ║
╚════════════════════════════════════════════════════════════════╝
```

Two variables can point to the same object:

```java
Student a = new Student();
Student b = a;     // b points to the same object
a.name = "Rahul";
System.out.println(b.name);   // Rahul - same object changed
```

Both `a` and `b` refer to one object. Changing through `a` is visible through `b`.

## Accessing Fields

Use the dot operator: `objectName.fieldName`.

```java
Student s = new Student();
s.name = "Rahul";
s.rollNumber = 7;
System.out.println(s.name);   // Rahul
```

## Calling Methods

Also with the dot operator: `objectName.methodName()`.

```java
Student s = new Student();
s.name = "Rahul";
s.study();   // Rahul is studying
```

## Complete Example

```java
class Student {
    String name;
    int rollNumber;

    void study() {
        System.out.println(name + " is studying");
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + rollNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.rollNumber = 7;
        s1.showInfo();
        s1.study();

        Student s2 = new Student();
        s2.name = "Priya";
        s2.rollNumber = 12;
        s2.showInfo();
    }
}
```

Output:

```
Name: Rahul
Roll: 7
Rahul is studying
Name: Priya
Roll: 12
```

Note how two objects (`s1` and `s2`) each hold their own copies of the fields.

## Why the new Keyword Exists

Without `new`, there is no actual object. The class is only a blueprint. `new` reserves memory and builds a real object.

```java
Student s;          // only a variable, no object yet
s = new Student();  // now an object exists and s points to it
```

Accessing a field before creating the object gives a NullPointerException because no object exists.

## Memory Idea (Beginner Level)

- Fields are stored inside memory for each object separately.
- The method code is stored once per class and shared by all objects.
- Each object gets: its own name, its own roll number.

## When an Object Has No Value

Every field gets a default value when an object is created:

| Field type | Default |
| --- | --- |
| int | 0 |
| double | 0.0 |
| boolean | false |
| String or any object | null |

```java
Student s = new Student();
System.out.println(s.rollNumber);   // 0
System.out.println(s.name);         // null
```

## Common Mistakes

- Forgetting `new` and writing `Student s = Student();` - this does not compile.
- Calling a method on an object that was never created.
- Writing fields inside a method instead of inside the class.
- Expecting objects to be copied when assigned with `=` (they are only referenced).

## Important Points

- Class is a blueprint. Object is the real thing.
- `new` creates an object in memory.
- Dot operator `.` accesses fields and methods.
- Each object has its own copy of the fields.
- Object variables hold references, not the objects themselves.

## Common Interview Questions

Q. What does `new Student()` do?

A. It creates an object of the Student class in memory and returns its reference.

Q. What happens when two variables refer to the same object?

A. Both see the same object. A change through one variable is visible through the other.

Q. What is the default value of an int field in an object?

A. 0. Reference fields default to null.

Next: Methods.