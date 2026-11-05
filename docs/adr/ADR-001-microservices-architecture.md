
# ADR-001: Adopt Microservices Architecture

- Status: Accepted
- Date: 2026-11-06

## Context

SmartCart AI is intended to demonstrate production-oriented backend engineering, distributed systems, independent service ownership, and AI integration.

A monolithic architecture would make independent deployment and service-level scaling harder to demonstrate.

## Decision

We will use a microservices architecture.

Each business service will:

- Own its business logic.
- Own its database or logical database schema.
- Expose APIs or publish events for other services.
- Be independently buildable, testable, and deployable.

Services will communicate using synchronous REST APIs and asynchronous Kafka events, depending on the use case.

## Service Discovery

Docker DNS will be used for local service discovery initially.

Eureka will be studied separately as an interview topic.

## Consequences

### Benefits

- Independent deployment.
- Clear service boundaries.
- Independent scaling.
- Practical experience with distributed systems.

### Trade-offs

- More operational complexity.
- Distributed transactions require patterns such as Saga.
- Eventual consistency and failure handling must be addressed.
- Local development requires infrastructure orchestration.
