@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.fp

// Functions are first-class citizens in Kotlin, so they can be both passed as
// parameters and returned from other functions
fun performOperationOnInts(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    val result = op(x, y)

    println(result)

    return result
}

fun intOperationFromString(op: String): (Int, Int) -> Int {
    return when (op) {
        "add" -> { x, y -> x + y }
        "subtract" -> { x, y -> x - y }
        "multiply" -> { x, y -> x * y }
        "divide" -> { x, y -> x / y }
        else -> throw UnsupportedOperationException("Unknown operation")
    }
}

fun main(args: Array<String>) {
    // Passing lambda as a parameter
    performOperationOnInts(1, 2) { a, b -> a + b }
    // Passing anonymous function as a parameter
    // Anonymous functions can have multiple return statements
    performOperationOnInts(1, 2, fun(x: Int, y: Int): Int {
        return x + y
    })
    // Method references are just like in Java
    performOperationOnInts(1, 2, Int::plus)

    // Returning a lambda from a function and immediately invoking it
    val multiplicationResult = intOperationFromString("multiply")(2, 2)
    println(multiplicationResult)

    // Lambdas can be stored in variables
    val divideLambda = intOperationFromString("divide")
    println(divideLambda(4, 2))
}
