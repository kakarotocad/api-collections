package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("---------------------------------")

    for(valor in values){
        println("Valor: ${valor}")
    }

    println("---------------------------------")

    values.forEach {
        println("Valor: ${it}")
    }

    println("---------------------------------")
    //Neste exemplo estamos iterando os indices, neste caso temos que apontar o array e a variavel
    // index representa qual indice deste array esta sendo iterado
    for (index in values.indices){
        println(values[index])
    }
    println("---------------------------------")
    values.sort()
    values.forEach {
        println("Valor: ${it}")
    }

}