package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "Andre"

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("--------NOMES2/ arrayof --------")
    val nomes2 = arrayOf("Tadeu", "Manoel", "Bruna")
    nomes2.sort()
    nomes2.forEach { println(it) }
}