package one.digitalinnovation.collections

fun main() {
    val func1 = Funcionario("Jonas",2500.0,"CLT")
    val func2 = Funcionario("Edward",3700.0, "PJ")
    val func3 = Funcionario("Michael",2950.0, "CLT")

    val funcionarios1 = setOf(func1,func3)
    val funcionarios2 = setOf(func2)

    val resultUnion = funcionarios1.union(funcionarios2)

    resultUnion.forEach { println(it) }

    //subtraction function changed, search for the new mde the use
    //intersection will scan two arrays and show wich item(s) they have in common


}


