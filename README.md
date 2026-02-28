# 📱 Android Mobile QA Testing Portfolio Project

---

## 📌 Project Overview

This repository demonstrates a structured manual mobile testing cycle performed on a custom-built Android application.

The primary focus of this project was validating Android-specific behaviors such as activity lifecycle transitions, navigation stability, UI responsiveness, and state handling during configuration changes.

The project follows a complete QA workflow including test planning, test design, execution, defect reporting, and documentation organization.

---

## 🛠 Application Under Test

The application under test is a simple Android application developed using Kotlin and Jetpack Compose.

It contains two primary screens with navigation between them, UI interaction feedback through Toast messages, and back stack handling using Compose Navigation.

The application was intentionally designed to allow validation of lifecycle behavior, navigation consistency, and user interaction scenarios.

---

## 🧪 Testing Scope

### Included

- Application launch and cold start validation
- Background and foreground transitions
- Screen rotation handling
- Navigation flow between screens
- Back stack behavior consistency
- UI interaction responsiveness
- Rapid interaction stress scenarios
- Memory pressure validation
- Network interruption handling

### Excluded

- Performance testing
- Security testing
- Automation testing
- Multi-device compatibility testing
- Backend/API validation beyond connectivity change simulation

---

## 🔍 Testing Approach

Testing was performed using a structured manual testing methodology including:

- Functional test scenario validation
- Negative and edge case testing
- Mobile-specific lifecycle simulation (rotation, interruptions, background/foreground)
- Memory pressure testing
- Exploratory testing to identify unstable behavior
- Structured defect documentation with reproducible steps
- Risk-based test coverage mapping (RTM)

---

## 🐞 Defect Documentation

Identified defects are documented in the `/docs/defects` directory.

Each defect report includes:

- Summary
- Environment details
- Steps to reproduce
- Expected result
- Actual result
- Severity reasoning
- Supporting evidence (screenshots and videos)

---

## 📂 Repository Structure

The documentation is organized according to the QA lifecycle:

- `/test-plan/` – Planning documentation
- `/test-design/` – Structured test cases and checklists
- `/test-execution/` – Exploratory testing notes and summary reports
- `/docs/defects/` – Structured bug reports
- `/docs/evidence/` – Screenshots and video evidence
- `/environment/` – Environment setup details
- `Requirement_Traceability_Matrix.md` – Risk-to-test mapping

---

## 📑 Documentation Standards

All test artifacts in this repository follow the conventions defined in `Documentation_Standards.md`, including:

- Standardized test case structure
- ISO 8601 date formatting
- Execution result documentation format
- Evidence file naming conventions
- Defect identification and traceability rules

This ensures consistency, clarity, and traceability across all QA deliverables.

---

## 🎯 Skills Demonstrated

- Manual mobile testing
- Android lifecycle validation
- Navigation and back stack analysis
- Structured test documentation
- Defect reporting with reproducible evidence
- Risk-based test coverage mapping
- Requirement Traceability Matrix (RTM) usage
- Lifecycle stress and interruption testing

---

# Risk Coverage Overview

The test suite is mapped to identified project risks as defined in the Requirement Traceability Matrix (RTM).

---

### 🔴 R-01 — Application Launch & Relaunch

**Test Cases:**  
TC-FUNC-01  
TC-FUNC-07  
TC-FUNC-13  
TC-MOB-09  

Validates application startup, relaunch stability, and post-reboot behavior.

**Status:** Partially Executed

---

### 🔴 R-02 — Navigation Flow Stability

**Test Cases:**  
TC-FUNC-02  
TC-FUNC-03  
TC-FUNC-04  
TC-FUNC-06  
TC-NEG-01  
TC-NEG-03  

Validates screen transitions, back stack consistency, and prevention of duplicate or corrupted navigation states.

**Status:** Partially Executed

---

### 🟡 R-03 — Screen Rotation Handling

**Test Cases:**  
TC-FUNC-09  
TC-FUNC-11  
TC-FUNC-14  
TC-MOB-01  
TC-NEG-06  
TC-NEG-12  

Validates layout integrity and state preservation during orientation changes.

**Result:** One defect identified (DEF-001 — Landscape clipping issue)

---

### 🟡 R-04 — Background / Foreground Lifecycle

**Test Cases:**  
TC-FUNC-08  
TC-MOB-02  
TC-MOB-03  
TC-MOB-04  
TC-MOB-05  
TC-MOB-06  
TC-NEG-07  
TC-NEG-11  

Validates lifecycle stability during minimize/restore, lock/unlock, memory pressure, and interruption scenarios.

Core lifecycle stress scenarios executed. No additional instability identified.

---

### 🟠 R-05 — Rapid / Abnormal User Interaction

**Test Cases:**  
TC-NEG-02  
TC-NEG-04  
TC-NEG-05  
TC-NEG-08  
TC-NEG-09  
TC-NEG-10  

Validates system behavior under rapid tapping, repeated actions, and abnormal interaction patterns.

**Status:** Designed and Partially Executed

---

### 🟢 R-06 — Network Interruption Handling

**Test Cases:**  
TC-MOB-10  

Validates application stability during network connectivity loss and restoration.

**Result:** Executed — No instability observed

---

### 🟢 R-07 — UI Feedback Consistency

**Test Cases:**  
TC-FUNC-05  

Validates Toast message visibility and duplication handling.

**Result:** Executed — No defects identified

---

### ⚪ R-08 — Environmental Conditions

**Test Cases:**  
TC-MOB-07  
TC-MOB-08  

Validates application behavior under low battery mode and system language changes.

**Status:** Designed