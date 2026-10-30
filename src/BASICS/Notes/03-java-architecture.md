 # Java Architecture: JVM , JRE & JDK

This file explains the three most important pieces of Java in simple language. These three names confuse almost every beginner, so read slowly.

## The Three Pieces

```text
╔══════════════════════════════════════════════════════════════╗
║                  JDK (Java Development Kit)                  ║
║                                                              ║
║  ╔════════════════════════════════════════════════════════╗  ║
║  ║              JRE (Java Runtime Environment)            ║  ║
║  ║                                                        ║  ║
║  ║  ╔══════════════════════════════════════════════════╗  ║  ║
║  ║  ║            JVM (Java Virtual Machine)            ║  ║  ║
║  ║  ║                                                  ║  ║  ║
║  ║  ║  ┌────────────────────┐ ┌─────────────────────┐  ║  ║  ║
║  ║  ║  │   Class Loader     │ │  Bytecode Verifier  │  ║  ║  ║
║  ║  ║  └────────────────────┘ └─────────────────────┘  ║  ║  ║
║  ║  ║                                                  ║  ║  ║
║  ║  ║  ┌────────────────────┐ ┌─────────────────────┐  ║  ║  ║
║  ║  ║  │   Memory Areas     │ │   Execution Engine  │  ║  ║  ║
║  ║  ║  └────────────────────┘ └─────────────────────┘  ║  ║  ║
║  ║  ╚══════════════════════════════════════════════════╝  ║  ║
║  ║                                                        ║  ║
║  ║                    Runtime Libraries                   ║  ║
║  ╚════════════════════════════════════════════════════════╝  ║
║                                                              ║
║                      Development Tools                       ║
║                  javac  |  javadoc  |  jdb                   ║
╚══════════════════════════════════════════════════════════════╝
```


## JVM - Java Virtual Machine

What it is: JVM is the machine that actually runs Java bytecode.

#### Simple definition: the JVM is a software that converts bytecode into machine instructions and runs your program.

Key facts:

- Each operating system has its own JVM.
- The same bytecode runs on different JVMs. This is what makes Java platform independent.
- The JVM also manages memory and cleans up unused objects (done by a part called the **Garbage Collector**).

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

>The JVM is not a physical machine. It is software that pretends to be a machine.

## JRE - Java Runtime Environment

What it is: JRE is everything needed to run a Java program.

#### Simple definition: the JRE is the environment that provides the JVM plus the basic libraries Java programs need to run.

JRE = JVM + core libraries (like the code for printing, reading, and math operations).

Key facts:

- If you only want to run Java programs (not write them), you only need the JRE.
- The JRE does NOT include the compiler.

## JDK - Java Development Kit

What it is: JDK is everything needed to develop and run Java programs.

#### Simple definition: the JDK is the full toolkit for Java developers. It includes tools to write, compile, and run Java programs.

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

## What Each One Does 

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

## Is Java Compiled or Interpreted?

Everyone asks this question, and the answer is: **Java is both compiled AND interpreted.** It is a hybrid. Here is the three-stage story.

```text
╔═══════════════════════════════════════════════════════════════════╗
║              JAVA - THE TWO-STEP JOURNEY                          ║
╠═══════════════════════════════════════════════════════════════════╣
║                                                                   ║
║  STEP 1 - COMPILED                                                ║
║  ┌────────────────────────────────────────────────────┐           ║
║  │ You write Hello.java                               │           ║
║  └────────────────────────────────────────────────────┘           ║
║                          ▼                       (once)           ║
║  ┌────────────────────────────────────────────────────┐           ║
║  │ javac compiles the WHOLE file at once              │           ║
║  └────────────────────────────────────────────────────┘           ║
║                          ▼                                        ║
║  ┌────────────────────────────────────────────────────┐           ║
║  │ Bytecode Hello.class (not machine code!)           │           ║
║  └────────────────────────────────────────────────────┘           ║
║                                                                   ║
║  STEP 2 - INTERPRETED BY THE JVM                                  ║
║  ┌────────────────────────────────────────────────────┐           ║
║  │ Every system's JVM reads the bytecode              │           ║
║  │ and converts it to machine instructions            │           ║
║  │ (line by line, at run time)                        │           ║
║  └────────────────────────────────────────────────────┘           ║
║                          ▼                                        ║
║  ┌────────────────────────────────────────────────────┐           ║
║  │ Program output                                     │           ║
║  └────────────────────────────────────────────────────┘           ║
║                                                                   ║
╚═══════════════════════════════════════════════════════════════════╝
```

### Why Java is a Hybrid or Mix Language

| Question | Answer |
| --- | --- |
| Is Java compiled? | Yes. `javac` converts the whole `.java` source into bytecode (`.class`) before anything runs. This is a compiler's job. |
| Is Java interpreted? | Yes. The JVM does not understand source code or bytecode as machine instructions. It reads the bytecode at run time and converts it to machine instructions. This is an interpreter's job. |
| So what is bytecode? | The middle step. It is NOT machine code (like C produces) and it is NOT source code. It is a half-way language that a JVM can read. |
| Why do this? | Bytecode is the same on every system, so the same `.class` file runs anywhere that has a JVM. That is what makes Java platform independent. |

### The fast version of the same story (JIT)

There is one more layer many interviews ask about, called the **JIT compiler** (Just-In-Time).

- The JVM is a software interpreter, and plain interpreters can be slow.
- To fix this, the JVM watches which bytecode runs again and again.
- The JIT compiler (a part of the JVM) takes those frequently used parts of bytecode and compiles them into real machine code once, while the program runs.
- From then on, that part runs like native machine code - much faster, and repeatedly.

So the full honest answer is:

```
Java compiles to bytecode (compiled),
the JVM interprets bytecode at first (interpreted),
and then the JIT compiler improves hot code into machine code (compiled again, at run time).
```

### Compare with C and Python

| | C / C++ | Python | Java |
| --- | --- | --- | --- |
| Compile to machine code | Yes, directly | No | No, only to bytecode |
| Interpreted at run time | No | Yes | Yes (by the JVM) |
| Kind | Compiled only | Interpreted only | Hybrid (compiled + interpreted) |
| Output of compile step | Machine code (.exe/.out) | None | Bytecode (.class) |
| Portability | Machine-code file runs only on one OS | Source runs anywhere with Python | Bytecode runs anywhere with a JVM |

### Easy interview explanation

- #### If an interviewer asks "Is Java compiled or interpreted?", say this:

Java is both. First `javac` compiles the whole source file into bytecode, which is a .class file. Then the JVM interprets that bytecode and turns it into machine instructions at run time. To make it faster, a part of the JVM called the JIT compiler compiles the frequently used parts of bytecode into native machine code while the program is running. So Java starts as compiled, runs as interpreted, and finishes with JIT compilation.

>Keep it as three short sentences: compiled to bytecode, interpreted by the JVM, then JIT speeds it up.


- #### If an interviewer asks "Explain JVM, JRE and JDK", say this:

Java source code is compiled by the Java compiler into bytecode. This bytecode runs on the JVM, which is a virtual machine that converts bytecode into machine instructions. The JRE is the JVM plus the libraries needed to run Java programs. The JDK is the JRE plus development tools like the compiler. So the JDK is the biggest, it contains the JRE, and the JRE contains the JVM.

>Keep this short and natural. Do not memorize a long paragraph.

## Important Points

- **Can you compile Java code without JRE?** Yes. The Java compiler (`javac`) is included in the JDK, so you can compile Java programs without installing a separate JRE.

- **Can you run Java code without JDK?** Yes. You only need a compatible Java runtime environment to execute an already compiled Java program. A full JDK is not required.

- **Is JVM different for each operating system?** Yes. Different operating systems have their own compatible JVM implementations, but Java bytecode remains the same across platforms. This allows Java programs to run on Windows, macOS, and Linux without changing the source code or bytecode.
> **JDK** is used to develop and compile Java programs, **JRE** provides the runtime environment, and **JVM** executes Java bytecode.
of a Java program.

>The next file is [Java Syntax](04-java-syntax.md)