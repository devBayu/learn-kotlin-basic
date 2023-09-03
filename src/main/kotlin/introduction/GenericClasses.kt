package introduction

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)
    fun peek() = elements.last();
    fun pop() : E = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size

    override fun toString() = "introduction.MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = MutableStack(0.62, 3.14, 2.7)
    stack.push(2024.0)
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }

    println("=============================")
    val stack2 = mutableStackOf(0.62, 3.14, 2.7)
    println(stack2)
}
