@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.tidbits

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 23000000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 23000000)
}

fun main(args: Array<String>) {
    // Kotlin offers destructuring declarations for tuples
    // Pair destructuring
    val (capital, population) = capitalAndPopulation("Spain")
    // This is equivalent to:
    //    val result = capitalAndPopulation("Spain")
    //    val capital = result.first
    //    val population = result.second

    // Triple destructuring
    val (capital2, continent, population2) = countryInformation("Spain")

    // Destructuring also works for nested tuples in collections (like lists)
    val listCapitalsAndCountries =
        listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for ((listCapital, listCountry) in listCapitalsAndCountries) {
        println("The capital of $listCountry is $listCapital")
    }
}
