## 🔧 Constructor vs Method in Java
| Feature                   | **Constructor**                                         | **Method**                                                  |
| ------------------------- | ------------------------------------------------------- | ----------------------------------------------------------- |
| **Purpose**               | Used to **create and initialize** an object             | Used to **perform a task or define behavior**               |
| **Name**                  | Must have the **same name as the class**                | Can have **any name**                                       |
| **Return Type**           | Has **no return type**, not even `void`                 | Must have a **return type** (e.g., `void`, `int`, `String`) |
| **Called Automatically?** | Yes, **called automatically** when an object is created | No, must be **called manually**                             |
| **Can Be Inherited?**     | No                                                      | Yes (methods can be inherited and overridden)               |
| **Can Be Overloaded?**    | Yes                                                     | Yes                                                         |
| **How It's Called**       | With the `new` keyword: `new ClassName()`               | Using the object: `object.methodName()`                     |


🧪 Examples
✅ Constructor Example:
public class Car {
    String model;

    // Constructor
    public Car(String modelName) {
        model = modelName;
    }
}
## Usage:
Car myCar = new Car("Toyota"); // Constructor is called

## ✅ Method Example:
public class Car {
    String model;

    // Method
    public void drive() {
        System.out.println("Driving " + model);
    }
}
## Usage:
myCar.drive(); // Method is called manually

🧠 Key Tip to Remember:
 1. Constructor = Creates the object
 2. Method = Tells the object what to do