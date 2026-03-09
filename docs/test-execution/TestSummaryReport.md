# Test Summary Report

---

## 1. Test Cycle Information

- **Application Name:** MyFirstApp
- **Application Version:** 1.0 (Local Debug Build)
- **Test Execution Period:** 2026-02-18 – 2026-03-09
- **Test Device:** Xiaomi Redmi 12C (Android 14, API 34)
- **Tester:** GCarlomagno

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

| Metric | Result |
|--------|--------|
| Total Test Cases Designed | 42 |
| Total Test Cases Executed | 37 |
| Passed | 31 |
| Failed | 6 |
| Not Executed | 5 |
| Defects Identified | 2 (DEF-001, DEF-002) |

---

## 5. Defect Summary

Two defects were identified during structured execution:

- **DEF-001** – UI layout issue under landscape orientation (R-03 – Screen Rotation Handling).
- **DEF-002** – Blank white screen under rapid navigation stress conditions (R-05 – Rapid / Abnormal User Interaction).

DEF-002 was validated under structured negative stress testing in both portrait and landscape modes on 2026-03-03, and further confirmed under TC-NEG-04 on 2026-03-09.

---

## 6. Risk Assessment

- Core functional navigation remains stable under normal usage.
- Rapid navigation stress testing revealed a reproducible instability (R-05).
- Screen rotation handling exposed a UI layout defect (R-03).
- Lifecycle handling (background, lock/unlock, memory pressure, network interruption) remained stable.

---

## 7. Conclusion

The application is stable under standard user interaction scenarios.

However, structured rapid navigation stress testing revealed a reproducible UI instability (DEF-002) that should be addressed prior to production release. DEF-002 was confirmed across multiple test cases (TC-NEG-01, TC-NEG-02, TC-NEG-03, TC-NEG-04).

Risk coverage is now substantially complete. Remaining not-executed cases (TC-MOB-06, TC-MOB-07, TC-MOB-08, TC-MOB-09, TC-NEG-13) were deferred due to environment limitations or low priority.

---

## 8. Revision History

| Version | Date | Description |
|---------|------------|--------------------------------------------------------------|
| v1.0 | 2026-03-01 | Initial execution cycle report (core functional & lifecycle validation) |
| v1.1 | 2026-03-03 | Executed structured negative stress tests (R-05); validated DEF-002 reproducibility; updated execution metrics |
| v1.2 | 2026-03-08 | Corrected execution metrics: Executed 23 (was 22), Passed 18 (was 17), Not Executed 14 (was 15) |
| v1.3 | 2026-03-08 | Added TC-NEG-14 through TC-NEG-18 from Day6 execution; updated metrics: Designed 42, Executed 28, Passed 23 |
| v1.4 | 2026-03-08 | Updated Test Execution Period end date to 2026-03-08 |
| v1.5 | 2026-03-09 | Executed TC-NEG-04 through TC-NEG-12; TC-NEG-04 failed (DEF-002 confirmed again); updated metrics: Executed 37, Passed 31, Failed 6, Not Executed 5 |