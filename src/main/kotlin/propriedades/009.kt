package propriedades
fun main() {
//propriedades

    //Quantidade de caracteres
    val nome: String = "Ezequiel"
    val quantidade = nome.length //Essa propriedade mostra a quantidade de caracteres que tem em uma palavra

    println(quantidade)

    //maiúscula
    val nomeDois: String = "Silva"
    val maiuscula = nomeDois.uppercase() //converte as palavras  em maiúsculas

    println(maiuscula)

    //minúscula
    val nomeTres: String = "LIMA"
    val minuscula = nomeTres.lowercase() //converte as palavras  em minúsculas

    println(minuscula)
}