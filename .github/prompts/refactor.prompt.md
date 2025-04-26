# Refactoring Guidelines

When refactoring code follow these goals and constraints:

## Goals

- Improve readability and maintainability.
- Promote reusable and testable logic.
- Move business logic from controllers to dedicated services.
- Favor single-responsibility functions and classes.

## Technologies

- Java 11+

## Refactor Targets

- **Controllers**: Should delegate complex logic to services. Keep them slim and focused on handling the HTTP layer.
- **Services**: Extract reusable, testable business logic into services under `src/main/java/com/example/service/`.
- **Entities**: Avoid including application logic in entity classes. Use them for data modeling only.
- **Templates**: If applicable, reduce complex conditionals. Extract reusable components or helper methods.
- **Enums**: Replace hard-coded string values (like status codes) with `enum` types.
- **Validation**: Move custom validation logic into dedicated validators or utility classes.

## Naming Conventions

- Services end in `Service`, e.g., `DrinkOrderService`, `VendorManagementService`.
- Enums use PascalCase and singular names, e.g., `OrderStatus`.
- Repository classes end in `Repository`, and are located in `src/main/java/com/example/repository/`.

## Best Practices

- Use constructor injection for dependencies to promote testability.
- Use `final` for variables and classes where immutability is desired.
- Use `switch` expressions (if using Java 14+) for cleaner conditional logic.
- Prefer immutability where possible.
- Follow Java naming conventions: camelCase for variables and methods, PascalCase for classes.
- Write unit tests for all services and business logic.
- Use logging (e.g., SLF4J) instead of `System.out.println` for debugging and monitoring.