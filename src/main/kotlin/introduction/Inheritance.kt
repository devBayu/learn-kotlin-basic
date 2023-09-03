package introduction

open class Dog {
    open fun sayHello() {
        println("Anying Anying")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("Anjing Anjing")
//        super.sayHello()
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}

/*
    1. gunakan super untuk menurunkan function dari parentnya cth(super.[namaFunction()])
    2. keyword open digunakan untuk class tersebut dapat dioverride
    3. :parentClass() adalah untuk menurunkan sesuatu dari parentnya
    4. override adalah keyword untuk mengoverride sesuatu dari parentnya
* */
