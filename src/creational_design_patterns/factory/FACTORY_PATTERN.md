The factory design pattern in Java is a creational design pattern that involves defining an interface or abstract class for creating an object and letting the subclasses decide which class to instantiate. 
The factory method in the interface defers the instantiation to one or more concrete subclasses.
This pattern is used when a superclass has multiple sub-classes and based on input, we need to return one of the sub-classes. 
This pattern takes out the responsibility of instantiating a class from the client program to the factory class.

<h2>Benefits of factory pattern</h2>
<p>The main advantages of using the factory pattern</p>
<ol>
<li>The creation of an object precludes its reuse without significant duplication of code.</li>
<li>The creation of an object requires access to information or resources that should not be contained within the composing class.</li>
<li>The lifetime management of the generated objects must be centralized to ensure a consistent behavior within the application.</li>
</ol>

<p>Factory pattern is most suitable where there is some complex object creation steps are involved. To ensure that these steps are centralized and not exposed to composing classes, factory pattern should be used. We can see many realtime examples of factory pattern in JDK itself e.g.</p>