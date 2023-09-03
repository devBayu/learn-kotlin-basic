package introduction

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(5 * "Bye ")

    operator fun Int.div(str: String) = str.length / this
    println(5 / "Divided ")

    operator fun Int.plus(str: String) = str.plus(this)
    println(5 + "Plus ")

    operator fun Int.minus(str: String) = println(str.min() + " Deh")
    println(5 - 5)

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Alaways forgive your enemies; nothing annoys them so much."
    println(str[2..14])
}
