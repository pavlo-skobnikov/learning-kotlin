@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.nullability

fun main(args: Array<String>) {
    // Kotlin is "null-safe" by default
    // This means that you cannot assign null to a variable unless you
    // explicitly say so
    var nonNullString: String = "Hello, World!"
    var nullString: String? = null
    var inferredNull = null

    // Checking for nulls
    if (nullString != null) {
        println(nullString.length)
    }

    // ? operator -> Used to check for nulls easily and compactly
    println(nullString?.length)

    // Elvis operator -> Used to provide a default value when a value is null
    println(nullString?.length ?: -1)

    // !! operator -> Used to force to disregard nullability checks from
    // compiler
    println(nullString!!.length)
}
