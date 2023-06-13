@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.inheritance

interface InterfaceExample {
    // Interfaces can have properties
    // However, unlike abstract classes, they cannot maintain state
    val property: String

    // Interfaces can have both undefined and  methods
    fun print()

    fun printProperty() {
        print()
        println(property)
    }
}

class InterfaceImplementation(override val property: String) :
    InterfaceExample {
    override fun print() {
        println("What's up?")
    }
}

// When implementing multiple interfaces with the same method signature, we
// need to override the method! If we need to call on of the supers, we can
// simply reference which interface's method we want to use.
interface ConflictingInterface1 {
    fun print() {
        println("ConflictingInterface1")
    }
}

interface ConflictingInterface2 {
    fun print() {
        println("ConflictingInterface2")
    }
}

fun main(args: Array<String>) {
    val interfaceImplementation = InterfaceImplementation("Hello, World!")
    interfaceImplementation.printProperty()

    object : InterfaceExample {
        override val property: String
            get() = "Goodbye, World!"

        override fun print() {
            println("Whatever")
        }
    }

    // Interface referencing in action!
    val conflictingObject =
        object : ConflictingInterface1, ConflictingInterface2 {
            override fun print() {
                super<ConflictingInterface1>.print()
                super<ConflictingInterface2>.print()
            }
        }
}
