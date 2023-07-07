fun main(){

    var y : Any = 13.37
    when(y) {
    is Int -> println("$y is an Int")
    !is Double -> println("$y is not Double")
    is String -> println("$y is a String")
    else -> println("$y is none of the above")
    }


    val x : Any = 13.37
    //assign when to a variable
    val result =  when(x) {
        //let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
    //then print x with the result
    print("$x $result")
}