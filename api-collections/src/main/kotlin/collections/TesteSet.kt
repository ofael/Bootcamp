package collections

fun main(){
    val maria = Funcionarios("Maria",1500.0,tipoContratacao = "CLT")
    val leo = Funcionarios("Leo",2500.0,"CLT")
    val ric = Funcionarios("Ricardo",5000.0,"PJ")

    //gerando 2 grupos de objetos
    val funcionario1 = setOf(maria,leo)
    val funcionario2 = setOf(ric)
    //unindo os dois grupos para imprimir os valores contidos nos dois
    val resultUnion = funcionario1.union(funcionario2)

    resultUnion.forEach{
        println(it)

        println("~~~~~~~~~~")
        //criando mais um grupo para subtração
        val funcionarios3 = setOf(maria,leo,ric)
        val resultSub = funcionarios3.subtract(funcionario2)

        resultSub.forEach {
            println(it)
        }
        println("~~~~~~~~~~")
        //imprimindo valores em comum entre os dois grupos
        val resultInt = funcionario2.intersect(funcionarios3)
        resultInt.forEach {
            println(it)
        }
    }
}