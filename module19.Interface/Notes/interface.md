# Understanding Interfaces in Java

In Java, an `interface` is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They are used to specify a contract that classes must follow.

---

## 🔹 Why Use Interfaces?

* To achieve **abstraction**.
* To implement **multiple inheritance** (Java does not support multiple inheritance with classes).
* To define a **common behavior** that multiple classes can implement.

---

## 🔧 Interface Syntax

```java
public interface Animal {
    void makeSound(); // abstract method
}
```

---

## 🛠 Implementing an Interface

```java
public class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}
```

* The `Dog` class must provide an implementation for the `makeSound()` method.

---

## 🔁 Multiple Interfaces

Java allows a class to implement **multiple interfaces**:

```java
public interface Flyable {
    void fly();
}

public interface Swimmable {
    void swim();
}

public class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Flying...");
    }
    public void swim() {
        System.out.println("Swimming...");
    }
}
```

---

## 🧪 Interface vs Abstract Class

| Feature              | Interface                       | Abstract Class          |
| -------------------- | ------------------------------- | ----------------------- |
| Method Types         | Abstract, default, static       | Abstract and concrete   |
| Fields               | Constants (public static final) | Instance fields allowed |
| Constructors         | ❌ Not allowed                   | ✅ Allowed               |
| Multiple Inheritance | ✅ Yes                           | ❌ No                    |
| Access Modifiers     | Methods are `public` by default | Can use any modifier    |

---

## 🧠 Key Notes

* Interface methods are `public` and `abstract` by default.
* Fields are `public static final` (constants).
* Java 8+ allows `default` and `static` methods in interfaces.
* A class uses the `implements` keyword to adopt an interface.

---

Interfaces are a key component of Java’s object-oriented architecture. They provide a clean way to enforce consistent behavior across unrelated classes and enable flexible, scalable code design.
