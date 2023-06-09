@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
)

package introduction.basics

fun main(args: Array<String>) {
    // For loop with a range
    // Type is inferred, so, it's optional
    for (i: Int in 1..100) {
        println(i)
    }

    val numbers = 1..100

    for (i in numbers) {
        println("Second loop: $i")
    }

    // Descending range
    for (i: Int in 100 downTo 1) {
        println("Descending loop: $i")
    }

    // Exclusive loop with step
    for (i: Int in 1 until 100 step 5) {
        println("Exclusive loop: $i")
    }

    // For loops with collections are, of course, possible
    val names = listOf("John", "Jane", "Mary", "Mark")
    for (name in names) {
        println("Name: $name")
    }

    // While loop is also present in Kotlin
    var i = 0
    while (i < 10) {
        println("While loop: $i")
        i++
    }

    // Breaking out of a loop can be done with break
    // in a very straightforward way
    for (j in 1..10) {
        if (j == 50) {
            break
        }

        println("Breaking loop: $j")

        // `continue` is also present
        // It works the same way as in Java
        // Here, it's redundant
        continue
    }

    // Kotlin has labels which can be applied to some of
    // Kotlin's keywords
    // This is how you can break out of a nested loop
    outer@ for (j in 1..100) {
        for (k in 1..100) {
            if (k == 50) {
                break@outer
            }

            println("Breaking loop with label: $k")
        }
    }
}
