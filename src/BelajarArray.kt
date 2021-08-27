fun main() {
    val arrString: Array<String> = arrayOf("Fahmi", "Budi", "Steve")
    val budi = arrString[1]
    arrString[0] = "Kiki"
    println(budi)
    println(arrString.joinToString())
}