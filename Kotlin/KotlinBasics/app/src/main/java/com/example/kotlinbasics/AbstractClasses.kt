package com.example.kotlinbasics


fun main() {
    val human = Human("Steven", "Oregon", 290.0, 3.0)
    val elephant = Elephant("Humphry", "India", 2100.0, 25.0)


    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}

// An abstract class cannot be instantiated
// (you cannot create objects of an abstract class).
// However, you can inherit subclasses from an abstract class.
// The members (properties and methods) of an abstract class are non-abstract

abstract class Mammal(private val name: String, private val origin: String, private val weight: Double) {

    // Abstract Property (Must be overridden by Subclasses)
    abstract  var maxSpeed: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()

    // Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Origin: $origin, weight: $weight, Max Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        // Code to run
        println("Runs on two legs")
    }

    override fun breath() {
        // Code to breath
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        // Code to run
        println("Runs on four legs")
    }

    override fun breath() {
        // Code to breath
        println("Breath through the trunk")
    }
}