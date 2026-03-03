# Exploratory Testing Report

---

## Session 1 – Rapid Navigation Stress

### 1. Session Information

- **Execution Date:** 2026-02-18  
- **Session Type:** Risk-focused exploratory testing  
- **Target Risk Areas:** R-02 (Navigation Flow Stability), R-05 (Rapid / Abnormal Interaction)  
- **Environment:** Xiaomi Redmi 12C (Android 14, API 34)  
- **Application Version:** 1.0  
- **Duration:** ~10 minutes  

---

### 2. Session Charter

Evaluate application stability under rapid user interaction and repeated navigation transitions between screens.

---

### 3. Areas Explored

- Rapid tapping of navigation buttons  
- Repeated back-and-forth navigation cycles  
- State recovery after UI instability  
- App behavior after minimizing and reopening during stress conditions  

---

### 4. Observations

- Application entered a blank white screen state after repeated rapid navigation cycles.  
- The application process remained active.  
- No fatal exception was observed in Logcat.  
- Manual restart was required to restore normal functionality.  
- Behavior was reproducible across multiple attempts.  

---

### 5. Risk Assessment

Rapid interaction scenarios can expose navigation state instability.  
Potential absence of input debouncing may contribute to inconsistent UI state under stress conditions.

---

### 6. Defect Identified

- **DEF-002 – Blank White Screen After Rapid Navigation Cycles**

The defect resulted in loss of functional usability and required manual application restart to recover.

---

## Session 2 – Lifecycle Stability Validation

### 1. Session Information

- **Execution Date:** 2026-02-18  
- **Session Type:** Lifecycle exploratory validation  
- **Target Risk Areas:** R-03 (Screen Rotation Handling), R-04 (Background / Foreground Lifecycle)  
- **Environment:** Xiaomi Redmi 12C (Android 14, API 34)  
- **Application Version:** 1.0  
- **Duration:** ~15 minutes  

---

### 2. Session Charter

Validate application behavior during lifecycle transitions including backgrounding, foregrounding, and orientation changes.

---

### 3. Areas Explored

- Pressing Home and resuming  
- Lock/unlock behavior  
- Screen rotation on main screen  
- Screen rotation on second screen  
- Back stack behavior after rotation  

---

### 4. Observations

- Application resumed correctly after backgrounding.  
- Navigation state was preserved after foregrounding.  
- No crash occurred during rotation.  
- Back stack behavior remained consistent in both portrait and landscape modes.  

---

### 5. Risk Assessment

No lifecycle instability was identified during exploratory validation.

However, future UI complexity may increase the risk of rotation-related state management issues, requiring regression validation.