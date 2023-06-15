@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.tidbits

// Exceptions are similar to Java but Kotlin does away with checked exceptions
// Throwable is the base class for all exceptions and errors
class NotANumberException(message: String) : Throwable(message)

fun isANumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("$obj is not a number!")
    }
}

fun main(args: Array<String>) {
    //    throw NotANumberException("This is not a number!")

    // Won't throw
    isANumber(5)

    // Handling is done with try-catch(-finally) blocks

    try {
        isANumber("Five")
    } catch (e: NotANumberException) {
        println("Caught exception: ${e.message}")
    } finally {
        println("This is always printed")
    }
}
