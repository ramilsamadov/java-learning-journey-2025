# 🧮 Java Operators Notes

This document covers the basic operators in Java: arithmetic, relational, logical, assignment, unary, and ternary operators.

---

1. 🔢 Arithmetic Operators
| Operator | Meaning     | Example  | Description                            |
|----------|-------------|----------|-------------------------------------|
| `+`      | Addition    | `a + b`  | Adds a and b                         |
| `-`      | Subtraction | `a - b`  | Subtracts b from a                  |
| `*`      | Multiplication | `a * b` | Multiplies a and b                  |
| `/`      | Division    | `a / b`  | Divides a by b (integer division truncates) |
| `%`      | Modulus     | `a % b`  | Remainder of a divided by b         |

```java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a % b); // 1


2. 🤔 Relational Operators
| Operator | Meaning          | Example  |
| -------- | ---------------- | -------- |
| `==`     | Equal to         | `a == b` |
| `!=`     | Not equal to     | `a != b` |
| `>`      | Greater than     | `a > b`  |
| `<`      | Less than        | `a < b`  |
| `>=`     | Greater or equal | `a >= b` |
| `<=`     | Less or equal    | `a <= b` |


3. 🧠 Logical Operators
| Operator | Meaning | Example          |    |         |   |         |
| -------- | ------- | ---------------- | -- | ------- | - | ------- |
| `&&`     | AND     | `a > 0 && b > 0` |    |         |   |         |
| \`       |         | \`               | OR | \`a > 0 |   | b > 0\` |
| `!`      | NOT     | `!(a > b)`       |    |         |   |         |


4. 📝 Assignment Operators
| Operator | Description         | Example  |
| -------- | ------------------- | -------- |
| `=`      | Assignment          | `a = 5`  |
| `+=`     | Add and assign      | `a += 3` |
| `-=`     | Subtract and assign | `a -= 2` |
| `*=`     | Multiply and assign | `a *= 4` |
| `/=`     | Divide and assign   | `a /= 2` |
| `%=`     | Modulus and assign  | `a %= 3` |


5. ➕ Unary Operators
| Operator | Description                | Example      |
| -------- | -------------------------- | ------------ |
| `+`      | Positive sign              | `+a`         |
| `-`      | Negative sign              | `-a`         |
| `++`     | Increment (prefix/postfix) | `++a`, `a++` |
| `--`     | Decrement (prefix/postfix) | `--a`, `a--` |


6. 🎯 Ternary Operator
A shorthand for if-else statement:
int max = (a > b) ? a : b;
Returns a if a > b is true, otherwise returns b.

📌 Notes
Difference between ++a and a++:
    1.++a: Increment first, then use
    2.a++: Use first, then increment
Integer division truncates decimal part, e.g., 5 / 2 = 2
