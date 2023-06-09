@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.basics

import introduction.basics.Result.Success
import java.util.UUID

fun main(args: Array<String>) {
    // Simple control flow like in other C-like languages
    // is available
    val string = "Not Empty!"

    val result = if (string.isNotEmpty()) {
        println("String is not empty")
    } else if (string.startsWith("a")) {
        println("String starts with 'a'")
    } else {
        println("String is empty")
    }
    // If-else is actually an expression in Kotlin
    // So, it returns a value (by default from the last expression)
    // In this case, it's Unit, which is similar to Void in Java

    // Kotlin doesn't have a ternary operator, instead,
    // if-else can be used as an expression
    val ternaryResult = if (string.isNotEmpty()) "Not empty" else "Empty"

    // When is like a case switch in other languages
    when (UUID.randomUUID().toString()) {
        "Not Empty!" -> println("String is `Not Empty!`")
        "Empty!" -> println("String is `Empty!`")
        else -> println("String is unknown")
    }

    // When can be used as an expression as well
    val whenResult = when (UUID.randomUUID().toString()) {
        "Not Empty!" -> "String is `Not Empty!`"
        "Empty!" -> "String is `Empty!`"
        else -> "String is unknown"
    }

    println("When result: $whenResult")

    // When guarantees exhaustive checks and is awesome to use with
    // sealed classes and interfaces
    when (val resultItem: Result = Success("Success")) {
        is Success<*> -> println("Success with type 2")
        is Result.Failure -> throw resultItem.error
    }
}

sealed class Result {
    data class Success<T>(val value: T) : Result()
    data class Failure(val error: Throwable) : Result()
}
