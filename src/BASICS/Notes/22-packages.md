# Packages

## What is a Package?

A package is a folder (directory) that groups related classes together.

Simple definition: a package organizes classes into a clean structure, like folders on a computer.

## Why Packages Are Used

- To avoid name clashes. Two classes named Calculator can exist if they are in different packages.
- To organize a large project into logical groups.
- To control access (covered in Access Modifiers).
- To make distribution of code reusable.

## Creating a Package

Put this line at the very top of the Java file. It must be the first statement.

```java
package basics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inside basics package");
    }
}
```

The file must be placed inside a folder named `basics`.

```text
╔══════════════════════════════════════════════════════════════════════════════════════════════════╗
║                                     PROJECT FOLDER STRUCTURE                                     ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                      ┌────────────────────┐                                      ║
║                                      │   Project folder   │                                      ║
║                                      └────────────────────┘                                      ║
║                                                ▼                                                 ║
║                                              ▼   ▼                                               ║
║             ┌────────────────────┐                            ┌────────────────────┐             ║
║             │   basics folder    │                            │    game folder     │             ║
║             └────────────────────┘                            └────────────────────┘             ║
║ ┌────────────────────┐  ┌────────────────────┐                ┌────────────────────┐             ║
║ │     Main.java      │  │    Student.java    │                │    Player.java     │             ║
║ └────────────────────┘  └────────────────────┘                └────────────────────┘             ║
╚══════════════════════════════════════════════════════════════════════════════════════════════════╝
```

## Import

The `import` statement brings a class from another package into use.

```java
import java.util.Scanner;
```

After this line, the Scanner class can be used without writing its full path every time.

Without import, we must write the full name each time:

```java
java.util.Scanner sc = new java.util.Scanner(System.in);
```

Importing once is much cleaner.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
    }
}
```

## java.lang - The Special Package

`java.lang` contains the most basic classes: String, Math, System, and so on.

This package is imported automatically in every Java file. That is why we can use String and System without any import.

```java
String name = "Java";        // no import needed
System.out.println(name);    // no import needed
```

## Common Java Packages

| Package | What it contains |
| --- | --- |
| java.lang | core classes: String, Math, System - always available |
| java.util | utility classes: Scanner, Random, ArrayList |
| java.io | input and output classes |
| java.net | networking classes |
| java.time | date and time classes |

```java
import java.util.Random;

Random r = new Random();
int number = r.nextInt(100);
```

## Package Naming Conventions

- Package names are all lowercase.
- No spaces or special symbols.
- Companies use their reversed domain name, for example `com.example.myapp`.

| Wrong name | Correct name |
| --- | --- |
| MyPackage | mypackage |
| school-notes | school.notes |

## Writing Your Own Package Step by Step

1. Create a folder named `mypack`.
2. Write a class file with `package mypack;` as the first line.
3. Save it as `mypack/Helper.java`.
4. From another file, import it: `import mypack.Helper;`.
5. Use it normally.

## Importing Everything from a Package

```java
import java.util.*;
```

The asterisk imports all classes of the package. It is simpler but imports more than needed. Prefer importing only what you use.

## Common Mistakes

- Writing the package statement anywhere except the first line.
- Importing java.lang - it needs no import.
- Using uppercase letters in a package name.
- Importing a class that does not exist in the package.

## Important Points

- Package = folder for grouping classes.
- import brings classes from other packages.
- java.lang is automatically imported.
- Package names are lowercase.
- Same class names can exist in different packages.

## Common Interview Questions

Q. What is a package?

A. A group of related classes organized in a folder-like structure.

Q. What is the purpose of the import statement?

A. To use classes from other packages without writing their full package names.

Q. Why do we not import java.lang?

A. Because Java imports it automatically for every program.

Q. What is the difference between package and import?

A. package declares where a class belongs. import brings a class from another package into use.

Next: Access modifiers - who can see what.