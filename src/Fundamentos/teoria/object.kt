package Fundamentos.teoria

/*OBJECT, COMPANION OBJECT E SINGLETON
SINGLETON
O padrão Singleton(ter apenas uma instância de uma classe no projeto inteiro)
é nativo no kotlin com a palavra object.Dica: Tente manter Singletons o mais
imutáveis (val) possível para evitar bugs em sistemas grandes

COMPANION OBJECT
Como kotlin nao tem a palavra static usamos companion object
para métodos que pertencem à classe e não à instância.
se você quer que um mét0do pertença à classe
e não a um objeto específico, você o coloca dentro
de um companion object


object declaration — Singleton nativo
kotlin tem suporte nativo a Singleton via object. A instância é criada de forma lazy e thread-safe pelo classloader da JVM:


object Configuracao {
    val host = "localhost"
    var porta = 8080

    fun url() = "http://$host:$porta"
}

Configuracao.url()           // acesso direto
Configuracao.porta = 9090    // mutável


Na JVM, object compila para uma classe com campo estático INSTANCE. É thread-safe por garantia do classloader.
companion object — membros "estáticos" da classe


class Conexao private constructor(val url: String) {

    companion object {                          // pode ter nome: companion object Factory
        const val TIMEOUT = 30
        private var instancias = 0

        fun criar(url: String): Conexao {
            instancias++
            return Conexao(url)
        }
    }
}

val c = Conexao.criar("jdbc://...")   // acesso via nome da classe
println(Conexao.TIMEOUT)              // 30


O companion object é um objeto real — pode implementar interfaces:


interface Fabrica<T> {
    fun criar(): T
}

class Produto(val nome: String) {
    companion object : Fabrica<Produto> {
        override fun criar() = Produto("padrão")
    }
}

val fabrica: Fabrica<Produto> = Produto   // companion object como instância


object expression — equivalente a classe anônima do Java


val comparador = object : Comparator<String> {
    override fun compare(a: String, b: String) = a.length - b.length
}

// Com interface funcional, lambda é preferível:
val comp = Comparator<String> { a, b -> a.length - b.length }
*/
object BancoDeDados {
    val url = "jdbc:postgresql://localhost:5432/db"
    fun conectar() = println("Conectado!")
}
class Servidor {
    //Membros "estáticos"
    companion object{
        const val PORTA_PADRAO = 8080
        fun criarDefault() = Servidor()
    }
}

fun main(){
    //Singleton absoluto, Não precisa armazenar(val x = BancoDeDados.conectar())
    // para chamar
    BancoDeDados.conectar()
    val x = Servidor()
}