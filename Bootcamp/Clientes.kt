package digital.one.bank

class Clientes(
    nome:String,
    cpf:String,
    val clienteTipo: String,
    val senha:String
) : Pessoas(nome ,cpf ), LoginOn {
    override fun login(): Boolean = "123mudarofael" == senha

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Tipo conta: $clienteTipo        
    """.trimIndent()
}
