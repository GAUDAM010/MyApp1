package com.example.myapp1.kotlinexs

fun main() {
    val s = Square(10)

    println("".printVitNames("students of vvit"))
    println( double(20))
    tempToday("mon",32)
    drive(mph=10, speed = "slow")
    var a  = "abdul"
    for (i in 3..6 step 2) print(i)


    val numberOfDogs:Int = 3
    val numberOfCats = 2
    println("i have $numberOfDogs of dogs and $numberOfCats of cats")
}

fun printHello(name: String?) {
    println("Hi there!")
}

fun drive(speed: String = "fast",mph:Int):String {
    println("driving $speed")
    return ""
}

fun tempToday(day: String, temp: Int) {
    println("Today is $day and it's $temp degrees.")
}


fun double(x: Int) = x * 2

fun String.printVitNames( names:String){
    println(names)
}

class Square(val side: Int) {
    init {
        println(side * 2)
    }
}