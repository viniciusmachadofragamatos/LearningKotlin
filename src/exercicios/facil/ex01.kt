package exercicios.facil

/*Modelagem com Data Class e Null Safety
Crie uma data class chamada LeituraSensor. Ela deve ter:

    Um id (String).
    Um valorTemperatura (Double, que pode ser nulo caso o sensor falhe).
    Um mét-do ou propriedade que use o Elvis Operator (?:) para retornar
    o valorTemperatura ou -99.0 (indicando erro) caso seja nulo.*/


data class LeituraSensor(
    val id: String,
    val valorTemperatura : Double?
) {
    // 2. Criamos uma propriedade computada(get) para a lógica do Elvis
    val temperaturaSegura: Double
        get() = valorTemperatura ?: -99.0
}

fun main() {
    val sensorOk = _root_ide_package_.exercicios.facil.LeituraSensor("SN-001", 25.5)
    println("Sensor 1: ${sensorOk.temperaturaSegura}") // Saída: 25.5

    // Testando com valor nulo
    val sensorFalha = _root_ide_package_.exercicios.facil.LeituraSensor("SN-002", null)
    println("Sensor 2: ${sensorFalha.temperaturaSegura}") // Saída: -99.0
}



/*EXPLICAÇÃO
val temperaturaSegura: Double: Note que aqui não tem ?. Isso garante que
 quem usar essa propriedade nunca receberá um nulo.


O get(): Em Kotlin, você pode criar propriedades que não armazenam
um valor físico, mas calculam algo toda vez que são chamadas.
É mais elegante que um mét0do getTemperatura().

O Operador Elvis (?:): Imagine que ele é uma bifurcação. Se o lado esquerdo for nulo, ele "escorrega" para o valor da direita. Se não for nulo, ele usa o valor original.
 */