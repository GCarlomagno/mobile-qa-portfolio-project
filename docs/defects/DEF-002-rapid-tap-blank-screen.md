# BUG-01 – Blank White Screen After Rapid Navigation Cycles

## Summary
Application displays a completely blank white screen after rapid repeated navigation between main and second screen.

## Environment
Device: Xiaomi Redmi 12C  
Android Version: 14 (API 34)  
Build Type: Debug  

## Preconditions
App is launched and device is in portrait mode.

## Steps to Reproduce
1. Tap "Go to second screen".
2. Tap "Go Back".
3. Repeat steps 1–2 rapidly approximately 10 times.
4. Continue until UI disappears.
Tested in both portrait and landscape modes.
Issue reproduces at same rate in both orientations.

## Expected Result
Navigation remains stable.
Main or second screen remains visible.
UI elements remain rendered.

## Actual Result
Screen becomes completely blank white.
No buttons or text are visible.
Application does not crash.
No crash dialog appears.

## Recovery Behavior
- First occurrence: pressing device back button restores UI.
- Subsequent occurrences: device back no longer restores UI.
- Rotating the device always restores UI.
- Lock/unlock does not restore UI.
- App switching sometimes restores UI.

## Reproducibility
Occurs consistently under rapid navigation stress.

## Severity
Major – Core navigation becomes unusable and UI disappears.

## Technical Observation
Rotation restores UI, suggesting navigation state corruption or composition invalidation rather than application crash.
