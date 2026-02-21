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

### 3.1 Negative Tests

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
Screenshot captured: /evidence/day6/negative-tests/TC-NEG-01-blank-screen.png
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
Screenshot captured: /evidence/day6/negative-tests/TC-NEG-02-blank-screen-landscape.png
Logcat reviewed – no FATAL EXCEPTION detected.

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
Executed 5 times. Behavior consistent. No instability reproduced.

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
Executed 5 times. No instability reproduced.

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

### 3.2 Mobile-Specific Tests

### TC-MOB-01 – Rapid orientation stress

Result: PASS

Observed Behavior:
Application remained stable during rapid orientation changes (portrait ↔ landscape).
Current screen remained visible throughout.
Navigation state was preserved correctly.
No blank screen occurred.
No UI flicker, delay, or crash observed.

Reproducibility:
Executed twice. No instability reproduced.

Evidence:
No screenshot required (test passed without abnormal behavior).

---

### TC-MOB-02 – Rapid background and foreground switching

Result: PASS

Observed Behavior:
Application resumed correctly during rapid background and foreground switching.
User remained on the second screen throughout the test.
No reload of the main screen occurred.
No blank screen, flicker, delay, or freeze observed.

Reproducibility:
Executed twice (10 rapid cycles each time). No instability reproduced.

Evidence:
No screenshot required (test passed without abnormal behavior).

---

### TC-MOB-03 – Rapid device lock and unlock handling

Result: PASS

Observed Behavior:
Application remained stable during rapid device lock and unlock cycles.
Current screen remained visible after each unlock.
Navigation state was preserved correctly.
No blank screen, delay, flicker, freeze, or navigation corruption observed.

Reproducibility:
Executed twice (10 rapid lock/unlock cycles each time). No instability reproduced.

Evidence:
No screenshot required (test passed without abnormal behavior).

---

### TC-MOB-04 – Mixed lifecycle interruption sequence

Result: PASS

Observed Behavior:
Application remained stable during combined lifecycle interruptions (rotation, backgrounding, device lock/unlock).
Navigation state was preserved correctly throughout the test.
User returned to the expected screen after each interruption cycle.
No blank screen, delay, freeze, UI flicker, or navigation corruption observed.

Reproducibility:
Executed 3 full mixed-interruption cycles. No instability reproduced.

Evidence:
No screenshot required (test passed without abnormal behavior).

---

### TC-MOB-05 – Resume after memory pressure simulation

Result: PASS (Noticeble delay observed)

Observed Behavior:
After remaining in background under simulated memory pressure (multiple heavy apps opened),
the application resumed on the second screen.
Navigation state was preserved correctly.
No blank screen, crash, or navigation corruption occurred.

A noticeable delay (~5 seconds) was observed before the UI became fully visible after returning from memory pressure conditions.
No flicker or reload to main screen occurred.

Reproducibility:
Executed once under memory pressure conditions. Behavior consistent.

Evidence:
Video: /evidence/day6/mobile-specific/TC-MOB-05-memory-pressure-delay.mp4
Logcat reviewed – no FATAL EXCEPTION detected.

---

### 3.3 Functional Tests

### TC-FUN-01 – Verify application launches successfully

Result: PASS

Observed Behavior:
Application launched successfully from closed state.
Main screen was displayed immediately.
Text "Hello GCarlomagno" was visible.
No delay, flicker, or crash observed.

Reproducibility:
Executed once. Behavior stable.

Evidence:
No screenshot required (test passed without abnormal behavior).

---

### TC-FUN-02 – Verify navigation to second screen

Result: PASS

Observed Behavior:
Upon tapping "Go to second screen", the Toast message "Going to second screen" appeared once and disappeared automatically after a short duration.
Second screen was displayed successfully.
Text "This is the second screen!" was visible.
No delay, flicker, or duplicate navigation observed.

Reproducibility:
Executed once. Behavior stable.

Evidence:
Screenshot captured: /evidence/day6/functional-tests/TC-FUN-02-toast-navigation.png

---

### TC-FUN-03 – Verify back navigation using button

Result: PASS

Observed Behavior:
Upon tapping "Go Back" on the second screen, the application returned to the main screen.
Text "Hello GCarlomagno" was visible.
No delay, flicker, or duplicate screen behavior observed.

Reproducibility:
Executed once. Behavior stable.

Evidence:
No screenshot required (test passed without abnormal behavior).

---

### TC-FUN-04 – Verify device back button navigation

Result: PASS

Observed Behavior:
Pressing the device back button on the second screen returned the user to the main screen.
The application did not exit.
No duplicate screen was created.
No unexpected behavior observed.

Reproducibility:
Executed once. Behavior stable.

Evidence:
No screenshot required (test passed without abnormal behavior).

---

### TC-FUN-05 – Verify Toast message appears correctly

Result: PASS

Observed Behavior:
Toast message "Going to second screen" appeared once upon tapping the button.
Toast disappeared automatically after a short duration.
No duplication or persistence observed.

Reproducibility:
Executed once. Behavior stable.

Evidence:
Covered under TC-02 screenshot: /evidence/day6/functional-tests/TC-FUN-02-toast-navigation.png

---

### TC-FUN-06 – Verify repeated navigation cycles

Result: PASS

Observed Behavior:
Navigation between main and second screen was repeated five times at normal user speed.
Application remained stable.
No blank screen occurred.
No crash or navigation instability observed.

Reproducibility:
Executed once (5 navigation cycles). Behavior stable.

Evidence:
No screenshot required (test passed without abnormal behavior).


---
---

## 4. Observations

- Blank screen defect occurs only under rapid repeated navigation cycles.
- Issue reproducible in both portrait and landscape modes.
- Rotation, backgrounding, and device locking do not independently trigger the defect.
- A noticeable delay (~5 seconds) was observed before the UI became fully visible after returning from memory pressure conditions.
- No FATAL EXCEPTION or ANR detected during testing.

---
---

## 5. Potential Defect Candidates

- BUG-01 – Blank white screen after rapid navigation cycles (confirmed and documented).

---
---

## 6. Evidence Collection Policy

Screenshot required for failed test cases.
Screen recording required for intermittent issues.
Logcat review required for crashes or UI instability.
No evidence required for passed test cases unless abnormal behavior observed.

Note:
Evidence from exploratory sessions (Day 1–5) have been archived in:
evidence/day1-5/

---

## 7. Day 6 Conclusion

All structured functional, negative, and mobile-specific tests were executed.
Core functionality remains stable under normal and lifecycle conditions.
A reproducible navigation defect (BUG-01) was identified under rapid navigation stress.
A noticeable (~5 seconds) resume delay was observed under memory pressure conditions.