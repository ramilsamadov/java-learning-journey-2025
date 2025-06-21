# Encapsulation in Object-Oriented Programming

Encapsulation is one of the fundamental principles of object-oriented programming (OOP). It refers to the bundling of data (fields) and the methods that operate on that data into a single unit, typically a class, and restricting direct access to some of the object's components.

## 🎯 Key Goals of Encapsulation

- **Data protection**: Prevent external classes from directly modifying internal fields.
- **Controlled access**: Provide controlled ways (getters/setters) to read or modify data.
- **Improved maintainability**: Makes code easier to maintain and debug.
- **Hiding implementation details**: Keeps internal logic hidden from the outside world.

## 🔒 How Encapsulation Works in Java

- Declare class fields as `private`.
- Provide `public` getter and setter methods to access or modify those fields.

### Example:

```java
public class Employee {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

# ✅ Benefits of Encapsulation

- **Security**: Sensitive data is hidden from unauthorized access.
- **Validation**: You can add checks inside setters before accepting data.
- **Flexibility**: The internal implementation can change without affecting code that uses the class.
- **Modularity**: Each class manages its own state and behavior, making it easier to debug and maintain.

# 💡 Best Practices

- Always declare class variables as `private`.
- Provide `public` getter and setter methods when external access is needed.
- Avoid exposing unnecessary fields or internal logic.
- Add validation logic in setter methods to ensure data consistency.

# 🧠 Remember

Encapsulation is not just about marking fields as `private`. It’s about defining a **controlled boundary** between a class’s internal state and the external code that interacts with it.

> "Encapsulation is the protective shield that prevents the data from being accessed by the code outside this shield."

---

# 📊 Access Modifiers in Java

| Modifier   | Class | Package | Subclass | World |
|------------|:-----:|:-------:|:--------:|:-----:|
| `public`   | ✅     | ✅       | ✅        | ✅     |
| `protected`| ✅     | ✅       | ✅        | ❌     |
| *(default)*| ✅     | ✅       | ❌        | ❌     |
| `private`  | ✅     | ❌       | ❌        | ❌     |

### Legend:
- **Class** – accessible within the same class
- **Package** – accessible within the same package
- **Subclass** – accessible in subclasses (even in different packages for `protected`)
- **World** – accessible from anywhere

**Note:** Default access (also called *package-private*) is when no access modifier is specified.

---

