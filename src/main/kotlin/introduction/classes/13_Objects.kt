@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.classes

// Kotlin can have objects that are not tied to a class on definition

// This object declaration, is a singleton object that is also a singleton
object Global {
    const val PI = 3.14
}

fun main(args: Array<String>) {
    println(Global.PI)

    println(Global)
    println(Global.javaClass)

    // There are also object expressions
    val localObject = object {
        val TAU = 6.28
    }

    println(localObject)
    println(localObject.javaClass)

    // Object declarations are lazy while object expressions are eager
}
