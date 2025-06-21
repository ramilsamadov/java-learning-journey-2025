# Understanding `super` and `this` in Java

In Java, `super` and `this` are special keywords used for referencing parent class members and current class members, respectively. They are primarily used in the context of **inheritance**, **constructor chaining**, and **method overriding**.

---

## 🔹 `super` Keyword

The `super` keyword refers to the **immediate parent class** of the current class.

### ✳️ Uses of `super`:

1. **Call the parent class constructor:**

   ```java
   super(); // calls the parent class's default constructor
   super(param1, param2); // calls the parent class's parameterized constructor
   ```

2. **Access a parent class method that is overridden:**

   ```java
   super.someMethod();
   ```

3. **Access a parent class field (when shadowed):**

   ```java
   super.fieldName;
   ```

### 🛑 Rules for using `super()`:

* `super()` **must be the first statement** in the subclass constructor.
* If not explicitly used, Java automatically calls the parent’s **no-argument constructor**.

### 📌 Example:

```java
class Animal {
    public Animal(String name) {
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {
    public Dog() {
        super("Dog"); // calls Animal constructor
        System.out.println("Dog created");
    }
}
```

---

## 🔹 `this` Keyword

The `this` keyword refers to the **current object** of the class.

### ✳️ Uses of `this`:

1. **Differentiate between instance variables and parameters:**

   ```java
   this.name = name;
   ```

2. **Call another constructor in the same class:**

   ```java
   this(); // calls default constructor
   this(param1, param2); // calls another constructor
   ```

3. **Pass the current object as a parameter:**

   ```java
   someMethod(this);
   ```

### 🛑 Rules for using `this()`:

* `this()` must be the **first line** of a constructor.
* You cannot use both `this()` and `super()` in the same constructor.

### 📌 Example:

```java
class Person {
    private String name;

    public Person() {
        this("Unknown"); // calls parameterized constructor
    }

    public Person(String name) {
        this.name = name;
    }
}
```

---

## 🔁 Summary

| Keyword | Refers to      | Common Use                                | Rules                                |
| ------- | -------------- | ----------------------------------------- | ------------------------------------ |
| `super` | Parent class   | Call parent constructor, methods, fields  | Must be first in constructor         |
| `this`  | Current object | Reference current instance or constructor | Must be first in constructor if used |

Understanding and properly using `super` and `this` allows you to build more readable and maintainable object-oriented Java code, especially in multi-level inheritance and constructor chaining scenarios.
