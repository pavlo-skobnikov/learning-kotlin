@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.tidbits

// Tuples are present in Kotlin but are limited to pairs and triples
fun returnPair(): Pair<String, Int> {
    return Pair("Hello, World!", 42)
}

fun returnPairTuple(): Pair<String, Int> {
    return ("Hello, World!" to 42)
}

fun returnTriple(): Triple<String, Int, Double> {
    return Triple("Hello, World!", 42, 3.14)
}

fun main(args: Array<String>) {
    val pair = returnPair()
    println(pair.first)
    println(pair.second)

    val pairTuple = returnPairTuple()
    println(pairTuple.first)
    println(pairTuple.second)

    val triple = returnTriple()
    println(triple.first)
    println(triple.second)
    println(triple.third)
}
