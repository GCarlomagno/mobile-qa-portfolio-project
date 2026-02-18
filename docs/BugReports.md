# Bug Reports

---

## BUG-01: Blank Screen After Rapid Navigation Tapping

**ID:** BUG-01  
**Title:** Application displays blank screen after rapid tapping of navigation button  
**Severity:** High  
**Priority:** Medium  
**Status:** Open  

### Environment
- Device: Redmi 12C
- Android Version: 14 (API 34)
- App Version: 1.0 (Debug Build)
- Installation Method: ADB via Android Studio

### Preconditions
- Application installed and launched
- User on main screen

### Steps to Reproduce
1. Open application
2. Rapidly tap "Go to second screen" and "Go Back" buttons 10–15 times
3. Observe screen behavior

### Expected Result
Application should navigate between first and second screens and remain stable.

### Actual Result
Application displays a blank screen while process remains active. Manual restart required to recover.

### Evidence
- screenshots/05-rapid-click-crash.png
