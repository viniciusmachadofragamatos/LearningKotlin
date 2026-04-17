package teoria.Fundamentos

/* DATA CLASSES
quando o único propósito de uma classe é armazenar dados
use data class. O compilador gera automaticamente metodos
úteis:
equal()
hashCode()
toString()

função copy() para clonar objetos mudando alguns valores,
e funções para destructuring.

 */

fun main() {
    data class Dispositivo(val id: String, val ativo: Boolean)

    fun testarDataClass() {
        val d1 = Dispositivo("sensor_01", true)

        // copy(): cria um novo objeto alterando apenas o necessário
        val d2 = d1.copy(ativo = false)

        // Destructuring: extraindo as propriedades direto para variáveis
        val (codigo, status) = d1
        println("ID: $codigo, Ativo: $status")
    }
}
/*
data class é uma classe cujo propósito principal é carregar dados. O compilador gera automaticamente: equals, hashCode, toString, copy e funções componentN para destructuring.


data class Ponto(val x: Double, val y: Double)

val p1 = Ponto(1.0, 2.0)
val p2 = Ponto(1.0, 2.0)

println(p1 == p2)          // true — equals por estrutura, não referência
println(p1 === p2)         // false — objetos diferentes
println(p1)                // Ponto(x=1.0, y=2.0) — toString automático
println(p1.hashCode() == p2.hashCode())  // true


copy — imutabilidade com modificação parcial


data class Usuario(
    val nome: String,
    val email: String,
    val ativo: Boolean = true,
    val nivel: Int = 1
)

val u1 = Usuario("Ana", "ana@email.com")
val u2 = u1.copy(email = "novo@email.com")       // só muda o email
val u3 = u1.copy(ativo = false, nivel = 5)        // muda dois campos
// u1 permanece inalterado — imutabilidade preservada


Destructuring — componentN
O compilador gera component1(), component2() etc. para cada propriedade declarada no construtor primário:


val (x, y) = Ponto(3.0, 4.0)   // x=3.0, y=4.0

// Em loops
val pontos = listOf(Ponto(1.0,2.0), Ponto(3.0,4.0))
for ((px, py) in pontos) {
    println("x=$px, y=$py")
}

// Em funções que retornam par de valores
data class Resultado(val valor: Int, val erro: String?)
fun calcular(): Resultado = Resultado(42, null)

val (valor, erro) = calcular()
Regras e limitações das data class
// DEVE ter pelo menos um parâmetro no construtor primário
// data class Vazia  // ERRO

// Parâmetros do construtor primário devem ser val ou var
// data class Errada(nome: String)  // ERRO

// data class são open? NÃO — são final por padrão
// Não podem ser abstract, open, sealed, inner

// Propriedades FORA do construtor primário NÃO entram em equals/hashCode/toString/copy
data class Produto(val id: Int, val nome: String) {
    var desconto: Double = 0.0   // ignorada pelo equals/hashCode!
}

val a = Produto(1, "Caneta")
val b = Produto(1, "Caneta")
a.desconto = 0.5
b.desconto = 0.9
println(a == b)   // TRUE — desconto ignorado!
```

### Comparação: `data class` vs classe normal

|                 | Classe normal         |           `data class`            |
|-----------------|-----------------------|-----------------------------------|
| `equals`        | referência (`===`)    | estrutural (por propriedades)     |
| `hashCode`      | baseado em referência | baseado em propriedades           |
| `toString`      | `Classe@hashcode`     | `Classe(prop=val, ...)`           |
| `copy`          | não existe            | gerado automaticamente            |
| `componentN`    | não existe            | gerado para o construtor primário |
| Herança         | ✅                     | ❌ (final)                         |

---

## Visão sistêmica — como os fundamentos se conectam
```
val/var + tipos          → base de todo estado
    ↓
null safety (?/!!/?./?: ) → elimina NPE em tempo de compilação
    ↓
funções (Unit/Nothing)   → modelagem de comportamentos e falhas
    ↓
if/when como expressões  → código declarativo, sem efeitos colaterais
    ↓
String templates          → composição de texto com tipo seguro
    ↓
classes + construtores    → encapsulamento de dados
    ↓
data class               → valor semântico (equals por estrutura)
    ↓
object/companion         → estado global controlado e fábricas


 */