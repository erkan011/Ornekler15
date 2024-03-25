class Address(val street: String, val city: String, val postalCode: String)

fun main() {
    val address = Address("152061 Nolu Sokak", "Gürçam Sitesi 1", "16")

    println("Street: ${address.street}")
    println("City: ${address.city}")
    println("PostalCode: ${address.postalCode}")
}