# Al-Naqel Fare Card System - Maintenance & Production Support Manual

## 1. Maintenance Task Log (Sprint 1)
Our team tracks scheduled enhancements and code optimizations to maintain software health.

| Task ID | Description | Assigned To | Status | Target Completion |
| :--- | :--- | :--- | :--- | :--- |
| **TSK-01** | Implement Swagger OpenAPI UI documentation for system clarity | Ali Abdalla | Completed | Sprint 1 |
| **TSK-02** | Static Code Analysis & Refactoring via SonarQube for IDE | Ali Abdalla | Completed | Sprint 1 |

## 2. Product Versioning & Release Strategy
We adhere to **Semantic Versioning (SemVer)** to maintain the system infrastructure cleanly:
* **Format:** `MAJOR.MINOR.PATCH` (e.g., current base release is `0.0.1-SNAPSHOT`).
* **Patch Releases (`0.0.x`):** Reserved for hotfixes, minor refactoring, or code-smell resolutions (like our SonarQube cleanup).
* **Minor Releases (`0.x.0`):** Deployed when adding new functional modules, such as the upcoming Stations and Zones API.