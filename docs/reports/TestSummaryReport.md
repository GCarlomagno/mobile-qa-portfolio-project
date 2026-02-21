# Test Summary Report

---

## 1. Test Cycle Information

- **Application Name:** MyFirstApp  
- **Application Version:** 1.0 (Local Debug Build)  
- **Test Execution Period:** 2026-02-18 – 2026-02-21 
- **Test Device:** Xiaomi Redmi 12C (Android 14, API 34)  
- **Tester:** Giacomo Carlomagno

---

## 2. Test Objective

The objective of this test cycle was to validate mobile lifecycle stability, navigation behavior, and UI interaction reliability of the Android application.

---

## 3. Test Scope

Testing included:

- Functional navigation validation
- Rapid navigation stress testing
- Android lifecycle behavior (rotation, background, locking)
- Negative interaction scenarios

Performance, security, and automation were out of scope.

---

## 4. Test Execution Overview

| Category          | Total Test Cases | Passed | Failed |
|-------------------|------------------|--------|--------|
| Functional        | 6                | 6      | 0      |
| Negative          | 7                | 5      | 2      |
| Mobile-Specific   | 5                | 5      | 0      |

---

## 5. Defect Summary

- 1 High-impact defect identified (R-01 – Rapid navigation causing UI crash).
- The defect was reproduced in TC-NEG-01 and TC-NEG-02.
- All other validated risk areas passed successfully.

---

## 6. Risk Assessment

- Rapid navigation instability represents a High-impact risk and should be prioritized for fix and regression validation.
- Lifecycle handling (rotation, background, lock/unlock) remained stable during execution.
- No additional high-severity risks were observed during this test cycle.

---

## 7. Conclusion

The application demonstrates stability under normal usage conditions.

However, rapid navigation stress testing revealed a high-impact instability that should be addressed before production release.
