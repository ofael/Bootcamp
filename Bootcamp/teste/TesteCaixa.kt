package digital.one.bank.teste

import digital.one.bank.Caixa
import digital.one.bank.Funcionario

fun main(){
    val Fatima = Caixa(
        nome = "Fatima",
        cpf = "123.456.789-96",
        salario = 1350.0,
        senha = "caixa123"
    )

    println(Fatima)
    TesteAutenticacao().autentica(Fatima)
}