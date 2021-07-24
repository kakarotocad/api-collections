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

    println("----- Count function -----")
    println(String.format("Total of elements: %d", salary.count()))
    println(String.format("Salary(ies) in a range of $2000 and $5000: %d",salary.count { it in 2000.0..5000.0}))

    println("----- Find function -----")
    println(String.format("Has a salary equals to $7000.0? %f", salary.find { it == 7000.0 }))
    println(String.format("Has a salary equals to $4000.0? %.2f", salary.find { it == 4000.0 }))

    println("----- Any function -----")
    println(String.format("Has a salary equals to $4000.0? %b", salary.any { it == 4000.0 }))
    println(String.format("Has a salary equals to $7000.0? %b", salary.any { it == 7000.0 }))

    println("---- Filtering an array if Strings -----")
    val names = arrayOf("Black Panter", "Thor", "Iron Man", "Loki", "Black Widow")
    val namesFiltered = names.filter { it.contains("Black") }
    namesFiltered.forEach{ println(it)}
    println(names.any { it == "Loki"})
}