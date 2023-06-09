@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
)

package introduction.functions

// Kotlin makes it easy to have default and named parameters
fun sayHello(name: String = "John") {
    println("Hello, $name!")
}

//
fun sayHelloToMultiplePeople(
    name1: String,
    name2: String = "John",
    name3: String,
) {
    println("Hello, $name1, $name2, and $name3!")
}

fun main(args: Array<String>) {
    // Using the default parameter
    sayHello()
    // Overriding the default parameter
    sayHello("Jane")
    // Using named parameter
    sayHello(name = "Mark")
    // We can combine named and default parameters usage
    sayHelloToMultiplePeople("Jane", name3 = "Mark")
    // With named parameters, the order of parameters doesn't matter
    sayHelloToMultiplePeople(name3 = "Mark", name2 = "Paul", name1 = "Jane")
}
