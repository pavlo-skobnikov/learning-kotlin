@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
)

package introduction.basics

fun main(args: Array<String>) {
    // val is used for immutable variables
    val a: Int = 1 // immediate assignment

    val b = 2 // `Int` type is inferred

    val c: Int // Type required when no initializer is provided
    c = 3 // deferred assignment

    println("a = $a, b = $b, c = $c")

    // var is used for mutable variables
    var x = 5 // `Int` type is inferred
    x += 1

    println("x = $x")
}
