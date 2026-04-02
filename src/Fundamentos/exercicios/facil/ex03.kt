package Fundamentos.exercicios.facil
class Carro (val marca : String,val modelo : String,val ano : Int)
fun main() {
    var carro1 = Carro(marca ="Toyota", modelo = "corola", ano = 2009)
    var carro2 = Carro(marca="Honda", modelo ="Civic", ano = 2015)
    println(carro1.modelo)
}