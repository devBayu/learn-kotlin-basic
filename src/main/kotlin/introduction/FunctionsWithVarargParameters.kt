package introduction

fun main() {
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "你好", prefix = "Greeting: ")

    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}

/*
    1. vararg menjadikan parameter sebagai array,
    2. setiap pemanggilan argumen dari parameter yang dilempar harus menggunakan looping
    3. dengan menggunakan symbol (*) dapat menampilkan nilai dari setiap parameter yang dilempar
    4. untuk mengakses argument dari parameter juga dapat dengan metode array[INDEX KE n]
* */
