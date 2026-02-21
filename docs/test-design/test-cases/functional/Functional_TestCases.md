# Functional Test Cases

This document contains structured functional test cases for the Android application under test.

---

### TC-FUN-01 – Verify application launches successfully

**Priority:** High  

**Precondition:**  
Application is installed on the device.

**Steps:**  
1. Ensure the application is not running.  
2. Launch the application.

**Expected Result:**  
- Main screen is displayed.  
- Greeting text is visible.  
- No crash occurs.

---

### TC-FUN-02 – Verify navigation to second screen

**Priority:** High  

**Precondition:**  
Application is launched and user is on the main screen.

**Steps:**  
1. Tap the button labeled "Go to second screen".

**Expected Result:**  
- Toast message appears briefly.  
- Second screen is displayed.  
- Second screen text is visible.

---

### TC-FUN-03 – Verify back navigation using in-app button

**Priority:** High  

**Precondition:**  
User is on the second screen.

**Steps:**  
1. Tap the button labeled "Go Back".

**Expected Result:**  
- User returns to the main screen.  
- Main screen greeting text is visible.

---

### TC-FUN-04 – Verify device back button navigation

**Priority:** Medium  

**Precondition:**  
User is on the second screen.

**Steps:**  
1. Press the device back button.

**Expected Result:**  
- User returns to the main screen.  
- No duplicate screen instance is created.

---

### TC-FUN-05 – Verify Toast message behavior

**Priority:** Medium  

**Precondition:**  
Application is on the main screen.

**Steps:**  
1. Tap "Go to second screen".

**Expected Result:**  
- Toast message appears once.  
- Toast disappears automatically after a short duration.

---

### TC-FUN-06 – Verify repeated navigation cycles

**Priority:** High  

**Precondition:**  
Application is launched.

**Steps:**  
1. Tap "Go to second screen".  
2. Tap "Go Back".  
3. Repeat steps 1–2 five times.

**Expected Result:**  
- Navigation works consistently.  
- No blank screen appears.  
- No crash occurs.
