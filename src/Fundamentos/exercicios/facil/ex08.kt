package Fundamentos.exercicios.facil


fun somar(a: Int, b: Int): Int {
    return a + b
}
fun saudar(nome: String) : Unit {
    println("Olá $nome!")
}
fun maiorDeTres(a: Int, b: Int, c: Int) =
    if (a > b && a > c) {
        if (b > c) "$a > $b > $c" else "$a > $c > $b"
    } else if (b > c) {
        if (a > c) "$b > $a > $c" else "$b > $c > $a"
    } else {
        if (a > b) "$c > $a > $b" else "$c > $b > $a"
    }
fun main() {
    saudar("joão")
    maiorDeTres(2,1,3)
    println(somar(1,2))
}