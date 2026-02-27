# Documentation Standards

This document defines documentation and execution standards used in this QA portfolio project.

The goal is consistency, clarity, and industry-aligned structure.

---

## 1. Date Format

All dates must follow ISO 8601 format:

YYYY-MM-DD

Example:
2026-02-27

Reason:
- International standard
- Avoids US/EU ambiguity
- Consistent with CI systems and logging tools

---

## 2. Execution Result Values

Only the following values are allowed:

- Pass
- Fail
- Blocked (if applicable)

Not allowed:
- Passed
- OK
- Working
- Successful
- N/A

Reason:
Industry-standard test reporting terminology.

---

## 3. Execution Notes Style

Execution notes must:

- Be factual
- Describe observed behavior
- Avoid subjective language
- Avoid opinions

Do:
- "User successfully navigated to the Home screen."
- "Spinner remained visible for 5 seconds before content loaded."

Do Not:
- "Works fine."
- "Everything normal."
- "Looks good."
- "No issues."

---

## 4. Severity Levels (Defect Reporting)

Only the following severities are used:

- High – Crash, data loss, core flow blocked
- Medium – Feature partially working, incorrect behavior
- Low – Cosmetic issue, minor UI misalignment

Severity must reflect impact, not emotion.

---

## 5. File Naming Conventions

### Test Evidence:

Format:
TC-<TEST-ID>-<result>.png

Example:
TC-FUNC-01-pass.png
TC-NEG-03-fail.png

### Defects:

DEF-<number>-<short-description>.md

Example:
DEF-001-navigation-freeze.md
DEF-002-blank-screen.md

Reason:
Clear traceability between test cases and execution evidence.

---

## 6. Test Case Formatting

Each executed test case must include:

Execution Result: <Pass/Fail>
Execution Date: <YYYY-MM-DD>
Notes: <Factual observation>

Execution fields must be updated immediately after running the test.

---

## 7. Git Commit Message Format

Commit prefixes used in this project:

docs: documentation updates
test: test execution updates
fix: corrections
feat: new implementation
ci: CI configuration updates

Example:
test: execute core functional test cases and update results

Reason:
Aligned with industry Git conventions.

---

## 8. Folder Structure Consistency

Documentation must remain inside:

/docs/
/docs/test-design/
/docs/defects/
/docs/evidence/
/docs/standards/

No documentation outside /docs.

Reason:
Clear separation between documentation and automation code (Week 7+).

---

## 9. Language Standard

All documentation must be written in:

English

Reason:
International market.