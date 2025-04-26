# Copilot Instructions

This project is a cli application for managing fruit drink vending operations. It is built using **Java 11+**. The goal is to allow vendors to manage drink inventories, process orders, and handle customer interactions efficiently. The system supports different types of drinks, order statuses, and reusable business logic.

## Coding Standards

- Use **camelCase** for variable, property, and method names.
- Use **PascalCase** for class names.
- Use **snake_case** for database column names.
- Use **4 spaces** for indentation.
- Use **type declarations** for all method parameters and return types.
- Use **final** for variables and classes where immutability is desired.
- Use **switch** expressions (if using Java 14+) for cleaner conditional logic.
- Use **constructor injection** for dependencies to promote testability.
- Use **SLF4J** for logging instead of `System.out.println`.
- Follow **Java naming conventions** and **PSR-like structure** for consistency.

## Best Practices

- Keep **controllers** thin—delegate business logic to services.
- Organize code using **Domain-Driven Design** principles when possible.
- Use **enum** types for status and selection options (e.g., order status, drink types).
- Write **unit tests** for all services and business logic.
- Use **interfaces** for service contracts to promote flexibility and testability.
- Avoid mixing business logic into **entity classes**—use them for data modeling only.
- Extract reusable logic into **utility classes** or **dedicated services**.
- Follow the **single-responsibility principle** for classes and methods.

## Directory Structure

- Place **controllers** under `src/main/java/com/example/controller/`.
- Place **services** under `src/main/java/com/example/service/`.
- Place **repositories** under `src/main/java/com/example/repository/`.
- Place **entities** under `src/main/java/com/example/entity/`.
- Place **enums** under `src/main/java/com/example/enums/`.
- Place **validators** or **utilities** under `src/main/java/com/example/util/`.

## Testing Guidelines

- Write **unit tests** for all services and business logic.
- Use **JUnit 5** for testing.
- Mock dependencies using **Mockito**.
- Ensure high code coverage for critical business logic.
- Use **integration tests** for testing interactions between components.

- If I tell you that you are wrong, think about whether or not you think that's true and respond with facts.
- Avoid apologizing or making conciliatory statements.
- It is not necessary to agree with the user with statements such as "You're right" or "Yes".
- Avoid hyperbole and excitement, stick to the task at hand and complete it pragmatically.