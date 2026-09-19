# Switch Statement

## What is Switch?

Switch is a conditional statement that chooses one block to run from many options based on a value.

Simple definition: switch matches a value against several possible cases and runs the matching one.

```text
╔══════════════════════════════════════════╗
║             SWITCH DECISION              ║
╠══════════════════════════════════════════╣
║          ┌────────────────────┐          ║
║          │  Expression value  │          ║
║          └────────────────────┘          ║
║            │case 1 matched?│             ║
║            └───────────────┘             ║
║                    ▼                     ║
║    yes                               no  ║
║   ▼                                    ▼ ║
║   ┌────────────────┐  ┌───────────────┐  ║
║   │Run case 1 block│  │case 2 matched?│  ║
║   └────────────────┘  └───────────────┘  ║
║            │case 2 matched?│             ║
║            └───────────────┘             ║
║                    ▼                     ║
║    yes                               no  ║
║   ▼                                    ▼ ║
║    ┌────────────────┐  ┌─────────────┐   ║
║    │Run case 2 block│  │default block│   ║
║    └────────────────┘  └─────────────┘   ║
╚══════════════════════════════════════════╝
```

Switch is a cleaner alternative to a long else-if chain when all the checks compare one value.

## Basic Syntax

```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code when nothing matches
}
```

Parts:

- switch - the keyword.
- expression - the value being checked.
- case - each possible matching value.
- break - stops the switch. Without it the code falls through.
- default - runs when no case matches.

## Simple Example

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
        break;
}
```

Output:

```
Wednesday
```

## What Does break Do?

`break` ends the switch and exits it. Without break, Java continues running the next case's code even if it does not match. This is called fall-through.

## Fall-Through

Fall-through means the code continues into the next case because there is no break.

```java
int x = 2;

switch (x) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    case 3:
        System.out.println("Three");
        break;
    default:
        System.out.println("Other");
}
```

Output:

```
Two
Three
```

Case 2 matches and prints "Two". Since there is no break there, it falls into case 3 and prints "Three" as well.

Fall-through is usually a mistake. Sometimes programmers use it on purpose to share code between cases, but beginners should always add break.

## When switch is Useful

Switch works well when:

- One value is compared against many fixed options.
- Reading a menu option.
- Printing the name of a weekday or month.
- Handling small fixed categories.

## switch vs if-else

| Point | switch | if-else |
| --- | --- | --- |
| Compares | one value against fixed cases | any boolean conditions |
| Conditions | equality only (`==`) | any like >, <, combinations |
| Long chains | cleaner and faster to read | can become messy |
| Data allowed | numbers, char, String, enum | anything boolean |

If the decision is based on comparing one value to fixed options, switch is cleaner. If the decision needs ranges or complex logic, use if-else.

```java
if (marks >= 90) { ... }          // range - use if-else
switch (day) { case 1: ... }      // fixed values - use switch
```

## Multiple Cases Sharing One Block

Some versions of Java allow grouping cases:

```java
switch (option) {
    case 1:
    case 2:
        System.out.println("Small");
        break;
    default:
        System.out.println("Other");
}
```

Here case 1 and case 2 both print "Small".

## Switch with String

Switch can compare strings (Java 7 and above).

```java
String fruit = "apple";

switch (fruit) {
    case "apple":
        System.out.println("An apple a day...");
        break;
    case "banana":
        System.out.println("Monkey's favorite");
        break;
    default:
        System.out.println("Unknown fruit");
}
```

## Common Mistakes

- Forgetting break, causing fall-through.
- Writing `case 1:` without the colon.
- Putting duplicate case values - not allowed.
- Using the same expression in every case instead of comparing the switch value.

## Important Points

- The matched case runs until a break.
- default runs only when no case matches.
- Good practice to keep a default in almost every switch.
- Each case value must be unique.

## Common Interview Questions

Q. What is fall-through in switch?

A. When a case has no break, execution continues into the next case. That behavior is fall-through.

Q. Switch or if-else - which to use?

A. For comparing one value to fixed options, switch is cleaner. For ranges or complex conditions, use if-else.

Q. What is the purpose of default?

A. It runs when none of the cases match.

Next: Conditional problems - solve real practice problems with if-else and switch.