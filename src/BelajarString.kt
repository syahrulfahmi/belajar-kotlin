fun main() {
    val firstName: String = "Syahrul "
    val lastName: String = "Fahmi"
    val fullName: String = firstName + lastName
    val address: String = """
        Jl. Kenangan
        Kec, Cinta
        Kab. Patah Hati
    """.trimIndent()
    println(firstName)
    println(address)
    println(fullName)
}