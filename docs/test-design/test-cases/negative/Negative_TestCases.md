# Negative Test Cases

This document contains structured negative and stress test cases designed to identify instability or unexpected behavior in the Android application.

---

### TC-NEG-01 – Rapid navigation cycle stress test (Portrait Mode)
**Type:** Negative  
**Priority:** High  
**Preconditions:** Application is launched and device is in portrait mode.  
**Test Data:** N/A

**Steps:**
1. Tap "Go to second screen".
2. Tap "Go Back".
3. Repeat steps 1–2 rapidly 10 times (as fast as possible).

**Expected Result:**
- Navigation remains stable.
- Correct screen is displayed after each action.
- No blank screen appears.
- No crash or freeze occurs.
- No duplicate screen instances are created.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**

---

### TC-NEG-02 – Rapid navigation cycle stress test (Landscape Mode)
**Type:** Negative  
**Priority:** High  
**Preconditions:** Application is launched and device is in landscape mode.  
**Test Data:** N/A  

**Steps:**
1. Tap "Go to second screen".
2. Tap "Go Back".
3. Repeat steps 1–2 rapidly 10 times (as fast as possible).

**Expected Result:**
- Navigation remains stable.
- No UI elements disappear.
- No blank screen appears.
- No crash or freeze occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**

---

### TC-NEG-03 – Double-tap navigation button rapidly
**Type:** Negative  
**Priority:** High  
**Preconditions:** Application is launched and user is on the main screen.  
**Test Data:** N/A  

**Steps:**
1. Rapidly double-tap the "Go to second screen" button multiple times.

**Expected Result:**
- Only one navigation event is triggered.
- No duplicate screens are created.
- Application remains stable and responsive.
- No crash occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**

---

### TC-NEG-04 – Rapid alternating interaction between buttons
**Type:** Negative  
**Priority:** Medium  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Tap "Go to second screen".
2. Immediately tap "Go Back".
3. Quickly tap both buttons alternately without waiting for transitions to complete.
4. Continue for 10 seconds.

**Expected Result:**
- Application handles rapid input gracefully.
- Navigation state remains consistent.
- No blank screen appears.
- No crash or UI corruption occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**

---

### TC-NEG-05 – Press back button repeatedly on main screen
**Type:** Negative  
**Priority:** Medium  
**Preconditions:** Application is launched and user is on the main screen.  
**Test Data:** N/A  

**Steps:**
1. Press the device Back button repeatedly (5 times).

**Expected Result:**
- Application exits gracefully if designed to exit on back press.
- No crash occurs.
- No unexpected behavior or UI corruption occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**

---

### TC-NEG-06 – Rapid device rotation during active navigation
**Type:** Negative  
**Priority:** High  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Tap "Go to second screen".
2. While the transition is occurring, rotate the device repeatedly.
3. Tap "Go Back".
4. Repeat the sequence 5 times.

**Expected Result:**
- Navigation state remains consistent.
- No blank screen appears.
- No UI corruption occurs.
- No crash occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**

---

### TC-NEG-07 – Interrupt navigation with screen lock
**Type:** Negative  
**Priority:** Medium  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Tap "Go to second screen".
2. Immediately lock the device.
3. Unlock the device.
4. Tap "Go Back".
5. Repeat 5 times.

**Expected Result:**
- Navigation state is preserved.
- Application remains responsive.
- No blank screen appears.
- No crash occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**

---

### TC-NEG-08 – Tap navigation button with extremely slow interaction
**Type:** Negative  
**Priority:** Low  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Tap "Go to second screen" very slowly multiple times.

**Expected Result:**
- Only one navigation event occurs.
- No duplicate screens are created.
- Application remains stable.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**

---

### TC-NEG-09 – Tap screen outside interactive elements repeatedly
**Type:** Negative  
**Priority:** Low  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Tap randomly on non-interactive areas 20 times.

**Expected Result:**
- No unexpected action is triggered.
- Application remains stable.
- No crash occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**

---

### TC-NEG-10 – Rotate device while rapidly pressing back button
**Type:** Negative  
**Priority:** High  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Navigate to the second screen.
2. Rotate the device repeatedly.
3. Press the device Back button multiple times.

**Expected Result:**
- Navigation state remains consistent.
- No crash occurs.
- No blank screen appears.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**

---

### TC-NEG-11 – Rapidly minimize and reopen during transition
**Type:** Negative  
**Priority:** Medium  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Tap "Go to second screen".
2. Immediately press the Home button.
3. Reopen the application from recent apps.
4. Repeat 5 times.

**Expected Result:**
- Application does not freeze.
- No blank screen appears.
- Navigation state remains consistent.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**

---

### TC-NEG-12 – Attempt navigation during orientation change
**Type:** Negative  
**Priority:** Medium  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Rotate the device.
2. Immediately tap the navigation button during rotation.

**Expected Result:**
- Only one navigation event occurs.
- No duplicate screens appear.
- No crash occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**

---

### TC-NEG-13 – Press device back button repeatedly after exit
**Type:** Negative  
**Priority:** Low  
**Preconditions:** Application is closed.  
**Test Data:** N/A  

**Steps:**
1. Press the device Back button multiple times.

**Expected Result:**
- Device behaves normally.
- The application does not reopen unexpectedly.
- No crash occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**
**Evidence:**