# Functional Test Cases

This document contains structured functional test cases for the Android application under test.

---

### TC-FUNC-01 – Verify application launches successfully
**Type:** Functional  
**Priority:** High  
**Preconditions:** Application is installed and device is operational.  
**Test Data:** N/A  

**Steps:**
1. Ensure the application is not running in the background (close from recent apps if necessary).
2. Launch the application by tapping the app icon.

**Expected Result:**
- Main screen is displayed successfully.
- Greeting text is visible and readable.
- No crash or error message occurs.

**Execution Result:** Pass  
**Execution Date:**  2026-02-27
**Notes:** Application launched successfully and navigated to the Home screen without delay
**Evidence:** /docs/evidence/week3/day1/TC-FUNC-01-pass.png

---

### TC-FUNC-02 – Verify navigation to second screen
**Type:** Functional  
**Priority:** High  
**Preconditions:** Application is launched and user is on the main screen.  
**Test Data:** N/A  

**Steps:**
1. Tap the button labeled "Go to second screen".

**Expected Result:**
- Toast message appears briefly.
- Second screen is displayed successfully.
- Second screen text is visible and readable.
- No crash or error message occurs.

**Execution Result:** Pass
**Execution Date:**  2026-02-27
**Notes:** Application navigated successfully to the second screen and toast message was displayied briefly without crash.
**Evidence:** /docs/evidence/week3/day1/TC-FUNC-02-pass.png

---

### TC-FUNC-03 – Verify back navigation using in-app button
**Type:** Functional  
**Priority:** High  
**Preconditions:** User is on the second screen.  
**Test Data:** N/A  

**Steps:**
1. Tap the button labeled "Go Back".

**Expected Result:**
- User returns to the main screen.
- Main screen greeting text is visible and readable.
- No crash or unexpected behavior occurs.

**Execution Result:** Pass
**Execution Date:**  2026-02-27
**Notes:** Application successfully navigated back to the Home screen and greeting text was visible without crash.

---

### TC-FUNC-04 – Verify device back button navigation
**Type:** Functional  
**Priority:** Medium  
**Preconditions:** User is on the second screen.  
**Test Data:** N/A  

**Steps:**
1. Press the device Back button.

**Expected Result:**
- User returns to the main screen.
- No duplicate screen instance is created.
- No crash or unexpected behavior occurs.

**Execution Result:** Not Executed  
**Execution Date:**  
**Notes:** Application successfully navigated back to the Home screen and greeting text was visible without crash.

---

### TC-FUNC-05 – Verify Toast message behavior
**Type:** Functional  
**Priority:** Medium  
**Preconditions:** Application is launched and user is on the main screen.  
**Test Data:** N/A  

**Steps:**
1. Tap the button labeled "Go to second screen".

**Expected Result:**
- Toast message appears once.
- Toast displays the correct text.
- Toast disappears automatically after a short duration.
- No duplicate toast appears.

**Execution Result:** Pass
**Execution Date:**  2026-02-27
**Notes:** Toast message was displayed once with the correct text and disappeared automatically without duplication or crash.

---

### TC-FUNC-06 – Verify repeated navigation cycles
**Type:** Functional  
**Priority:** High  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

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

**Execution Result:** Pass
**Execution Date:**  2026-02-27
**Notes:** Application successfully navigated back and forth 5 times without crash, blank screen, or loss of responsiveness.

---

### TC-FUNC-07 – Verify cold start behavior
**Type:** Functional  
**Priority:** High  
**Preconditions:** Application is installed and not running.  
**Test Data:** N/A  

**Steps:**
1. Force stop the application from device settings.
2. Launch the application.

**Expected Result:**
- Application starts successfully.
- Main screen is displayed correctly.
- No crash occurs.
- Launch time is within acceptable range (no excessive delay).

**Execution Result:** Pass
**Execution Date:**  2026-02-27
**Notes:** Application started successfully after being force stopped, and the Home screen was displayed without crash or excessive delay.

---

### TC-FUNC-08 – Verify warm start behavior
**Type:** Functional  
**Priority:** Medium  
**Preconditions:** Application is running in the background.  
**Test Data:** N/A  

**Steps:**
1. Press the Home button.
2. Reopen the application from recent apps.

**Expected Result:**
- Application resumes quickly.
- User remains on the last active screen.
- No UI reset occurs.

**Execution Result:** Pass
**Execution Date:**  2026-02-27
**Notes:** Application resumed quickly to the last active screen without UI reset or crash.

---

### TC-FUNC-09 – Verify UI elements are visible in landscape mode
**Type:** Functional  
**Priority:** Medium  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Rotate the device to landscape mode.

**Expected Result:**
- All UI elements are visible.
- No text truncation occurs.
- No layout overlap occurs.

**Execution Result:** Pass
**Execution Date:**  2026-02-27
**Notes:** Application rotated successfully to landscape mode, and all UI elements were visible without text truncation or layout overlap.
**Evidence:** /docs/evidence/week3/day1/TC-FUNC-09-pass.png

---

### TC-FUNC-10 – Verify button labels display correctly
**Type:** Functional  
**Priority:** Medium  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Observe all visible buttons on the main and second screens.

**Expected Result:**
- Button text is readable.
- No spelling errors appear.
- No text clipping occurs.

**Execution Result:** Fail
**Execution Date:** 2026-02-27
**Notes:** In landscape mode, part of the button and screen text appears under the system status bar, causing text clipping. As a result, full label readability could not be verified.
**Evidence:** /docs/evidence/week3/day1/TC-FUNC-10-fail.png

---

### TC-FUNC-11 – Verify application state after device rotation
**Type:** Functional  
**Priority:** High  
**Preconditions:** User is on the second screen.  
**Test Data:** N/A  

**Steps:**
1. Rotate the device once.

**Expected Result:**
- User remains on the second screen.
- Content remains consistent.
- No unexpected reset occurs.

**Execution Result:** Pass
**Execution Date:**  2026-02-27
**Notes:** Application remained on the Second screen after rotation, and content remained consistent without reset or crash.
**Evidence:** /docs/evidence/week3/day1/TC-FUNC-11-pass.png

---

### TC-FUNC-12 – Verify navigation without rapid interaction
**Type:** Functional  
**Priority:** Medium  
**Preconditions:** Application is launched.  
**Test Data:** N/A  

**Steps:**
1. Tap "Go to second screen".
2. Wait 3 seconds.
3. Tap "Go Back".

**Expected Result:**
- Navigation works normally.
- No delay occurs.
- No crash occurs.

**Execution Result:** Pass 
**Execution Date:**  2026-02-27
**Notes:** Application navigated to the Second screen and returned to the Home screen after a 3-second wait without delay or crash.

---

### TC-FUNC-13 – Verify application icon launches correct activity
**Type:** Functional  
**Priority:** Low  
**Preconditions:** Application is installed.  
**Test Data:** N/A  

**Steps:**
1. Tap the application icon from the device home screen.

**Expected Result:**
- Application launches the main screen.
- No intermediate incorrect screen appears.
- No crash occurs.

**Execution Result:** Pass
**Execution Date:**  2026-02-27
**Notes:** Application launched from the device Home screen and displayed the Main screen without intermediate screens or crash.

---

### TC-FUNC-14 – Verify button labels display correctly on second screen
**Type:** Functional  
**Priority:** Medium  
**Preconditions:** User is on the second screen.  
**Test Data:** N/A  

**Steps:**
1. Rotate the device to landscape mode.
2. Observe all visible buttons and text elements on the second screen.

**Expected Result:**
- Button text is readable.
- No spelling errors appear.
- No text clipping occurs.
- UI elements respect system safe areas.

**Execution Result:** Fail  
**Execution Date:** 2026-02-27  
**Notes:** In landscape mode, part of the button and screen text on the Second screen is rendered under the system navigation bar, causing visible clipping and reduced readability.  
**Evidence:** /docs/evidence/week3/day1/TC-FUNC-14-fail.png