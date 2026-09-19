# Variable Scope and Parameters

## What is Scope?

Scope is the part of the program where a variable can be used.

Simple definition: scope answers "where can I see this variable?"

A variable is alive only inside the block `{}` where it was declared.

```java
public class Main {
    public static void main(String[] args) {
        int a = 10;                    // visible in the whole main method

        if (a > 5) {
            int b = 20;                // visible only inside this if block
            System.out.println(a + b); // a and b both fine here
        }

        // System.out.println(b);      // ERROR - b does not exist here
        System.out.println(a);         // fine - a still exists
    }
}
```

`b` was declared inside the if block, so after the block ends, `b` is gone.

## Method-Level Scope

A variable declared inside a method is visible from its declaration to the end of that method.

```java
void example() {
    int x = 5;
    System.out.println(x);   // fine
}
```

It cannot be seen by any other method.

```java
void first() {
    int x = 5;
}

void second() {
    // System.out.println(x);   // ERROR - x is only in first()
}
```

## Block-Level Scope

A block is any `{}` section: an if block, a loop body, or a nested block.

Variables declared inside a block are visible only inside that block.

```java
for (int i = 1; i <= 3; i++) {
    int square = i * i;       // square exists only in this round
    System.out.println(square);
}
// System.out.println(square);   // ERROR - square gone
```

## Types of Variables by Position

1. Local variables
   Declared inside a method or block. They live only there.

2. Instance variables (fields)
   Declared inside a class, outside methods. Every object has its own copy.

3. Class (static) variables
   Declared with the `static` keyword. One copy shared by all objects of the class.

```java
class Student {
    static String school = "Springfield";   // class variable - one copy
    String name;                            // instance variable - per object

    void study() {
        int hours = 2;                      // local variable - inside study
        System.out.println(hours);
    }
}
```

| Kind | Where declared | Copy count | Lifetime |
| --- | --- | --- | --- |
| Local | inside a method or block | per call | until the block ends |
| Instance | inside a class | one per object | linked to the object |
| Static | inside a class with static | one for the whole class | as long as the class is loaded |

## Local vs Instance Variable

- Local variables must be initialized before use, otherwise Java gives "variable might not have been initialized".
- Instance variables get default values automatically (0, null, false).

```java
class Student {
    int marks;            // default 0, no error

    void show() {
        int bonus;        // no default value
        // System.out.println(bonus);   // ERROR - not initialized
    }
}
```

## Parameters

Parameters are the variables listed in a method's declaration. They behave like local variables.

```java
static void add(int a, int b) {
    System.out.println(a + b);
}
```

`a` and `b` are parameters. They exist only inside `add`.

## Formal Parameter vs Actual Argument

- Formal parameter: the variable written in the method declaration.
- Actual argument: the value passed when the method is called.

```java
static void add(int a, int b) {   // a and b are formal parameters
    System.out.println(a + b);
}

public static void main(String[] args) {
    add(10, 20);                  // 10 and 20 are actual arguments
}
```

| Term | Where | Example |
| --- | --- | --- |
| Parameter | in the method declaration | int a, int b |
| Argument | in the method call | 10, 20 |

The arguments must match the parameters in number, order, and type.

## Pass by Value

Java is always pass-by-value.

Meaning: when a method is called, Java copies the value of each argument into the parameter. The method works on the copy.

If the argument is a primitive (int, double...), the method cannot change the original variable.

```java
public class Main {

    static void change(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        int number = 5;
        change(number);
        System.out.println(number);   // still 5
    }
}
```

Inside `change`, x became 100, but that was a copy. The original `number` in main stayed 5.

```text
╔════════════════════════════╗
║ PASS BY VALUE - PRIMITIVE  ║
╠════════════════════════════╣
║ ┌────────────────────────┐ ║
║ │     int number = 5     │ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │     change(number)     │ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │   int x = 5  (copy)    │ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │x = 100  (only the copy)│ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │ number still 5 in main │ ║
║ └────────────────────────┘ ║
╚════════════════════════════╝
```

Dry run:

| Step | value of number (main) | value of x (copy) |
| --- | --- | --- |
| before call | 5 | - |
| call passes 5 | 5 | 5 |
| x = 100 | 5 | 100 |
| method ends | 5 | gone |

## Pass by Reference - The Misconception

With objects, a common myth exists that Java is pass-by-reference. It is not.

The reference (the memory address) is passed by value. So:

- The method receives a copy of the reference.
- The copy points to the same object.
- Changing the object's fields through either reference changes the real object.
- But reassigning the parameter to a new object does NOT change the caller's variable.

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Main {

    static void setName(Student s) {
        s.name = "Rahul";      // changes the same object - visible outside
    }

    static void swap(Student a, Student b) {
        Student temp = a;
        a = b;
        b = temp;              // only swaps the local copies
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aman");
        Student s2 = new Student("Priya");

        setName(s1);
        System.out.println(s1.name);   // Rahul - object changed

        swap(s1, s2);                  // tries to swap references
        System.out.println(s1.name);   // still Rahul - swap failed
    }
}
```

Why the swap failed: the swap happened on copied references inside the method. Outside, the variables `s1` and `s2` still point where they pointed before.

```text
╔════════════════════════════════════════════════════════════╗
║              PASS BY VALUE - OBJECT REFERENCE              ║
╠════════════════════════════════════════════════════════════╣
║ ┌──────────────────────────┐  ┌──────────────────────────┐ ║
║ │   s1 - reference copy    │  │  Student object (Rahul)  │ ║
║ └──────────────────────────┘  └──────────────────────────┘ ║
║                             ▼                              ║
║                ┌──────────────────────────┐                ║
║                │swap only moves the copies│                ║
║                └──────────────────────────┘                ║
╚════════════════════════════════════════════════════════════╝
```

## Key Rule to Remember

- Primitive argument: method cannot change the original value.
- Object argument: method can change the object's contents, but cannot point the caller's variable to a different object.

Never say "Java is pass-by-reference". Correct answer: "Java is pass-by-value. For objects, the value being passed is the reference."

## Common Mistakes

- Expecting a method to change a primitive variable outside it.
- Thinking that objects are passed by reference in Java.
- Declaring a variable in a block and using it outside that block.
- Naming a parameter the same as a field and then forgetting `this` (covered in Constructors).

## Important Points

- Scope is decided by the block `{}` where the variable is declared.
- Local variables need initialization.
- Instance variables get defaults.
- Parameter = declaration. Argument = call.
- Java is pass-by-value for primitives and references.

## Common Interview Questions

Q. What is the difference between a formal parameter and an actual argument?

A. The formal parameter is the variable written in the method declaration. The actual argument is the value passed in the call.

Q. Is Java pass-by-value or pass-by-reference?

A. Java is pass-by-value. For objects, the value passed is the reference, so the method can modify the object's contents but cannot reassign the caller's variable.

Q. Can a method change a primitive variable from the caller?

A. No. The method works on a copy.

Q. What are the scopes of a local and an instance variable?

A. Local variables exist only inside the method or block where they are declared. Instance variables exist as long as the object exists, one copy for every object.

Next: DSA transition and time complexity.