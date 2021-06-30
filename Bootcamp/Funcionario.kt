package digital.one.bank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
                  ) : Pessoas(nome, cpf) {
    protected abstract fun calculoAxulio(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: $salario
        Auxilio: ${calculoAxulio()}
        
    """.trimIndent()

}