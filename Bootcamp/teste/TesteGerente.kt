package digital.one.bank.teste

import digital.one.bank.Funcionario
import digital.one.bank.Gerente

fun main(){
    val joao = Gerente(nome = "Joao Silva",cpf = "123.459.157-63", salario = 5000.0)
    ImprimeRelatorioFuncionario.imprimeRelatorio((joao))
}