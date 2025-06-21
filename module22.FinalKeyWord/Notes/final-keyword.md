
# 🔐 Java `final` Keyword

The `final` keyword in Java is a non-access modifier used to restrict the user. It can be applied to variables, methods, parameters, and classes.

---

## 📌 Final Variable (Constant)

A variable declared with `final` cannot be reassigned.

```java
final int age = 25;
age = 30; // ❌ Compile-time error
```

Use case: Declaring constants.

---

## 🛠️ Final Method

A method declared as `final` cannot be **overridden** by subclasses.

```java
class Parent {
    public final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    public void show() { // ❌ Compile-time error
        System.out.println("Trying to override.");
    }
}
```

Use case: Protecting method behavior in inheritance.

---

## 🧩 Final Method Parameter

If a method parameter is declared as `final`, its value cannot be changed within the method.

```java
public void greet(final String name) {
    name = "Another Name"; // ❌ Compile-time error
}
```

Use case: Preventing accidental modification inside the method.

---

## 🧱 Final Class

A class declared as `final` cannot be **extended** (inherited from).

```java
final class Utility {
    // Helper methods
}

// class MyClass extends Utility { } // ❌ Compile-time error
```

Use case: Creating immutable classes or utility classes (like `java.lang.Math`).

---

## ✅ Summary

| Use                  | Restriction                                |
|----------------------|---------------------------------------------|
| `final` variable     | Value cannot be changed                     |
| `final` method       | Cannot be overridden                        |
| `final` parameter    | Cannot be reassigned inside the method      |
| `final` class        | Cannot be subclassed                        |

---
