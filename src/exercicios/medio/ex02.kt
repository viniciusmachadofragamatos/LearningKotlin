package exercicios.medio
fun dividir(a:Int, b: Int) : Int{
    if(b == 0){
        _root_ide_package_.exercicios.medio.erroDivisao()
    }
    return a / b
}
fun erroDivisao() : Nothing {
    throw IllegalArgumentException("Divisão por zero!")
}