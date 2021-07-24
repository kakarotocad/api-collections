package one.digitalinnovation.collections

fun main() {
    val salary = doubleArrayOf(1000.0,2250.0,4000.0,1800.0,2800.0,1150.0)
    println("----Initial Values-----")
    salary.forEach { println(it) }
    println(String.format("Maior salario: %.2f", salary.maxOrNull()))
    println(String.format("Menor salario: %.2f", salary.minOrNull()))
    println(String.format("Media salarial: %.2f", salary.average()))

    val salariesGrater2500 = salary.filter { it > 2500.0 }
    println("-----Filter for Salaries Grater than 2500 -----")
    salariesGrater2500.forEach { (println(it)) }


    println("---- Filtering an array if Strings -----")
    val names = arrayOf("Black Panter", "Thor", "Iron Man", "Loki", "Black Widow")
    val namesFiltered = names.filter { it.contains("Black") }
    namesFiltered.forEach{ println(it)}
}