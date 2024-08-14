package alocação

fun main(){
// Alocação e Espaço de memória

    // Espaços de memória em tipos primitivos
    val byte: Byte = 8       // 8 bit
    val short: Short = 16   // 16 bit
    val int: Int = 32        // 32 bit
    val long: Long = 64      // 64 bit

    val float: Float = 1.400f // 32 bit
    val double: Double = 1.400 // 64 bit

    // De acordo com a vontade do usuário é possivel alterar  a quantidade de armazenamento que a maquina usara, evitando utilizar um espaço maior que o necessário
    println(byte::class)
}