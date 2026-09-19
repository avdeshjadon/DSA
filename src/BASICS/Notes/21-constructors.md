# Constructors

## What is a Constructor?

A constructor is a special method that runs automatically when an object is created.

Simple definition: a constructor sets up a new object the moment it is born.

```java
class Student {
    Student() {
        System.out.println("A student object was created");
    }
}
```

This constructor runs when we write:

```java
Student s = new Student();   // prints the message
```

## Why Constructors Exist

The main job of a constructor is initial setup. Without a constructor, every field would need manual assignment after creating the object. A constructor lets us set up the object in one step.

```java
Student s = new Student("Rahul", 7);   // object ready in one line
```

## Rules for Constructors

- The constructor name is exactly the class name.
- A constructor has no return type, not even void.
- A constructor is usually public.

```java
class Student {
    Student() {
    }
}
```

## Default Constructor

If you write no constructor at all, Java gives the class a default constructor. It has no parameters and does nothing except create the object.

```java
class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();   // uses the hidden default constructor
        s.name = "Rahul";
    }
}
```

The default constructor exists only when the class has no constructors of its own. If you write any constructor, Java removes the default one.

## Parameterized Constructor

A constructor that takes parameters sets field values with them.

```java
class Student {
    String name;
    int rollNumber;

    Student(String n, int r) {
        name = n;
        rollNumber = r;
    }

    void show() {
        System.out.println(name + " " + rollNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 7);
        s.show();
    }
}
```

Output:

```
Rahul 7
```

The object is fully ready immediately after creation.

## Constructor Overloading

Two constructors with the same name but different parameter lists is called overloading. Java picks the correct one based on the arguments.

```java
class Student {
    String name;
    int rollNumber;

    Student() {
        name = "No name";
        rollNumber = 0;
    }

    Student(String n) {
        name = n;
        rollNumber = 0;
    }

    Student(String n, int r) {
        name = n;
        rollNumber = r;
    }
}
```

Calls:

```java
Student a = new Student();               // first constructor
Student b = new Student("Priya");        // second constructor
Student c = new Student("Aman", 5);      // third constructor
```

Java compares the number and types of arguments to choose the constructor. Same rule as method overloading.

## this Keyword - First Look

`this` refers to the current object inside the class.

Constructor parameters often use the same names as fields. `this` tells Java which is which.

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;   // left = field, right = parameter
    }
}
```

- `this.name` is the field of the current object.
- `name` alone is the parameter.

Common interview point: without `this`, `name = name;` assigns the parameter to itself and the field is never set.

## Constructor vs Method

| Point | Constructor | Method |
| --- | --- | --- |
| Name | same as the class | any valid name |
| Return type | none at all | must have one, even void |
| Called by | new keyword, automatically | by name from code |
| Runs | once when the object is created | any number of times |
| Purpose | set up the object | perform any task |

## Important Points

- A constructor runs automatically on object creation.
- It has no return type.
- Class name == constructor name.
- Java adds a default constructor only when no constructor exists.
- Overloading works for constructors exactly like methods.
- `this` separates the field from a same-named parameter.

## Common Mistakes

- Writing a return type like `void Student()` - then it is a normal method, not a constructor.
- Writing the constructor name with any other case than the class name.
- Forgetting that adding any constructor removes the default one.
- Expecting a constructor to be callable like a normal method.

## Common Interview Questions

Q. What is a constructor?

A. A special method with no return type, named the same as the class, that runs automatically when an object is created.

Q. What is the default constructor?

A. A no-argument constructor Java writes automatically when no constructor is declared in the class.

Q. What is constructor overloading?

A. Having multiple constructors with different parameters in the same class.

Q. Difference between a constructor and a method?

A. Constructor has no return type, has the class name, and runs once at object creation. Methods have return types and run when called.

Q. Why is `this` used in a constructor?

A. To distinguish the field from a parameter with the same name. `this.name` refers to the object's field.

Next: Packages - organizing classes.