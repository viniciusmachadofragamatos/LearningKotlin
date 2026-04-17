package teoria.Fundamentos

/*VARIAVEIS
Em Kotlin, você não precisa declarar o tipo da variável
se o compilador puder adivinhar (Inferência de Tipo).
Tudo em Kotlin é um objeto, não existem "tipos primitivos"
puros como no Java (embora o compilador otimize isso por
baixo dos panos para performance).

val (Value) é imutavel (somente leitura), depois de
atribuir um valor nao pode mudar, pense nele como o
final do java. sempre prefira val

var(Variable) é mutável. O valor pode ser alterado
depois.



No Java, temos int (primitivo) e Integer (objeto).
 No Kotlin, tudo é tratado como objeto do ponto de vista
 do programador (Int, Double, Boolean, Long).

Vantagem:
Você pode chamar métodos diretamente
 em números: 10.toDouble() ou 5.plus(10).

Performance: Não se preocupe, o compilador
do Kotlin é inteligente. Ele converte esses
 objetos para tipos primitivos da JVM sempre
  que possível para manter a performance alta.

Inferência de Tipo

O Kotlin é estaticamente tipado, mas ele é preguiçoso
(no bom sentido). Se você inicializa a variável na
declaração, ele não te obriga a escrever o tipo.
Kotlin

val idade = 25          // O compilador entende que é Int
val salario = 1500.50   // O compilador entende que é Double
val nome = "Gemini"     // O compilador entende que é String

Onde a inferência falha?
Se você declarar a variável e não atribuir o valor imediatamente, você precisa declarar o tipo:
Kotlin

val matricula: String
// ... algum código ...
matricula = "ADS-2026"

Aprofundando: val vs const val

Como você quer ser profissional,
precisa saber essa diferença que muita gente confunde:

val: É uma constante de tempo de execução.
O valor pode ser decidido enquanto o programa roda (ex: o resultado de uma função).

const val: É uma constante de tempo de compilação.
O valor tem que ser conhecido antes do programa rodar.
Elas só podem existir fora de funções (no topo do arquivo)
ou dentro de um object.

EXEMPLO
const val PI = 3.14 // Compilação

fun main() {
    val horarioAcesso = LocalDateTime.now() // Execução (não poderia ser const)
}
*/
fun main() {
    val nome = "Kotlin"
    // inferiu que é strig.Nao pode ser alterado
    var versao = 1.9
    // inferiu que é double
    versao = 2.00
    //permitiu pois é var

    //declaração EXPLICITA DE TIPOS
    val idade : Int = 25
    val ativo : Boolean = true
    val inicial : Char = 'K'

}
