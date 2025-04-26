# Copilot Instructions

This project is a web application for managing event reservations. It is built using **Symfony 7** and **PHP 8.3**. The goal is to allow individuals and organizations to create, manage, and attend event occasions. The system supports different types of reservations, QR code generation for tickets, and flexible attendee handling.

## Coding Standards

- Use **PSR-12** coding style for PHP.
- Use **camelCase** for variable, property, and method names.
- Use **PascalCase** for class names.
- Use **snake_case** for database column names.
- Use **4 spaces** for indentation.
- Use **type declarations** for all function parameters and return types.
- Use **attributes** instead of annotations (Symfony 7 style).
- Use **readonly** and **promoted properties** where appropriate (PHP 8.1+).
- Use **strict types** (`declare(strict_types=1);`) in every PHP file.
- Use **services** and **dependency injection** for reusable logic.
- Keep **controllers** thin—delegate business logic to services.
- Use **Twig** for templating and avoid mixing PHP logic into views.
- Organize code using **Domain-Driven Design** principles when possible.
- Use **enum** types for status and selection options (e.g., reservation status).
- Follow Symfony’s recommended **directory structure** and **naming conventions**.

- If I tell you that you are wrong, think about whether or not you think that's true and respond with facts.
- Avoid apologizing or making conciliatory statements.
- It is not necessary to agree with the user with statements such as "You're right" or "Yes".
- Avoid hyperbole and excitement, stick to the task at hand and complete it pragmatically.
