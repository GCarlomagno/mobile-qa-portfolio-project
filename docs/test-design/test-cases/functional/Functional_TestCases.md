# Functional Test Cases

This document contains structured functional test cases for the Android application under test.

---

### TC-FUNC-01 – Verify application launches successfully

**Type:**  
Functional  

**Priority:**  
High  

**Preconditions:**  
Application is installed and device is operational.

**Test Data:**  
N/A  

**Steps:**  
1. Ensure the application is not running in the background (close from recent apps if necessary).  
2. Launch the application by tapping the app icon.

**Expected Result:**  
- Main screen is displayed successfully.  
- Greeting text is visible and readable.  
- No crash or error message occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-FUNC-02 – Verify navigation to second screen

**Type:**  
Functional  

**Priority:**  
High  

**Preconditions:**  
Application is launched and user is on the main screen.

**Test Data:**  
N/A  

**Steps:**  
1. Tap the button labeled "Go to second screen".

**Expected Result:**  
- Toast message appears briefly.  
- Second screen is displayed successfully.  
- Second screen text is visible and readable.  
- No crash or error message occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-FUNC-03 – Verify back navigation using in-app button

**Type:**  
Functional  

**Priority:**  
High  

**Preconditions:**  
User is on the second screen.

**Test Data:**  
N/A  

**Steps:**  
1. Tap the button labeled "Go Back".

**Expected Result:**  
- User returns to the main screen.  
- Main screen greeting text is visible and readable.  
- No crash or unexpected behavior occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-FUNC-04 – Verify device back button navigation

**Type:**  
Functional  

**Priority:**  
Medium  

**Preconditions:**  
User is on the second screen.

**Test Data:**  
N/A  

**Steps:**  
1. Press the device back button.

**Expected Result:**  
- User returns to the main screen.  
- No duplicate screen instance is created.  
- No crash or unexpected behavior occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-FUNC-05 – Verify Toast message behavior

**Type:**  
Functional  

**Priority:**  
Medium  

**Preconditions:**  
Application is launched and user is on the main screen.

**Test Data:**  
N/A  

**Steps:**  
1. Tap the button labeled "Go to second screen".

**Expected Result:**  
- Toast message appears once.  
- Toast is displayed with the correct text.  
- Toast disappears automatically after a short duration.  
- No duplicate toast appears.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:**  

---

### TC-FUNC-06 – Verify repeated navigation cycles

**Type:**  
Functional  

**Priority:**  
High  

**Preconditions:**  
Application is launched.

**Test Data:**  
N/A  

**Steps:**  
1. Tap "Go to second screen".  
2. Tap "Go Back".  
3. Repeat steps 1–2 five times at normal interaction speed.

**Expected Result:**  
- Navigation works consistently.  
- The correct screen is displayed after each action.  
- No blank screen appears.  
- No crash occurs.  
- Application remains responsive.

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