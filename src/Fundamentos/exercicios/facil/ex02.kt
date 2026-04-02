package Fundamentos.exercicios.facil

fun main() {
    fun analisarTemperatura(temperatura: Double): String {
        return when(temperatura) {
            in Double.MIN_VALUE..9.99 -> "Frio"
            in 10.0..30.0-> "Normal"
            else -> "Alerta de Superaquecimento"
        }
    }
    println(analisarTemperatura(5.0))
    println(analisarTemperatura(15.0))
    println(analisarTemperatura(40.0))
}