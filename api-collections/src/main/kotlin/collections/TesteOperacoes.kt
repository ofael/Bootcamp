package collections

fun main(){
    val salarios = doubleArrayOf(1500.0,2000.0,3780.0)

    for ( salario in salarios){
        println(salario)
    }

    println("~~~~~~~~~~")
    //maior salario
    println("Mario salario: ${salarios.maxOrNull()}")
    //menor salario
    println("Menor salario: ${salarios.minOrNull()}")
    //media dos salarios
    println("Media dos salarios: ${salarios.average()}")

    //filtrando valores
    val salarioMaiorQue2500 = salarios.filter { it > 2500 }
    println("~~~~~~~~~~")
    salarioMaiorQue2500.forEach {
        println("Maior salario: $it")
    }
}