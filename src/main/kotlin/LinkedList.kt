import java.util.LinkedList

fun main() {
    val meyve: LinkedList<String> = LinkedList()

    meyve.add("karpuz")
    meyve.add("erik")
    meyve.add("çilek")

    println("Meyveler: $meyve")

    meyve.add(1,"portakal")
    println("öğe ekle: $meyve")

    val ilkcikar = meyve.removeFirst()
    println("ilk eleman Çıkarıldı: $ilkcikar")
    println("Güncel: $meyve")

    val soncikar = meyve.removeLast()
    println("son eleman Çıkarıldı: $soncikar")
    println("Güncel: $meyve")

}