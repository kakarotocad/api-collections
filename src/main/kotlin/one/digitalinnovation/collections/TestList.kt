package one.digitalinnovation.collections

fun main() {
    val func1 = Funcionario("Jonas",2500.0,"CLT")
    val func2 = Funcionario("Edward",3700.0, "PJ")
    val func3 = Funcionario("Michael",2950.0, "CLT")

    val employees = listOf(func1,func2,func3)

    employees.forEach { println(it) }
    println("-------------------")
    println(employees.find { it.name == "Jonas" })

    println("-------------------")
    employees
        .sortedBy{ it.salary }
        .forEach { println(it) }

    println("-------------------")
    employees
        .groupBy{ it.contractType }
        .forEach { println(it) }

}

