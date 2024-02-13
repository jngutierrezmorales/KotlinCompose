package com.jngutierrezmorales.kotlincompose

fun main() {
    val name = "Juan"
    print("Hello $name\n")

    val score: Int
    score = 10

    val myByte: Byte
    myByte = 127

    val myShort: Short
    myShort = 22222

    val myLong: Long
    myLong = 1L

    val myDouble: Double = 3.14

    var myFloat = 3.14f
    myFloat = 3.14F
    println(myFloat)

    val a = 4
    val b = 2
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

    val amount = 99
    when (amount) {
        in 1..100 -> println("This amount is between 1 and 100.")
        !in 10..90 -> println("This amount is outside the range.")
        999 -> println("Really close.")
        1000 -> println("Rich but not there.")
        1100 -> println("You've made it!")
        else -> {
            println("$amount is just not going to work.")
        }
    }
//    if (amount >= 1000) {
//        println("Wow... you are very wealthy!")
//    } else {
//        println("You are getting by")
//    }

    for (i in 1..30) {
        if (i % 3 == 0)
            println("$i is multiple of 3.") else println("---")
        if (i % 2 == 0) println(i)
    }

    //calculate(1, 1000, message = "is multiple of", 3)
    calculate(first = 20, second = 100, message = "is multiple of", multipleOf = 11)

    val catAge = calculateCatAge(age = 12)
    print("This cat is $catAge years old")
}

fun calculate(first: Int = 1, second: Int = 1000, message: String, multipleOf: Int) {
    for (i in first..second) {
        if (i % multipleOf == 0) {
            println("$i $message $multipleOf")
        }
    }
}

fun calculateCatAge(age: Int): Int = age * 7
