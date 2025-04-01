/*
 * Inheritance and its types (single, multilevel, hierarchical) 
 * Inheritance allows a class (child/subclass) to inherit properties 
 * and methods from another class (parent/superclass), promoting code 
 * reusability.
● Method Overriding and super keyword 
Key Points:

@Override annotation (recommended)

super.method() calls parent's version

Runtime polymorphism (decides which method to call at runtime)


● Polymorphism (compile-time and runtime) 
Key Points:

Same method name

Different parameter lists

Decision made at compile time

Key Points: Overridding

Parent reference holding child object

Actual method called depends on runtime object type

● Abstract classes and interfaces 
Key Points:

Cannot instantiate abstract classes

Must implement abstract methods

Can have concrete methods too

● Encapsulation and getter/setter methods 
 */

/*
 * Summary Table
Concept	Example	Key Benefit
Single Inheritance	class Car extends Vehicle	Basic reuse
Multilevel Inheritance	Puppy → Dog → Animal	Layered functionality
Method Overriding	@Override + super	Customize parent behavior
Compile-Time Polymorphism	Method overloading	Multiple ways to call
Runtime Polymorphism	Animal a = new Cat()	Flexible method calls
Abstract Classes	abstract class Shape	Partial implementation
Interfaces	interface Payment	Full abstraction
Encapsulation	Private fields + getters/setters	Data protection
 */

public class OOPConcepts {

}
