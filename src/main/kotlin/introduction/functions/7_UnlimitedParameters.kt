@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
)

package introduction.functions

// Variable number of parameters is easy in Kotlin with the `varargs` keyword
// `vararg` parameter will be treated as an Array of that reference type
fun printStrings(vararg strings: String) {
    for (string in strings) {
        println("Printing string: $string")
    }
}

// Multiple `vararg` parameters are not allowed
// fun printStrings(vararg strings: String, vararg otherStrings: String) {
//     -> Not allowed
// }

fun main(args: Array<String>) {
    printStrings("Hello", "World", "!")
    // We can also pass an array
    val strings = arrayOf("Hello", "World", "!", "2")
    // Here `*` is the spread operator
    printStrings(*strings)
}
