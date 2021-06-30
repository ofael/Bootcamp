package digital.one.bank.teste

import digital.one.bank.Funcionario
import digital.one.bank.Pessoas
import java.math.BigDecimal
import java.math.BigInteger

fun main(){
    val rafael = Pessoas(nome = "Rafael" , cpf = "120.780.657-91")
    println(rafael.nome)
    println(rafael.cpf)
    println("")
    val maria = Funcionario(nome = "Maria Luísa", cpf = "123.565.157.64", BigDecimal.valueOf(2000.0))
    println(maria.nome)
    println(maria.cpf)
    println(maria.salario)
}