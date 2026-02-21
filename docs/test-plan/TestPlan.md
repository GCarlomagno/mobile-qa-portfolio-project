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

`docs/environment/Test-Environment-Documentation.md`

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

---

### ❌ Out of Scope

The following areas were intentionally excluded:

- Performance testing  
- Security testing  
- Network/API validation  
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

- All planned test cases are executed  
- All Critical and High severity defects are reported  
- No unresolved blocking defects remain  
- Evidence (screenshots/videos) is stored  
- Test Summary Report is completed  

---

## 7. Risk Areas

During planning, common mobile instability areas were identified and validated during execution.

### 🔴 Confirmed Risk (Observed Issue)

| Risk ID   | Description                       | Impact    | Probability |
|-----------|-----------------------------------|-----------|-------------|
| R-01      | Rapid navigation causing UI crash | High      | High        |

This issue was reproduced during stress testing and documented as a defect.

---

### 🟡 Validated Risks (No Issue Observed)

The following areas were validated but no defects were observed:

| Risk ID   | Description                           | Impact    | Probability   |
|-----------|---------------------------------------|-----------|---------------|
| R-02      | State loss after screen rotation      | High      | Low           |
| R-03      | Background / foreground instability   | Medium    | Medium        |
| R-04      | Back stack inconsistency              | Medium    | Low           |
| R-05      | Toast visibility inconsistency        | Low       | Medium        |

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

Risk-based validation identified one high-impact instability under rapid navigation stress conditions, while all other lifecycle scenarios remained stable.

The documentation reflects a structured junior-level QA execution aligned with real-world testing practices.
