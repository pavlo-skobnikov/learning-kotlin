@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.tidbits

// Kotlin has smart casting, which is the ability of a compiler to automatically
// cast variables to a certain type based on the context of the code.
open class BaseClass

class ChildClass1 : BaseClass() {
    fun childClass1Function() {
        println("childClass1Function")
    }
}

class ChildClass2 : BaseClass() {
    fun childClass2Function() {
        println("childClass2Function")
    }
}

fun smartCasting(baseClass: BaseClass) {
    // Kotlin is smart enough to know that baseClass is a ChildClass1
    // and allows us to call childClass1Function()
    if (baseClass is ChildClass1) {
        baseClass.childClass1Function()
    }

    // Kotlin is smart enough to know that baseClass is a ChildClass2
    // and allows us to call childClass2Function()
    if (baseClass is ChildClass2) {
        baseClass.childClass2Function()
    }
}

fun main(args: Array<String>) {
    // Direct casting is done via the `as` keyword
    val initialTypeValue = "Hello, World!"

    //    val targetTypeValue = initialTypeValue as Int
    // ^^^ Gives compiler warning and will fail at runtime

    // Safe casting is done via the `as?` keyword
    val targetTypeValue = initialTypeValue as? Int
    // ^^^ Will not fail at runtime
}
