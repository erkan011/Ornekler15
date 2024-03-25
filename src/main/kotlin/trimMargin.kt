fun main() {
    val multilineString = """
              |Bu çok satırlı bir metindir.
                |Satır içi boşluklar düzenlenecektir.
           |TrimMargin işlevi kullanılarak.
    """.trimMargin()

    println(multilineString)
}