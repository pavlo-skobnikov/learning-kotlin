@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
)

package introduction.functions

// Kotlin has top-level functions (no need for them to be in the class)

// Function with no return value returns Unit
fun sayHello() {
    println("Hello!")
}

// Nothing type is used to mark functions that never return
// (e.g. throw an exception)
fun throwsException(): Nothing {
    throw Exception("Random int is odd")
}

// If a function returns a value, the return type must be specified
// The same goes for parameters -> they must have a type
fun sum(a: Int, b: Int): Int {
    return a + b
}

// If the function returns a single expression, the curly braces can be omitted
fun sumBraceless(a: Int, b: Int): Int = a + b
fun main(args: Array<String>) {
    sayHello()

    // Functions can be easily assigned to variables
    val sumFunction = ::sum

    println(sumFunction(1, 2))
}
