# Mobile Testing Checklist

This checklist is used to validate mobile-specific behavior of the Android application under test.

---

## 1. Application Launch

- [x] App launches successfully from cold start
- [ ] Splash/loading behavior is consistent
    - Note: Application does not implement a dedicated splash or loading screen.
- [x] No crash on initial launch
- [x] UI renders completely on first load

---

## 2. Navigation & UI Interaction

- [X] Main screen loads correctly
- [X] Navigation to second screen works
- [X] Back navigation returns to main screen
- [ ] Rapid multiple clicks do not break navigation
    - Result: FAILED – Rapid tapping of the navigation button causes the application to display a blank screen while the process remains active. Manual app restart was required to recover.
- [x] Toast messages display correctly
- [x] UI elements are responsive

---

## 3. Lifecycle Behavior

- [x] App resumes correctly after pressing Home
- [x] App state preserved after background → foreground
- [x] Screen rotation does not crash the app
- [x] Screen rotation preserves navigation state
- [x] Back stack behaves correctly after rotation
    - Validated in both portrait and landscape modes.

---

## 4. Interruptions

- [ ] App handles incoming call simulation
- [ ] App handles notification interaction
- [ ] App remains stable when switching apps rapidly

---

## 5. Network Behavior (Future Scope)

- [ ] App behavior under airplane mode
- [ ] App behavior under slow network
- [ ] App handles network reconnection properly

---

## 6. Stability & Stress

- [ ] No crash during rapid navigation
- [ ] No crash during rapid rotation
- [ ] No UI freeze observed
- [ ] Logs show no critical exceptions

---

## 7. Logging Observation

- [ ] Logcat shows no critical errors on launch
- [ ] Logcat shows no warnings during navigation
- [ ] No memory leak warnings detected
