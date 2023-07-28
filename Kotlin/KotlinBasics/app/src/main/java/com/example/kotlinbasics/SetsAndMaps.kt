package com.example.kotlinbasics

fun main(){
    // sets
    // only counts unique entries
    val fruits = setOf("Orange", "Apple", "Mango", "Grape", "Apple", "Orange")
    println(fruits.size)
    println(fruits)
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    println(newFruits)
    println(newFruits.elementAt(4))

    // maps
    // key value pairs
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(daysOfTheWeek[2])

    for(key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }

    // key is a string, value is an object
    val fruitsMap = mapOf("Favorite" to Fruit("Mango", 1.2),
        "OK" to Fruit("Apple", 1.0))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"
    println(newDaysOfWeek)
    println(newDaysOfWeek.toSortedMap())
}