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

Simple definition: a programming language is a formal language used to write programs.

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

- Websites
  Websites like Google and YouTube are programs that run on servers and send pages to your browser.
- Mobile applications
  Apps like WhatsApp and Instagram are programs written for phones.
- Desktop applications
  Software like Microsoft Word and VS Code runs directly on your computer.
- Banking
  Banks use programs to store account details, transfer money, and keep transactions secure.
- E-commerce
  Online shopping sites like Amazon use programs to show products, manage carts, and process payments.
- Games
  Games are programs that handle graphics, player input, and game rules.
- Automation
  Factories and software pipelines use programs to do repetitive work automatically.
- Cloud systems
  Services like Google Drive and AWS run on massive programs spread across many computers.
- Artificial intelligence
  AI systems use programs that learn patterns from data.
- Data processing
  Programs help process huge amounts of data quickly, like analyzing sales reports.
- Embedded systems
  Small programs run inside washing machines, cars, and TVs.
- Testing
  Programs are used to test other programs automatically.
- Cybersecurity
  Programs protect systems, detect attacks, and keep data safe.

## Problem Solving

Before writing code, a programmer must first understand the problem.

Problem solving in programming means:
1. Understand the problem completely.
2. Break it into small steps.
3. Find a way to solve each step.
4. Write those steps in code.
5. Test whether the result is correct.

Coding is only the last part. Most of programming is thinking, not typing.

## Algorithm

An algorithm is a step-by-step method to solve a problem.

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

An algorithm is language independent. The same algorithm can be written in Java, Python, or C.

## Logic Building

Logic building is the skill of thinking correctly about a problem and choosing the right steps.

This skill improves with practice. Solving many small problems, like the ones later in these notes (odd/even, loops, patterns), is the best way to build logic.

## Compiler

A compiler is a program that converts the whole source code into machine code at once, before running it.

After conversion, a separate file of machine code is created, which can be run later.

- Example: C, C++, Java (Java uses a mix, explained in the Java architecture file).

Simple line to remember: the compiler translates your whole code first, then the machine runs it.

## Interpreter

An interpreter converts and runs the code line by line at the same time.

There is no separate machine-code file created first.

- Example: Python, JavaScript.

Simple line to remember: the interpreter reads one line, runs it, then reads the next line.

| Feature | Compiler | Interpreter |
| --- | --- | --- |
| Converts code | Whole code at once | Line by line |
| Runs immediately? | No, converts first | Yes, runs as it reads |
| Error reporting | Reports errors after checking whole file | Stops at the first error line |
| Speed | Usually faster after compiling | Generally slower |

Java is a special case: Java source is compiled into bytecode by the Java compiler, and the bytecode is then interpreted (and sometimes compiled) by the JVM. This is explained in the Java Architecture file.

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

An object is a real-world thing with data and behavior. A car has data (color, speed) and behavior (start, stop). A student has data (name, roll number) and behavior (study, play). OOP groups data and behavior together in classes and objects.

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

OOP is explained fully starting from the OOP Introduction file.

## Why OOP Matters for Java

Java is an object-oriented language. Almost everything in Java lives inside a class and an object. Understanding OOP clearly is the most important step before writing real Java programs.

Simple summary: OOP means we build software like we build with real-world objects, using classes as blueprints and objects as the real things.

## Key Takeaways

- Programming is giving instructions to a computer.
- A program is a set of instructions.
- An algorithm is a step-by-step solution method.
- Compiler converts whole code first; interpreter converts and runs line by line.
- Source code is human-readable; machine code is 0s and 1s.
- Procedural programming focuses on steps.
- OOP organizes code around objects.

Next: keep reading in order. The next file introduces Java.