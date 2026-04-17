package exercicios.facil

fun main() {
    val nome: String = "Vinicius"
    var cidade : String = "São Paulo"
    var idade: Int = 16
    println("Seu nome é $nome, sua idade é $idade e sua cidade é $cidade")
    println("""
    Seu nome é $nome
    Sua idade é $idade
    Sua cidade é $cidade
    """.trimIndent())
}