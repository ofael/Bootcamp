package digital.one.bank

class Caixa(nome:String,
            cpf:String,
            salario:Double,
            val senha:String) : Funcionario(nome, cpf, salario) , LoginOn {
    override fun calculoAxulio(): Double = salario * 0.1
    override fun login(): Boolean = "caixa123" == senha
}