package digital.one.bank.teste

import digital.one.bank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.Tipo}")

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.Tipo}")
    }
    }

    val pf = ClienteTipo.Pf
    println("${pf.name} - ${pf.Tipo}")

    val pj = ClienteTipo.Pj
    println("${pj.name} - ${pj.Tipo}")
}