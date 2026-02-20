# Execution Notes – Day 6

## 1. Test Environment

**Device:**
Xiaomi Redmi 12C

**Android Version:**
14 (UP1A.231005.007)

**Android Security Update:**
01 December 2025

**API Level:**
34
 
**RAM:**
3GB + 3GB extended memory

---

## 2. Test Scope

Test execution focused on:
- Functional navigation stability
- Rotation handling
- Background / foreground behavior
- Lifecycle interruption scenarios

---
---

## 3. Test Cases Executed

### TC-NEG-01 – Rapid navigation cycle stress test (Portrait Mode)

Result: FAIL

Observed Behavior:
After approximately 8–10 rapid navigation cycles, the screen becomes completely blank white.
No crash dialog appears.
On first occurrence, pressing the device back button restores the UI.
On subsequent occurrences, the device back button does not restore the UI.
Rotating the device always restores the UI.

Reproducibility:
Occurs consistently under rapid navigation stress.

Evidence:
Screenshot captured. /docs/screenshots/day1-5-screenshots/05-rapid-click-crash.png
Logcat reviewed – no FATAL EXCEPTION detected.

---

### TC-NEG-02 – Rapid navigation cycle stress test (Landscape Mode)

Result: FAIL

Observed Behavior:
Blank white screen appears under the same rapid navigation conditions.
Behavior and recovery pattern identical to portrait mode.
Rotation restores UI consistently.

Reproducibility:
Occurs consistently under rapid navigation stress.

Evidence:
Screenshot captured.

---

### TC-NEG-03 – Rotation during navigation cycles

Result: PASS

Observed Behavior:
Application remained stable during repeated navigation combined with device rotation.
No blank screen occurred.
No UI flicker observed.
Navigation state was preserved correctly.
User remained on the expected screen throughout the test.

Reproducibility:
Executed five times. Behavior consistent. No instability reproduced.

Evidence:
No screenshot required (test passed without abnormal behavior).

---

### TC-NEG-04 – Rapid rotation on second screen

Result: PASS

Observed Behavior:
User remained on the second screen during rapid rotation (portrait ↔ landscape).
Navigation state was preserved correctly.
No blank screen occurred.
No UI glitches observed.

Reproducibility:
Executed five times. No instability reproduced.

Evidence:
No screenshot required (test passed without abnormal behavior).

---

### TC-NEG-05 – Minimize app during navigation cycle

Result: PASS

Observed Behavior:
Application remained stable when minimized during navigation cycles.
Navigation state was preserved correctly.
No reset to main screen occurred.
No blank screen appeared.
No noticeable delay observed upon resuming the app.

Reproducibility:
Executed 5 times. No instability reproduced.

Evidence:
No screenshot required (test passed without abnormal behavior).

---

### TC-NEG-06 – Extended background state validation

Result: PASS

Observed Behavior:
After remaining in background for approximately 3 minutes and opening other applications,
the app resumed correctly.
User remained on the second screen.
No reload occurred.
No UI flicker observed.

Reproducibility:
Executed once (extended duration scenario). No instability reproduced.

Evidence:
No screenshot required (test passed without abnormal behavior).

---

### TC-NEG-07 – Navigation combined with rapid screen locking

Result: PASS

Observed Behavior:
Application remained stable when navigation cycles were combined with rapid device locking and unlocking.
No blank screen occurred.
Navigation state was preserved correctly.
No delay or freeze observed.

Reproducibility:
Executed 5 times. No instability reproduced.

Evidence:
No screenshot required (test passed without abnormal behavior).

---
---

## 4. Observations

(To be updated during execution)

---

## 5. Potential Defect Candidates

(To be updated if any instability is identified)

---

## 6. Evidence Collection Policy

Screenshot required for failed test cases.
Screen recording required for intermittent issues.
Logcat review required for crashes or UI instability.
No evidence required for passed test cases unless abnormal behavior observed.

Note:
Screenshots from exploratory sessions (Day 1–5) have been archived in:
docs/evidence/day1-5-screenshots/

