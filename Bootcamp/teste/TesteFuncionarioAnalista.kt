package digital.one.bank.teste

import digital.one.bank.Analista
import digital.one.bank.Funcionario
import digital.one.bank.Pessoas
import java.math.BigDecimal
import java.math.BigInteger

fun main(){

    val maria = Analista(nome = "Maria Luísa", cpf = "123.565.157.64", salario = 2000.0)
    val rafael = Analista(nome = "Rafael",cpf = "120.780.657.91", salario = 1500.0)
    ImprimeRelatorioFuncionario.imprimeRelatorio(maria)
    ImprimeRelatorioFuncionario.imprimeRelatorio(rafael)
}
