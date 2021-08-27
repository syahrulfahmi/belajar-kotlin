fun main() {
    val nama = 0.toString()
    when (nama) {
        is String -> println("ini adalah string")
        !is String -> println("ini bukan string")
    }
}