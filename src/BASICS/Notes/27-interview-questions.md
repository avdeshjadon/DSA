# Java Interview Questions (Beginner to Intermediate)

Questions are organized from easy to interview-style. Each has an answer and a short explanation.

## Beginner Level

### Q1. What is Java?

Answer: Java is an object-oriented programming language that runs on the JVM and is designed to be platform independent.

Interview tip: add one line about write once, run anywhere. Do not give a lecture.

### Q2. Why is Java called platform independent?

Answer: Java code compiles into bytecode, not machine code. Any machine with a JVM can run the same bytecode, so the code does not depend on the operating system.

How to answer: mention the three players - source code, compiler, JVM.

### Q3. What is bytecode?

Answer: Bytecode is the intermediate code produced by compiling Java source. It is stored in `.class` files and executed by the JVM.

### Q4. What are the features of Java?

Answer: simple, object-oriented, platform independent, secure, robust, portable.

Do not fall silent after naming them. Pick one, like platform independence, and explain it.

### Q5. What is a class?

Answer: A class is a blueprint that defines the state and behavior of objects.

### Q6. What is an object?

Answer: An object is an actual instance of a class, created at runtime with the new keyword.

### Q7. What is the difference between a class and an object?

Answer: A class is a blueprint; an object is the real thing created from it. One class creates many objects, each with its own data.

### Q8. What is the main method? Explain public static void main.

Answer:

- public - the JVM needs to reach it from outside.
- static - no object exists yet when the JVM starts, so main belongs to the class.
- void - main returns nothing.
- main - the fixed name the JVM looks for.
- String[] args - command-line arguments.

### Q9. What are the 8 primitive data types?

Answer: byte, short, int, long, float, double, char, boolean.

### Q10. What is the difference between int and long?

Answer: int uses 4 bytes, long uses 8 bytes. Long holds much bigger values.

## Intermediate Level

### Q11. What is the difference between = and ==?

Answer: `=` assigns a value to a variable. `==` compares two values and returns true or false.

### Q12. What is the difference between a parameter and an argument?

Answer: A parameter is the variable declared in the method signature. An argument is the value passed when calling the method.

Example:

```java
void add(int a, int b) { }   // a, b are parameters
add(10, 20);                  // 10, 20 are arguments
```

### Q13. What is the difference between a method and a constructor?

Answer:

| Method | Constructor |
| --- | --- |
| has a return type | never has a return type |
| any name | same name as the class |
| called by code | runs at object creation |
| runs many times | runs once per object |

### Q14. What is constructor overloading?

Answer: Defining multiple constructors in the same class with different parameter lists. Java picks the right one from the arguments.

### Q15. What is the this keyword?

Answer: `this` refers to the current object. It separates the field from a same-named parameter, like `this.name = name;`.

### Q16. Is Java pass-by-value or pass-by-reference?

Answer: Java is pass-by-value.

Explanation: primitives pass a copy of the value. Objects pass a copy of the reference, so the contents can change, but the caller's variable cannot be reassigned inside the method.

How to answer: state pass-by-value firmly, then show the two cases briefly. Never say "pass-by-reference".

### Q17. What is the difference between local, instance, and static variables?

Answer:

- Local: declared in a method or block, exists only there.
- Instance: declared in a class, one copy per object.
- Static: declared in a class, one copy shared by all objects.

### Q18. What is variable scope?

Answer: Scope is the block of code `{}` where a variable can be accessed.

### Q19. What are the access modifiers in order of visibility?

Answer: private (least), default, protected, public (most).

private: same class only. default: same package. protected: same package or subclass. public: everywhere.

### Q20. What is encapsulation?

Answer: Wrapping data and the methods that use it inside a class, and keeping fields private so outside code cannot touch them directly.

### Q21. What is a package?

Answer: A package is a folder-like structure that groups related classes. It prevents name clashes and organizes code.

### Q22. Why is java.lang not imported?

Answer: Java imports it automatically in every file. It contains String, Math, System.

### Q23. What is the Scanner nextInt and nextLine problem?

Answer: nextInt reads the number but leaves the Enter in the buffer. A following nextLine reads that leftover Enter and returns an empty line. Fix: consume the Enter with one extra nextLine().

### Q24. What is the difference between print and println?

Answer: print does not move to a new line. println moves to a new line after printing.

## Interview-Oriented Level

### Q25. What is the output of "- + 5 + 3" style concatenation?

```java
System.out.println("Result: " + 5 + 3);
```

Answer: `Result: 53`. Once a String appears, everything joins as text. Use brackets to add first: `"Result: " + (5 + 3)`.

### Q26. What is integer division and why does 7/2 give 3?

Answer: When both operands are integers, Java performs whole-number division and drops the remainder. Use 7.0/2 to get 3.5.

### Q27. What is the difference between while and do-while?

Answer: while checks the condition first, body may never run. do-while runs the body once before checking the condition.

### Q28. What is break vs continue?

Answer: break ends the loop. continue skips only the current round.

### Q29. What is fall-through in switch?

Answer: When a matching case has no break, execution continues into the following cases. Usually a bug, sometimes intentional.

### Q30. Explain two's complement with ~5.

Answer: Java stores negatives using two's complement. Flipping all bits of 5 gives the representation of -6, so ~5 = -6, and generally ~x = -(x+1).

### Q31. What is the complexity of a nested loop of n rows and n columns?

Answer: O(n^2). The inner loop runs n times for each of the n outer rounds.

### Q32. What is the algorithm to check even/odd without using %?

```java
if ((n & 1) == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

AND with 1 keeps only the last bit. 0 means even, 1 means odd.

### Q33. What happens if a class has no constructor?

Answer: Java supplies a default constructor with no parameters. If any constructor is written, the default disappears.

### Q34. Can main be private? What if it is?

Answer: main must be public, static, and void for the JVM to find it. A private main compiles but the program cannot start normally.

### Q35. What is OOP in one sentence?

Answer: OOP organizes a program around classes and objects, where each object owns its data and behavior.

## Tricky Questions

### Q1. Predict: int y = x++ + ++x with x = 8

Answer: Step by step: x++ uses 8 and x becomes 9. ++x makes x 10 and uses 10. y = 8 + 10 = 18.

### Q2. Two references to one object

```java
Student a = new Student();
Student b = a;
a.name = "Rahul";
System.out.println(b.name);
```

Answer: Rahul. Both references point to the same object.

### Q3. What is the default value of a boolean field?

Answer: false. Strings default to null, ints to 0.

### Q4. Can two variables with the same name exist in one scope?

Answer: No. Java gives a compile error.

### Q5. What does `charAt(0)` on `sc.next()` do?

Answer: Reads a word, then takes its first character. This is how beginners read a single char with Scanner.

## Common Beginner Mistakes Interviewers Check

- Mixing up `=` and `==`.
- Thinking integer division gives decimals.
- Claiming Java is pass-by-reference.
- Mixing up while and do-while.
- Backward parameter and argument definitions.
- Forgetting the nextInt/nextLine leftover Enter.
- Calling a non-static method without an object.

## Suggested Follow-up Questions an Interviewer May Ask

- After "What is OOP?" - Name the four pillars.
- After "Pass by value?" - Show with a swap example why object swap fails.
- After "JVM?" - What is bytecode, JRE, JDK.
- After "Scanner?" - The nextLine bug and its fix.
- After "Complexity?" - Estimate the complexity of the code on the board.

Next: Quick revision and the interview cheat sheet.