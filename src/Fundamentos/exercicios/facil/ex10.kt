package Fundamentos.exercicios.facil

data class Ponto(var x : Int, var y : Int)

fun main() {
    val p1 = Ponto(4,2)
    val p2 = Ponto(4,2)
    println(p1 == p2) // TRUE -> (COMPARA CONTEÚDO)
    println(p1 === p2) // FALSE -> (COMPARA REFERÊNCIA)
}