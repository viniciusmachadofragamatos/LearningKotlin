package exercicios.facil

data class Ponto(var x : Int, var y : Int)

fun main() {
    val p1 = _root_ide_package_.exercicios.facil.Ponto(4, 2)
    val p2 = _root_ide_package_.exercicios.facil.Ponto(4, 2)
    println(p1 == p2) // TRUE -> (COMPARA CONTEÚDO)
    println(p1 === p2) // FALSE -> (COMPARA REFERÊNCIA)
}