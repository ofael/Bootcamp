package digital.one.bank.teste

import digital.one.bank.Banco
import digital.one.bank.ClienteTipo
import digital.one.bank.Clientes

fun main(){
  val rafael = Clientes()
    val pf = ClienteTipo.Pf
     val bank = Banco(nome = "DigiOne",numero = 130219)

    println("Dados dos Clientes ${bank.infoBanco()}" +
            "${rafael.fullInfo()}" +
            "${pf.name} - ${pf.Tipo}")
}