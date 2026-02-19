# DSG Android BDD Test Automation Framework

## Overview

This framework automates BDD scenarios for the DSG Android app using Kotlin, Espresso, and Cucumber. It supports 1:1 Gherkin-Kotlin mapping, Page Object Model, utilities, hooks, and is fully Gradle-configured.

## Structure

- `features/`: Gherkin feature files
- `steps/`: Step definitions
- `pages/`: Page objects (with TODOs for resource IDs)
- `utils/`: Utility classes
- `hooks/`: Hooks for idling resources, setup/teardown
- `test/`: Cucumber test runner

## Build & Run

1. Clone the repo.
2. Open in Android Studio.
3. Update all `TODO` resource IDs in page objects.
4. Run tests:
   - `./gradlew connectedAndroidTest`

## Troubleshooting

- **Resource Not Found**: Ensure all resource IDs in page objects are correct.
- **Idling Issues**: Use `WaitUtils` for async operations.
- **App Launch**: Handled by test runner; check manifest and runner config.
- **Test Data**: Replace hardcoded values with test data management as needed.

## Quality Assurance

- All steps are mapped 1:1 to Gherkin.
- Page objects encapsulate UI logic.
- Utilities and hooks ensure reliability.
- Example feature files provided for each scenario.

## Future Recommendations

- Integrate with CI/CD (e.g., GitHub Actions, Jenkins).
- Add support for data-driven testing.
- Expand page objects as app grows.
- Add visual testing and accessibility checks.
- Refactor common login/navigation steps for reuse.

## Contacts

- Automation Engineer: [Your Name]
- QA Lead: [Contact]
