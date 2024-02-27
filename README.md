# Databases and Object relational mapping (ORM)

In this lab session we are working on Domain classes implementation and Data persistance using Spring's JPA.

### What gets persisted to a database, classes or objects? Why is this needed?

Classes are a blueprint with which the Objects are created and the Objects hold the values for each instance. The Object values gets persisted into the Database. Databases are used to store data persistently, meaning that the data should remain even after the program that created or manipulated it has terminated.

### Explain the role of domain classes in an MVC architecture.

In the Model-View-Controller (MVC) architecture, domain classes play a crucial role within the Model component. The Model layer represents the application's data, business logic, and rules. Domain classes, also known as model classes or domain objects, are a part of this layer. They encapsulate the application's business logic and represent the domain entities or concepts relevant to the application's problem domain.

### What are the advantages of using an ORM instead of embedding SQL statements in the code?

- ORM frameworks abstract away the low-level details of database operations, allowing developers to work with higher-level objects and methods.

- ORM frameworks often provide mechanisms for database abstraction, allowing applications to work with different database systems without significant code changes.

- ORM frameworks often provide additional features and functionality, such as lazy loading, caching, and query optimization.

### Would it be prudent to use the H2 database in a production setting? Why or why not?

The short answer is NO. H2 is an in-memory database, which uses the system's memory (RAM) as opposed to the disk space that most traditional databases use. H2 is useful for caching.
