package digital.one.bank

class Analista(nome:String,
               cpf:String,
               salario:Double
) : Funcionario(nome ,cpf ,salario ) {
    override fun calculoAxulio()  = salario  * 0.1

}