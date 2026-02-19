# Kotlin BDD Test Automation Framework for Android

## Overview
This framework enables BDD-style test automation for Android apps using Kotlin, Espresso, and Cucumber. It supports parsing Gherkin scenarios from Excel, generating feature files, and mapping steps to robust Kotlin code.

## Project Structure
- `androidTest/assets/features/`: Gherkin feature files.
- `androidTest/steps/`: Step definitions.
- `androidTest/pages/`: Page objects.
- `androidTest/utils/`: Utility classes.
- `androidTest/hooks/`: Test hooks.
- `androidTest/runner/`: Custom test runner.

## Build & Run Instructions
1. Place feature files under `androidTest/assets/features/`.
2. Update resource IDs in page objects.
3. Configure credentials via Gradle or command line.
4. Run tests:
   ```shell
   ./gradlew connectedAndroidTest
   ```

## Secure Credential Handling
Credentials are injected via `InstrumentationRegistry.getArguments()` with defaults. Update `app/build.gradle` or pass via command line.

## Troubleshooting
- **ResourceNotFound**: Update TODOs in page objects with actual IDs.
- **Step Mismatch**: Ensure Gherkin steps match regex in `Steps.kt`.
- **Timeouts**: Adjust `waitForView` timeout in `EspressoUtils.kt`.

## Maintenance
- Add new scenarios to feature files.
- Implement corresponding methods in page objects.
- Update utilities and hooks as needed.

## Recommendations
- Integrate with CI/CD for automated regression.
- Expand page objects for new screens.
- Use custom IdlingResources for network waits.

## Contact
For support or contributions, contact the QA Automation team.