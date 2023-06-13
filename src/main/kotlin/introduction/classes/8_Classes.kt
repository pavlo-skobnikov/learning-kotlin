@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.classes

// Simple class definitions don't need braces
class EmptyClass

// Classes can have properties. Properties can be mutable or immutable.
// Types can be specified or inferred. Blank properties cannot be declared in
// the class body. Below, we 'initialize' properties with default values
// NB: Kotlin doesn't have the notion of fields (there are backing and
// auto-fields, though)
class Person {
    val name: String = "John"
    var age = 0
}

// Properties that should be initialized in the constructor, can be declared in
// the constructor header

// The long way
class Person2(initName: String, initAge: Int) {
    val name = initName
    var age = initAge
}

// The short way (notice the val/var keywords)
class Person3(val name: String, var age: Int)

// Default values can be specified for constructor parameters
class Person4(val name: String = "John", var age: Int = 0)

// Just like in Java, `init` blocks can be used to execute some code during
// object initialization
class Person5(var name: String, var age: Int) {
    init {
        this.name = name.uppercase()
        this.age += 1

        println("Person initialized with name = $name and age = $age")
    }
}

// Classes can have secondary constructors
class Person6(var name: String = "", var age: Int = 0) {
    constructor(charArray: CharArray) : this(
        name = String(charArray),
    )
}

// Getters and setters can be easily defined for properties
class Person7(var surname: String, var age: Int) {
    var name: String = ""
        get() = field.uppercase()
        set(value) {
            field = value.lowercase()
        }
}

fun main(args: Array<String>) {
    // Kotlin has no `new` keyword
    val person = Person()

    person.age = 10

    val person2 = Person2("Jane", 20)
    println("Person2: ${person2.name}, ${person2.age}")

    val person3 = Person3("Mark", 30)
    println("Person3: ${person3.name}, ${person3.age}")
    // Default values used
    val person4Default = Person4()
    println("Person4Default: ${person4Default.name}, ${person4Default.age}")
    // -> Named parameters can be used when creating an instance of a class
    val person4Named = Person4(age = 34, name = "Paul")
    println("Person4Named: ${person4Named.name}, ${person4Named.age}")

    val person5 = Person5("John", 40)
    println("Person5: ${person5.name}, ${person5.age}")
    // Primary and secondary constructors
    val person6 = Person6("Joe", 40)
    println("Person6: ${person6.name}, ${person6.age}")
    val person6Secondary = Person6("Joe".toCharArray())
    println("Person6Secondary: ${person6Secondary.name}, ${person6Secondary.age}")
    // Getters and setters
    val person7 = Person7("Doe", 50)
    person7.name = "John"
    println("Person7: ${person7.name}, ${person7.surname}, ${person7.age}")
}
