@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.fp

fun unaryOperation(number: Int, function: (Int) -> Int): Int {
    return function(number)
}

// Closures are functions that can access variables from the enclosing scope
fun outsideFunction(upperBound: Int) {
    for (number in 1..10) {
        // Here the `number` variable is captured by the lambda
        unaryOperation(number) { x ->
            // `number` will be updated with each iteration
            println("x: $x, number: $number")
            val i = x * number
            println("i: $i")
            i
        }
    }
}

fun main(args: Array<String>) {
    outsideFunction(10)
}
