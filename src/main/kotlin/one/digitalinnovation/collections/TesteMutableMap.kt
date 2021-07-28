package one.digitalinnovation.collections

fun main() {

    val func1 = Funcionario("Jonas",2500.0,"CLT")
    val func2 = Funcionario("Edward",3700.0, "PJ")
    val func3 = Funcionario("Michael",2950.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(func1.name, func1)
    repositorio.create(func2.name, func2)
    repositorio.create(func3.name, func3)

    println(repositorio.findById(func1.name))
    println("-------------------")
    println(repositorio.findAll().forEach { println(it) })
    println("-------------------")
    repositorio.remove(func1.name)
    println(repositorio.findAll().forEach { println(it) })


}