# Getters and Setters in Java

## 📌 What Are Getters and Setters?

- A **getter** is a method used to read the value of a private field.
- A **setter** is a method used to modify the value of a private field.

They are used to enforce **encapsulation** by controlling how fields are accessed and modified.

---

## ✅ Why Use Getters and Setters?

- Protect the internal state of an object
- Add validation before modifying fields
- Make code easier to maintain and refactor
- Control read/write permissions for fields

---

## 🧪 Basic Example

```java
public class Student {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
==========================================================
## Usage:
Student s = new Student();
s.setName("Alice");
s.setAge(21);

System.out.println(s.getName()); // Alice
System.out.println(s.getAge());  // 21

## Example with Validation
public class Employee {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be non-negative.");
        }
    }
}
## Output:
Employee e = new Employee();
e.setSalary(-100); // Prints warning
e.setSalary(5000);
System.out.println(e.getSalary()); // 5000

Best Practices
 - Always keep fields private.
 - Use meaningful names: getX(), setX().
 - Use validation logic inside setters when needed.
 - Avoid unnecessary setters if the value should be read-only.
 - For boolean fields, use isX() instead of getX() (e.g., isAvailable()).

