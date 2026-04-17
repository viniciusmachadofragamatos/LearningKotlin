package teoria.POO
// sem 'open', esta classe NÃO pode ser herdada
//class Animal //implicitamente final

//para permitir herança, você DEVE declarar 'open'
open class Animal(val nome: String) {
    open fun emitirSom(): String = "..."    // mét0do tamém precisa de 'open'
    fun respirar() = "respirando"           //esta NAO pode ser sobrescrito
}

class cachorro(nome: String) : Animal(nome) {
    override fun emitirSom(): String = "Au au"
    //overide fun respirar() = "..." //ERRO de compilação
}


abstract class Forma {
    abstract fun area() : Double
    abstract fun perimetro(): Double

    fun descricao(): String =
        "Area: ${area()}, Perimetro: ${perimetro()}"
}

class circulo (var raio: Double) : Forma() {
    override fun area() = Math.PI * raio * raio
    override fun perimetro() = Math.PI * raio * 2
}