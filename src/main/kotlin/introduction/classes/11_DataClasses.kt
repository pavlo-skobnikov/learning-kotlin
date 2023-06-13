@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.classes

import java.util.UUID

data class DataClassExample(
    val stringValue: String,
    val intValue: Int,
) {
    // Data classes can also have member functions.
    // However, data classes are not really meant to have business logic.
    // Their main purpose is to hold data.
    fun printRandomString() {
        println("Random string: ${UUID.randomUUID()}")
    }
}

fun main(args: Array<String>) {
    val dataClassExample1 = DataClassExample("Hello, World!", 42)
    val dataClassExample2 = DataClassExample("Hello, World!", 42)

    // Data classes have an already redefined `toString` method.
    println(dataClassExample1)

    // Data classes have an already redefined `equals` method.
    println(dataClassExample1 == dataClassExample2)

    // Data classes have an already redefined `hashCode` method.
    println(dataClassExample1.hashCode())

    // Data classes have an already redefined `copy` method.
    val dataClassExample3 =
        dataClassExample1.copy(stringValue = "Hello, World! 2")
    println(dataClassExample3)
    // `copy` method can also partially copy the object
    val dataClassExample4 =
        dataClassExample1.copy(stringValue = "Hello, World! 2")
    println(dataClassExample4)

    // Data classes have an already redefined `componentN` methods.
    val (stringValue, intValue) = dataClassExample1
    println("String value: $stringValue, Int value: $intValue")

    // Data classes have accessor methods by default.
    println(dataClassExample1.stringValue)
    println(dataClassExample1.intValue)
}
