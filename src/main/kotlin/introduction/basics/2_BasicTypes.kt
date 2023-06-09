@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
)

package introduction.basics

fun main(args: Array<String>) {
    // There are no primitives in Kotlin
    // All types are objects
    val myInt: Int
    val myChar: Char
    val myBoolean: Boolean

    // For type inference, Kotlin still has primitive type literals
    val inferredInt = 1
    val inferredFloat = 1f
    val inferredDouble = 1.0

    val inferredChar = 'c'
    val inferredString = "c"

    // Cool strings

    val name = "John"
    val greeting = "Hello, $name!"
    val shoutingGreeting = "Hello, ${name.uppercase()}!"

    val multipleLineString = """
        Goodbye,
        $name!
    """.trimIndent()
}
