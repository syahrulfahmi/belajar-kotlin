fun main() {
    val grade = 80
    val kkm = 75

    val old = 20
    val kkmOld = 18
    val passExam = grade > kkm
    val passOld = old > kkmOld
    val result = !passExam || passOld
    println(result)
}