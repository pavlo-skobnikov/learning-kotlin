@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.classes

// Enums are classes that can only have a finite number of (static) instances
enum class Color(val hex: String) {
    RED("#FF0000") {
        override fun sayHello() {
            println("Hello, I don't care!")
        }
    },
    GREEN("#00FF00") {
        override fun sayHello() {
            println("Hello, I'm feeling kinda blue!")
        }
    },
    BLUE("#0000FF") {
        override fun sayHello() {
            println("Hello, I'm ${this.name}!")
        }
    },
    ;

    fun containsRed(): Boolean {
        return this.hex.contains("FF0000")
    }

    abstract fun sayHello()
}

fun main(args: Array<String>) {
    println(Color.RED.containsRed())
    println(Color.GREEN.containsRed())

    for (color in Color.values()) {
        println("${color.name} -> ${color.hex}")
        color.sayHello()
    }

    println()
}
