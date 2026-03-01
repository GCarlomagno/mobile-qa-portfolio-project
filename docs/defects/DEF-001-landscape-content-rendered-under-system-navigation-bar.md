# DEF-001 – Landscape content rendered under system navigation bar

**Status:** Open  
**Severity:** Medium  
**Reported Date:** 2026-02-27
**Related Risk:** R-03 – Screen Rotation Handling  
**Linked Test Cases:** TC-FUNC-10, TC-FUNC-14

---

## Summary

In landscape mode, application content is rendered under the system navigation bar on multiple screens, causing partial clipping of button and screen text.

---

## Environment

- Device: Redmi 12C (Xiaomi)
- Android Version: 14 (UP1A.231005.007)
- Application Version: 1.0 (Local debug build)
- Orientation: Landscape
- Execution Date: 2026-02-27

---

## Affected Screens

- Main screen
- Second screen

---

## Preconditions

- Application is installed.
- Device is initially in portrait mode.

---

## Steps to Reproduce

1. Launch the application.
2. Rotate the device to landscape mode.
3. Observe the area near the system navigation bar.

---

## Expected Result

Application content should respect system safe areas and remain fully visible without being rendered under the system navigation bar.

---

## Actual Result

Part of the button and screen text is rendered under the system navigation bar, resulting in visible clipping and reduced readability.

---

## Impact

- Partial UI clipping.
- Reduced readability of button and text.
- Affects user experience in landscape orientation.

---

## Evidence

- `/docs/evidence/week3/day1/TC-FUNC-10-fail.png`
- `/docs/evidence/week3/day1/TC-FUNC-14-fail.png`