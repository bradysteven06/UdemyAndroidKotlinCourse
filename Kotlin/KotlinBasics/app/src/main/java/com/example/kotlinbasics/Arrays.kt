package com.example.kotlinbasics

fun main(){
    //val numbers:IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
    //val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)

    // prints the array of numbers
    //print(numbers.contentToString())
    for(element in numbers) {
        print(element)
    }
    for(element in numbers) {
        print(" $element+2")
    }
    for(element in numbers) {
        print(" ${element+2} ")
    }
    // values were not changed from previous print statements
    for(element in numbers) {
        print("$element")
    }
    println()

    println("initial values ${numbers.contentToString()}")
    println(numbers[1])
    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1
    print("new values ${numbers.contentToString()}")
    println()

    val days = arrayOf("Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grapes", 3.5))
    println(fruits.contentToString())
    for(fruit in fruits){
        print("${fruit.name} ")
    }
    println()
    for(index in fruits.indices){
        print("${fruits[index].name} is in index $index ")
    }
    println()

    // array of mixed data types
    val mix = arrayOf("Sun", "Mon", "Tues", 1, 2, 3, Fruit("Apple", 2.5))
    println(mix.contentToString())
}

data class Fruit(val name: String, val price: Double)