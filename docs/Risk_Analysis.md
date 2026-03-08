# Risk Analysis – Mobile Application Testing

This document identifies potential risks associated with the tested Android application and explains how risk-based prioritization was applied during test design and execution.

Risks were evaluated based on business impact, user interaction frequency, and probability of occurrence. Higher-risk areas were prioritized during testing to ensure core functionality and application stability were validated first.

Risk IDs align with the Requirement Traceability Matrix (RTM).

---

## 1. Risk Identification

| Risk ID | Description | Type | Impact | Probability | Risk Level |
|---------|-------------|------|--------|-------------|------------|
| R-01 | Application fails to launch or crashes on start/relaunch | Technical / Stability | High | High | 🔴 Critical |
| R-02 | Navigation flow instability or back stack inconsistency | Functional | High | High | 🔴 Critical |
| R-03 | UI state loss or layout corruption after screen rotation | Technical | High | Medium | 🟠 High |
| R-04 | State loss or instability during background/foreground transitions | Stability | High | Medium | 🟠 High |
| R-05 | Application instability under rapid or abnormal user interaction | Technical / Stability | Medium | Medium | 🟡 Medium |
| R-06 | Application instability during network interruption or restoration | Technical | Medium | Medium | 🟡 Medium |
| R-07 | Toast messages not visible, duplicated, or incorrect | UI | Medium | Low | 🟢 Low |
| R-08 | Unexpected behavior under environmental conditions (low battery, language change) | Stability | Medium | Low | 🟢 Low |

---

## 2. Risk Level Legend

| Level | Emoji | Criteria |
|-------|-------|----------|
| Critical | 🔴 | High impact + High probability — must be tested first |
| High | 🟠 | High impact + Medium probability — prioritized in execution |
| Medium | 🟡 | Medium impact + Medium probability — tested after core areas |
| Low | 🟢 | Low impact or Low probability — tested if time permits |

---

## 3. Execution Outcomes

| Risk ID | Validation Status | Outcome |
|---------|-------------------|---------|
| R-01 | Executed | No defects identified. Application launched and relaunched correctly under all tested conditions. |
| R-02 | Partially Executed | **DEF-002 confirmed.** Blank white screen reproduced after rapid navigation cycles (TC-NEG-01, TC-NEG-02, TC-NEG-03). Functional navigation validated as stable under normal conditions. |
| R-03 | Partially Executed | **DEF-001 confirmed.** UI elements rendered under system navigation bar in landscape mode (TC-FUNC-10, TC-FUNC-14). Rotation state handling stable. Additional stress scenarios pending. |
| R-04 | Partially Executed | No defects identified. Background/foreground, lock/unlock, mixed interruption, and memory pressure scenarios all passed. TC-MOB-06, TC-NEG-07, TC-NEG-11 not executed. |
| R-05 | Partially Executed | No additional defects beyond DEF-002. TC-NEG-04 through TC-NEG-13 remain pending execution. |
| R-06 | Executed | No defects identified. Application remained stable during network interruption and restoration (TC-MOB-10). |
| R-07 | Executed | No defects identified. Toast message displayed correctly (TC-FUNC-05). |
| R-08 | Not Executed | TC-MOB-07 (low battery) and TC-MOB-08 (language change) pending execution due to environment limitations. |

---

## 4. Revision History

| Version | Date | Description |
|---------|------|-------------|
| v1.0 | 2026-02-18 | Initial risk analysis created |
| v1.1 | 2026-03-08 | Aligned Risk IDs with RTM (R-01 to R-08); replaced inaccurate R4 description; added missing risks R-01, R-04, R-06, R-08; added risk level legend; added execution outcomes section; added revision history |