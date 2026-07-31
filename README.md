TASK DESC: Sorting functionality.

Focus: Functionality of different sorting options

Launch URL: https://www.saucedemo.com

UC-1 Sort by Name (A to Z)
Login as standard_user.
Select “Name (A to Z)” in sorting dropdown.
Verify items are sorted in alphabetical order (A → Z).

UC-2 Sort by Name (Z to A)
Login as standard_user.
Select “Name (Z to A)” in sorting dropdown.
Verify items are sorted in reverse alphabetical order (Z → A).

UC-3 Sort by Price (low to high)
Login as standard_user.
Select “Price (low to high)” in sorting dropdown.
Verify items are sorted by price (low → high).

UC-4 Sort by Price (high to low)
Login as standard_user.
Select “Price (high to low)” in sorting dropdown.
Verify items are sorted by price (high → low).

Technical Requirements:
Tool: Selenium WebDriver.

Browsers: Chrome, Edge (Run in Parallel).

Pattern: Page Object Model (POM).

Locators: CSS Selectors, Xpath.

Reporting: Generate an Allure Report (or similar HTML report) for the test run.

Documentation: Add a README.md explaining how to run the tests and generate the report.

===========================================================================================

README.md:

SauceDemo Sorting Automation

Technologies:
Java 17
Maven
Selenium WebDriver
JUnit 5

Browsers:
Chrome
Edge

Framework:
Page Object Model

Run Tests:
mvn clean test

Tests run on Chrome and Edge parallelly.

Allure Report:
allure serve target/allure-results