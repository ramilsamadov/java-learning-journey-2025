# Understanding Inheritance in Java

Inheritance is one of the core concepts of Object-Oriented Programming (OOP) in Java. It allows a class (subclass or child class) to acquire the properties and behaviors (fields and methods) of another class (superclass or parent class).

## 1. Purpose of Inheritance

* Promotes code reusability.
* Establishes a relationship between classes.
* Makes it easier to maintain and extend code.

## 2. Syntax

```java
class Parent {
    // parent class members
}

class Child extends Parent {
    // child class inherits from Parent
}
```

## 3. Access Modifiers and `protected`

The `protected` access modifier plays an important role in inheritance.

* `protected` members can be accessed:

  * Within the same package (just like `default`/package-private).
  * By subclasses (even if they are in different packages).

### Example:

```java
class Animal {
    protected String type = "Mammal";

    protected void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    public void displayInfo() {
        // Accessing protected field and method from parent class
        System.out.println("Animal type: " + type);
        makeSound();
    }
}
```

## 4. Constructors and Inheritance

* Constructors are **not inherited**.
* However, the **constructor of the parent class can be called** using the `super()` keyword.
* `super()` must be the **first statement** in the subclass constructor if used.

### Example:

```java
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    private int grade;

    public Student(String name, int grade) {
        super(name); // calling parent constructor
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
}
```

In this example:

* The `Student` class uses `super(name)` to initialize the `name` field inherited from `Person`.
* The `name` field is marked `protected`, so it can be accessed directly in the `Student` class.

## 5. Summary

* `extends` keyword is used to define inheritance.
* `protected` allows subclass access to superclass members.
* Constructors are not inherited but can be called with `super()`.
* Inherited methods and fields can be used or overridden in the subclass.

Inheritance is a powerful feature that allows you to write cleaner and more modular Java code by reusing functionality across related classes.
