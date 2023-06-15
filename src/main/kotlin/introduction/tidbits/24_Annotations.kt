@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.tidbits

// Annotations in Kotlin are very similar to Java
@Deprecated(
    "This is deprecated",
    ReplaceWith("println(\"This is a deprecated function\")"),
)
fun deprecatedFunction() {
    println("This is a deprecated function")
}

fun main(args: Array<String>) {
    deprecatedFunction()
}
