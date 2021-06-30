package digital.one.bank.teste

import digital.one.bank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprimeRelatorio(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}