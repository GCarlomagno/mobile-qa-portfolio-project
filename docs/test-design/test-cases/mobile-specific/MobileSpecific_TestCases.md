# Mobile-Specific Test Cases

This document contains structured mobile-specific test cases focusing on Android lifecycle behavior, state preservation, and device interaction scenarios.

---

### TC-MOB-01 – Rapid orientation change stress test

**Priority:** High  

**Precondition:**  
Application is launched.

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

**Priority:** High  

**Precondition:**  
Application is launched and user is on the second screen.

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

**Priority:** Medium  

**Precondition:**  
Application is launched.

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

**Priority:** High  

**Precondition:**  
Application is launched.

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

**Priority:** Medium  

**Precondition:**  
Application is on the second screen.

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

**Type:**  
Mobile  

**Priority:**  
Medium  

**Preconditions:**  
Application is launched.

**Test Data:**  
N/A  

**Steps:**  
1. Simulate incoming call (or notification interruption).  
2. Accept and return to app.

**Expected Result:**  
- Application resumes correctly.  
- State is preserved.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-FUNC-07 – Verify cold start behavior

**Type:**  
Functional  

**Priority:**  
High  

**Preconditions:**  
Application is installed and not running.

**Test Data:**  
N/A  

**Steps:**  
1. Force stop the application from device settings.  
2. Launch the application.

**Expected Result:**  
- Application starts successfully.  
- Main screen is displayed correctly.  
- No crash or delay occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-FUNC-08 – Verify warm start behavior

**Type:**  
Functional  

**Priority:**  
Medium  

**Preconditions:**  
Application is running in background.

**Test Data:**  
N/A  

**Steps:**  
1. Press Home button.  
2. Reopen the application from recent apps.

**Expected Result:**  
- Application resumes quickly.  
- User remains on the last active screen.  
- No UI reset occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-FUNC-09 – Verify UI elements are visible in landscape mode

**Type:**  
Functional  

**Priority:**  
Medium  

**Preconditions:**  
Application is launched.

**Test Data:**  
N/A  

**Steps:**  
1. Rotate device to landscape mode.

**Expected Result:**  
- All UI elements are visible.  
- No text truncation occurs.  
- No layout overlap occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-FUNC-10 – Verify button labels display correctly

**Type:**  
Functional  

**Priority:**  
Medium  

**Preconditions:**  
Application is launched.

**Test Data:**  
N/A  

**Steps:**  
1. Observe all visible buttons on main and second screen.

**Expected Result:**  
- Button text is readable.  
- No spelling errors appear.  
- No text clipping occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-FUNC-11 – Verify application state after device rotation

**Type:**  
Functional  

**Priority:**  
High  

**Preconditions:**  
User is on second screen.

**Test Data:**  
N/A  

**Steps:**  
1. Rotate device once.

**Expected Result:**  
- User remains on second screen.  
- Content remains consistent.  
- No unexpected reset occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-FUNC-12 – Verify navigation without rapid interaction

**Type:**  
Functional  

**Priority:**  
Medium  

**Preconditions:**  
Application is launched.

**Test Data:**  
N/A  

**Steps:**  
1. Tap "Go to second screen".  
2. Wait 3 seconds.  
3. Tap "Go Back".

**Expected Result:**  
- Navigation works normally.  
- No delay occurs.  
- No crash occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-FUNC-13 – Verify application icon launches correct activity

**Type:**  
Functional  

**Priority:**  
Low  

**Preconditions:**  
Application is installed.

**Test Data:**  
N/A  

**Steps:**  
1. Tap application icon from device home screen.

**Expected Result:**  
- Application launches main screen.  
- No intermediate incorrect screen appears.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

-

### TC-MOB-14 – Behavior under low battery mode

**Type:**  
Mobile  

**Priority:**  
Low  

**Preconditions:**  
Device battery saver mode is enabled.

**Test Data:**  
N/A  

**Steps:**  
1. Launch application.  
2. Navigate between screens.

**Expected Result:**  
- Application remains functional.  
- No unexpected behavior occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-MOB-15 – Behavior when system language changes

**Type:**  
Mobile  

**Priority:**  
Low  

**Preconditions:**  
Application is installed.

**Test Data:**  
N/A  

**Steps:**  
1. Change device language.  
2. Launch application.

**Expected Result:**  
- Application launches correctly.  
- UI text remains readable.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-MOB-016 ehavior after device reboot

**Type:**  
Mobile  

**Priority:**  
Medium  

**Preconditions:**  
Application is installed.

**Test Data:**  
N/A  

**Steps:**  
1. Restart device.  
2. Launch application.

**Expected Result:**  
- Application launches normally.  
- No configuration issues occur.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

---

### TC-MOB-17 – Network interruption during navigation

**Type:**  
Mobile  

**Priority:**  
High  

**Preconditions:**  
Application is launched and device is connected to the internet (Wi-Fi or mobile data).

**Test Data:**  
N/A  

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