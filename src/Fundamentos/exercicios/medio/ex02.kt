package Fundamentos.exercicios.medio
fun dividir(a:Int, b: Int) : Int{
    if(b == 0){
        erroDivisao()
    }
    return a / b
}
fun erroDivisao() : Nothing {
    throw IllegalArgumentException("Divisão por zero!")
}