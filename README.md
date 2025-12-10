text
# Java HashSet Demo

This project demonstrates how to use the `HashSet` class in Java to store unique elements efficiently. It showcases the **no-duplicate rule**, how `null` is handled, and that elements are **unordered**.

## 🚀 Features
- Prevents duplicate elements automatically.
- Allows only one `null` value.
- Does not preserve insertion order.
- Offers fast performance for add, remove, and lookup operations.

## 📂 Project Structure
collections/
├── hashset.java

text

### Classes Overview
- **`class f`** → Works with a `HashSet<String>`. Demonstrates duplicate removal and handling of `null` values.
- **`class o`** → Uses a `HashSet<Integer>`. Shows that duplicates are ignored and only one `null` is allowed.
- **`class w`** → Combines both numbers and strings using a `HashSet<Object>` to show mixed-type handling.
- **`hashset` (main class)** → Executes all three examples.

## 🧠 Concepts Demonstrated
| Concept | Description |
|----------|--------------|
| **Uniqueness** | Duplicate elements are automatically ignored. |
| **Order** | HashSet does not maintain any predictable order. |
| **Null Handling** | Only one `null` element is allowed. |
| **Performance** | HashSet operations are generally faster than lists for searching and insertion. |

## 🛠️ How to Run
1. Clone the repository:
git clone https://github.com/<your-username>/Java-HashSet-Demo.git

text
2. Navigate to the folder:
cd Java-HashSet-Demo

text
3. Compile the Java code:
javac collections/hashset.java

text
4. Run the program:
java collections.hashset

text

## 🧩 Example Output
[bhuvi, mani, kumar, rohan, null]
bhuvi
mani
kumar
rohan
null
[null, 1, 2, 3, 4]
[0, 1, 2, 12, bhuvi, ram]
