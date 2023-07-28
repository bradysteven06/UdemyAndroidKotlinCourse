package com.example.kotlinbasics

fun main(){
    // empty ArrayList
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println("....print ArrayList....")
    for(i in arrayList){
        println(i)
    }

    // ArrayList using collections
    val arrayList2: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")
    arrayList2.addAll(list)
    println("....print ArrayList....")

    val itr = arrayList2.iterator()
    while(itr.hasNext()){
        println(itr.next())
    }
    println("size of arrayList2 = " + arrayList2.size)

    // ArrayList get()
    println("....arrayList2.get(1)....")
    println(arrayList2.get(1))
}