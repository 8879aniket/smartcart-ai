
# SmartCart AI

An AI-powered e-commerce platform built using Java, Spring Boot, Angular, microservices, and Generative AI.

## Project Vision

Build a production-oriented e-commerce platform that combines traditional shopping capabilities with an AI shopping assistant.

## Technology Stack

| Area | Technology |
|---|---|
| Frontend | Angular, TypeScript |
| Backend | Java 21, Spring Boot |
| API Gateway | Spring Cloud Gateway |
| Communication | REST, Apache Kafka |
| Databases | PostgreSQL |
| Caching | Redis |
| Security | Spring Security, OAuth2, JWT |
| AI | Spring AI, OpenAI |
| Vector Search | pgvector |
| Containers | Docker, Docker Compose |
| Testing | JUnit 5, Mockito, Testcontainers |
| Monitoring | Actuator, Micrometer, Prometheus, Grafana |
| CI/CD | GitHub Actions |

## Architecture

The application follows a microservices architecture.

### Planned Services

- API Gateway
- Identity Service
- User Service
- Product Catalog Service
- Cart Service
- Inventory Service
- Order Service
- Payment Service
- Notification Service
- Review Service
- AI Assistant Service

Each service owns its data and can be independently built, tested, and deployed.

## Repository Structure

```text
smartcart-ai/
├── frontend/
│   └── smartcart-web/
├── backend/
│   ├── api-gateway/
│   ├── identity-service/
│   ├── user-service/
│   ├── catalog-service/
│   ├── cart-service/
│   ├── inventory-service/
│   ├── order-service/
│   ├── payment-service/
│   ├── notification-service/
│   ├── review-service/
│   └── ai-assistant-service/
├── infrastructure/
├── docs/
├── .env.example
├── .gitignore
└── README.md
```

## Development Principles

- Independent service ownership and deployment.
- Database-per-service logical ownership.
- Secure API communication.
- Event-driven communication where appropriate.
- Automated testing and CI/CD.
- Observability and production readiness.
- Secure handling of credentials and environment variables.

## Project Status

Phase 1: Repository and architecture setup.
