fun main() {
    val name = "Erkan"
    val  age = 22

    val formattedText = String.format("Merhaba, benim adım %s ve %d yaşındayım.", name, age)

    println(formattedText)


    val text = """
    Bu bir örnek metindir.
    Burada farklı satırlar ve boşluklar bulunmaktadır.
"""

    val formattedText1 = text.trimIndent()

    println("Biçimlendirilmiş Metin:")
    println(formattedText1)


}