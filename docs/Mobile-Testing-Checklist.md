# Mobile Testing Checklist

This checklist is used to validate mobile-specific behavior of the Android application under test.

---

## 1. Application Launch

- [x] App launches successfully from cold start
- [ ] Splash/loading behavior is consistent
    - Note: Application does not implement a dedicated splash or loading screen.
- [x] No crash on initial launch
    - Verified via Logcat review (no FATAL EXCEPTION / ANR detected)
- [x] UI renders completely on first load

---

## 2. Navigation & UI Interaction

- [x] Main screen loads correctly
- [x] Navigation to second screen works
- [x] Back navigation returns to main screen
- [ ] Rapid multiple clicks do not break navigation
    - FAILED – Rapid tapping of navigation buttons causes blank screen and disappearance of UI elements.
    - Recovery inconsistent. See BUG-01.
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
- [x] App remains stable when switching apps rapidly
    - State preserved across 15 rapid app switches.
    - No reload, crash, blank screen, or delay observed.
- [x] App handles background → foreground after extended duration
    - App left in background for ~3 minutes.
    - Multiple apps opened during that time.
    - State preserved, no reload or UI glitch observed.

---

## 5. Network Behavior (Future Scope)

- [ ] App behavior under airplane mode
- [ ] App behavior under slow network
- [ ] App handles network reconnection properly

---

## 6. Stability & Stress

- [ ] Application remains stable during rapid navigation
    - FAILED – See BUG-01 (Blank Screen After Rapid Navigation Tapping)
- [x] No crash during rapid rotation
- [x] No UI freeze observed
    - Observation: Logcat reported "Skipped 37 frames" during initial launch.
    - No visible freeze observed, but indicates potential main-thread workload.
- [x] Logs show no critical exceptions during stress scenarios
    - No FATAL EXCEPTION or ANR detected during stress testing.

---

## 7. Logging Observation

- [ ] Logcat shows no critical errors on launch
    - Observation: "Invalid resource ID 0x00000000" logged during launch.
    - No crash or functional impact observed.
- [x] Logcat shows no critical warnings during navigation stress

### Launch Log Summary
- No FATAL EXCEPTION detected
- No ANR detected
- Minor warnings observed
- Application remained functional

