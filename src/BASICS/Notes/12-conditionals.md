# Conditional Statements - if, else, else if

## What is a Conditional Statement?

A conditional statement lets the program make a decision and run different code based on a condition.

Simple definition: conditionals let code choose between paths, like choosing a road based on a sign.

```text
╔════════════════════════════════════════════════════╗
║                  IF-ELSE DECISION                  ║
╠════════════════════════════════════════════════════╣
║                 ┌───────────────┐                  ║
║                 │Condition true?│                  ║
║                 └───────────────┘                  ║
║                         ▼                          ║
║      yes                                       no  ║
║   ▼                                              ▼ ║
║       ┌────────────┐  ┌─────────────────────┐      ║
║       │Run if-block│  │Run else-block / skip│      ║
║       └────────────┘  └─────────────────────┘      ║
║                         ▼                          ║
║                     ┌────────┐                     ║
║                     │Continue│                     ║
║                     └────────┘                     ║
╚════════════════════════════════════════════════════╝
```

## if Statement

The `if` block runs only when the condition is true.

```java
if (condition) {
    // code to run when condition is true
}
```

```java
int age = 20;
if (age >= 18) {
    System.out.println("Adult");
}
```

Output:

```
Adult
```

If the condition is false, the block is skipped completely.

## if-else

The `else` block runs when the `if` condition is false.

```java
if (condition) {
    // runs when true
} else {
    // runs when false
}
```

```java
int number = 7;
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

Output:

```
Odd
```

One of the two blocks always runs, never both.

## else if

Use `else if` when there are more than two cases.

```java
if (condition1) {
    // first case
} else if (condition2) {
    // second case
} else if (condition3) {
    // third case
} else {
    // everything else
}
```

Java checks the conditions from top to bottom. The first true one runs. Everything after it is skipped.

```java
int marks = 75;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 60) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

Output:

```
Grade B
```

Even though `marks >= 60` is also true, it is never reached because `marks >= 75` was checked first and it was true.

## How Java Decides Which Block to Run

1. Test condition1.
2. If true, run its block and stop checking.
3. If false, test condition2.
4. Continue until a condition is true.
5. If nothing is true, run the `else` block (if present).

## Nested if-else

A nested if-else is an if-else placed inside another if-else.

```java
if (condition1) {
    if (condition2) {
        // inner true case
    } else {
        // inner false case
    }
}
```

```java
boolean hasTicket = true;
boolean isVip = true;

if (hasTicket) {
    if (isVip) {
        System.out.println("VIP lounge");
    } else {
        System.out.println("Normal gate");
    }
} else {
    System.out.println("Buy a ticket first");
}
```

Output:

```
VIP lounge
```

Nested blocks let us check one thing first, then decide on the next.

## Multiple Conditions with && and ||

Conditions can be combined using logical operators.

```java
int age = 25;
boolean hasLicense = true;

if (age >= 18 && hasLicense) {
    System.out.println("Can drive");
} else {
    System.out.println("Cannot drive");
}
```

Output:

```
Can drive
```

- `&&` - both sides must be true.
- `||` - at least one side true.
- `!` - flips the result.

```java
boolean isRaining = false;
if (!isRaining) {
    System.out.println("Go for a walk");
}
```

Output:

```
Go for a walk
```

## Condition with Numbers

Any expression that gives true or false can be a condition.

```java
System.out.println(5 > 3);   // true
System.out.println(5 == 3);  // false
int x = 10;
if (x != 5) {
    System.out.println("x is not 5");
}
```

## = vs == Again (Very Important)

- `=` assigns.
- `==` compares.

```java
int x = 5;
if (x == 5) {          // correct - compares
    System.out.println("Yes");
}
```

```java
if (x = 5) {           // wrong in a condition - assignment is not allowed here
}
```

In Java, `if (x = 5)` gives a compile-time error because the condition must be boolean.

## Conditional Operator (Ternary)

The ternary operator is a short form of if-else.

```java
result = (condition) ? valueIfTrue : valueIfFalse;
```

```java
int age = 20;
String status = (age >= 18) ? "Adult" : "Minor";
System.out.println(status);   // Adult
```

It is useful for short decisions. For long logic, use a normal if-else.

## Full If-Else Flow

```text
╔══════════════════════════════════════════╗
║            FULL IF-ELSE FLOW             ║
╠══════════════════════════════════════════╣
║            ┌───────────────┐             ║
║            │Check condition│             ║
║            └───────────────┘             ║
║                    ▼                     ║
║      yes                             no  ║
║   ▼                                    ▼ ║
║    ┌─────────────┐  ┌────────────────┐   ║
║    │if block runs│  │else-if present?│   ║
║    └─────────────┘  └────────────────┘   ║
║          ┌────────────────────┐          ║
║          │Next condition true?│          ║
║          └────────────────────┘          ║
║                    ▼                     ║
║       yes                           no   ║
║    ▼                                  ▼  ║
║    ┌──────────────┐  ┌───────────────┐   ║
║    │Run that block│  │else block runs│   ║
║    └──────────────┘  └───────────────┘   ║
╚══════════════════════════════════════════╝
```

## Common Mistakes

- Using `=` instead of `==`.
- Adding a semicolon after the closing bracket of the condition: `if (x > 5); {}` - the semicolon ends the if early.
- Forgetting brackets `{}`, then the if controls only one line.
- Believing that else-if is a different keyword. It is just `else` followed by another `if`.

## Important Points

- The condition must produce a boolean value (true or false).
- Only the first true branch runs in an else-if chain.
- Opinion: keep nested blocks shallow. When nesting goes too deep, code becomes hard to read.

## Common Interview Questions

Q. What happens if multiple conditions are true in an else-if chain?

A. Only the first true condition's block runs. Java stops checking after the first true condition.

Q. Difference between if-else and nested if-else?

A. if-else picks between two branches based on one condition. A nested if-else places another decision inside a branch.

Q. What is a ternary operator?

A. A one-line if-else: `(condition) ? valueIfTrue : valueIfFalse`.

Next: Switch - another way to choose between many cases.