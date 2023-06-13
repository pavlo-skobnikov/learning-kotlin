@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.inheritance

// Abstract classes are just like in Java
abstract class AbstractClass {
    // Kotlin allows abstract properties and methods
    abstract val abstractProperty: String
    abstract fun print()
}

class ConcreteClass(override val abstractProperty: String) : AbstractClass() {
    override fun print() {
        println("Hello, World!")
    }
}

fun main(args: Array<String>) {
    // Not allowed!
    //    val abstractClass = AbstractClass()
    //    abstractClass.print()

    val concreteClass = ConcreteClass("Goodbye, World!")
    println(concreteClass.abstractProperty)
    concreteClass.print()
}
