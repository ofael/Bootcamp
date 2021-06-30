package digital.one.bank.teste

import digital.one.bank.ClienteTipo
import digital.one.bank.Clientes

fun main(){
    val leandro = Clientes(
        nome = "Leandro Reis",
        cpf = "120.780.555-90",
        clienteTipo = ClienteTipo.Pf.Tipo,
        senha = "123mudarofael"
    )

    println(leandro)
    TesteAutenticacao().autentica(leandro)
}
