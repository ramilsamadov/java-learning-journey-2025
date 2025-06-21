# Understanding the 'static' Keyword in Java

In Java, the `static` keyword is used to indicate that a particular member (variable or method) belongs to the class itself, rather than to instances of the class. This means you can access them without creating an object of the class.

## 1. Static Variables

A static variable is shared among all instances of a class. It is also known as a class variable.

```java
public class Counter {
    static int count = 0; // static variable

    Counter() {
        count++;
        System.out.println(count);
    }
}

// Usage:
Counter c1 = new Counter(); // prints 1
Counter c2 = new Counter(); // prints 2
```

## 2. Static Methods

Static methods can be called without creating an instance of the class. They can only directly access other static members.

```java
public class Utility {
    static void sayHello() {
        System.out.println("Hello, world!");
    }
}

// Usage:
Utility.sayHello(); // prints Hello, world!
```

## 3. Static Blocks

Static blocks are used for static initialization of a class. This block runs once when the class is loaded into memory.

```java
public class Example {
    static int num;

    static {
        num = 100;
        System.out.println("Static block executed");
    }
}
```

## 4. Static Classes (Nested Static Classes)

A static class in Java is a nested class which is a static member of the outer class.

```java
public class Outer {
    static class Inner {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}

// Usage:
Outer.Inner obj = new Outer.Inner();
obj.display();
```

## Key Points:

* Static members belong to the class, not instances.
* Static methods cannot use `this` or `super` keywords.
* Useful for utility or helper methods (e.g., `Math.sqrt()`).
* Memory efficient because static data is shared among instances.

Understanding the `static` keyword helps you write more efficient, organized, and reusable Java code.
