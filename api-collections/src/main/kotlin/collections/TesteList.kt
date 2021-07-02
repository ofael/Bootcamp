package collections

fun main(){
    val rafael = Funcionarios(nome = "Rafael", salario = 1500.0)
    val maria = Funcionarios(nome = "Maria", salario = 3500.0)
    val ghessica = Funcionarios(nome = "Ghessica", salario = 4500.0)

    val funcionarios = listOf(rafael,maria,ghessica)

    funcionarios.forEach {
        println(it)
    }
    println("~~~~~~~~~~")

    println(funcionarios.find { it.nome == "Maria" })
}

data class Funcionarios(
  val nome:String,
  val salario:Double
){
    override fun toString():String = """
        Nome: $nome
        Salario: $salario
        
""".trimIndent()
}

