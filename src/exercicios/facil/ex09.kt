package exercicios.facil

object contador {
    var total = 0;
    fun incrementar() {
        total++
    }
}
fun facilitador(){
    _root_ide_package_.exercicios.facil.contador.incrementar()
    println(_root_ide_package_.exercicios.facil.contador.total)
}
fun main() {
    _root_ide_package_.exercicios.facil.contador.incrementar()
    println(_root_ide_package_.exercicios.facil.contador.total)

    _root_ide_package_.exercicios.facil.facilitador()
}