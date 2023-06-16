@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.interoperability

fun main(args: Array<String>) {
    // Kotlin can call Java code directly quite easily.
    val person = Person("John", 42)

    // Although it seems like we're accessing the fields directly, Kotlin is
    // actually calling the getters and setters for us -> this is called
    // synthetic property references.
    person.age += 1
    person.name = "Jane"

    // Java's `void` methods return `Unit` in Kotlin.
    val personUnit: Unit = person.print()
    println(personUnit)

    // Some of the Kotlin keywords are valid identifiers in Java: in, object,
    // is, and other. These can be escaped with backticks.
    println(person.`is`(Person("John", 42)))

    // Every reference from Java code is potentially nullable, so Kotlin,
    // for practical purposes, relaxes the nullability checks for specefic
    // cases when Java code is involved.
    val list = ArrayList<String>() // non-null (constructor result)
    list.add("Item")
    val size = list.size // non-null (primitive int)
    val item = list[0] // platform type inferred (ordinary Java object)

    item.substring(1) // allowed, throws an exception if item == null

    val nullable: String? = item // allowed, always works
    val notNull: String = item // allowed, may fail at runtime

    // Notation for platform types - platform types can't be mentioned
    // explicitly in the program, so there's no syntax for them in the language.
    // Nevertheless, the compiler and IDE need to display them sometimes (for
    // example, in error messages or parameter info), so there is a mnemonic
    // notation for them:
    //    T! means "T or T?",
    //
    //    (Mutable)Collection<T>! means "Java collection of T may be mutable or
    //    not, may be nullable or not",
    //
    //    Array<(out) T>! means "Java array of T (or a subtype of T), nullable
    //    or not"
}
