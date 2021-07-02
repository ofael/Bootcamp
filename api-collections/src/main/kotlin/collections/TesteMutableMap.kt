package collections

fun main(){
    val rafael = Funcionarios("Rafael", 1500.0, "CLT")
    val ghessica = Funcionarios("Ghessica",2500.0, "PJ")
    val maria = Funcionarios("Maria",8000.0,"CLT")

    //criando lista mutaveis(podem ser modificadas)
    val funcionario = mutableListOf(rafael, ghessica)
    funcionario.forEach {
        println(it)
    }

    println("~~~~~MUTABLE LIST~~~~~")

    //adicionando funcionario a lista mutavel
    funcionario.add(maria)
    funcionario.forEach {
        println(it)
    }

    println("~~~~~~~~~~")

    //removendo funcionario da lista mutavel
    funcionario.remove(rafael)
    funcionario.forEach {
        println(it)
    }

    println("~~~~MUTABLE SET~~~~~~")

    val funcionarioSet = mutableSetOf(maria)
    //funcionarioSet.forEach { println(it) }
    //adicionando os funcionarios
    println("~~~~ADICIONANDO FUNC~~~~~~")
    funcionarioSet.add(rafael)
    funcionarioSet.add(ghessica)
    funcionarioSet.forEach {
        println(it)
    }
    println("~~~~REMOVENDO FUNC~~~~~~")
    funcionarioSet.remove(rafael)
    funcionarioSet.forEach {
        println(it)
    }
}
