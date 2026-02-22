
# Risk Analysis – Mobile Application Testing

This document identifies potential risks associated with the tested Android application and explains how risk-based prioritization was applied during test design and execution.

Risks were evaluated based on business impact, user interaction frequency, and probability of occurrence. Higher-risk areas were prioritized during testing to ensure core functionality and application stability were validated first.


## 1. Risk Identification

| Risk ID | Description                             | Type                    | Impact | Probability | Risk Level   |
|-------|-------------------------------------------|-------------------------|--------|------------|--------------|
| R1    | Rapid navigation causes blank screen      | Technical / Stability   | High   | High       | 🔴 Critical  |
| R2    | UI state loss after rotation              | Technical               | High   | Medium     | 🟠 High      |
| R3    | Back button navigation inconsistency      | Functional              | High   | Medium     | 🟠 High      |
| R4    | UI delay after fix                        | Performance / Usability | Medium | Medium     | 🟡 Medium    |
| R5    | App crash under low memory conditions     | Stability               | High   | Low        | 🟡 Medium    |
| R6    | Toast messages not visible in landscape   | UI                      | Medium | Low        | 🟢 Low       |