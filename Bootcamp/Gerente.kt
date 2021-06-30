package digital.one.bank

class Gerente(nome: String,
              cpf: String,
              salario: Double
                ) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun calculoAxulio(): Double = salario * 0.4
}