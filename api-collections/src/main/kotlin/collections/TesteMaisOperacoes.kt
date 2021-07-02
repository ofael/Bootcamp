package collections

fun main(){
    //criando um array e procurando quantidade de valores em uma faixa range
    val salarios = doubleArrayOf(1350.0,2340.0,5670.0)

    println(salarios.count{it in 2000.0..5000.0})
    println("~~~~~~~~~~")

    //procurando valor especifico no Array, caso não encontre retorna 'null'
    println(salarios.find { it == 2340.0 })
    println("~~~~~~~~~~")

    //procurar qualquer um valor , retorna false ou true
    println(salarios.any { it == 2000.0 })

}