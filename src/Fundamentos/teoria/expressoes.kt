package Fundamentos.teoria



/* CONTROLE DE FLUXO COMO EXPRESSÕES

No kotlin, if e When podem retornar valores. isso reduz
a necessidade de criar variáveis mutáveis só para guardar
um estado
 */
/*
Em Kotlin, if, when e try são expressões — produzem valores e podem ser atribuídos.
if como expressão


val max = if (a > b) a else b   // substitui o operador ternário (que Kotlin não tem)
val categoria = if (idade < 12) "criança"
                else if (idade < 18) "adolescente"
                else "adulto"


when — o switch-case evoluído


// when como statement
when (x) {
    1 -> println("um")
    2, 3 -> println("dois ou três")       // múltiplos valores
    in 4..10 -> println("entre 4 e 10")   // range
    is String -> println("é string")       // tipo
    else -> println("outro")
}

// when como expressão
val descricao = when (codigo) {
    200 -> "OK"
    404 -> "Não encontrado"
    in 500..599 -> "Erro de servidor"
    else -> "Código desconhecido"
}

// when sem argumento — substitui if-else-if complexo
val resultado = when {
    temperatura < 0   -> "congelando"
    temperatura < 15  -> "frio"
    temperatura < 30  -> "agradável"
    else              -> "quente"
}


for — iteração sobre qualquer Iterable


for (i in 1..5) print(i)           // 12345
for (i in 1 until 5) print(i)      // 1234 (exclui 5)
for (i in 5 downTo 1) print(i)     // 54321
for (i in 0..10 step 2) print(i)   // 02468 10
// Com índice
val lista = listOf("a", "b", "c")
for ((index, valor) in lista.withIndex()) {
    println("$index: $valor")
}


while e do-while


var n = 1
while (n <= 5) { print(n); n++ }

do {
    val entrada = lerEntrada()
} while (entrada != "sair")


break e continue com labels — controle preciso em loops aninhados


externo@ for (i in 1..3) {
    for (j in 1..3) {
        if (j == 2) continue@externo   // pula para próxima iteração do loop externo
        if (i == 2) break@externo      // sai do loop externo completamente
        println("$i,$j")
    }
}
 */

fun main () {
    val a = 10
    val b = 20

    //If como expressão (substitui o operador ternario a > b ? a : b)
    val maior = if (a > b) a else b

    //When(o "Switch" anabolizado do kotlin
    val status = 200
    val mensagem = when(status) {
        200, 201 -> "Sucesso"
        in 400..499 -> "Erro do Cliente"
        else -> "Erro Desconhecido"
    }
}