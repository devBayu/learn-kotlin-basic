package introduction

class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()
    val contact = Contact(1, "skuy@gmail.com")

    println(contact.id)
    contact.email = "jane@gmail.com"
    println(contact.email)
    println(customer)
}

/*
    1. Di kotlin tidak perlu menggunakan keyword new untuk menginisialisasi object
    2. Untuk mengakses properti dalam class dapat dengan cara NamaClass.[nama_properti]
    3. untuk membuat class dapat dengan class NamaClass(parameter ini dapat menjadi optional)
* */
