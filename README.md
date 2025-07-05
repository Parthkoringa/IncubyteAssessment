# String Calculator – Incubyte Assessment

A Java implementation of the **String Calculator** developed using **Test-Driven Development (TDD)** principles as part of the **Incubyte coding assessment**.

---

## 🚀 Features

- ✅ Add numbers from a string
- ✅ Handle empty string
- ✅ Supports default delimiters: `,` and newline (`\n`)
- ✅ Supports custom delimiters:
  - Single character: `//;\n1;2`
  - Multi-character: `//[***]\n1***2***3`
  - Multiple delimiters: `//[*][%]\n1*2%3`
- ✅ Throws exception for negative numbers
- ✅ Handles unknown amount of numbers
- ✅ Ignores numbers > 1000

---

## 🛠 Technologies Used

- Java 
- JUnit 4 (for test cases)
- Maven (for build and dependency management)

---

## 📂 Project Structure

```
IncubyteAssessment/
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── Incubyte/
│                   └── StringCalculator.java
│
├── src/
│   └── test/
│       └── java/
│           └── org/
│               └── Incubyte/
│                   └── StringCalculatorTest.java
│
├── pom.xml
└── README.md
```

---



## 📜 Sample Inputs & Expected Outputs

| Input                            | Output | Notes                                      |
|----------------------------------|--------|--------------------------------------------|
| `""`                             | `0`    | Empty string returns 0                     |
| `"1"`                            | `1`    | Single number                              |
| `"1,2"`                          | `3`    | Sum of two numbers                         |
| `"1\n2,3"`                       | `6`    | Supports newline as delimiter              |
| `"//;\n1;2"`                    | `3`    | Custom single-char delimiter               |
| `"//[***]\n1***2***3"`          | `6`    | Custom delimiter of any length             |
| `"//[*][%]\n1*2%3"`             | `6`    | Multiple custom delimiters                 |
| `"1,-2,3"`                      | Error  | Throws exception: Negative numbers not allowed: [-2] |
| `"1,2,1001"`                    | `3`    | Numbers > 1000 are ignored (if implemented) |


## 📬 Contact

Built by [Parth Koringa](https://github.com/Parthkoringa/IncubyteAssessment.git) as part of the Incubyte coding assessment.
<br>Email:- koringap321@gmail.com
---

