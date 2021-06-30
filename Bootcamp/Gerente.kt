package digital.one.bank

class Gerente(nome: String,
              cpf: String,
              salario: Double,
              val senha:String
                ) : Funcionario(nome = nome, cpf = cpf, salario = salario), LoginOn {

    override fun calculoAxulio(): Double = salario * 0.4

    override fun login(): Boolean = senha == "123mudar"


}