package com.example.kotlinbasics

fun main() {
    var myCar = Car()
    println(myCar.owner)
    println("brand is: ${myCar.myBrand}")
    myCar.maxSpeed = 300
    println("max speed is: ${myCar.maxSpeed}")
    println("Model is ${myCar.myModel}")
}

class Car() {
    // lateinit keyword means that the variable will be initialized later.
    // if it is initialized in init{} it is not needed.
    lateinit var owner : String

    val myBrand: String = "BMW"
        // Custom getter
        get() {
            return field.lowercase()
        }

    var maxSpeed: Int = 250
        get() = field
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Max speed can not be less than 0")
        }

    var myModel : String = "M5"
        private set

    init {
        this.owner = "Frank"
    }


}