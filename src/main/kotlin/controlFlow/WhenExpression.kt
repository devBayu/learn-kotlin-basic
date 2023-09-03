package controlFlow

fun main() {
    println(whenAssign(1))
    println(whenAssign("Hello"))
    println(whenAssign(0L))
}

fun whenAssign(type: Any) : Any {
    val result = when (type) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42 // default value
    }
    return result
}

/*
    1. Mirip dengan When statement, when expression ini juga sebetulnya memiliki tingkah laku yang sama dengan when statement.
    2. when statement dapat ditampung dalam sebuah variable
    3. default value dibutuhkan di when expression
* */

