# Java Architecture: JVM, JRE, JDK

This file explains the three most important pieces of Java in simple language. These three names confuse almost every beginner, so read slowly.

## The Three Pieces

```text
╔════════════════════════════════╗
║        THE THREE PIECES        ║
╠════════════════════════════════╣
║ ┌────────────────────────────┐ ║
║ │   JDK - Development Kit    │ ║
║ └────────────────────────────┘ ║
║               ▼                ║
║ ┌────────────────────────────┐ ║
║ │ JRE - Runtime Environment  │ ║
║ └────────────────────────────┘ ║
║               ▼                ║
║ ┌────────────────────────────┐ ║
║ │   JVM - Virtual Machine    │ ║
║ └────────────────────────────┘ ║
╚════════════════════════════════╝
```

Rules to remember:

- JDK contains JRE.
- JRE contains JVM.
- So JDK is the biggest, JRE is in the middle, JVM is the smallest.

## JVM - Java Virtual Machine

What it is: JVM is the machine that actually runs Java bytecode.

Simple definition: the JVM is a software "machine" that converts bytecode into machine instructions and runs your program.

Key facts:

- Each operating system has its own JVM.
- The same bytecode runs on different JVMs. This is what makes Java platform independent.
- The JVM also manages memory and cleans up unused objects (done by a part called the Garbage Collector).

```text
╔════════════════════════════╗
║     JVM IN THE MIDDLE      ║
╠════════════════════════════╣
║ ┌────────────────────────┐ ║
║ │    Bytecode .class     │ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │          JVM           │ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │  Machine instructions  │ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │         Output         │ ║
║ └────────────────────────┘ ║
╚════════════════════════════╝
```

The JVM is not a physical machine. It is software that pretends to be a machine.

## JRE - Java Runtime Environment

What it is: JRE is everything needed to run a Java program.

Simple definition: the JRE is the environment that provides the JVM plus the basic libraries Java programs need to run.

JRE = JVM + core libraries (like the code for printing, reading, and math operations).

Key facts:

- If you only want to run Java programs (not write them), you only need the JRE.
- The JRE does NOT include the compiler.

## JDK - Java Development Kit

What it is: JDK is everything needed to develop and run Java programs.

Simple definition: the JDK is the full toolkit for Java developers. It includes tools to write, compile, and run Java programs.

JDK = JRE + development tools.

The main tool is `javac`, the Java compiler. The JDK also includes `java` (used to run programs) and many other utilities.

Key facts:

- Developers install the JDK.
- The JDK contains the JRE, and the JRE contains the JVM.
- If you want to write Java code, you must install the JDK.

## Relationship in One Diagram

```text
╔════════════════════════════╗
║   CONTAINS RELATIONSHIP    ║
╠════════════════════════════╣
║ ┌────────────────────────┐ ║
║ │     JDK (biggest)      │ ║
║ └────────────────────────┘ ║
║          contains          ║
║ ┌────────────────────────┐ ║
║ │          JRE           │ ║
║ └────────────────────────┘ ║
║          contains          ║
║ ┌────────────────────────┐ ║
║ │          JVM           │ ║
║ └────────────────────────┘ ║
╚════════════════════════════╝
```

Read this diagram as:

```
JDK  =  JRE  +  development tools (compiler, etc.)
JRE  =  JVM  +  core libraries
JDK  =  JVM  +  core libraries  +  development tools
```

## What Each One Does (Simple Table)

| Name | Full form | What it does | Do you need it to write code? |
| --- | --- | --- | --- |
| JVM | Java Virtual Machine | Runs bytecode | No |
| JRE | Java Runtime Environment | Provides JVM and libraries to run programs | No |
| JDK | Java Development Kit | Provides compiler + JRE to build programs | Yes |

## Complete Flow of Program Execution

```text
╔══════════════════════════════════════════╗
║    COMPLETE FLOW OF PROGRAM EXECUTION    ║
╠══════════════════════════════════════════╣
║ ┌──────────────────────────────────────┐ ║
║ │         You write Hello.java         │ ║
║ └──────────────────────────────────────┘ ║
║                    ▼                     ║
║ ┌──────────────────────────────────────┐ ║
║ │      javac from JDK compiles it      │ ║
║ └──────────────────────────────────────┘ ║
║                    ▼                     ║
║ ┌──────────────────────────────────────┐ ║
║ │         Hello.class bytecode         │ ║
║ └──────────────────────────────────────┘ ║
║                    ▼                     ║
║ ┌──────────────────────────────────────┐ ║
║ │          JRE loads bytecode          │ ║
║ └──────────────────────────────────────┘ ║
║                    ▼                     ║
║ ┌──────────────────────────────────────┐ ║
║ │           JVM executes it            │ ║
║ └──────────────────────────────────────┘ ║
║                    ▼                     ║
║ ┌──────────────────────────────────────┐ ║
║ │       Program output on screen       │ ║
║ └──────────────────────────────────────┘ ║
╚══════════════════════════════════════════╝
```

## Easy Interview Explanation

If an interviewer asks "Explain JVM, JRE and JDK", say this:

"Java source code is compiled by the Java compiler into bytecode. This bytecode runs on the JVM, which is a virtual machine that converts bytecode into machine instructions. The JRE is the JVM plus the libraries needed to run Java programs. The JDK is the JRE plus development tools like the compiler. So the JDK is the biggest, it contains the JRE, and the JRE contains the JVM."

Keep this short and natural. Do not memorize a long paragraph.

## Important

- One file, can you compile without JRE? No, javac comes with the JDK.
- One file, can you run without JDK? Yes, if the JRE is installed.
- The JVM is different for each operating system, but Java code stays the same everywhere.

## Common Interview Questions

Q. Why is Java called platform independent?

A. Because Java compiles to bytecode, which does not depend on any operating system. Any system that has a JVM can run the same bytecode.

Q. What is the difference between JDK, JRE and JVM?

A. JVM runs bytecode. JRE = JVM + libraries needed for running programs. JDK = JRE + development tools like the compiler.

Q. What is inside the JDK?

A. The JDK contains the JRE, the JVM, the compiler `javac`, the runtime `java`, and other development tools.

Next: Java syntax - the structure of a Java program.