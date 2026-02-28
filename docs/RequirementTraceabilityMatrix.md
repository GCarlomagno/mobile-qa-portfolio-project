# Requirement Traceability Matrix

This document maps application functional areas and identified risks to the corresponding test cases designed to validate them.

It ensures that high-risk areas and core functionalities are adequately covered by structured testing.

---

## Traceability Matrix

| Risk ID | Functional Area / Requirement | Risk Description | Test Case IDs | Validation Status |
|---------|--------------------------------|------------------|---------------|------------------|
| R-01 | Application Launch & Relaunch | Application fails to start or crashes on launch/relaunch | TC-FUNC-01, TC-FUNC-07, TC-FUNC-13, TC-MOB-09 | Partially Executed |
| R-02 | Navigation Flow Stability | Incorrect navigation, duplicate screens, or inconsistent back stack behavior | TC-FUNC-02, TC-FUNC-03, TC-FUNC-04, TC-FUNC-06, TC-NEG-01, TC-NEG-03 | Partially Executed |
| R-03 | Screen Rotation Handling | State loss, UI corruption, or unexpected reset during orientation change | TC-FUNC-09, TC-FUNC-11, TC-FUNC-14, TC-MOB-01, TC-NEG-06, TC-NEG-12 | Partially Executed – Defect identified (DEF-001) |
| R-04 | Background / Foreground Lifecycle | State loss or instability when minimizing, restoring, or interrupting the app | TC-FUNC-08, TC-MOB-02, TC-MOB-03, TC-MOB-04, TC-MOB-05, TC-MOB-06, TC-NEG-07, TC-NEG-11 | Partially Executed – Background/foreground, lock/unlock, mixed interruption, and memory pressure scenarios executed. No new defects identified. |
| R-05 | Rapid / Abnormal User Interaction | Application instability during stress or rapid interaction scenarios | TC-NEG-02, TC-NEG-04, TC-NEG-05, TC-NEG-08, TC-NEG-09, TC-NEG-10 | Designed |
| R-06 | Network Interruption Handling | Application instability during connectivity loss or restoration | TC-MOB-10 | Executed – No defects |
| R-07 | UI Feedback Consistency | Toast message visibility or duplication issues | TC-FUNC-05 | Executed – No defects |
| R-08 | Environmental Conditions | Unexpected behavior under low battery mode or system language changes | TC-MOB-07, TC-MOB-08 | Designed |

---

## Risk Heat Matrix (Impact vs Probability)

| Impact \ Probability | Low        | Medium           | High         |
|----------------------|------------|------------------|--------------|
| **High Impact**      |            | R-03, R-04       | 🔴 R-01, R-02 |
| **Medium Impact**    | R-08       | R-05, R-06       |              |
| **Low Impact**       | R-07       |                  |              |

---

## Coverage Observation

- Core functional test cases (TC-FUNC series) have been executed.
- One defect (DEF-001) was identified under Screen Rotation Handling (R-03).
- Mobile lifecycle and stress scenarios (background/foreground, lock/unlock, mixed interruption, memory pressure, and network interruption) have been executed with stable results.
- High-risk areas such as Launch and Navigation are partially executed, with remaining negative and edge scenarios pending.