package Fundamentos.exercicios.facil

fun main() {
    var x = IntArray(5) { i -> (i+1) * (i+1) }
    for (i in x.indices) {
        println("Indice : $i, valor: ${x[i]}")
    }
}