package one.digitalinnovation.collections

fun main() {

    val func1 = Funcionario("Jonas",2500.0,"CLT")
    val func2 = Funcionario("Edward",3700.0, "PJ")
    val func3 = Funcionario("Michael",2950.0, "CLT")

    println("---------- Mutable List --------------")

    val funcionarios = mutableListOf(func1,func2)
    funcionarios.forEach { println(it) }

    println("------------------------")
    funcionarios.add(func3)
    funcionarios.forEach { println(it) }

    println("------------------------")
    funcionarios.remove(func2)
    funcionarios.forEach { println(it) }

    println("----------- Mutable Set-------------")
    val funcionarioSet = mutableSetOf(func1)
    funcionarioSet.add(func2)
    funcionarioSet.add(func3)
    funcionarioSet.forEach { println(it) }

    println("--------------------------")

    funcionarioSet.remove(func2)
    funcionarioSet.forEach { println(it) }




}