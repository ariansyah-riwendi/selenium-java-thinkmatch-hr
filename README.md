# Selenium Java - Part 03: Cucumber & Hooks

---

This project demonstrates a robust Selenium Java automation framework built with the Page Object Model (POM) design pattern and integrates Cucumber for Behavior-Driven Development (BDD). It uses Cucumber Hooks to manage WebDriver lifecycle and separates production and test code clearly, following best practices for maintainability and scalability.
The example automation targets the OrangeHRM Demo web application.

---

## Objectives
- Implement Cucumber Hooks (@Before and @After) to automate WebDriver setup and teardown around each scenario.
- Organize WebDriver initialization and page object management in reusable base classes (BaseTest, BaseSetup).
- Structure the project with clear separation between production and test code using Maven standard folders (src/main/java and src/test/java).
- Define Step Definitions in the test source folder to map Gherkin feature steps to Java methods.
- Store Cucumber feature files under src/test/resources/features for clear separation and maintainability.
- Configure a Cucumber TestNG Test Runner to execute tagged scenarios and generate rich HTML reports.
- Apply the Page Object Model (POM) pattern to encapsulate UI elements and interactions.
- Use utility helper classes to centralize common Selenium actions (e.g., waiting, clicking, typing).

---

## Tools & Dependencies
- **Java** 21
- **Maven**
- **Selenium Java** 4.x
- **TestNG**
- **ChromeDriver**
- **Cucumber JVM (cucumber-java, cucumber-testng)**

---

## Key Components Overview

### Base Classes (base)
- BaseTest — initializes and quits WebDriver; manages browser setup.
- BaseSetup — extends BaseTest; creates and provides page object instances for tests.

### Hooks (hooks)
- Contains the Hooks class implementing Cucumber lifecycle hooks:
- @Before method to launch browser and prepare test environment.
- @After method to close browser and clean resources.

### Pages (pages)
- Implements Page Object Model to abstract UI page details:
- Defines locators and interaction methods (e.g., input username, click login).
- Promotes reusability and maintainability of test actions.

### Utils (utils)
- Provides common helper methods for Selenium operations such as:
- Waiting for elements visibility.
- Clicking elements safely.
- Inputting text with clearing first. 

### Step Definitions (steps)
- Maps feature file Gherkin steps to Java methods.
- Uses page objects to perform UI actions corresponding to each step.

### Feature Files (features)
- Written in Gherkin syntax to describe user scenarios and acceptance criteria.
- Stored in test resources to keep them decoupled from source code.

### Test Runner (runners)
- Entry point for running Cucumber tests integrated with TestNG.
- Configured with feature file paths, glue code packages, reporting plugins, and tags.

___

## How To Clone (Using IntelliJ IDEA)
1. Open **IntelliJ IDEA**.
2. From the main menu, select: File → New → Project from Version Control...
3. Select **Git** from the list.
4. Paste the repository URL: https://github.com/your-username/selenium-java-part-01-basic.git
5. Click **Clone**.
6. Wait for IntelliJ to finish downloading the project and load all dependencies.

## How To Run
1. Make sure you have **Java** and **Maven** installed.
2. In IntelliJ, open this file: src/test/java/com/automation/tests/LoginTest.java
3. Look on the left side of the class name — click the green **Run ▶** icon.
4. IntelliJ will execute the test, and the browser will open automatically.

