package teoria.Fundamentos

/*CLASSES E CONSTRUTORES
Construtor primário
O construtor primário faz parte do cabeçalho da classe. Com val/var, o parâmetro vira propriedade automaticamente:
nclass Pessoa(val nome: String, var idade: Int)  // propriedades declaradas inline


val p = Pessoa("Ana", 30)
println(p.nome)   // Ana
p.idade = 31      // OK — var

// Sem val/var: apenas parâmetro, não vira propriedade
class Temp(x: Int) {
    val dobro = x * 2   // x só existe no construtor
}


Construtor primário com inicialização


class Circulo(val raio: Double) {
    val area = Math.PI * raio * raio     // inicialização usando parâmetro
    val diametro = raio * 2

    init {
        require(raio > 0) { "Raio deve ser positivo, era: $raio" }
    }
}


Construtores secundários
São definidos com constructor e devem delegar ao primário com this(...):


class Retangulo(val largura: Double, val altura: Double) {

    // Construtor secundário — deve chamar this(...)
    constructor(lado: Double) : this(lado, lado)   // quadrado

    constructor(largura: Int, altura: Int) : this(largura.toDouble(), altura.toDouble())

    val area get() = largura * altura
}

val r1 = Retangulo(3.0, 4.0)
val r2 = Retangulo(5.0)         // chama o secundário
val r3 = Retangulo(2, 3)        // chama o Int secundário


Visibilidade no construtor


class Singleton private constructor() {   // construtor privado
    companion object {
        val INSTANCE = Singleton()
    }
}


 */