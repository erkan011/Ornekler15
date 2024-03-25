class Product(val name: String, val price: Double)

fun main() {
    val product1 = Product("Telefon", 1500.5)
    val product2 = Product("Laptop", 2500.6)

    println("${product1.name} Fiyatı: ${product1.price} TL")
    println("${product2.name} Fiyatı: ${product2.price} Tl")
}