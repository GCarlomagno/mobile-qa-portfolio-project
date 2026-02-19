## BUG-01: Blank Screen After Rapid Navigation Tapping

**ID:** BUG-01  
**Title:** Application displays blank screen after rapid navigation interaction 
**Severity:** High  
**Priority:** High  
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
3. Repeat navigation cycle multiple times
4. Observe screen behavior

### Expected Result
Application should handle rapid user interaction gracefully.
Navigation should remain functional and UI elements should remain visible.

### Actual Result
Screen becomes blank
Navigation buttons disappear
Application process remains active
Pressing Back does not recover UI
Pressing Home and reopening does not consistently recover UI
Recovery inconsistent: Opening and interacting with larger apps (e.g., Gmail, Netflix) sometimes restores UI
Opening small apps without interaction does not restore UI
In some cases, full app restart required

### Logcat Review

No FATAL EXCEPTION detected
No ANR detected
No critical exception logged during reproduction

### Evidence
- evidence/screenshots/05-rapid-click-crash.png
- evidence/videos/bug01-rapid-navigation.mp4