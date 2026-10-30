# Programming Fundamentals

This is the first file in the series. It answers the most basic question: what is programming?

## What is Programming?

Programming is the process of giving instructions to a computer so that it can do a task for us.

The computer cannot think on its own. It only follows instructions. We write those instructions. That act of writing instructions is called programming.
#### Simple definition: programming means giving step-by-step instructions to a computer.

## What is a Program?

A program is a set of instructions written in a programming language that tells the computer what to do.

Example: a program that adds two numbers tells the computer:
1. Read the first number.
2. Read the second number.
3. Add them.
4. Show the result.

## What is a Programming Language?

Computers do not understand human languages like English or Hindi. They understand only two numbers: 0 and 1.

A programming language is a middle ground. It uses simple English-like words that humans can read, and later it is converted into 0s and 1s that the computer can understand.

Examples of programming languages: Java, Python, C, C++, JavaScript.

#### Simple definition: a programming language is a formal language used to write programs.


## How a Program Works at a Basic Level

```text
╔════════════════════════════════════════════╗
║            HOW A PROGRAM WORKS             ║
╠════════════════════════════════════════════╣
║ ┌────────────────────────────────────────┐ ║
║ │        Human writes source code        │ ║
║ └────────────────────────────────────────┘ ║
║                     ▼                      ║
║ ┌────────────────────────────────────────┐ ║
║ │  Compiler or interpreter converts it   │ ║
║ └────────────────────────────────────────┘ ║
║                     ▼                      ║
║ ┌────────────────────────────────────────┐ ║
║ │       Machine code of 0s and 1s        │ ║
║ └────────────────────────────────────────┘ ║
║                     ▼                      ║
║ ┌────────────────────────────────────────┐ ║
║ │     Computer executes instructions     │ ║
║ └────────────────────────────────────────┘ ║
║                     ▼                      ║
║ ┌────────────────────────────────────────┐ ║
║ │        Result shown to the user        │ ║
║ └────────────────────────────────────────┘ ║
╚════════════════════════════════════════════╝
```

The computer executes each instruction one by one, very fast.

## Real-World Applications of Programming

Programming is everywhere. Below is a small list with a simple explanation for each.

| Application | Description |
| --- | --- |
| Websites | Websites like Google and YouTube are programs that run on servers and send pages to your browser. |
| Mobile applications | Apps like WhatsApp and Instagram are programs written for phones. |
| Desktop applications | Software like Microsoft Word and VS Code runs directly on your computer. |
| Banking | Banks use programs to store account details, transfer money, and keep transactions secure. |
| E-commerce | Online shopping sites like Amazon use programs to show products, manage carts, and process payments. |
| Games | Games are programs that handle graphics, player input, and game rules. |
| Automation | Factories and software pipelines use programs to do repetitive work automatically. |
| Cloud systems | Services like Google Drive and AWS run on massive programs spread across many computers. |
| Artificial intelligence | AI systems use programs that learn patterns from data. |
| Data processing | Programs help process huge amounts of data quickly, like analyzing sales reports. |
| Embedded systems | Small programs run inside washing machines, cars, and TVs. |
| Testing | Programs are used to test other programs automatically. |
| Cybersecurity | Programs protect systems, detect attacks, and keep data safe. |
## Problem Solving

Before writing code, a programmer must first understand the problem.

Problem solving in programming means:
1. Understand the problem completely.
2. Break it into small steps.
3. Find a way to solve each step.
4. Write those steps in code.
5. Test whether the result is correct.

> Coding is only the last part. Most of programming is thinking, not typing.

## Algorithm

An algorithm is a step-by-step methode to solve a problem.

The steps must be clear, complete, and in the correct order.

Example: algorithm to make tea.
1. Boil water.
2. Add tea leaves.
3. Add milk and sugar.
4. Heat for 2 minutes.
5. Pour into a cup.

Example: algorithm to add two numbers.
1. Take input number A.
2. Take input number B.
3. Calculate sum = A + B.
4. Print sum.

> An algorithm is language independent. The same algorithm can be written in Java, Python, or C.

## Compiler

A compiler is a program that translates the entire source code written in a high-level programming language into machine code or another executable form before running it.

During compilation, the compiler checks the code for errors, analyzes the instructions, and generates output that the computer can execute.

After successful compilation, a separate executable file may be created, which can be run later without compiling the source code again.

- Example: C, C++, Rust, Go.

Simple line to remember: the compiler translates your code first, generates an executable, and then the computer runs it.

## Interpreter

An interpreter is a program that reads, processes, and executes source code at runtime.

In a traditional interpreted approach, the interpreter processes instructions one by one and executes them without requiring a separate native executable to be generated beforehand.

If an error occurs during execution, the interpreter reports the error and may stop the program.

- Example: Python, JavaScript, Ruby, PHP.

Simple line to remember: the interpreter processes your code at runtime and executes the instructions as it goes.

## Difference Between Compiler and Interpreter

| Feature | Compiler | Interpreter |
| --- | --- | --- |
| Translation | Translates source code before execution | Processes code during runtime |
| Execution | Executes the generated output | Executes through an interpreter or runtime |
| Output | May generate a separate executable file | Usually does not generate a separate native executable |
| Speed | Generally faster after compilation | May have additional interpretation overhead |
| Error reporting | Reports compilation errors before execution | Runtime errors can occur during execution |
| Portability | Native executables may be platform-dependent | Source code can run wherever a compatible runtime is available |
| Examples | C, C++, Rust, Go | Python, JavaScript, Ruby, PHP |

> **Modern programming languages do not always follow a purely compiled or interpreted approach.** Some languages combine both techniques for better performance and flexibility.
>
> **Java** is a good example of this combination. Its source code (`.java`) is first compiled into **bytecode (`.class`)** by the Java compiler (`javac`). This bytecode is then executed by the **Java Virtual Machine (JVM)**, which uses an **Interpreter** to execute instructions and a **JIT (Just-In-Time) Compiler** to convert frequently executed code into native machine code for better performance.
>
> **Remember:** Java source code is compiled into bytecode first, and then the JVM executes that bytecode using interpretation and JIT compilation.

## Source Code

Source code is the code written by the programmer in a programming language.

Example:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

This is source code. Humans can read it. Computers cannot run it directly.

## Machine Code

Machine code is the code made of only 0s and 1s that the computer can run directly.

The processor (CPU) understands only machine code.

## High-Level Language

A high-level language is a language written using human-friendly words. It is close to human language and far from machine code.

Examples: Java, Python, JavaScript.

Advantages: easy to read, easy to write, easy to maintain.

## Low-Level Language

A low-level language is close to machine code. It is hard for humans to read.

Examples: assembly language, machine code.

Low-level code gives more control over the hardware but is very difficult to use.

| Feature | High-level | Low-level |
| --- | --- | --- |
| Ease of writing | Easy | Hard |
| Closeness to human language | Close | Far |
| Speed of development | Fast | Slow |
| Hardware control | Less | More |

## Programming Paradigms

A paradigm is a style or way of writing programs.

Two important paradigms:

1. Procedural programming
2. Object-oriented programming

## Procedural Programming

Procedural programming means writing a program as a list of steps (procedures or functions) that run one after another.

The main focus is on "what steps to perform".

```text
╔═══════════════════════════════════════════════════════════════════╗
║                       PROCEDURAL PROGRAMMING                      ║
╠═══════════════════════════════════════════════════════════════════╣
║ ┌────────────┐ ▶ ┌────────────┐ ▶ ┌────────────┐ ▶ ┌────────────┐ ║
║ │   Step 1   │ ▶ │   Step 2   │ ▶ │   Step 3   │ ▶ │   Result   │ ║
║ └────────────┘ ▶ └────────────┘ ▶ └────────────┘ ▶ └────────────┘ ║
╚═══════════════════════════════════════════════════════════════════╝
```

Example: C is a procedural language.



## Object-Oriented Programming (OOP)

OOP is a style where a program is organized around objects instead of only steps.

```text
╔════════════════════════════════════════════════════════════╗
║               OOP - ONE CLASS, MANY OBJECTS                ║
╠════════════════════════════════════════════════════════════╣
║                    ┌──────────────────┐                    ║
║                    │Class - Blueprint │                    ║
║                    └──────────────────┘                    ║
║                             ▼                              ║
║ ┌────────────────┐  ┌────────────────┐  ┌────────────────┐ ║
║ │    Object 1    │  │    Object 2    │  │    Object 3    │ ║
║ └────────────────┘  └────────────────┘  └────────────────┘ ║
╚════════════════════════════════════════════════════════════╝
```
In the old view, a program was just steps. In OOP, a program is a collection of objects that talk to each other.

A quick look at the four pillars of OOP (explained in detail later):

1. Encapsulation - keeping data safe inside an object.
2. Inheritance - creating new classes from old ones.
3. Polymorphism - one thing behaving in different ways.
4. Abstraction - hiding unnecessary details, showing only the important parts.

OOP is explained fully starting from the [OOP Introduction](18-oop-introduction.md) file.

## Why OOP Matters for Java

Java is an object-oriented language. Almost everything in Java lives inside a class and an object. Understanding OOP clearly is the most important step before writing real Java programs.


>The next file is [Java Introduction](02-java-introduction.md).