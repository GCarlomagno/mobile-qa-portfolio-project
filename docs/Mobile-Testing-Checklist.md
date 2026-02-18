# Mobile Testing Checklist

This checklist is used to validate mobile-specific behavior of the Android application under test.

---

## 1. Application Launch

- [ ] App launches successfully from cold start
- [ ] Splash/loading behavior is consistent
- [ ] No crash on initial launch
- [ ] UI renders completely on first load

---

## 2. Navigation & UI Interaction

- [ ] Main screen loads correctly
- [ ] Navigation to second screen works
- [ ] Back navigation returns to main screen
- [ ] Rapid multiple clicks do not break navigation
- [ ] Toast messages display correctly
- [ ] UI elements are responsive

---

## 3. Lifecycle Behavior

- [ ] App resumes correctly after pressing Home
- [ ] App state preserved after background → foreground
- [ ] Screen rotation does not crash the app
- [ ] Screen rotation preserves navigation state
- [ ] Back stack behaves correctly after rotation

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
