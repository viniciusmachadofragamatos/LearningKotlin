package Fundamentos.exercicios.facil

fun main() {
    val HTTP = 200
    var conectandoHTTP = when(HTTP){
        200 -> "Tudo Certo"
        404 -> "Erro no Cliente"
        500 -> "Erro no Servidor"
        else -> "Codigo Desconhecido"

    }
}