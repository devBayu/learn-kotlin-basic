package controlFlow

fun main() {
    val desserts = listOf<String>("Carrot", "Cheese", "Chocolate", "Getuk", "Somay", "Batagor", "Baso Tahu", "Kue Rangi")
    for (dessert in desserts) {
        println(dessert)
    }

    var dessertEaten = 0
    var dessertBaked = 0
    while (dessertEaten < 5) {
        eatDessert();
        dessertEaten++
    }

    do {
        bakeDessert()
        dessertBaked++
    } while (dessertBaked < dessertEaten)
}

fun eatDessert() = println("Eat a dessert")
fun bakeDessert() = println("Bake a dessert")

/*
    1. Kotlin memiliki looping seperti umumnya bahasa pemrograman lainnya (for, while, do-while)
* */
