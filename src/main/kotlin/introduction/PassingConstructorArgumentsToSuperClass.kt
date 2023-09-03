package introduction

fun  main() {
    val lion: Lion = Asiatic("Rufoh")
    lion.sayHello()
}

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graohh!!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")
