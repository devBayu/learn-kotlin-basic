package controlFlow

fun main() {
    for (i in 0..5) {
        print(i)
    }
    print(" ")

    for (i in 0 until 5) {
        print(i)
    }
    print(" ")

    for (i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    for (i in 10 downTo 0) {
        print(i)
    }
    print(" ")
    println()

    for (c in 'a'..'g') {
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    print(" ")
    println()

    val number = 2
    if (number in 1..5) {
        print("$number is in range from 1 to 5")
    }
    println()

    if (number !in 6..10) {
        print("$number is not in range from 1 to 5")
    }
}

/*
*   1.  Untuk for step kurang lebih seperti ini for(i = 2; i < 8; i + 2) jika di bahasa (Java/C++)
*   2. Step artinya selisih, setiap iterasi ditambahkan dengan angka step tersebut
*   3. (number..number) adalah range/rentang yang mana angka pertama dan terakhir ini termasuk cth(1..5 artinya 1, 2, 3, 4, 5)
*   4. Until (number until number) adalah length dari nilai yang ditentukan cth(0 until 5 artinya 0, 1, 2, 3, 4) ada 5 lengthnya.
*   5. Range juga berguna untuk if statement
* */
