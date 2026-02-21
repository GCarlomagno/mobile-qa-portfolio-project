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
