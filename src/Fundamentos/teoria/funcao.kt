package Fundamentos.teoria

/*FUNÇÕES: PARÂMETROS, RETORNO, UNIT, NOTHING

funções começam com a palavra chave fun o tipo de retorno vem
 no final, após os dois pontos :

 Unit: é o equivalente ao void do Java/C. Significa que a função
 não retorna um valor útil, é opcional escreve-lô

 Nothing: Significa que a função nunca retorna com sucesso
(ela sempre lança uma exceção ou entra em loop infinito)
Muito útil para análise de código do compilador

fun somar(a: Int, b: Int): Int {
    return a + b
}
Unit — equivalente ao void, mas é um tipo real
Unit é um tipo singleton com um único valor: Unit. Funções que "não retornam nada" retornam Unit implicitamente:
kotlinfun imprimir(msg: String): Unit {   // Unit pode ser omitido
    println(msg)
}

fun imprimir(msg: String) {         // equivalente — Unit implícito
    println(msg)
}
Por ser um tipo real, Unit pode ser usado em genéricos — algo impossível com void em Java:
kotlinfun <T> executar(bloco: () -> T): T = bloco()
val resultado: Unit = executar { println("ok") }  // T = Unit
Nothing — o tipo que nunca retorna
Nothing representa uma computação que jamais completa normalmente — lança exceção, entra em loop infinito, ou encerra o processo. É subtipo de todos os tipos (fundo da hierarquia):
kotlinfun falhar(msg: String): Nothing {
    throw IllegalStateException(msg)
}

fun dividir(a: Int, b: Int): Int {
    if (b == 0) falhar("divisão por zero")  // compilador sabe que isso não retorna
    return a / b                              // compilador sabe que b != 0 aqui
}
Nothing? é o tipo de null — é o subtipo de todos os tipos nullable:
kotlinval x: String? = null   // null tem tipo Nothing?
Varargs
kotlinfun somar(vararg nums: Int): Int = nums.sum()
somar(1, 2, 3, 4)   // OK

// Spread operator para passar array como vararg
val arr = intArrayOf(1, 2, 3)
somar(*arr)
 */
fun main() {
    fun saudar(nome: String) : Unit { // Unit é opcional
        println("Olá, $nome")
    }
    fun falhar(mensagem: String): Nothing {
        throw IllegalArgumentException(mensagem)
    }
    /* FUNÇÃO DE EXPRESSÃO UNICA E PARâMETROS DEFAUL/NOMEADOS
    se a função apenas tem uma linha que retorna algo, você pode
    omitir as chaves {} e o tipo de retorno, usando o sinal de =.

    Ao chamar parametros por default, vai em ordem padrão, ja se nomear
    não importa a ordem
     */
    fun somar(a: Int, b: Int) = a + b

    fun configurarServidor(host : String = "localhost", porta : Int = 8080) {
        println("Servidor rodando em $host:$porta")
    }
    fun testeNomeados () {
        //Parâmetros nomeados permitem ignorar a ordem
        configurarServidor( porta = 3000, host = "127.0.0.1")
        configurarServidor()
        //Usa os defaults: localhost:8080
    }


}
/*
//Expressão única (single-expression function)
//Quando o corpo é uma única expressão, o return e as chaves são opcionais. O tipo de retorno pode ser inferido:


fun quadrado(x: Int): Int = x * x
fun quadrado(x: Int) = x * x   // tipo inferido — igualmente válido
fun max(a: Int, b: Int) = if (a > b) a else b
fun fatorial(n: Int): Long = if (n <= 1) 1L else n * fatorial(n - 1)


//Parâmetros default
//Evitam a explosão de overloads que existe em Java:


fun criar(
    nome: String,
    ativo: Boolean = true,
    prioridade: Int = 0,
    descricao: String = ""
) { ... }

criar("Tarefa")                          // usa todos os defaults
criar("Tarefa", prioridade = 5)          // pula alguns com argumentos nomeados
criar("Tarefa", false, 3, "Urgente")     // posicional — todos explícitos


//Argumentos nomeados
//Melhoram legibilidade e permitem reordenar argumentos (exceto quando misturados com posicionais de forma ambígua):


fun conectar(host: String, porta: Int, ssl: Boolean, timeout: Int) { ... }


// Posicional — ilegível
conectar("localhost", 5432, true, 30)

// Nomeado — autodocumentado
conectar(
    host = "localhost",
    porta = 5432,
    ssl = true,
    timeout = 30
)

// Reordenamento com nomeados é permitido
conectar(timeout = 30, host = "localhost", ssl = true, porta = 5432)

//Regra de mistura posicional + nomeado

// Posicionais devem vir ANTES dos nomeados
conectar("localhost", porta = 5432, ssl = true, timeout = 30)  // OK
// conectar(host = "localhost", 5432, ...)  // ERRO
 */


