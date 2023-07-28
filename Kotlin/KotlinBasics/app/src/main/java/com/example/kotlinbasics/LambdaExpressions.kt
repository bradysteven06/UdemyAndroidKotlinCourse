package com.example.kotlinbasics

fun main(){
    // lambda expression
    // returns the result of a+b
    val sum1: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    println(sum1(10, 5))

    // shorter version of above lambda expression
    // prints the result to console
    val sum2 = {a: Int, b: Int -> println(a+b) }
    sum2(10, 5)
}