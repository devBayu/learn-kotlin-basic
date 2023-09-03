package controlFlow

fun main() {
    val authors = setOf<String>("Shakespeare", "Hemingway", "Twain", "Peter")
    val writers = setOf<String>("Twain", "Shakespeare", "Hemingway", "Peter")

    println(authors == writers) // true karena valuenya sama meskipun urutan nilainya berbeda
    println(authors === writers) // false karena reference nya berbeda

}

/*
    1.  == untuk membandingkan value
    2.  === untuk membandingkan reference
    3.  Reference adalah alamat memory
* */
