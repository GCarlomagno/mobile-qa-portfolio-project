# Negative Test Cases

This document contains structured negative and stress test cases designed to identify instability, unexpected behavior, or lifecycle issues in the Android application.

---

### TC-NEG-01 – Rapid navigation cycle stress test (Portrait Mode)

**Precondition:**
App is launched and device is in portrait mode.

**Steps:**
1. Tap "Go to second screen".
2. Tap "Go Back".
3. Repeat steps 1–2 rapidly 10 times (as fast as possible).

**Expected Result:**
Navigation remains stable.
No blank screen appears.
No crash occurs.
No duplicate screen instances are created.

---

### TC-NEG-02 – Rapid navigation cycle stress test (Landscape Mode)

**Precondition:**
App is installed and not running.

**Steps:**
1. Launch the application.
2. Rotate device to landscape mode.
3. Tap "Go to second screen".
4. Tap "Go Back".
5. Repeat steps 3–4 rapidly 10 times (as fast as possible).

**Expected Result:**
Navigation remains stable.
No blank screen appears.
No UI elements disappear.
No crash occurs.

---

### TC-NEG-03 – Rotation during navigation cycles

**Precondition:**
App is launched.

**Steps:**
1. Tap "Go to second screen".
2. Rotate device (portrait → landscape).
3. Tap "Go Back".
4. Rotate device again.
5. Repeat the sequence 5 times.

**Expected Result:**
Navigation state is preserved.
User remains on the correct screen.
No blank screen appears.
No crash occurs.

---

### TC-NEG-04 – Rapid rotation on second screen

**Precondition:**
User is on second screen.

**Steps:**
1. Rotate device portrait → landscape → portrait rapidly 5 times.

**Expected Result:**
User remains on second screen.
Navigation state is preserved.
No UI corruption occurs.
No crash occurs.

---

### TC-NEG-05 – Minimize app during navigation cycle

**Precondition:**
App is launched.

**Steps:**
1. Tap "Go to second screen".
2. Press Home button.
3. Reopen the app from recent apps.
4. Tap "Go Back".
5. Repeat sequence 3 times.

**Expected Result:**
App resumes correctly.
Navigation state is preserved.
No reset to main screen unless expected.
No blank screen appears.

---

### TC-NEG-06 – Extended background state validation

**Precondition:**
User is on second screen.

**Steps:**
1. Press Home button.
2. Leave the app in background for 3 minutes.
3. Open several other apps.
4. Return to the test application.

**Expected Result:**
User remains on second screen.
No unexpected reload occurs.
No crash occurs.

---

### TC-NEG-07 – Navigation combined with rapid screen locking

**Precondition:**
App is launched.

**Steps:**
1. Tap "Go to second screen".
2. Lock the device immediately.
3. Unlock device.
4. Tap "Go Back".
5. Repeat 5 times.

**Expected Result:**
Navigation state is preserved.
No blank screen appears.
No crash occurs.
Application remains responsive.
