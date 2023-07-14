package com.example.kotlinbasics

fun main() {
    var galaxyS20 = MobilePhoneChallenge("Android","Samsung", "Galaxy S20")
    galaxyS20.chargeBattery(30)
}

class MobilePhoneChallenge(osName: String, brand: String, model: String){
    var battery: Int = 15

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(charged: Int) {
        println("Starting battery level: $battery")
        println("Battery was charged by: $charged")
        println("Current batter charge: ${battery + charged}")
        battery += charged
    }
}