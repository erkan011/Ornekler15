import java.text.SimpleDateFormat
import java.util.Date

fun main() {
    val currentDate = Date()
    val dateForm = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
    val formattedDate = dateForm.format(currentDate)

    println("Biçimlendirilmiş Tarih ve Saat: $formattedDate")
}