package introduction

fun main() {
    var char: String = "Initial"
    println(char)

    var word: String = "Initial Word"
    println(word)

    val secondWord = "Second Word"
    println(secondWord)

//    var number: Int
//    println(number)

    val numberB: Int
    if (someCondition()) {
        numberB = 1
    } else {
        numberB = 2
    }

    println(numberB)
}

fun someCondition() = true

/*
    1. deklarasi variable dapat menggunakan keyword yang ada di kotlin, namun ini tidak disarankan menurut saya
    2. keyword var untuk mutable variable
    3. keyword val untuk immutable variable
    4. variable yang dideklarasikan harus diisi valuenya, jika tidak akan terjadi variable [NAMA_VARIABLE] must be initialized
* */
