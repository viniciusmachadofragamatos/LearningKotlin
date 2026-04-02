package Fundamentos.teoria

/*STRINGS TEMPLATES E MULTILINHA

Tempates de string permitem injetar variáveis e expressões
diretamente no texto usando $.

Strings multilinha usam três aspas """.
=================================================================
Templates


val nome = "Kotlin"
val versao = 1.9

println("Olá, $nome!")                   // variável simples
println("Versão: ${versao.toInt()}")     // expressão entre chaves
println("2 + 2 = ${2 + 2}")             // expressão arbitrária

// Escape do $
println("Preço: \$${preco}")            // Preço: $29.90
println("Preço: ${'$'}${preco}")        // alternativa com Char template


Strings multilinhas com """


val sql = """
    SELECT *
    FROM usuarios
    WHERE ativo = true
""".trimIndent()   // remove indentação comum a todas as linhas

// trimMargin — usa um caractere de margem explícito
val html = """
    |<html>
    |  <body>
    |    <p>$nome</p>
    |  </body>
    |</html>
""".trimMargin()   // remove tudo até (e inclusive) o | em cada linha


trimIndent vs trimMargin
trimIndent detecta a indentação mínima presente nas linhas não-vazias e a remove de todas:


val a = """
    linha 1
    linha 2
        linha 3 (indentação extra mantida)
""".trimIndent()
// "linha 1\nlinha 2\n    linha 3 (indentação extra mantida)"


trimMargin usa um delimitador explícito (padrão |) — mais preciso, não depende da indentação do código:


val b = """
    |linha 1
    |linha 2
    |    linha 3
""".trimMargin()
// "linha 1\nlinha 2\n    linha 3"


Strings são imutáveis e internadas:


val s1 = "hello"
val s2 = "hello"
println(s1 === s2)   // true — mesma referência (string interning)

val s3 = String(charArrayOf('h','e','l','l','o'))
println(s1 === s3)   // false — objeto diferente
println(s1 == s3)    // true — conteúdo igual (equals estrutural)
 */
fun main() {
    val usuario = "Admin"
    println("Bem vindo, $usuario! Seu nome tem ${usuario.length} letras")

    //multilinha (ótimo para SQL, JSON ou textos longos)
    val query = """
        SELECT *
        FROM usuarios
        WHERE ativo = true
    """.trimIndent() // remove os espaços em branco da esquerda
}