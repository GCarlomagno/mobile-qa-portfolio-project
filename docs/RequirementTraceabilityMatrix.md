# Requirement Traceability Matrix

This document maps application functional areas and identified risks to the corresponding test cases that validate them.

It ensures that high-risk areas and core functionalities are adequately covered by structured testing.

---

## Traceability Matrix

| Risk ID | Functional Area / Requirement | Risk Description | Test Case IDs | Validation Status |
|------|--------------------------------|------------------|---------------|----------------|
| R-01 | App Launch Stability | Rapid navigation causing UI crash | TC-NEG-01, TC-NEG-02 | Validated |
| R-02 | Screen Rotation Handling | State loss after screen rotation | TC-MOB-01, TC-NEG-04 | Validated |
| R-03 | Background / Foreground Behavior | Background/foreground instability | TC-MOB-02, TC-NEG-05, TC-NEG-06 | Validated |
| R-04 | Back Navigation | Back stack inconsistency | TC-FUN-03, TC-FUN-04 | Validated |
| R-05 | Toast Message Visibility | Toast visibility inconsistency | TC-FUN-05 | Validated |

---

## Risk Heat Matrix (Impact vs Probability)

| Impact \ Probability | Low  | Medium     | High     |
|----------------------|------|------------|----------|
| **High Impact**      |      | R-02, R-03 | 🔴 R-01 |
| **Medium Impact**    | R-05 | R-04       |          |
| **Low Impact**       |      |            |          |

---

## Coverage Observation

- All identified risks are mapped to at least one validating test case.
- High-risk areas (navigation stability and lifecycle handling) are covered by both functional and negative scenarios.
- No critical functional area remains untested.