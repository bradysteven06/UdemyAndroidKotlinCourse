package com.example.kotlinbasics

data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Steven")

    val name = user1.name
    println(name)
    user1.name = "Kevin"
    val user2 = User(2, "Bob")

    println(user1 == user2)
    println("User Details: $user1")

    val updatedUser = user1.copy(name="Steven Brady")
    println(user1)
    println(updatedUser)

    // print id
    println(updatedUser.component1())
    // print name
    println(updatedUser.component2())

    val (id, name2) = updatedUser
    println("id = $id, name = $name2")
}