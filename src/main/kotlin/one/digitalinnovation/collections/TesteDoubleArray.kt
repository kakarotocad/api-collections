package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1800.0
    salarios[1] = 5000.0
    salarios[2] = 800.0

    salarios.forEach { println(it) }
    println("-------Ordered------")
    salarios.sort()
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
        println(String.format("%.2f",salarios[index]))
    }
    println("------ Salarios2/doubleArryaOf -------")
    val salarios2 = doubleArrayOf(1500.0,900.0,4800.0)
    salarios2.sort()
    salarios2.forEachIndexed { index, actual ->
        salarios2[index] = actual * 1.5
        println(String.format("%.2f",salarios2[index]))
    }

}