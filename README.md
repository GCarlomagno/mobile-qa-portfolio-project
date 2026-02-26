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


## Risk Coverage Overview

The test suite was reviewed and classified according to risk areas relevant to Android mobile application testing.

### 🟢 Core Functional Flow
TC-FUNC-01  
TC-FUNC-02  
TC-FUNC-03  
TC-FUNC-04  
TC-FUNC-06  
TC-FUNC-12  

Covers standard application launch, navigation flow, and back navigation behavior under normal user interaction.

---

### 🟡 Negative / Stress Interaction
TC-NEG-01  
TC-NEG-02  
TC-NEG-03  
TC-NEG-04  
TC-NEG-05  
TC-NEG-08  
TC-NEG-09  
TC-NEG-13  

Covers rapid interactions, repeated actions, abnormal user behavior patterns, and stress conditions.

---

### 🔵 Rotation Handling
TC-FUNC-09  
TC-FUNC-11  
TC-MOB-01  
TC-MOB-04  
TC-NEG-06  
TC-NEG-10  
TC-NEG-12  

Validates layout integrity, state preservation, and stability during orientation changes.

---

### 🟣 Background / Foreground & Interruptions
TC-FUNC-08  
TC-MOB-02  
TC-MOB-04  
TC-MOB-05  
TC-NEG-07  
TC-NEG-11  

Validates application behavior during lifecycle transitions including minimize, restore, lock/unlock, and memory pressure scenarios.

---

### 🟠 Network Interruption / Change
TC-MOB-17  

Validates application stability during network connectivity loss and restoration.

---

### ⚪ Crash Recovery / Relaunch
TC-FUNC-07  
(Supported by TC-MOB-05)

Validates application behavior after force-stop and resume scenarios.

---

### ⚪ Permission Handling
N/A — The application does not request runtime permissions.

---

### ⚪ Invalid Inputs
N/A — The application does not contain user input fields. Abnormal interaction behavior is covered through negative test cases.