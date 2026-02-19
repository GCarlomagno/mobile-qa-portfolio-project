# Functional Test Cases

This document contains structured functional test cases for the Android application under test.

---

### TC-01 – Verify application launches successfully

**Precondition:**
App is installed on device.

**Steps:**
1. Ensure the app is not running.
2. Launch the application.

**Expected Result:**
Main screen is displayed.
Text "Hello GCarlomagno" is visible.
No crash occurs.

---

### TC-02 – Verify navigation to second screen

**Precondition:**
App is launched and user is on main screen.

**Steps:**
1. Tap the button labeled "Go to second screen".

**Expected Result:**
Toast message "Going to second screen" appears briefly.
Second screen is displayed.
Text "This is the second screen!" is visible.

---

### TC-03 – Verify back navigation using button

**Precondition:**
User is on second screen.

**Steps:**
1. Tap the button labeled "Go Back".

**Expected Result:**
User returns to main screen.
Text "Hello GCarlomagno" is visible.

---

### TC-04 – Verify device back button navigation

**Precondition:**
User is on second screen.

**Steps:**
1. Press the device back button.

**Expected Result:**
User returns to main screen.
No duplicate screen is created.

---

### TC-05 – Verify Toast message appears correctly

**Precondition:**
App is on main screen.

**Steps:**
1. Tap "Go to second screen".

**Expected Result:**
Toast message "Going to second screen" appears once.
Toast disappears automatically after short duration.

---

### TC-06 – Verify repeated navigation cycles

**Precondition:**
App is launched.

**Steps:**
1. Tap "Go to second screen".
2. Tap "Go Back".
3. Repeat steps 1–2 five times.

**Expected Result:**
Navigation works consistently.
No blank screen occurs.
No crash occurs.
