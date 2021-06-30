package digital.one.bank.teste

import digital.one.bank.Funcionario
import digital.one.bank.Gerente

fun main(){
    val joao = Gerente(nome = "Joao Silva",cpf = "123.459.157-63", salario = 5000.0, senha = "123mudar")
    val maria = Gerente(nome = "Maria do Carmo", cpf = "120.565.157-61", salario = 3500.0, senha = "maria123")
    ImprimeRelatorioFuncionario.imprimeRelatorio((joao))

    TesteAutenticacao().autentica(joao)
    TesteAutenticacao().autentica(maria)
}