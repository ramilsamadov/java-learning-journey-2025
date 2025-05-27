# 📘 Java Variable Scope – Complete Guide

In Java, **scope** refers to the area of the code where a variable is accessible. Understanding scope is essential for writing clean, bug-free, and maintainable code.

There are **four primary types of scope** in Java:

1. Local Scope
2. Instance (Object) Scope
3. Static (Class) Scope
4. Block Scope

---

## 1. 🔄 Local Scope

A **local variable** is declared inside a method, constructor, or block. It exists only while the method or block is executing.

### ✅ Example:

```java
public class LocalScope {
    public void greet() {
        String message = "Hello!"; // local variable
        System.out.println(message);
    }
}

## 🧪 Variable Lifecycle Summary
| Scope Type | Declared In         | Accessible Where                | Lifetime                   |
| ---------- | ------------------- | ------------------------------- | -------------------------- |
| Local      | Method or block     | Only in that method/block       | Until method/block ends    |
| Instance   | Class (non-static)  | Any non-static method in class  | As long as object exists   |
| Static     | Class (with static) | Any static or non-static method | As long as class is loaded |
| Block      | Inside `{}` block   | Only within the block           | Until block ends           |

## 💡 Best Practices
    1. Use meaningful variable names to avoid shadowing.
    2. Keep variable scope as narrow as possible.
    3. Prefer local variables unless shared state is needed.
    4. Avoid using static unless you're managing shared data or utilities.

## 📚 Real-World Analogy
| Scope Type | Analogy                              |
| ---------- | ------------------------------------ |
| Local      | Notes taken during a meeting         |
| Instance   | Personal files in your own laptop    |
| Static     | Company-wide notice board            |
| Block      | Temporary variables on a sticky note |
