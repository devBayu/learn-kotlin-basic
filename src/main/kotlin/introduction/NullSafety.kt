package introduction

fun main() {
    var neverNull: String = "This can't be null"
//    neverNull = null

    var nullable: String? = "You can keep a null here"
    nullable = null
    var canNull: Boolean? = null
//    println(canNull)

//    var inferredNonNull = "The compiler assumes non-null"
//    inferredNonNull = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
//    strLength(nullable)

    println(describeString(null))
}

fun describeString(maybeString: String?):String {
    if (maybeString !== null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

/*
    1. variable di kotlin tidak dapat diassign null
    2. Untuk dapat membuat value null dalam variable perlu menambahkan symbol (?)
* */
