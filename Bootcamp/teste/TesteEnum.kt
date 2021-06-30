package digital.one.bank.teste

import digital.one.bank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - $elemento.")

    ClienteTipo.values().forEach {
        println("${it.name} - $it")
    }
    }
}