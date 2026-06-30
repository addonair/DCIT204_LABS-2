# DCIT 204 – Lab 2: Interactive Array Algorithms

## Objective

> **This assignment is due on Wednesday 1:10pm**

In this lab, you will build **interactive console applications** by implementing two fundamental array algorithms discussed in class:

* **Find Maximum Value**
* **Pair Sum (Brute Force Search)**

Unlike previous examples where arrays and target values were hardcoded, this assignment requires your programs to collect all necessary input from the user using Java's `Scanner` class.

The goal is to strengthen your understanding of:

* User input handling
* Arrays
* Loops
* Brute-force searching
* Time complexity
* Writing clean, readable Java code


---

# Task 1: Interactive Find Maximum Algorithm

Write a Java program that finds the **largest value** in an array **and its index**.

## Requirements

Your program must:

1. Prompt the user to enter the number of elements in the array.
2. Create an integer array of that size.
3. Prompt the user to enter each array element one at a time.
4. Search through the array to determine:

   * The maximum value
   * The index where the maximum value occurs
5. Display the results in a clear and professional format.

---

---

# Task 2: Interactive Pair Sum (Brute Force)

Write a Java program that searches for **a unique pair of numbers** whose sum equals a target value.

## Requirements

Your program must:

1. Prompt the user for the array size.
2. Accept each array element from the user.
3. Prompt the user to enter a **Target Sum**.
4. Use the **Brute Force (Nested Loop)** algorithm to search for a matching pair.
5. If a pair is found, display:

   * Both indices
   * Their values
   * The equation
6. If no pair exists, print an appropriate message.

---

---

# 📂 Project Structure

Your project should contain the following Java files:

```text
Lab2/
│
├── FindMax.java
├── PairSum.java
└── README.md
```

---

# Submission Instructions

Follow the Git workflow below exactly.

---

## Step 1 — Fork the Repository

Fork the official repository:

```text
https://github.com/DCIT204-2026/DCIT204_LABS-2.git
```

---

## Step 2 — Clone Your Fork

```bash
git clone <YOUR_FORK_URL>
```

---

## Step 3 — Create Your Branch

Create a new branch using the format:

```text
firstName_StudentId
```

Example:

```bash
git checkout -b john_10912345
```

**Branch Naming Format**

```text
firstname_studentID
```

Examples

```text
joseph_11023456
mary_10987654
john_10876543
```

---

## Step 4 — Complete the Assignment

Implement both Java programs.

---

## Step 5 — Commit Your Work

```bash
git add .
git commit -m "Completed Lab 2 Array Algorithms"
```

---

## Step 6 — Push Your Branch

```bash
git push origin firstName_StudentId
```

Example:

```bash
git push origin john_10912345
```

---


# Learning Outcomes

After completing this lab, you should be able to:

* Work confidently with arrays.
* Accept user input using `Scanner`.
* Implement a linear search algorithm.
* Implement a brute-force pair search.
* Analyze algorithm time complexity.
* Write clean, maintainable Java code.
* Use Git and GitHub for version control.

---

## Best of Luck!

Take your time, write clean code, test your programs thoroughly, and remember:

> **Correctness first, then readability, then efficiency.**
