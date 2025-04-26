# Refactoring Guidelines for Zutritto

When refactoring code in the Zutritto project, follow these goals and constraints:

## Goals

- Improve readability and maintainability.
- Promote reusable and testable logic.
- Move business logic from controllers to dedicated services.
- Favor single-responsibility functions and classes.

## Technologies

- Symfony 7 (PHP 8.3)
- Doctrine ORM
- Twig templates
- Symfony components for Forms, Routing, and Validation

## Refactor Targets

- **Controllers**: Should delegate complex logic to services. Keep them slim and focused on handling the HTTP layer.
- **Services**: Extract reusable, testable business logic into services under `src/Service/`.
- **Entities**: Avoid including application logic in Doctrine entities. Use them for data modeling only.
- **Templates**: Reduce complex conditionals. Extract Twig macros or components if needed.
- **Forms**: Keep form configuration readable. Move data transformers or event listeners to separate classes if large.
- **Enums**: Replace hard-coded string values (like status codes) with `enum` types.
- **Validation**: Move custom validation logic into dedicated constraints and validators.

## Naming Conventions

- Services end in `Service`, e.g., `TicketQrService`, `ReservationManagerService`.
- Enums use PascalCase and singular names, e.g., `ReservationStatus`.
- Repository classes end in `Repository`, and are located in `src/Repository/`.

## Best Practices

- Use constructor property promotion and `readonly` where applicable.
- Use `match` expressions instead of complex `switch` or `if` chains.
- Always declare `strict_types=1` at the top of each PHP file.
- Use type-safe approaches: return types, param types, nullable types.
- Prefer immutability where possible.