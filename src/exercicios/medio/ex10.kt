package exercicios.medio
fun main()  {
    _root_ide_package_.exercicios.medio.fibonacciAteN(8)
}
fun classificarNumero(n: Int): String {
    return when {
        n <= 0 -> "Número inválido"
        _root_ide_package_.exercicios.medio.ehPerfeito(n) -> "Perfeito"
        _root_ide_package_.exercicios.medio.ehPrimo(n) -> "Primo"
        n % 2 == 0 -> "Par"
        else -> "Ímpar"
    }
}

fun ehPrimo(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}

fun ehPerfeito(n: Int): Boolean {
    var soma = 0
    for (i in 1 until n) {
        if (n % i == 0) soma += i
    }
    return soma == n
}
fun fibonacciAteN(n: Int) {
    var a = 0
    var b = 1

    for (i in 0..n step 1) {
        if (i == 0) {
            println(a)
        } else if (i == 1) {
            println(b)
        } else {
            val c = a + b
            println(c)
            a = b
            b = c
        }
    }
}