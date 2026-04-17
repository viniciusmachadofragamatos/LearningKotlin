package exercicios.medio

fun buscarUsuarios(id: Int) :String? {
    if(id < 0) {
        return null
    }
    return "O id é $id"
}
fun main() {
    val resultado = _root_ide_package_.exercicios.medio.buscarUsuarios(-1)
    println(resultado ?: "ID invalido!")
}