@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.fp

// Kotlin allows "extension functions" to be defined on existing classes
// It requires a special function definition syntax (function with receiver)
// and the `this` keyword
fun String.hello() {
    println("Hello, $this")
}

fun main(args: Array<String>) {
    // This is basically syntactic sugar for the following:
    // fun hello(string: String) {
    //     println("Hello, $string")
    // }
    // NOTE: Extension functions are resolved statically (at compile-time)
    "World".hello()
}
