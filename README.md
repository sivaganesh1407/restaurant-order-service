# Restaurant Order Service

> **Disclaimer:** This repository is an independent learning and portfolio project. It is not affiliated with, endorsed by, or sponsored by any employer or commercial entity. All code and documentation are provided as-is for educational purposes.

Spring Boot REST API for managing restaurant orders.

## Tech Stack

- Java 17+ (required to compile and run; Spring Boot 4 baseline)
- Spring Boot
- Maven (wrapper included; downloads from Maven Central)
- REST APIs
- JSON

---

## API Endpoints

GET /health

GET /orders

GET /orders/{id}

POST /orders

---

## Screenshots

Optional: add your own images under `screenshots/` if you want visuals in this README.

---

## Run the Project

Prerequisites: [JDK 17 or newer](https://adoptium.net/) and network access to [Maven Central](https://repo.maven.apache.org/) (no private registry or corporate VPN required).

Clone this repository (use your fork or clone URL).

```bash
git clone <your-repository-url>
cd restaurant-order-service
```

Run the application (Maven wrapper uses the project’s pinned Maven version):

```bash
chmod +x mvnw   # once, if needed on Unix/macOS
./mvnw spring-boot:run
```

Or, if you use a global Maven install:

```bash
mvn spring-boot:run
```

Open in a browser or HTTP client: `http://localhost:8080/orders`