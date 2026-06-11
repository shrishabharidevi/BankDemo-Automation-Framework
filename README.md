# BankDemo Automation Framework

A Selenium WebDriver Test Automation Framework built using Java, TestNG, Maven, Page Object Model (POM), Apache POI, Log4j2, and Extent Reports.

## Project Overview

This framework automates the banking application available at:

https://qaplayground.com/bank

The framework follows industry-standard design patterns and best practices to ensure maintainability, scalability, and reusability.

---

## Tech Stack

- Java 17
- Selenium WebDriver 4
- TestNG
- Maven
- Page Object Model (POM)
- Apache POI (Excel Data Handling)
- Log4j2 (Logging)
- Extent Reports
- Git & GitHub

---

## Framework Features

### Page Object Model (POM)

Separate page classes for:
- Login Page
- Dashboard Page
- Transactions Page

### Data-Driven Testing

- Excel-based test data
- Apache POI integration
- TestNG DataProvider support

### Reporting

- Extent Reports integration
- HTML execution reports

### Logging

- Log4j2 implementation
- Console and file logging support

### Screenshots

- Screenshot capture on test execution
- Stored in screenshots folder

---

## Project Structure

```text
BankDemo
│
├── src/main/java
│   ├── base
│   ├── pages
│   └── util
│
├── src/main/resources
│   ├── config.properties
│   └── log4j2.xml
│
├── src/test/java
│   └── testcases
│
├── testdata
│   └── bankDemo_testdata.xlsx
│
├── screenshots
│
├── test-output
│
├── testng.xml
│
└── pom.xml
```

---

## Test Scenarios Covered

### Login Functionality

- Valid Login
- Dashboard Validation

### Account Creation

- Create Savings Account
- Create Current Account
- Data-driven account creation using Excel

### Transaction Validation

- Verify account creation
- Verify transaction details

---

## Excel Test Data Example

| Account Name | Account Type | Balance |
|-------------|-------------|----------|
| savingsaccount1 | savings | 1500 |
| savingsaccount2 | savings | 1243 |
| currentaccount1 | current | 1200 |

---

## Running Tests

### Clone Repository

```bash
git clone https://github.com/yourusername/BankDemo-Automation-Framework.git
```

### Navigate to Project

```bash
cd BankDemo-Automation-Framework
```

### Run Tests

```bash
mvn test
```

### Run TestNG Suite

```bash
Right Click → testng.xml → Run As → TestNG Suite
```

---

## Reporting

After execution:

### TestNG Report

```text
test-output/index.html
```

### Extent Report

```text
test-output/Extent.html
```

---

## Logging

Logs are generated at:

```text
logs/application.log
```

---

## Design Patterns Used

- Page Object Model (POM)
- Factory Pattern (PageFactory)
- Data-Driven Framework
- Utility Classes
- Singleton Configuration Loading

---

## Future Enhancements

- Selenium Grid Integration
- Docker Support
- Jenkins CI/CD Integration
- Cross Browser Execution
- Parallel Execution
- Allure Reporting

---

## Author

Shri Shabhari Devi A

### QA Automation Engineer

Skills:
- Manual Testing
- Selenium WebDriver
- Java
- TestNG
- Maven
- Apache POI
- Git & GitHub
- API Testing

