# Build & Run Instructions

## Build
- ./gradlew assembleAndroidTest

## Run Tests
- ./gradlew connectedAndroidTest

## Troubleshooting
- Ensure emulator/device is running
- Disable animations on device
- Verify Espresso Idling Resources are registered
- If a test fails due to missing resource ID, update the corresponding TODO in page objects
- If credentials are missing, ensure testInstrumentationRunnerArguments are set in Gradle
- For flaky UI tests, add Espresso idling resources in Hooks.kt
- For build errors, ensure all dependencies are correct and synced

## Usage Guidelines
- Follow 1:1 mapping between feature files and step definitions
- Keep Page Objects free of assertions
- Centralize waits using EspressoUtils

## Maintenance
- Add new feature files for new scenarios
- Update page objects as UI changes
- Refactor step definitions for reusability
- Monitor test results and update troubleshooting guide as needed