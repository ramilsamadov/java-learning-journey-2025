
# 🧠 Java Abstract Classes

## 📘 What is an Abstract Class?

An `abstract` class is a **base (incomplete)** class that cannot be instantiated directly. It is meant to be **inherited by other classes**, providing a **common structure** or **template**.

```java
public abstract class Shape {
    public abstract void draw(); // Abstract method with no body
}
```

---

## 🧱 Key Characteristics

- **Cannot be instantiated** (you can't create an object from it).
- Can contain:
  - **Abstract methods** (methods without a body)
  - **Concrete methods** (regular methods with implementation)
- If a class contains at least one `abstract` method, the class must be declared `abstract`.
- Subclasses that inherit an abstract class must **implement all abstract methods** unless they are also abstract.

---

## ✅ When to Use It?

Use abstract classes when:

- You want to define a **common base** for multiple related classes.
- You have **shared behavior**, but each subclass should have its own specific implementation.
- You want to **enforce a contract** that subclasses must follow.
- You want to combine **both defined and undefined behavior**.

---

## 🛠️ Example

```java
// Abstract class
public abstract class Animal {
    public abstract void makeSound(); // Abstract method

    public void breathe() {           // Concrete method
        System.out.println("Breathing...");
    }
}

// Subclass that implements abstract method
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}
```

**Usage:**

```java
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();  // Output: Bark!
        dog.breathe();    // Output: Breathing...
    }
}
```

---

## 🌟 Advantages of Abstract Classes

| Advantage             | Description                                                    |
|-----------------------|----------------------------------------------------------------|
| Code Reusability      | Shared methods are inherited by all subclasses                 |
| Enforces Structure    | Abstract methods define what must be implemented               |
| Better Design         | Helps organize code logically and maintainably                 |
| Partial Implementation| Allows mixing abstract and concrete methods in the same class  |

---

## ⚠️ Notes

- Abstract classes are different from **interfaces**:
  - Interfaces define **only method signatures** (before Java 8).
  - Abstract classes can have **fields**, **constructors**, and both **abstract and concrete methods**.
- A class can **extend only one abstract class** but **implement multiple interfaces**.

---
