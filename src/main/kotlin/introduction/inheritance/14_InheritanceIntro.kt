@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.inheritance

// Base classes for all classes in Kotlin is Any.
class AnyChild : Any()

// Kotlin classes are final by default.
open class Parent {
    // Kotlin methods are also final by default.
    open fun print() {
        println("Parent")
    }
}

open class Child : Parent() {
    // To override a method, we need to use the `override` keyword.
    // We can also use the `final` keyword to prevent overriding.
    final override fun print() {
        println("Child")
    }
}

class SpecialChild : Child() {
    // Not allowed!
    //    override fun print() {
    //        println("SpecialChild")
    //    }
}

fun main(args: Array<String>) {
    val parent = Parent()
    parent.print()

    val child = Child()
    child.print()

    // We can also use the `super` keyword to call the parent method.
    child.print()
}
