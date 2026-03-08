# Exploratory Testing Report

---

## Session 1 – Rapid Navigation Stress

### 1. Session Information

- **Execution Date:** 2026-02-18
- **Session Type:** Risk-focused exploratory testing
- **Target Risk Areas:** R-02 (Navigation Flow Stability), R-05 (Rapid / Abnormal Interaction)
- **Environment:** Xiaomi Redmi 12C (Android 14, API 34)
- **Application Version:** 1.0
- **Duration:** ~10 minutes

---

### 2. Session Charter

Evaluate application stability under rapid user interaction and repeated navigation transitions between screens.

---

### 3. Areas Explored

- Rapid tapping of navigation buttons
- Repeated back-and-forth navigation cycles
- State recovery after UI instability
- App behavior after minimizing and reopening during stress conditions

---

### 4. Observations

- Application entered a blank white screen state after repeated rapid navigation cycles.
- The application process remained active.
- No fatal exception was observed in Logcat.
- Manual restart was required to restore normal functionality.
- Behavior was reproducible across multiple attempts.

---

### 5. Risk Assessment

Rapid interaction scenarios can expose navigation state instability.
Potential absence of input debouncing may contribute to inconsistent UI state under stress conditions.

---

### 6. Defect Identified

- **DEF-002 – Blank White Screen After Rapid Navigation Cycles**

The defect resulted in loss of functional usability and required manual application restart to recover.

---

## Session 2 – Lifecycle Stability Validation

### 1. Session Information

- **Execution Date:** 2026-02-18
- **Session Type:** Lifecycle exploratory validation
- **Target Risk Areas:** R-03 (Screen Rotation Handling), R-04 (Background / Foreground Lifecycle)
- **Environment:** Xiaomi Redmi 12C (Android 14, API 34)
- **Application Version:** 1.0
- **Duration:** ~15 minutes

---

### 2. Session Charter

Validate application behavior during lifecycle transitions including backgrounding, foregrounding, and orientation changes.

---

### 3. Areas Explored

- Pressing Home and resuming
- Lock/unlock behavior
- Screen rotation on main screen
- Screen rotation on second screen
- Back stack behavior after rotation

---

### 4. Observations

- Application resumed correctly after backgrounding.
- Navigation state was preserved after foregrounding.
- No crash occurred during rotation.
- Back stack behavior remained consistent in both portrait and landscape modes.
- In landscape mode, UI elements on both the main screen and second screen were rendered partially under the system navigation bar, causing visible text clipping and reduced readability.

---

### 5. Risk Assessment

Background and foreground lifecycle transitions remained stable with no crashes or state loss observed.

However, screen rotation exposed a UI layout defect: content was not respecting system safe area insets in landscape orientation. This issue affects readability and usability and warrants a defect report and structured follow-up.

Future UI complexity may further increase the risk of rotation-related layout issues, requiring regression validation.

---

### 6. Defect Identified

- **DEF-001 – UI Elements Rendered Under System Navigation Bar in Landscape Mode**

In landscape orientation, button labels and screen text on both the main and second screens were partially obscured by the system navigation bar due to missing safe area inset handling. The defect affects readability but does not cause a crash. Observed on Xiaomi Redmi 12C (Android 14, API 34).

---

## Summary

| Session | Target Risk Areas | Duration | Defects Found |
|---------|-------------------|----------|---------------|
| Session 1 – Rapid Navigation Stress | R-02, R-05 | ~10 min | DEF-002 |
| Session 2 – Lifecycle Stability Validation | R-03, R-04 | ~15 min | DEF-001 |

Two defects were identified across both exploratory sessions. DEF-002 (blank screen under rapid navigation) and DEF-001 (UI clipping in landscape) were subsequently confirmed through structured test case execution.

---

## Revision History

| Version | Date | Description |
|---------|------|-------------|
| v1.0 | 2026-02-18 | Initial exploratory testing report created |
| v1.1 | 2026-03-08 | Added DEF-001 to Session 2 observations, risk assessment, and defect section; added document summary and revision history |