package one.digitalinnovation.collections

data class Funcionario(
    val name:String,
    val salary: Double,
    val contractType: String
){
    override fun toString(): String =
        """
            Nome:       $name
            Salario:    $salary
        """.trimIndent()
}