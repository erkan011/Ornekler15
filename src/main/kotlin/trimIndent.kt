fun main() {
    val multilineString = """
        |Bu çok satırlı bir metindir.
        |Satır içi boşluklar düzenlenecektir.
        |TrimIndent işlevi kullanılarak.
    """.trimIndent()
    println(multilineString)
}