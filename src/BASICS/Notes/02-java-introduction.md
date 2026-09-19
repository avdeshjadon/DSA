# Java Introduction

## What is Java?

Java is a general-purpose, object-oriented programming language.

Simple definition: Java is a programming language used to build software that can run on many different devices without changing the code.

It was created by James Gosling at Sun Microsystems and released in 1995. Today it is one of the most popular languages in the world.

## Why Java Exists

Before Java, programs written for one type of computer often failed to run on another type. The main goal of Java was to fix this.

Java was designed so that:

- The same program runs on Windows, Mac, Linux, and Android.
- Code is safe and reliable.
- Programs can run anywhere with a Java runtime installed.

The main idea is expressed by one slogan:

"Write once, run anywhere."

## Write Once, Run Anywhere

```text
╔══════════════════════════════════════════════════════════════════════════════════════════════════╗
║                                     WRITE ONCE, RUN ANYWHERE                                     ║
╠══════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                ┌────────────────────────────────┐                                ║
║                                │        Java source code        │                                ║
║                                └────────────────────────────────┘                                ║
║                                                ▼                                                 ║
║                                ┌────────────────────────────────┐                                ║
║                                │            Compiler            │                                ║
║                                └────────────────────────────────┘                                ║
║                                                ▼                                                 ║
║                                ┌────────────────────────────────┐                                ║
║                                │Bytecode - same for all systems │                                ║
║                                └────────────────────────────────┘                                ║
║ ┌────────────────────────────┐   ┌────────────────────────────┐   ┌────────────────────────────┐ ║
║ │       JVM on Windows       │   │         JVM on Mac         │   │        JVM on Linux        │ ║
║ └────────────────────────────┘   └────────────────────────────┘   └────────────────────────────┘ ║
╚══════════════════════════════════════════════════════════════════════════════════════════════════╝
```

The program is compiled once into bytecode. Every system has its own JVM that understands this bytecode. So the same bytecode runs everywhere.

## Features of Java

- Simple
  Java removed many difficult features of older languages (like pointers in C).
- Object-oriented
  Java is built around classes and objects.
- Platform independent
  The same bytecode runs on different operating systems.
- Secure
  Java runs code in a controlled environment, which reduces danger.
- Robust
  Java handles errors well and has strong memory safety.
- Portable
  Programs can move between machines easily.
- Multi-threaded
  Java can do many tasks at the same time (advanced topic, not needed yet).

## Where Java is Used

- Android mobile apps
- Web applications and backend servers (for example in banking and e-commerce)
- Desktop applications
- Big data tools (for example Hadoop)
- Enterprise banking and trading software
- Cloud applications
- Data structures and algorithm practice (what this course uses)

## Why Java is Popular

- It has been used for decades, so there are millions of projects already in Java.
- It is stable and reliable.
- It has a huge collection of ready-made libraries.
- It is a common first language taught in universities.
- Most big companies still hire Java developers.
- It is one of the best languages for learning DSA and OOP properly.

## Java Compared with General Programming Languages

| Feature | Java | Python | C | JavaScript |
| --- | --- | --- | --- | --- |
| Style | Object-oriented | Object-oriented | Procedural | Object-oriented |
| Runs on | On the JVM | Directly via interpreter | Compiled to machine code | Runs in a browser or Node |
| Compile step | Compiled to bytecode | Interpreted | Compiled to machine code | Interpreted |
| Easy to read | Moderate | Very easy | Harder | Moderate |
| Uses | Backend, Android, big data | Data science, scripting | Operating systems, systems | Websites, apps |

No language is "best". Each is best for different work. Java is chosen here because it teaches OOP clearly, has strict rules that build discipline, and is widely used in industry.

## The Journey of a Java Program

A Java program travels through several stages:

1. Write source code (a `.java` file).
2. Compile it with the Java compiler (`javac`).
3. The compiler produces bytecode (a `.class` file).
4. The Java Virtual Machine (JVM) reads the bytecode.
5. The JVM converts it into machine instructions.
6. The machine executes the program and gives output.

```text
╔══════════════════════════════════════════════╗
║          JOURNEY OF A JAVA PROGRAM           ║
╠══════════════════════════════════════════════╣
║ ┌──────────────────────────────────────────┐ ║
║ │      Java source code - Hello.java       │ ║
║ └──────────────────────────────────────────┘ ║
║                      ▼                       ║
║ ┌──────────────────────────────────────────┐ ║
║ │           Java compiler javac            │ ║
║ └──────────────────────────────────────────┘ ║
║                      ▼                       ║
║ ┌──────────────────────────────────────────┐ ║
║ │          Bytecode - Hello.class          │ ║
║ └──────────────────────────────────────────┘ ║
║                      ▼                       ║
║ ┌──────────────────────────────────────────┐ ║
║ │            JVM reads bytecode            │ ║
║ └──────────────────────────────────────────┘ ║
║                      ▼                       ║
║ ┌──────────────────────────────────────────┐ ║
║ │           Machine instructions           │ ║
║ └──────────────────────────────────────────┘ ║
║                      ▼                       ║
║ ┌──────────────────────────────────────────┐ ║
║ │       Program execution and output       │ ║
║ └──────────────────────────────────────────┘ ║
╚══════════════════════════════════════════════╝
```

## Java Source Code

A Java program starts as a text file with the extension `.java`.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Java is fun");
    }
}
```

## Compilation

Compilation is the process of converting source code into bytecode.

Command:

```bash
javac Main.java
```

After this, a file named `Main.class` is created. This file contains bytecode.

## Execution

Execution is the process of running the bytecode on the JVM.

Command:

```bash
java Main
```

The JVM loads the bytecode, converts it into machine instructions, and runs the program.

## Important

- The `.java` file is for humans to read and edit.
- The `.class` file contains bytecode produced by the compiler.
- Bytecode is the same on every system. This is why Java is platform independent.
- The JVM is different on each system, but the bytecode is the same.

## Common Interview Questions

Q. What is Java?

A. Java is an object-oriented programming language that runs on the JVM, which makes it platform independent.

Q. What does "write once, run anywhere" mean?

A. Java code is compiled into bytecode once. This bytecode runs on the JVM of any operating system, so no change is needed for different platforms.

Q. What is bytecode?

A. Bytecode is the intermediate result of Java compilation. It sits between source code and machine code and is executed by the JVM. Bytecode files have the `.class` extension.

Q. Which files does javac produce?

A. `javac` converts `.java` files into `.class` files containing bytecode.

Next: Java Architecture - how the JVM, JRE and JDK work together.