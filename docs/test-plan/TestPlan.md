# 📱 Mobile QA Test Plan

---

## 1. Objective

The objective of this project is to perform structured manual testing on a custom-built Android application designed to simulate mobile-specific behaviors such as lifecycle transitions, navigation handling, and UI interactions.

This project demonstrates a complete manual mobile testing cycle, including:

- Test planning  
- Structured execution  
- Risk identification  
- Defect reporting  
- Evidence documentation  

---

## 2. Application Under Test

### 2.1 Overview

The application under test is a custom-developed Android application created to simulate common mobile lifecycle and navigation behaviors.

It provides a controlled environment to validate:

- Lifecycle transitions (rotation, backgrounding, locking)
- Navigation flow stability
- UI responsiveness
- Back stack consistency

---

### 2.2 Application Technical Stack

- **Platform:** Android  
- **Language:** Kotlin  
- **UI Framework:** Jetpack Compose  
- **Navigation:** NavHost (Compose Navigation)  
- **Architecture:** Single-activity with composable screens  
- **Build Type:** Local debug build  

---

### 2.3 Test Environment Summary

Testing was executed using the following configuration:

- **Host Machine:** VMware Virtual Machine (Windows 11 Pro)  
- **Physical Test Device:** Xiaomi Redmi 12C  
- **Android Version:** 14  
- **API Level:** 34  
- **Installation Method:** ADB via Android Studio  
- **Monitoring Tool:** Logcat (Android Studio)  

Detailed configuration is documented in:

`docs/environment/Environment-Setup.md`

---

### 2.4 Core Functionalities

The application includes:

- Main screen displaying greeting text  
- Navigation button to open a second screen  
- Toast message triggered on navigation  
- Second screen with back navigation button  
- Back stack handling using `popBackStack()`  

---

## 3. Scope

### ✅ In Scope

The following areas were validated:

- Application installation and launch behavior  
- Cold start validation  
- Background and foreground transitions  
- Screen rotation handling  
- Navigation between screens  
- Back stack behavior consistency  
- UI interaction validation  
- Toast message display behavior  
- Stability under lifecycle changes  
- Network interruption handling  

---

### ❌ Out of Scope

The following areas were intentionally excluded:

- Performance testing  
- Security testing  
- API functional validation  
- Automated testing  
- Multi-device compatibility testing  
- Accessibility testing  

These areas were excluded to maintain focus on lifecycle and navigation validation within the defined project scope.

---

## 4. Test Strategy

Testing was conducted using a structured manual testing approach:

- Functional test case execution  
- Negative and stress interaction validation  
- Mobile-specific lifecycle scenario simulation  
- Rapid navigation stress testing  
- Exploratory testing focused on identified risks  
- Structured defect documentation  

Test cases are documented in:

`/docs/test-design/`

Defects are documented in:

`/docs/defects/`

---

## 5. Entry Criteria

Testing execution begins when:

- Application is successfully installed on the physical device  
- Test environment is configured  
- Logcat monitoring is available  
- Test cases are prepared  
- No blocking setup issues exist  

---

## 6. Exit Criteria

Testing is considered complete when:

- All planned test cases are executed or formally deferred with documented justification  
- All Critical and High severity defects are reported  
- No unresolved blocking defects remain  
- Evidence (screenshots/videos) is stored  
- Test Summary Report is completed  

> **Note:** At the close of this cycle, 14 test cases remain Not Executed due to environment limitations or scope deferral. These are documented in the Test Summary Report.

---

## 7. Risk Areas

During planning, common mobile instability areas were identified and validated during execution. Risk IDs align with the Requirement Traceability Matrix.

---

### 🔴 Confirmed Risks (Defects Identified)

| Risk ID | Description | Impact | Probability |
|---------|-------------|--------|-------------|
| R-02 | Navigation flow instability under rapid interaction | High | High |
| R-03 | UI layout corruption under screen rotation (landscape) | High | Medium |

- **DEF-002** reproduced under R-02: blank white screen after rapid navigation cycles (TC-NEG-01, TC-NEG-02, TC-NEG-03).
- **DEF-001** reproduced under R-03: UI elements rendered under system navigation bar in landscape mode (TC-FUNC-10, TC-FUNC-14).

---

### 🟡 Validated Risks (No Issues Observed)

| Risk ID | Description | Impact | Probability |
|---------|-------------|--------|-------------|
| R-01 | Application fails to launch or crashes on start/relaunch | High | High |
| R-04 | State loss or instability during background/foreground transitions | High | Medium |
| R-06 | Application instability during network interruption | Medium | Medium |
| R-07 | Toast message visibility or duplication issues | Low | Low |

---

### ⚪ Risks Not Executed

| Risk ID | Description | Impact | Probability |
|---------|-------------|--------|-------------|
| R-05 | Application instability under additional abnormal interaction scenarios | Medium | Medium |
| R-08 | Unexpected behavior under environmental conditions (low battery, language change) | Medium | Low |

These risks remain relevant for regression validation in future iterations.

---

## 8. Deliverables

This project includes:

- Test Plan (`TestPlan.md`)  
- Mobile Testing Checklist (`MobileTestingChecklist.md`)  
- Test Cases (`/docs/test-design/*`)  
- Requirement Traceability Matrix  
- Documented Bug Reports (`/docs/defects/*`)  
- Evidence Media (`/evidence/*`)  
- Test Summary Report (`/docs/reports/*`)  

---

## 9. Conclusion

This project demonstrates structured manual mobile testing focused on lifecycle stability, navigation consistency, and UI validation.

Risk-based validation identified two defects: a high-impact UI instability under rapid navigation stress conditions (DEF-002) and a UI layout defect under landscape orientation (DEF-001). All other lifecycle and network scenarios remained stable.

The documentation reflects a structured junior-level QA execution aligned with real-world testing practices.

---

## 10. Revision History

| Version | Date | Description |
|---------|------|-------------|
| v1.0 | 2026-02-18 | Initial test plan created |
| v1.1 | 2026-03-08 | Aligned Risk IDs with RTM (R-01 to R-08); added DEF-001 to confirmed risks; corrected environment file reference; updated Out of Scope; added exit criteria note on not-executed cases |