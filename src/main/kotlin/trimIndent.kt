fun main() {
    val multilineString = """
           |Bu çok satırlı bir metindir.
        |Satır içi boşluklar düzenlenecektir.
               |TrimIndent işlevi kullanılarak.
    """.trimIndent()
    println(multilineString)
}
//bu örnekten sonra trimMargin örneğine bakını.
//aradaki farkı sonuçlara bakarak anlaşılır.