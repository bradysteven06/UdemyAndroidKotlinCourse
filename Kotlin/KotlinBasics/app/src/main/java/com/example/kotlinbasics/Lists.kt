package com.example.kotlinbasics

fun main(){

    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2, 3, true, false, "String")
    println(anyTypes.size)
    println(months[1])

    for(month in months){
        println(month)
    }

    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    println(additionalMonths)
    additionalMonths.add("July")
    println(additionalMonths)

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    println(days)
    days[2] = "Sun"
    println(days)
    days.removeAt(1)
    println(days)
    val removeList = mutableListOf<String>("Sun")
    days.removeAll(removeList)
    println(days)
    days.removeAll(days)
    println(days)
}