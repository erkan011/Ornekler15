import java.util.*

fun main() {
    val stack = Stack<Int>()
    val stack1 = Stack<String>()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println("Stack: $stack")

    val poppedElement = stack.pop()
    println("Çıkarılan Öge: $poppedElement")
    println("Güncel Stack: $stack")



    stack1.push("erkan")
    stack1.push("eymen")
    stack1.push("burak")
    println("Stack1: $stack1")


    val poppedElement1 = stack1.pop()
    println("Çıkarılan Öge 1: $poppedElement1")
    println("Güncel Stack1: $stack1")
}