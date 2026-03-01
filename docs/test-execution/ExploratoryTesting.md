# Exploratory Testing Sessions

---

## Session 1 – Early build exploratory session

**Date:** 2026-02-18  
**Duration:** ~10 minutes (Defect reproduced quickly)
**Focus Area:** Navigation handling and rapid interaction behavior  

### Test Charter
Evaluate how the application handles rapid user interaction and navigation transitions between screens.

### Areas Explored
- Rapid tapping of navigation buttons
- Repeated back-and-forth navigation
- State recovery after UI corruption
- App behavior after minimizing and reopening

### Observations
- Rapid tapping caused application to enter blank screen state.
- Application process remained active.
- No fatal exception observed in Logcat.
- Manual restart required to recover.
- Defect reproduced consistently in multiple attempts.

### Risks Identified
- Users may accidentally trigger navigation instability.
- Lack of click debouncing may cause state corruption.

### Related Defects
- DEF-002: Blank Screen After Rapid Navigation Tapping

### Outcome
Defect documented as DEF-002 – Rapid Tap Blank Screen.

Structured negative stress scenarios (R-05) have not yet been executed.
Defect validation and regression confirmation remain pending.

---

## Session 2 – Lifecycle Behavior

**Date:** 2026-02-18  
**Duration:** 15 minutes  
**Focus Area:** Backgrounding and rotation handling  

### Test Charter
Validate how the application behaves during lifecycle transitions such as backgrounding and device rotation.

### Areas Explored
- Pressing Home and resuming
- Screen rotation on main screen
- Screen rotation on second screen
- Back stack behavior after rotation

### Observations
- App resumed correctly after backgrounding.
- Navigation state preserved after foregrounding.
- No crash during rotation.
- Back stack functioned correctly in both portrait and landscape modes.

### Risks Identified
- Future UI complexity may introduce rotation-related state issues.
