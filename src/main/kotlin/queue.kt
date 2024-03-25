import java.util.LinkedList

fun main() {
    val queue: LinkedList<String> = LinkedList()
    queue.add("Elma")
    queue.add("muz")
    queue.add("kiraz")
    println(queue)


    while (!queue.isEmpty()){
        val element =queue.remove()
        println("Removed: $element")
            println("Güncel: $queue")
    }
}