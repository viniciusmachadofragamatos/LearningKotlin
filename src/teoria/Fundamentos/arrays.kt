package teoria.Fundamentos

/* ARRAYS E RANGES

Arrays em kotlin têm um tamanho fixo. Para otimização de
primitivos, usamos arrays especificos como IntArray, DoubleArray
(isso evita o boxing/unboxing do Java).

O conceito de Range(intervalos) é muito usado em loops
 */
/*


Arrays


// Arrays tipados (sem boxing — primitivos na JVM)
val ints = IntArray(5)                    // [0,0,0,0,0]
val ints2 = IntArray(5) { it * it }       // [0,1,4,9,16] com lambda inicializador
val ints3 = intArrayOf(1, 2, 3, 4, 5)    // literal

// Array genérico (com boxing)
val strs = Array(3) { "item$it" }         // ["item0","item1","item2"]
val strs2 = arrayOf("a", "b", "c")

// Outros tipos primitivos
val longs   = LongArray(3)
val doubles = DoubleArray(3) { it.toDouble() }
val bools   = BooleanArray(5) { true }


Ranges
Ranges são objetos que implementam ClosedRange<T> ou Progression<T>:


val r1 = 1..10        // IntRange — fechado: [1, 10]
val r2 = 1 until 10   // IntRange — semi-aberto: [1, 10)
val r3 = 10 downTo 1  // IntProgression — decrescente
val r4 = 1..10 step 3 // IntProgression — com passo: 1,4,7,10

// Ranges de outros tipos
val chars = 'a'..'z'     // CharRange
val strs  = "abc".."xyz" // ClosedRange<String> (só suporta contains, não iteração)

// Operações
println(5 in 1..10)       // true
println(15 !in 1..10)     // true
println(r1.first)         // 1
println(r1.last)          // 10
println(r1.count())       // 10


Diferença entre Array<Int> e IntArray


val a: Array<Int>  = arrayOf(1, 2, 3)   // Integer[] na JVM — boxing
val b: IntArray    = intArrayOf(1, 2, 3) // int[] na JVM — sem boxing

// Para operações de coleção, prefira List<Int>
val lista = listOf(1, 2, 3)   // imutável
val mutavel = mutableListOf(1, 2, 3)

 */
fun main() {
    val numeros = IntArray(5) { it * 2}// [0, 2, 4, 6 ,8]

    //for, ranges e steps
    for (i in 1..5) println(i) // 1, 2, 3, 4, 5
    for (i in 1 until 5) println(i) // 1, 2, 3, 4(ignora o último)
    for (i in 10 downTo 2 step 2) println(i) // 10, 8, 6, 4, 2
}

