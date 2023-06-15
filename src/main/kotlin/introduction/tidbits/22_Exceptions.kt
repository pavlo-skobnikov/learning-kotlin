@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.tidbits

// Kotlin has explicit support for constants
// const val is used to declare constants of simple types
const val number = 5
const val string = "Hello, World!"

// Complex types can be declared as constants using the (companion) object
// declarations. This is similar to static in Java
object ConstantObject {
    const val number = 5
    const val string = "Hello, World!"

    fun print() {
        println("This is a constant object")
    }
}

fun main(args: Array<String>) {
    println(number)
    println(string)

    println(ConstantObject.number)
    println(ConstantObject.string)
    ConstantObject.print()

    // Not allowed
    //    number = 3
}
