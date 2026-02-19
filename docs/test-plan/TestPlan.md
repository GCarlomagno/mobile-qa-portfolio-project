# 📱 Mobile QA Test Plan

---

## 1. Objective

The objective of this project is to perform structured manual testing on a custom-built Android application designed to simulate mobile-specific behaviors such as lifecycle transitions, navigation handling, and UI interactions.

This project demonstrates a complete manual mobile testing cycle, including planning, execution, defect reporting, and documentation.

---

## 2. Application Under Test

### 2.1 Overview

The application under test is a custom-developed Android application built using **Kotlin** and **Jetpack Compose**.

It was intentionally created to provide a controlled testing environment focused on mobile lifecycle behavior, navigation flow, and UI responsiveness.

---

### 2.2 Technical Environment

- **Platform:** Android  
- **Language:** Kotlin  
- **UI Framework:** Jetpack Compose  
- **Navigation:** NavHost (Compose Navigation)  
- **Architecture:** Single-activity with composable screens  
- **Testing Type:** Manual Functional & Mobile-Specific Testing  

---

### 2.3 Core Functionalities

The application contains:

- Main screen displaying a greeting message  
- Navigation button to open a second screen  
- Toast message triggered on button interaction  
- Second screen with back navigation button  
- Back stack handling using `popBackStack()`  

---

## 3. Scope

### ✅ In Scope

The following areas are covered in this test cycle:

- Application installation and launch behavior  
- Cold start validation  
- Background and foreground transitions  
- Screen rotation handling  
- Navigation between screens  
- Back stack behavior consistency  
- UI interaction validation  
- Toast message display behavior  
- Basic stability observation during lifecycle changes  

---

### ❌ Out of Scope

The following areas are intentionally excluded:

- Performance testing  
- Security testing  
- Network API validation  
- Automated testing  
- Multi-device compatibility testing  
- Accessibility testing  

---

## 4. Test Strategy

Testing was performed using a structured manual testing approach:

- Functional test case execution  
- Negative and edge case validation  
- Mobile-specific scenario simulation (rotation, interruptions)  
- Exploratory testing for navigation and lifecycle risks  
- Defect documentation using structured bug report format  

Test execution results and identified defects are documented in the `/docs/defects` directory.

---

## 5. Risk Areas

The following risk areas were identified:

- Lifecycle instability during rotation  
- State loss during background/foreground transitions  
- Incorrect back stack behavior  
- Multiple rapid-click navigation issues  
- UI feedback inconsistency (Toast visibility timing)  

---

## 6. Deliverables

This project includes:

- Structured Test Plan (`TestPlan.md`)  
- Mobile Testing Checklist (`MobileTestingChecklist.md`)  
- Executed Test Cases  
- Documented Bug Reports (`/docs/defects`)  
- Evidence media( screenshot & videos) (`/evidence`)  

---

## 7. Conclusion

This project demonstrates structured manual mobile testing focused on Android lifecycle behavior, navigation stability, and UI interaction validation.

The documentation reflects a professional junior-level QA execution approach.
