import java.util.*

fun main() {
    val priorityQueue = PriorityQueue<Int>()
    priorityQueue.add(10)
    priorityQueue.add(5)
    priorityQueue.add(20)


    val highestPriority = priorityQueue.poll()
    println("En Yüksek Öncelikli Öge: $highestPriority")

    println("Kuyruktaki Diğer Ögeler")
    while (!priorityQueue.isEmpty())
        println(priorityQueue.poll())
}