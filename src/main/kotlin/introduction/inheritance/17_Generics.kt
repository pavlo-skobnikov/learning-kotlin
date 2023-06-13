@file:Suppress(
    "RedundantExplicitType",
    "UNUSED_PARAMETER",
    "JoinDeclarationAndAssignment",
    "KotlinConstantConditions",
)

package introduction.inheritance

// Kotlin supports generics for classes and interfaces just like Java
interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

class UserRepository : Repository<User> {
    override fun getById(id: Int): User {
        return User(id, "John Doe")
    }

    override fun getAll(): List<User> {
        return listOf(User(1, "John Doe"), User(2, "Jane Doe"))
    }
}

// Generic functions are also supported
fun <T> returnGiven(value: T): T {
    return value
}

class User(id: Int, name: String)

fun main(args: Array<String>) {
    val userRepository = UserRepository()

    // Returning objects of the supplied type parameter
    println(userRepository.getById(1))
    println(userRepository.getAll())

    val returnedInteger = returnGiven(1)
}
