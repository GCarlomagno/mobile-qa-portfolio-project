## 1. Objective

The objective of this project is to perform structured manual mobile testing on a custom-built Android application designed to simulate navigation, lifecycle transitions, and UI interaction scenarios.

The application was intentionally developed to allow controlled testing of:

- Activity lifecycle behavior
- Navigation and back stack management
- UI interaction feedback (Toast messages)
- State persistence during rotation and background transitions

## 2. Application Under Test

The application under test is a custom-developed Android application created using Kotlin and Jetpack Compose.

The purpose of this application is to provide a controlled environment for practicing structured mobile testing techniques, specifically focused on lifecycle behavior, navigation handling, and UI interaction validation.

### Technical Overview
- Platform: Android
- Language: Kotlin
- UI Framework: Jetpack Compose
- Navigation: NavHost (Compose Navigation)
- Architecture: Single-activity with composable screens

### Functional Overview
The application contains:

- A main screen displaying a greeting message
- A navigation button to move to a second screen
- Toast message feedback on button interaction
- A second screen with a back navigation button
- Back stack handling using `popBackStack()`

### Testing Relevance

This controlled test application enables validation of:

- Application cold start behavior
- Background and foreground transitions
- Screen rotation handling
- Navigation state management
- Back stack consistency
- UI interaction responsiveness
- Toast message display behavior

