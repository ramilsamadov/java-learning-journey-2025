# 📘 Java Methods - Notes

## 🧠 1. What is a Method?

A **method** is a reusable block of code that performs a specific task. It can take input (parameters), execute operations, and optionally return a result.

---

## 🧱 2. Basic Syntax of a Method

```java
// Method without return value
public static void methodName() {
    // Code block
}

// Method with return value
public static int sum(int a, int b) {
    return a + b;
}

🔁 3. Types of Methods
➤ Void Methods
    Do not return any value. 
public static void greet() {
    System.out.println("Hello!");
}

➤ Return Methods
    Return a value using the return keyword.
public static int square(int number) {
    return number * number;
}

🧩 4. Parameters vs Arguments
  1. Parameters: Variables listed in method declaration.
  2. Arguments: Actual values passed when calling a method.
public static void printName(String name) { // parameter
    System.out.println("Name: " + name);
}
printName("Alice"); // "Alice" is an argument

🧪 5. Method Example: Prime Number Checker
public static boolean isPrime(int number) {
    if (number <= 1) return false;
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) return false;
    }
    return true;
}

🧠 7. Method Overloading (Advanced)
    You can define multiple methods with the same name but different parameter lists.
public static int sum(int a, int b) {
    return a + b;
}

public static double sum(double a, double b) {
    return a + b;
}

✅ 8. Best Practices
1. Use descriptive method names (e.g., calculateArea)
2. Keep methods short and focused on a single task
3. Use comments for complex logic
4. Use static for utility/helper methods (especially in beginner-level programs)

