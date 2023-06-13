@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.classes

// 4 visibility modifiers: public, private, protected, internal.
// Default visibility:
//  - public
// Top-level declarations:
//  - internal -> Available in the (Maven, Gradle) module where it's declared
//  - private -> Available only in the file where it's declared
// Class-level declarations:
//  - private -> Available only in the class where it's declared
//  - protected -> Available in the class where it's declared and its subclasses
//  - internal -> Available to any client inside the module containing the class

fun publicTopLevelFunction() {
    println("publicTopLevelFunction")
}

internal fun internalTopLevelFunction() {
    println("internalTopLevelFunction")
}

private fun privateTopLevelFunction() {
    println("privateTopLevelFunction")
}

open class VisibilityHolder {
    fun publicMemberFunction() {
        println("publicMemberFunction")
    }

    internal fun internalInternalFunction() {
        println("internalInternalFunction")
    }

    protected fun protectedMemberFunction() {
        println("protectedMemberFunction")
    }

    private fun privateMemberFunction() {
        println("privateMemberFunction")
    }
}

fun main(args: Array<String>) {
    // Top-level declarations
    publicTopLevelFunction()
    internalTopLevelFunction()
    privateTopLevelFunction()

    // Class-level declarations
    val visibilityHolder = VisibilityHolder()

    visibilityHolder.publicMemberFunction()
    visibilityHolder.internalInternalFunction()
    // Inaccessible functions
    // visibilityHolder.protectedMemberFunction()
    // visibilityHolder.privateMemberFunction()
}
