# 📱 Android Mobile QA Testing Portfolio Project

**Application Version Tested:** 1.0 (Local Debug Build)
**Test Cycle Version:** 1.3
**Test Execution Period:** 2026-02-18 – 2026-03-08
**Test Device:** Xiaomi Redmi 12C (Android 14, API 34)

---

## 📌 Project Overview

This repository demonstrates a complete structured manual testing cycle executed on an Android mobile application.

The objective of the test cycle was to validate application stability across Android lifecycle transitions, navigation behavior, UI interaction reliability, and abnormal user interaction scenarios.

The project includes full QA documentation artifacts:

- Test Plan
- Structured Test Cases (Functional, Negative, Mobile-specific)
- Requirement Traceability Matrix (RTM)
- Exploratory Testing Notes
- Defect Reports with reproducible steps and evidence
- Test Summary Report

All artifacts follow standardized documentation conventions to simulate real project-level QA execution.

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

## 📝 Testing Approach

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

- `/docs/test-plan/` – Planning documentation
- `/docs/test-design/` – Structured test cases and checklists
- `/docs/test-execution/` – Exploratory testing notes and summary reports
- `/docs/defects/` – Structured bug reports
- `/docs/environment/` – Environment setup details
- `/docs/RequirementTraceabilityMatrix.md` – Risk-to-test mapping
- `/evidence/` – Screenshots and video evidence

---

## 📋 Documentation Standards

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

## 🧪 Test Execution Results

- **Total Test Cases Designed:** 42
- **Test Cases Executed:** 28 — ([Test Summary Report](docs/test-execution/TestSummaryReport.md))
- **Defects Identified:** 2 — ([DEF-001](docs/defects/DEF-001-landscape-content-rendered-under-system-navigation-bar.md), [DEF-002](docs/defects/DEF-002-rapid-tap-blank-screen.md))
- **Exploratory Session Conducted:** Yes — ([ExploratoryTesting.md](docs/test-execution/ExploratoryTesting.md))
- **Risk Coverage Maintained via RTM:** Yes — ([RequirementTraceabilityMatrix.md](docs/RequirementTraceabilityMatrix.md))

Execution included structured validation as well as exploratory stress testing to assess behavior under rapid user interaction and lifecycle edge conditions.

---

## ⚠ Risk-Based Coverage Overview

The test suite was mapped against identified project risks using a Requirement Traceability Matrix (RTM).

| Risk ID | Risk Area | Coverage Status | Defect Impact |
|---------|-----------|----------------|---------------|
| R-01 | Application Launch & Relaunch | Partially Executed | None |
| R-02 | Navigation Flow Stability | Partially Executed | DEF-002 |
| R-03 | Screen Rotation Handling | Partially Executed | DEF-001 |
| R-04 | Background / Foreground Lifecycle | Partially Executed | None |
| R-05 | Rapid / Abnormal Interaction | Partially Executed | DEF-002 |
| R-06 | Network Interruption Handling | Executed | None |
| R-07 | UI Feedback Consistency | Executed | None |
| R-08 | Environmental Conditions | Designed | None |

Full traceability mapping is available in the [RequirementTraceabilityMatrix.md](docs/RequirementTraceabilityMatrix.md).

---

### 🔴 R-01 – Application Launch & Relaunch

**Test Cases:**
TC-FUNC-01, TC-FUNC-07, TC-FUNC-13, TC-MOB-09

Validates application startup, relaunch stability, and post-reboot behavior.

**Status:** Partially Executed – TC-MOB-09 not executed.

---

### 🔴 R-02 – Navigation Flow Stability

**Test Cases:**
TC-FUNC-02, TC-FUNC-03, TC-FUNC-04, TC-FUNC-06, TC-NEG-01, TC-NEG-02, TC-NEG-03

Validates screen transitions, back stack consistency, and prevention of duplicate or corrupted navigation states.

**Status:** Partially Executed – DEF-002 confirmed under TC-NEG-01, TC-NEG-02, TC-NEG-03.

---

### 🟡 R-03 – Screen Rotation Handling

**Test Cases:**
TC-FUNC-09, TC-FUNC-11, TC-FUNC-14, TC-MOB-01, TC-NEG-06, TC-NEG-12

Validates layout integrity and state preservation during orientation changes.

**Result:** Partially Executed – DEF-001 identified (landscape clipping issue). TC-NEG-06, TC-NEG-12 not executed.

---

### 🟡 R-04 – Background / Foreground Lifecycle

**Test Cases:**
TC-FUNC-08, TC-MOB-02, TC-MOB-03, TC-MOB-04, TC-MOB-05, TC-MOB-06, TC-NEG-07, TC-NEG-11

Validates lifecycle stability during minimize/restore, lock/unlock, memory pressure, and interruption scenarios.

**Status:** Partially Executed – Core scenarios passed. TC-MOB-06, TC-NEG-07, TC-NEG-11 not executed.

---

### 🟠 R-05 – Rapid / Abnormal User Interaction

**Test Cases:**
TC-NEG-01, TC-NEG-02, TC-NEG-03, TC-NEG-04, TC-NEG-05, TC-NEG-06, TC-NEG-07, TC-NEG-08, TC-NEG-09, TC-NEG-10, TC-NEG-11, TC-NEG-12, TC-NEG-13, TC-NEG-14, TC-NEG-15, TC-NEG-16, TC-NEG-17, TC-NEG-18

Validates system behavior under rapid tapping, repeated actions, and abnormal interaction patterns.

**Status:** Partially Executed – DEF-002 confirmed under TC-NEG-01, TC-NEG-02, TC-NEG-03. TC-NEG-14 through TC-NEG-18 passed. TC-NEG-04 through TC-NEG-13 not executed.

---

### 🟢 R-06 – Network Interruption Handling

**Test Cases:**
TC-MOB-10

Validates application stability during network connectivity loss and restoration.

**Result:** Executed – No instability observed.

---

### 🟢 R-07 – UI Feedback Consistency

**Test Cases:**
TC-FUNC-05

Validates Toast message visibility and duplication handling.

**Result:** Executed – No defects identified.

---

### ⚪ R-08 – Environmental Conditions

**Test Cases:**
TC-MOB-07, TC-MOB-08

Validates application behavior under low battery mode and system language changes.

**Status:** Designed – Pending execution.

---

## Revision History

| Version | Date | Description |
|---------|------|-------------|
| v1.0 | 2026-02-18 | Initial README created |
| v1.1 | 2026-03-03 | Updated after negative stress test execution |
| v1.2 | 2026-03-08 | Corrected execution metrics; fixed defect and RTM file links; updated TC lists per risk area; added TC-NEG-14 through TC-NEG-18 to R-05 |
| v1.3 | 2026-03-08 | Final documentation alignment pass; updated test cycle version to 1.3 |