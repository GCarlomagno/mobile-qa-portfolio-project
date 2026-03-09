# Requirement Traceability Matrix

This document maps application functional areas and identified risks to the corresponding test cases designed to validate them.

It ensures that high-risk areas and core functionalities are adequately covered by structured testing.

---

## Traceability Matrix

| Risk ID | Functional Area / Requirement | Risk Description | Test Case IDs | Validation Status |
|---------|--------------------------------|------------------|---------------|------------------|
| R-01 | Application Launch & Relaunch | Application fails to start or crashes on launch/relaunch | TC-FUNC-01, TC-FUNC-07, TC-FUNC-13, TC-MOB-09 | Partially Executed – TC-FUNC-01, TC-FUNC-07, TC-FUNC-13 passed. TC-MOB-09 not executed. |
| R-02 | Navigation Flow Stability | Incorrect navigation, duplicate screens, or inconsistent back stack behavior | TC-FUNC-02, TC-FUNC-03, TC-FUNC-04, TC-FUNC-06, TC-NEG-01, TC-NEG-02, TC-NEG-03 | Partially Executed – Functional navigation validated (Pass). Rapid stress tests executed: DEF-002 reproduced under TC-NEG-01, TC-NEG-02, TC-NEG-03 (Fail). |
| R-03 | Screen Rotation Handling | State loss, UI corruption, or unexpected reset during orientation change | TC-FUNC-09, TC-FUNC-11, TC-FUNC-14, TC-MOB-01, TC-NEG-06, TC-NEG-12 | Executed – Orientation handling validated. UI clipping defect identified (DEF-001, TC-FUNC-10, TC-FUNC-14). TC-NEG-06 and TC-NEG-12 executed and passed (2026-03-09). |
| R-04 | Background / Foreground Lifecycle | State loss or instability when minimizing, restoring, or interrupting the app | TC-FUNC-08, TC-MOB-02, TC-MOB-03, TC-MOB-04, TC-MOB-05, TC-MOB-06, TC-NEG-07, TC-NEG-11 | Partially Executed – Background/foreground, lock/unlock, mixed interruption, and memory pressure scenarios executed. TC-NEG-07 and TC-NEG-11 executed and passed (2026-03-09). TC-MOB-06 not executed (no SIM card). |
| R-05 | Rapid / Abnormal User Interaction | Application instability during stress or rapid interaction scenarios | TC-NEG-01, TC-NEG-02, TC-NEG-03, TC-NEG-04, TC-NEG-05, TC-NEG-06, TC-NEG-07, TC-NEG-08, TC-NEG-09, TC-NEG-10, TC-NEG-11, TC-NEG-12, TC-NEG-13 | Partially Executed – DEF-002 reproduced under TC-NEG-01, TC-NEG-02, TC-NEG-03 (2026-03-03) and TC-NEG-04 (2026-03-09). TC-NEG-05 through TC-NEG-12 executed and passed (2026-03-09). TC-NEG-13 not executed (low priority, deferred). |
| R-06 | Network Interruption Handling | Application instability during connectivity loss or restoration | TC-MOB-10 | Executed – No defects. |
| R-07 | UI Feedback Consistency | Toast message visibility or duplication issues | TC-FUNC-05 | Executed – No defects. |
| R-08 | Environmental Conditions | Unexpected behavior under low battery mode or system language changes | TC-MOB-07, TC-MOB-08 | Not Executed – Designed, pending execution. |

---

## Risk Heat Matrix (Impact vs Probability)

| Impact \ Probability | Low        | Medium           | High         |
|----------------------|------------|------------------|--------------|
| **High Impact**      |            | R-03, R-04       | 🔴 R-01, R-02 |
| **Medium Impact**    | R-08       | R-05, R-06       |              |
| **Low Impact**       | R-07       |                  |              |

---

## Coverage Observation

- Core functional scenarios (TC-FUNC series) have been executed, including launch, navigation, rotation handling, and state validation.
- One UI defect (DEF-001) was identified under Screen Rotation Handling (R-03).
- Core lifecycle scenarios (background/foreground transitions, lock/unlock, mixed interruption, memory pressure, and network interruption) have been executed with stable results.
- Negative stress scenarios TC-NEG-01 through TC-NEG-12 have been fully executed. DEF-002 confirmed under TC-NEG-01, TC-NEG-02, TC-NEG-03, TC-NEG-04. TC-NEG-05 through TC-NEG-12 passed.
- TC-NEG-13 deferred (low priority). TC-MOB-06, TC-MOB-07, TC-MOB-08, TC-MOB-09 deferred due to environment limitations.
- Environmental condition scenarios (low battery mode, system language change) are designed and pending execution.
- Risk coverage reflects the current execution status at the time of reporting.

---

## Revision History

| Version | Date | Description |
|---------|------|-------------|
| v1.0 | 2026-03-01 | Initial RTM created covering R-01 through R-08 |
| v1.1 | 2026-03-03 | Updated R-05 validation status after negative stress test execution |
| v1.2 | 2026-03-08 | Corrected R-02 TC list (added TC-NEG-02); corrected R-05 TC list (added TC-NEG-06 through TC-NEG-13); updated validation statuses for R-02, R-03, R-04, R-05 to reflect actual execution outcomes |
| v1.3 | 2026-03-09 | Updated R-03, R-04, R-05 validation statuses after TC-NEG-04 through TC-NEG-12 execution; TC-NEG-04 failed (DEF-002); TC-NEG-05 through TC-NEG-12 passed |