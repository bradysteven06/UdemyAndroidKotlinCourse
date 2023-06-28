package com.example.kotlinbasics

fun main(){
    // immutable variable
    // type string
    val myName = "Steven"

    // type inference finds out the type from context
    var myAge = 31

    // Integer Types: Byte(8bit), Short(16bit),
    // Int (32bit), Long(64bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    // Floating Point number Types: Float(32bit), Double(64bit)
    val myFloat: Float = 13.37F
    val MyDouble: Double = 3.14159265358979323846

    // Boolean Type: The type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    var isRainy = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    println(firstCharInStr)
    println(lastCharInStr)

    println("Hello " + myName)
}
