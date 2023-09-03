package introduction

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: arghhhh")
    }
}

class SiberianTiger: Tiger("Siberia")

class SumateraTiger: Tiger("Sumatera")

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val sumateraTiger = SumateraTiger()
    sumateraTiger.sayHello()
}
