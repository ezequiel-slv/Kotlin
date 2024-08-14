package tipo

fun main(){
    val store = "Amazon" // Tipo inferido (O tipo da variavel está oculta, não foi especificada)
    val product: String = "Smartphone" // Tipo explicito (O tipo foi especificado no código)
    val price: Double = 4.500
    val year: Int = 2024

    println(store::class)
    println(product::class)
    println(price::class)
    println(year::class)
}