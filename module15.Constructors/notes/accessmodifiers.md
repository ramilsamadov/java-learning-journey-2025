##🔐 Java Access Modifiers
Java provides four main access modifiers to control the visibility of classes, methods, and variables.

1. public
    Access Level: Everywhere (inside the same class, same package, and other packages)
    Usage: When you want your class or method to be accessible from anywhere
## Example
public class MyClass {
    public void sayHello() {
        System.out.println("Hello");
    }
}

2. protected
Access Level:
    Same class
    Same package
    Subclasses in other packages
Usage: For allowing limited access to child classes and within the same package
## Example:
protected int age;

3. default (no modifier)
    Access Level: Only accessible within the same package
    Usage: For package-private access when you don’t write any modifier
## Example:
void show() {
    System.out.println("Package-private method");
}

4. private
Access Level: Only inside the same class
Usage: For hiding internal details or sensitive data
## Example:
private String password;

## 🔒 Summary Table
| Modifier    | Same Class | Same Package | Subclass (Other Package) | Other Packages |
| ----------- | ---------- | ------------ | ------------------------ | -------------- |
| `public`    | ✅          | ✅            | ✅                        | ✅              |
| `protected` | ✅          | ✅            | ✅                        | ❌              |
| *default*   | ✅          | ✅            | ❌                        | ❌              |
| `private`   | ✅          | ❌            | ❌                        | ❌              |
