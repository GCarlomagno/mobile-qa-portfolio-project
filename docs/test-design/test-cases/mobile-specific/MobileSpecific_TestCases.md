# Mobile-Specific Test Cases

This document contains structured mobile-specific test cases focusing on Android lifecycle behavior, state preservation, and device interaction scenarios.

---

### TC-MOB-01 – Rapid orientation change stress test
**Type:** Mobile  
**Priority:** High  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Rotate device portrait → landscape → portrait rapidly 10 times.

**Expected Result:**
- Application remains stable.
- Current screen remains visible.
- Navigation state is preserved.
- No blank screen appears.
- No crash occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**

---

### TC-MOB-02 – Rapid background and foreground switching
**Type:** Mobile  
**Priority:** High  
**Preconditions:** Application is launched and user is on the second screen.  
**Test Data:** N/A  

**Steps:**
1. Press the Home button.
2. Reopen the application from recent apps.
3. Repeat steps 1–2 ten times rapidly.

**Expected Result:**
- Application resumes correctly each time.
- User remains on the second screen.
- No unexpected reload occurs.
- No blank screen appears.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**

---

### TC-MOB-03 – Rapid device lock and unlock handling
**Type:** Mobile  
**Priority:** Medium  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Lock the device.
2. Unlock the device.
3. Repeat steps 1–2 ten times rapidly.

**Expected Result:**
- Application remains responsive.
- Current screen remains visible.
- No state loss occurs.
- No blank screen appears.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**

---

### TC-MOB-04 – Mixed lifecycle interruption sequence
**Type:** Mobile  
**Priority:** High  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Tap "Go to second screen".
2. Rotate the device.
3. Press the Home button.
4. Reopen the application.
5. Lock and unlock the device.
6. Tap "Go Back".
7. Repeat the sequence three times.

**Expected Result:**
- Navigation state is preserved.
- Application remains responsive.
- No blank screen occurs.
- No crash occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**

---

### TC-MOB-05 – Resume after memory pressure simulation
**Type:** Mobile  
**Priority:** Medium  
**Preconditions:** Application is on the second screen.  
**Test Data:** N/A  

**Steps:**
1. Press the Home button.
2. Open multiple resource-intensive applications.
3. Wait approximately 2–3 minutes.
4. Return to the test application from recent apps.

**Expected Result:**
- User remains on the second screen.
- Application does not restart unexpectedly.
- No blank screen appears.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**

---

### TC-MOB-06 – Behavior during incoming call simulation
**Type:** Mobile  
**Priority:** Medium  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Simulate an incoming call or notification interruption.
2. Accept the call (or open notification) and return to the application.

**Expected Result:**
- Application resumes correctly.
- State is preserved.
- No crash or UI freeze occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**

---

### TC-MOB-07 – Behavior under low battery mode
**Type:** Mobile  
**Priority:** Low  
**Preconditions:** Device battery saver mode is enabled.  
**Test Data:** N/A  

**Steps:**
1. Launch application.
2. Navigate between screens.

**Expected Result:**
- Application remains functional.
- No unexpected behavior occurs.
- Performance degradation does not break usability.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**

---

### TC-MOB-08 – Behavior when system language changes
**Type:** Mobile  
**Priority:** Low  
**Preconditions:** Application is installed.  
**Test Data:** N/A  

**Steps:**
1. Change device system language.
2. Launch application.

**Expected Result:**
- Application launches correctly.
- UI text remains readable.
- No layout breaks occur.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**

---

### TC-MOB-09 – Behavior after device reboot
**Type:** Mobile  
**Priority:** Medium  
**Preconditions:** Application is installed.  
**Test Data:** N/A  

**Steps:**
1. Restart the device.
2. Launch the application.

**Expected Result:**
- Application launches normally.
- No configuration issues occur.
- No crash occurs on first launch after reboot.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**

---

### TC-MOB-10 – Network interruption during navigation
**Type:** Mobile  
**Priority:** High  
**Preconditions:** Application is launched and device is connected to the internet (Wi-Fi or mobile data).  
**Test Data:** N/A  

**Steps:**
1. Tap "Go to second screen".
2. Immediately enable Airplane mode (or disable Wi-Fi and mobile data).
3. Observe application behavior for 5–10 seconds.
4. Disable Airplane mode (restore network connection).
5. Tap "Go Back".
6. Repeat steps 1–5 once more.

**Expected Result:**
- Application remains stable.
- Navigation works normally before, during, and after the network change.
- No crash or freeze occurs.
- No blank screen appears.
- UI remains responsive after connectivity is restored.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**