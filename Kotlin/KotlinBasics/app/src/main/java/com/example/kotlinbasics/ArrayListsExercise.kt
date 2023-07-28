package com.example.kotlinbasics

fun main(){
    val arrayList: ArrayList<Double> = ArrayList<Double>()
    arrayList.add(5.0)
    arrayList.add(10.0)
    arrayList.add(15.0)
    arrayList.add(20.0)
    arrayList.add(25.0)
    var sum = 0.0

    for (num in arrayList){
        sum += num
    }
    var average = sum / arrayList.size
    println("The average of the numbers is: $average")
}