package com.example.kotlinbasics

fun main() {
    // Creating instances of classes
    var steven = Person("Steven", "Brady", 40)
    steven.hobby = "flying drones"
    steven.stateHobby()
    println("Steven is ${steven.age} years old.")
    var john = Person()
    john.hobby = "playing video games"
    john.stateHobby()
    //var jonPeterson = Person(lastName = "Peterson")

}

class Person (firstName: String = "John", lastName: String = "Doe"){
    // Member Variables - Properties
    var age : Int? = null
    var hobby : String = "watching Netflix"
    var fName : String? = null

    init {
        this.fName = firstName
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }

    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName) {
        this.age = age
    }

    // Member functions - Methods
    fun stateHobby() {
        println("$fName's hobby is $hobby")
    }
}