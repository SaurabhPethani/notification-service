# Notification Service (Distributed, Scalable)

A high-performance distributed notification platform built using:
Java • Spring Boot • Kafka • Redis • Postgres • Docker

## Core Features (Phase 1)
- Publish events via API
- Queue processing via Kafka
- Redis cache for user subscriptions
- Postgres for persistence

## Upcoming Features
- Batching & async delivery
- Dead-letter queue
- Observability (Prometheus + Grafana)
- Benchmark report (P50 / P90 / P99 latency)

## Architecture (v1)
Client → API → Kafka → Consumer → Redis + Postgres → Delivery

## Why this project?
To demonstrate expertise in:
- Distributed systems
- Low-latency backend engineering
- Scalable microservices
