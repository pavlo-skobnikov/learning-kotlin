@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.classes

// Member function definition (or, in other words, method definition)
class FunctionHolder(private val stringValue: String) {
    fun printPrivateString() {
        println(stringValue)
    }
}

fun main(args: Array<String>) {
    val functionHolder = FunctionHolder("Hello, World!")
    functionHolder.printPrivateString()
}
