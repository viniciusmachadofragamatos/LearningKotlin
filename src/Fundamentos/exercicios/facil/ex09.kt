package Fundamentos.exercicios.facil

object contador {
    var total = 0;
    fun incrementar() {
        total++
    }
}
fun facilitador(){
    contador.incrementar()
    println(contador.total)
}
fun main() {
    contador.incrementar()
    println(contador.total)

    facilitador()
}