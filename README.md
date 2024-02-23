# Dependency Injection

In this Lab session we see the effects of

✅ Strong coupling (No Dependency Injection)  
✅ Loose Coupling (With Dependency Injection)  
✅ Factory Pattern (With Dependency Injection)

### Strong coupling

Strong coupling occurs when a group of classes heavily rely on one another or when individual classes undertake numerous responsibilities. Another instance is when an object instantiates another object for its own use. Code with tight coupling proves difficult to maintain.

The output of project `Dependency` which demonstrates the strong coupling is shown below.

![Strong Coupling](/assets/no_di.png "Strong Coupling")

### Loose Coupling with Dependency Injection

Loose coupling in Java means that the classes are independent of each other. The only knowledge one class has about the other class is what the other class has exposed through its interfaces in loose coupling.

The output of project `DependencyInjection` which demonstrates the strong coupling is shown below.

![Loose Coupling](/assets/di.png "Loose Coupling")

### Factory pattern

The factory method pattern loosens the coupling code by separating our Product‘s construction code from the code that uses this Product. This design makes it easy to extract the Product construction independently from the rest of the application. Besides, it allows the introduction of new products without breaking existing code.

![Factory Pattern with dependency Injection](/assets/di_fp.png "Factory Pattern with dependency Injection")

Factory Pattern with Eclipse and Rectangle class removed.

![Factory Pattern with Eclipse and Rectangle class removed ](/assets/di_fp_1.png "Factory Pattern with dependency Injection")
