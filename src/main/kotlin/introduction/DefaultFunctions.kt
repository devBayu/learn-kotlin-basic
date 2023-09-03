package introduction

//Default Parameter Values and Names Arguments
fun main() {
    printMessage("Haii Bayu")
    printMessageWithPrefix("Bayu", "Selamat Malam")
    println(sum(1, 2))
    println(multiply(2, 2))
}

fun printMessage(message: String) : Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int) : Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

/*
    1. Function dapat ditulis secara inline function
* */

