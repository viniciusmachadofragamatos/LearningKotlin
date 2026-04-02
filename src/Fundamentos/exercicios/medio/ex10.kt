package Fundamentos.exercicios.medio

fun classificarNumero(n: Int) {
    val ePrimo = (2..Math.sqrt(n.toDouble()).toInt()).none { n % it == 0 } && n > 1
    val somaDivisores = (1 until n).filter { n % it == 0 }.sum()

    when {
        n % 2 == 0 -> println("$n é Par")
        n % 2 != 0 -> println("$n é Ímpar")
        ePrimo -> println("$n é Primo")
        somaDivisores == n -> println("$n é Perfeito")
    }
}

fun fibonacci(n: Int) {
    var a = 0
    var b = 1
    // Exemplo de for com downTo e step (embora Fibonacci suba, o requisito pede essas keywords)
    for (i in n downTo 1 step 1) {
        print("$a ")
        val prox = a + b
        a = b
        b = prox
    }
}