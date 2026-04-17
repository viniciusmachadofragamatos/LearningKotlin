package teoria.Fundamentos

/*NULL SAFETY - O FIM DO NPE

Kotlin divide o sistema de tipos em dois:
os que pdoem ser nulos e os que nao podem
por padrão, nenhuma variável pode receber null,
para permitir, adicionamos ?

?(Nullable): String? significa " Pode ser uma string ou nulo ".

?.(Safe Call): Só executa se não for nulo. Retorna nulo se a variável for nula

?:(Elvis Operator): Fornece um valor padrão se a expressão à esquerda for nula

!!(Not-Null Assertion): Você diz ao compilador: "Eu garanto que não é nulo, Se
for nulo, lance um NullPointerException". Evite usar isso

Smart Cast: Se o kotlin percebe que você já checou se é nulo, ele converte
automaticamente para o tipo não-nulo
 */

/*
//Null safety é um dos pilares de Kotlin. O compilador garante em tempo de compilação que referências não-nullable nunca serão null — eliminando NullPointerException por design.
//Tipos nullable vs não-nullable


var nome: String  = "Ana"    // nunca pode ser null
var apelido: String? = null  // pode ser null

nome = null      // ERRO de compilação
apelido = null   // OK


//Safe call ?.
//Acessa membro somente se o objeto não for null. Retorna null se for:


val tamanho: Int? = apelido?.length   // null se apelido for null, Int se não for
// Encadeamento
val cidade: String? = usuario?.endereco?.cidade?.uppercase()
// Se qualquer parte for null, o resultado é null — sem NPE


//Elvis operator ?:
//Fornece um valor default quando a expressão à esquerda é null:


val tamanho: Int = apelido?.length ?: 0   // 0 se apelido for null
// Elvis com throw — idioma muito comum
val usuario = buscarUsuario(id) ?: throw NotFoundException("id=$id")

// Elvis com return antecipado
fun processar(dados: String?) {
    val d = dados ?: return   // sai da função se null
    // aqui d é String não-nullable garantidamente
}
//Not-null assertion !!
//Força o compilador a tratar o valor como não-null. Se for null em runtime, lança KotlinNullPointerException. Use com extrema parcimônia — é uma rendição ao compilador:


val tamanho = apelido!!.length   // NPE em runtime se apelido for null


//Smart Cast
//O compilador rastreia verificações de null e converte o tipo automaticamente após a checagem:


fun processar(s: String?) {
    if (s != null) {
        println(s.length)   // s é String aqui — Smart Cast automático
    }

    s?.let {
        println(it.length)  // it é String dentro do let
    }
}


// Smart Cast com is


fun descrever(obj: Any): String {
    return when (obj) {
        is String  -> "String de tamanho ${obj.length}"   // obj já é String aqui
        is Int     -> "Inteiro: ${obj * 2}"               // obj já é Int aqui
        is List<*> -> "Lista com ${obj.size} elementos"
        else       -> "Desconhecido"
    }
}


//Smart Cast não funciona com var mutável
//Se a variável pode ser modificada por outra thread entre a checagem e o uso, o compilador não aplica Smart Cast:


var s: String? = "texto"
if (s != null) {
    // s poderia ter sido setada para null por outra thread
    println(s.length)  // ERRO — Smart Cast não aplicado em var
}

// Solução: copiar para val local
val local = s
if (local != null) {
    println(local.length)  // OK — local é val, não pode mudar
}


 */

fun main() {
    var texto: String? = null

    //Safe call: imprime null em vez de quebrar
    println(texto?.length)

    //Elvis: se texto?.length for null, usa 0
    var tamanho = texto?.length ?: 0

    //Smart Cast
    if (texto != null){
        //aqui dentro, 'texto' é tratado como 'String' e não como 'String?'
        println(texto.length)
    }
}
