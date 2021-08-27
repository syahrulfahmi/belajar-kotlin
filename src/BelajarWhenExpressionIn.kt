fun main() {
    val pass = 81
    val passGrade = arrayOf(76, 80, 85, 90)
    when (pass) {
        in passGrade -> println("lulus")
        !in passGrade -> println("tidak lulus")
    }
}