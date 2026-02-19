## 📌 Project Overview

This repository demonstrates a structured manual mobile testing cycle performed on a custom-built Android application.

The primary focus of this project was validating Android-specific behaviors such as activity lifecycle transitions, navigation stability, UI responsiveness, and state handling during configuration changes.

The project follows a complete QA workflow including test planning, test design, execution, defect reporting, and documentation organization.


## 🛠 Application Under Test

The application under test is a simple Android application developed using Kotlin and Jetpack Compose.

It contains two primary screens with navigation between them, UI interaction feedback through Toast messages, and back stack handling using Compose Navigation.

The application was intentionally designed to allow validation of lifecycle behavior, navigation consistency, and user interaction scenarios.


## 🧪 Testing Scope

### Included

- Application launch and cold start validation
- Background and foreground transitions
- Screen rotation handling
- Navigation flow between screens
- Back stack behavior consistency
- UI interaction responsiveness
- Rapid interaction stress scenarios

### Excluded

- Performance testing
- Security testing
- Network/API validation
- Automation testing
- Multi-device compatibility testing


## 🔍 Testing Approach

Testing was performed using a structured manual testing methodology including:

- Functional test scenario validation
- Negative and edge case testing
- Mobile-specific lifecycle simulation (rotation and interruptions)
- Exploratory testing to identify unstable behavior
- Structured defect documentation with reproducible steps


## 🐞 Defect Documentation

Identified defects are documented in the `/docs/defects` directory.

Each defect report includes:

- Summary
- Steps to reproduce
- Expected result
- Actual result
- Severity reasoning
- Supporting evidence (screenshots and videos)


## 📂 Repository Structure

The documentation is organized according to the QA lifecycle:

- `/test-plan/` – Planning documentation
- `/test-design/` – Checklist and test scenarios
- `/test-execution/` – Exploratory testing notes
- `/defects/` – Structured bug reports
- `/environment/` – Environment setup details


## 🎯 Skills Demonstrated

- Manual mobile testing
- Android lifecycle validation
- Navigation and back stack analysis
- Structured test documentation
- Defect reporting with evidence
- Risk-based thinking

