# task 4: reverse engineering & architecture report

## 1. System architecture overview
The Al-Naqel Fare Card System employs **the n-tier (layered) model**; which is one of the more typical models used for large-scale enterprise Spring Boot applications. This layered design helps improve maintainability and separation of concerns as it breaks down the application into discrete layers. The layers defined include:

* Presentation layer (`com.demo.travelcardsystem.controller`): manages http request/replies from the client via REST API calls, controls http status codes, and replies back to the client.
* service layer (`com.demo.travelcardsystem.service`): coordinates the business logic. Services manage transactions between repositories and the rule engine.
* business rule layer (`com.demo.travelcardsystem.businessrule`): contains the complex logic required to calculate a fare utilizing special-purpose design patterns.
* data access layer (`com.demo.travelcardsystem.repository`): represents an abstract layer for access to data storage. Currently, an in-memory repository is utilized as part of the prototype to increase performance.
* Domain/Entity layer (`com.demo.travelcardsystem.Entity`): contains definitions of the basic business entities (i.e., travelcard, Journey, Station).

## 2. Identified Design Patterns

### 2.1 observer pattern

* Implementation: uses observable and observer interfaces. Travelcard functions as the observable Entity, while TravelCardObserver serves as the observer that responds to travel card state changes.
* Role: upon tapping a card (thus updating its Journey state), it notifies its observers. The TravelCardObserver then applies the logic of maintaining a maximum fare hold or calculates the final debit amount for a Journey based on its completed status.
* Contribution to maintainability: decoupled travel card state from the financial logic associated with it. Enables additional side effects to be added to travelcard without needing to alter the underlying travelcard class, and thus follows the open/closed principle.

### 2.2 strategy pattern

* Implementation: the TravelStrategy class uses functional interfaces (consumer, BiConsumer) to implement multiple fare-charging strategies.
* Role: encapsulates different fare-charging logic for various Journey types (e.g., anywhereinzoneonestrategy, anythreezonestrategy).
* Contribution to maintainability: enables easy modification/adaptation of fare structures/promotional pricing. Each strategy represents an isolated unit of logic, improving ease of testing/maintenance without impacting other Journey types.

### 2.3 Rule Engine / Specification Pattern

* Implementation: rule and RuleCollection classes.
* Role: Defines sets of criteria a Journey must meet to qualify for a certain fare. Iterates through these sets of rules to identify the most advantageous fare for the customer.
* Contribution to maintainability: avoids "spaghetti Code" created by deep nesting if/else statements or switch statements. Adding a new rule simply requires the addition of a new rule class object and adding it to the RuleCollection class.

### 2.4 repository pattern

* Implementation: InMemoryCardTransactionRepository.
* Role: acts as a mediator between the Domain layer and data-mapping layer, offering a collection-like interface for access to card information.
* Contribution to maintainability: allows developers to replace the current in-memory storage with a persistent database (e.g., sql or NoSQL) at some point in time without needing to make modifications to the service-layer logic.

#### 2.5 dependency injection (DI)

Dependency injection provides support for Implementation of all other quality characteristics using an extensive number of Spring Boot annotations (e.g., @component, @service, @requiredargsconstructor). DI is the mechanism used to determine dependency relationships among objects (e.g., how TravelCardObserver obtains an instance of FareCalculator injected into it); i.e., loose coupling between classes. DI supports maintainability in that the Code is significantly more suited to unit-testing due to the fact that each object’s dependencies may be substituted with mock/stub objects.

### 3. Maintainability analysis

Design pattern selections and architectural designs applied within this project result in high levels of modularity and extensibility.

1. Single Responsibility Principle (SRP): each class has a single responsibility.
2. Open-closed principle (ocp): new rules and/or strategies may be added without modifying existing core logic.
3. Code Readability: design patterns help create a common methodology across your developers that assists in understanding how fares are determined for new employees.

### 4. Conclusion
Al-Naqel Fare Card System was designed around a solid foundation for both operation and growth. As demonstrated during our reverse-engineering analysis of the system, Al-Naqel Fare Card System was designed not just to function today, but also to grow tomorrow. Since we have identified and described several patterns throughout this report, Al-Naqel Fare Card System will now be able to grow in complexity as needed in order to support large-scale public transportation systems with fewer risks of deterioration than would occur without this design structure.