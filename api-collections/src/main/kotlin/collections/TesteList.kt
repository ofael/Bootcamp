package collections

fun main(){
    //criando objetos
    val rafael = Funcionarios(nome = "Rafael", salario = 3500.0, "CLT")
    val maria = Funcionarios(nome = "Maria", salario = 1500.0,"PJ")
    val ghessica = Funcionarios(nome = "Ghessica", salario = 4500.0,"CLT")

    //criando lista de funcionarios
    val funcionarios = listOf(rafael,maria,ghessica)
    //percorrendo a lista de funcionarios e imprimindo valor
    funcionarios.forEach {
        println(it)
    }
    println("~~~~~~~~~~")
    //procurando funcionario com nome especifico
    println(funcionarios.find { it.nome == "Maria" })
    println("~~~~~~~~~~")
    //ordenando funcionarios pelo salario
         funcionarios
        .sortedBy { it.salario }
        .forEach{println(it)}
    println("~~~~~~~~~~")
    //ordenando funcionarios pelo tipo de contratação
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach {  println(it) }
    
}

data class Funcionarios(
  val nome:String,
  val salario:Double,
  val tipoContratacao:String
){
    override fun toString():String = """
        Nome: $nome
        Salario: $salario
        
""".trimIndent()
}

