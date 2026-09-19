# Access Modifiers

## What are Access Modifiers?

Access modifiers control who can use a class, field, or method.

Simple definition: access modifiers decide the visibility of code - who can see and touch it.

There are four:
1. public
2. private
3. protected
4. default (no keyword written)

## public

A public member is visible everywhere. Any class in any package can use it.

```java
public class Student {
    public String name;
}
```

## private

A private member is visible only inside the same class. Nothing outside the class can touch it.

```java
class Student {
    private int rollNumber;
}
```

`rollNumber` cannot be read or changed from outside the class. Only methods inside Student can use it.

```java
class Student {
    private int rollNumber;      // hidden

    void setRollNumber(int r) {
        rollNumber = r;          // allowed - same class
    }

    int getRollNumber() {
        return rollNumber;       // allowed - same class
    }
}
```

From main:

```java
Student s = new Student();
s.setRollNumber(7);
System.out.println(s.getRollNumber());   // 7
```

The direct line `s.rollNumber = 7;` would fail because rollNumber is private.

This is the core of encapsulation: keep fields private, give controlled access through methods.

## protected

A protected member is visible inside the same package and inside subclasses (classes that inherit). For beginners, the important rule is: protected behaves like default within the package, but also allows access through inheritance.

## default (no keyword)

If no modifier is written, the member is visible only inside the same package. Classes in other packages cannot see it.

```java
class Student {       // default class
    String name;      // default field
}
```

Both the class and the field are package-private.

## Comparison Table

| Modifier | Same class | Same package | Subclass (different package) | Anywhere |
| --- | --- | --- | --- | --- |
| public | yes | yes | yes | yes |
| protected | yes | yes | yes | no |
| default | yes | yes | no | no |
| private | yes | no | no | no |

Read it as a ladder:

```
private  <  default  <  protected  <  public
```

More restrictive on the left, most open on the right.

## When to Use Which

- Fields: almost always private. Expose them through methods.
- Methods that other classes must call: public.
- Helper methods used only inside the class: private.
- Members used across the same package: default.
- Members needed by subclasses but not everyone: protected.

Rule of thumb for beginners: keep things as private as possible, make only what is needed public.

## Simple Example

```java
class Student {
    private String name;        // hidden from outside
    public int rollNumber;      // freely visible

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.rollNumber = 7;                  // allowed - public
        // s.name = "Rahul";               // error - private

        s.setName("Rahul");                // allowed - public method
        System.out.println(s.getName());   // Rahul
    }
}
```

## Why Hide Fields?

If a field is public, anyone can put any value inside it.

```java
s.age = -500;   // nonsense value
```

By keeping fields private and controlling them through methods, we can validate values:

```java
void setAge(int age) {
    if (age >= 0) {
        this.age = age;
    } else {
        System.out.println("Invalid age");
    }
}
```

This is encapsulation: data is safe inside the object.

## Important Points

- private is the most restrictive.
- public is the most open.
- default means "package-private".
- protected opens access to subclasses.
- Fields should normally be private.

## Common Mistakes

- Making everything public "just in case". Use private by default.
- Confusing protected with public.
- Forgetting that default access is a real thing (none of the three keywords given).
- Writing modifiers that do not exist, like `hidden` or `open`.

## Common Interview Questions

Q. What are the four access modifiers in Java?

A. public, private, protected, and default (no keyword).

Q. What is encapsulation?

A. Wrapping data and methods together and restricting direct access to fields, usually by keeping fields private.

Q. What is the difference between default and protected?

A. Both are package-visible, but protected can also be accessed by subclasses in other packages.

Q. Why keep fields private?

A. To protect the data from invalid or wrong values and to give controlled access through methods.

Next: Variable scope and parameters.