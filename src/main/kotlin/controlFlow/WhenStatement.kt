package controlFlow

fun main() {
    cases(1)
    cases("Hello")
    cases(0L)
    cases(MyClass())
    cases("hello")
}

class MyClass

fun cases(type: Any) {
    when (type) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

/*
    1.  Seolah olah menggunakan switch case, kotlin menyediakan when statement untuk membuat pilihan layaknya menggunakan switch case
    2.  Bedanya dengan switch adalah when tidak perlu untuk default value (tergantung bahasa pemrogramannya)
    3.  Caranya adalah dengan keyword when(type_dari_pilihannya) tanda (->) untuk memberikan action dari type yang dipilih
    4.  Ketika type yang dipilih sama dengan pilihan di dalam when tersebut, maka akan mengeksekusi action yang terkait.
    5. Jika ingin menambahkan default value dapat menggunakan keyword else.
* */
