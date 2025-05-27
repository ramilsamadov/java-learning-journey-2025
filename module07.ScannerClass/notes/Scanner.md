## 🔑 Common Scanner Methods
| Method         | Description                     |
| -------------- | ------------------------------- |
| `next()`       | Reads the next token (word)     |
| `nextLine()`   | Reads the entire line           |
| `nextInt()`    | Reads an integer                |
| `nextDouble()` | Reads a double (decimal number) |
| `hasNext()`    | Checks if there is more input   |
| `close()`      | Closes the scanner              |

## ⚠️ Things to Watch Out For
1. Mixing nextInt() and nextLine() can cause input issues due to newline characters.
2. Always close the scanner with scanner.close() to free resources.