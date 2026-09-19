# Output Prediction Questions

These questions are a favorite in tests and interviews. The format: look at the code and predict the output. No execution, only mental tracing.

Read each solution only after you predicted.

## Q1: Variables and arithmetic

```java
int a = 10;
int b = 3;
System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

Output:

```
13
7
30
3
1
```

Explanation: integer division drops the decimal, so 10 / 3 = 3. The remainder is 1.

## Q2: Integer division trap

```java
System.out.println(7 / 2);
System.out.println(7.0 / 2);
```

Output:

```
3
3.5
```

First print uses two integers, so the result is 3. Second print uses a double, so the result is the real division 3.5.

## Q3: String concatenation

```java
System.out.println(5 + 3);
System.out.println("5" + 3);
System.out.println(5 + 3 + " result");
System.out.println("result " + 5 + 3);
```

Output:

```
8
53
8 result
result 53
```

Explanation: numbers before a String are added normally. Once a String appears, everything after joins as text.

## Q4: Increment and decrement

```java
int x = 5;
System.out.println(x++);
System.out.println(x);
System.out.println(++x);
System.out.println(x);
```

Output:

```
5
6
7
7
```

Explanation: x++ prints the old value 5, then x becomes 6. ++x first becomes 7, then prints 7.

## Q5: Post-increment in assignment

```java
int a = 10;
int b = a++;
int c = ++a;
System.out.println(a);
System.out.println(b);
System.out.println(c);
```

Output:

```
12
10
12
```

Explanation:

| line | a before | action | value stored |
| --- | --- | --- | --- |
| int b = a++ | 10 | store old 10, a becomes 11 | b = 10 |
| int c = ++a | 11 | a becomes 12, store 12 | c = 12 |

## Q6: Compound assignment

```java
int x = 5;
x += 3;
x *= 2;
x -= 4;
System.out.println(x);
```

Output:

```
12
```

Explanation: 5 + 3 = 8, then 8 * 2 = 16, then 16 - 4 = 12.

## Q7: if-else

```java
int marks = 85;
if (marks >= 90) {
    System.out.println("A");
} else if (marks >= 80) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

Output:

```
B
```

Explanation: marks >= 90 is false, marks >= 80 is true, so only B prints.

## Q8: Nested if

```java
int age = 25;
if (age > 18) {
    if (age < 30) {
        System.out.println("Young adult");
    } else {
        System.out.println("30+");
    }
} else {
    System.out.println("Teen");
}
```

Output:

```
Young adult
```

## Q9: Logical operators

```java
boolean a = true;
boolean b = false;
System.out.println(a && b);
System.out.println(a || b);
System.out.println(!a);
```

Output:

```
false
true
false
```

## Q10: Logical mixed with comparisons

```java
int x = 15;
System.out.println(x > 10 && x < 20);
System.out.println(x > 10 || x > 20);
System.out.println(!(x == 15));
```

Output:

```
true
true
false
```

## Q11: while loop

```java
int i = 1;
while (i < 5) {
    System.out.print(i + " ");
    i++;
}
```

Output:

```
1 2 3 4
```

Stop reason: when i becomes 5, the condition `i < 5` is false.

## Q12: for loop

```java
for (int i = 1; i <= 5; i++) {
    if (i % 2 == 0) {
        System.out.print(i + " ");
    }
}
```

Output:

```
2 4
```

## Q13: break

```java
for (int i = 1; i <= 10; i++) {
    if (i == 4) {
        break;
    }
    System.out.print(i + " ");
}
```

Output:

```
1 2 3
```

break stops the loop completely at 4, so 4 is not printed.

## Q14: continue

```java
for (int i = 1; i <= 6; i++) {
    if (i == 3 || i == 5) {
        continue;
    }
    System.out.print(i + " ");
}
```

Output:

```
1 2 4 6
```

The continue jumps over 3 and 5 only.

## Q15: Loop with nested if

```java
int count = 0;
for (int i = 1; i <= 10; i++) {
    if (i % 3 == 0) {
        count++;
    }
}
System.out.println(count);
```

Output:

```
3
```

Numbers divisible by 3 in 1..10: 3, 6, 9.

## Q16: Nested loops

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

Output:

```
*
**
***
```

The inner loop limit is i, so each row grows by one star.

## Q17: Method with return

```java
static int square(int x) {
    return x * x;
}

public static void main(String[] args) {
    int result = square(4) + square(2);
    System.out.println(result);
}
```

Output:

```
20
```

square(4) = 16, square(2) = 4, total 20.

## Q18: Void method and scope

```java
static void change(int x) {
    x = 99;
}

public static void main(String[] args) {
    int x = 5;
    change(x);
    System.out.println(x);
}
```

Output:

```
5
```

Java is pass-by-value. The method worked on a copy.

## Q19: Object change

```java
class Student {
    String name;
}

static void setName(Student s) {
    s.name = "Changed";
}

public static void main(String[] args) {
    Student s = new Student();
    s.name = "Original";
    setName(s);
    System.out.println(s.name);
}
```

Output:

```
Changed
```

The method received a copy of the reference, and both references point to the same object.

## Q20: do-while

```java
int i = 10;
do {
    System.out.print(i + " ");
    i++;
} while (i <= 5);
```

Output:

```
10
```

The body runs once before the condition is checked.

## Q21: Precedence

```java
System.out.println(2 + 3 * 4);
System.out.println((2 + 3) * 4);
```

Output:

```
14
20
```

First line: 3*4 first. Second line: brackets first.

## Q22: Assignment chain

```java
int a, b, c;
a = b = c = 5;
a = 10;
System.out.println(a + " " + b + " " + c);
```

Output:

```
10 5 5
```

Assignment associates right to left. Changing a later does not affect b or c.

## Q23: char operations

```java
char ch = 'A';
System.out.println(ch);
System.out.println(ch + 1);
System.out.println((char) (ch + 1));
```

Output:

```
A
66
B
```

Adding a number to a char converts it to int. Casting back gives the next character.

## Try These (answers at the end of the Practice file)

```java
int x = 8;
int y = x++ + ++x;
System.out.println(y);      // what value?

for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break;
    }
    System.out.println(i);
}                            // what prints?

int n = 12345;
int reverse = 0;
while (n != 0) {
    reverse = reverse * 10 + n % 10;
    n = n / 10;
}
System.out.println(reverse); // what prints?
```

## How to Practice Output Prediction

1. Trace the code line by line on paper.
2. Keep a running table of variable values.
3. Watch especially for post-increment timing, pass-by-value, and integer division.
4. Only after finishing, run the code to verify.

Next: Interview questions.