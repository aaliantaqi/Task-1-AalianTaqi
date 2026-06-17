# 🎮 Number Guessing Game — Java Project 1

A console-based number guessing game built in Java as part of the
DecodeLabs Internship Batch 2026.

---

## 📌 Project Overview

The program generates a random number between 1 and 100 and challenges
the player to guess it within 3 attempts. After each guess, the program
provides feedback guiding the player toward the correct answer.

---

## ⚙️ Features

- 🎲 Random number generation (1–100) using `java.util.Random`
- 💬 Real-time feedback — Too High / Too Low hints
- ❤️ 3 lives per round
- 🔁 Multiple rounds with Play Again option
- 🏆 Score tracking across rounds
- 💀 Game Over message reveals the secret number
- 🛡️ Input validation — handles non-numeric input without crashing

---

## 🧠 Concepts Used

- `java.util.Random` — random number generation
- `java.util.Scanner` — user input handling
- `do-while` loop — game loop
- `if-else` conditionals — feedback logic
- `try-catch` with `InputMismatchException` — defensive input handling

---

## 🚀 How to Run

### Prerequisites
- Java JDK installed (version 8 or above)

### Steps

1. Clone the repository
   git clone https://github.com/aaliantaqi/Task-1-AalianTaqi.git

2. Navigate to the project folder
   cd Task-1-AalianTaqi

3. Compile the file
   javac DecodeLabs_Java_P1.java

4. Run the program
   java DecodeLabs_Java_P1

---

## 🎮 How to Play

1. The program picks a secret number between 1 and 100
2. You have 3 lives to guess it
3. After each wrong guess you get a hint — guess Higher or Lower
4. Guess correctly to earn a point
5. After each round choose to Play Again or Exit
6. Your total score is displayed at the end

---

## 📁 File Structure

DecodeLabs_Java_P1.java   — Main source file

---

## 👨‍💻 Author

- **Aalian Taqi**
- DecodeLabs Industrial Training — Batch 2026

---

## 📄 License

This project is part of the DecodeLabs training program.
