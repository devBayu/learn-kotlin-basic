package controlFlow

fun main() {
    fun showMax(firstNumber: Int, secondNumber: Int) : Int {
        return if (firstNumber < secondNumber) {
            secondNumber;
        } else {
            firstNumber;
        }
    }

    println(showMax(100, 990))
}

/*
    NGERTI LAH YA, MASA IF IF DOANG MESTI DIJELASIN WKWKWK CAPE GUE !
* */
