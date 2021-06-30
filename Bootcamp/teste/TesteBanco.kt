package digital.one.bank.teste

import digital.one.bank.Banco

fun main(){
    val digiOneBank = Banco(nome = "DigiOne",numero = 12)
    println(digiOneBank.infoBanco())

    //mudando dataClass Banco
    val Banco2 = digiOneBank.copy(nome = "DigiTwo" , numero = 13)
    println(Banco2.infoBanco())
}