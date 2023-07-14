package com.example.kotlinbasics

// The class that inherits the features of another
// class is called the Sub class, Child class, or the Derived class.
// The class whose features are inherited is called the Super class, Parent class
// or the Base class.

// Any class inherits from the "Any" class

fun main() {
    var audiA3 = Car2(200.0, "A3", "Audi")
    var teslaS = ElectricCar(240.0, "S-Model", "Tesla", 85.0)

    teslaS.extendRange(200.0)
    println(teslaS.drive())
    teslaS.brake()
    audiA3.brake()

    // Polymorphism is the ability to treat objects with similar traits in a common way
    audiA3.drive(200.0)
    teslaS.drive(200.0)
}

// an interface can inherit from another interface
interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is braking.")
    }
}

// use open to make class inheritable
open class Car2(override val maxSpeed: Double, val name: String, val brand: String) : Drivable {
    // use open to make a property overridable
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if(amount > 0)
            range += amount
    }

    // override fun drive(): String = "driving the interface drive"
    override fun drive(): String {
        return "driving the interface drive"
    }

    // use open to make a function overridable
    open fun drive(distance: Double) {
        println("Drove for $distance Miles")
    }
}

class ElectricCar(maxSpeed: Double, name: String, brand: String, batterLife: Double) :
        Car2(maxSpeed, name, brand) {

    override var range = batterLife * 5
    override fun drive(distance: Double) {
        println("Drove for $distance Miles on electricity")
    }

    override fun drive(): String {
        return "Drove for $range Miles on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }
}

