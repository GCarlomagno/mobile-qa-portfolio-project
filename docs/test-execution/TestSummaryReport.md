# Test Summary Report

**Execution Cycle:** Manual Mobile Testing – Core Functional & Lifecycle Validation  
**Report Date:** 2026-02-28  
**Test Execution Period:** 2026-02-18 – 2026-02-28   
**Prepared By:** GCarlomagno

## 1. Test Scope

Testing activities were conducted as part of a structured manual mobile testing cycle and included:

- Functional validation of core application flows
- Navigation and back stack consistency verification
- Screen rotation handling
- Mobile lifecycle validation (background/foreground, lock/unlock, mixed interruption)
- Memory pressure testing
- Network interruption handling
- Exploratory stress testing

Negative rapid-interaction stress scenarios and environmental condition tests were documented but not fully executed at the time of reporting.

---

## 2. Test Environment

| Parameter | Value |
|------------|--------|
| Device Model | Redmi 12C |
| Manufacturer | Xiaomi |
| Android Version | 14 (UP1A.231005.007) |
| API Level | 34 |
| Application Name | MyFirstApp |
| Package Name | com.example.myfirstapp |
| Application Version | 1.0 (Local debug build) |
| Installation Method | ADB via Android Studio |

Testing was performed on a physical device connected via USB debugging.

---

## 3. Test Execution Summary

| Metric | Result |
|--------|--------|
| Total Test Cases Designed | 37 |
| Total Test Cases Executed | 19 |
| Passed | 17 |
| Failed | 2 |
| Not Executed | 18 |
| Defects Identified (Execution Phase) | 1 (DEF-001) |

Both failed test cases were associated with the same UI layout defect identified during landscape orientation validation (DEF-001).

No crashes, freezes, or state loss were observed during structured lifecycle testing.

---

## 4. Risk Coverage Summary

Based on the Requirement Traceability Matrix:

- **R-01 – Application Launch & Relaunch:** Partially Executed  
- **R-02 – Navigation Flow Stability:** Partially Executed  
- **R-03 – Screen Rotation Handling:** Partially Executed – UI defect identified (DEF-001)  
- **R-04 – Background / Foreground Lifecycle:** Partially Executed – Core scenarios executed with stable results  
- **R-05 – Rapid / Abnormal User Interaction:** Designed – Structured stress execution pending  
- **R-06 – Network Interruption Handling:** Executed – No instability observed  
- **R-07 – UI Feedback Consistency:** Executed – No defects identified  
- **R-08 – Environmental Conditions:** Designed – Pending execution  

An additional exploratory defect (DEF-002 – Rapid Tap Blank Screen) was identified under rapid abnormal interaction scenarios (R-05). Structured negative test execution and validation remain pending.

Risk coverage reflects the execution status at the time of reporting.

---

## 5. Overall Quality Assessment

The Application is functionally stable under normal usage and core lifecycle stress conditions.

One UI layout defect was identified during landscape orientation testing (DEF-001).  
No critical crashes or data loss were observed during execution.

Rapid abnormal interaction scenarios require structured validation in a follow-up phase.

The Application is suitable for minor UI correction iteration before broader negative stress validation.

## 6. Revision History

| Version | Date | Description |
|---------|------------|---------------------------------------------|
| v1.0 | 2026-03-01 | Initial execution cycle report (core functional & lifecycle validation) |