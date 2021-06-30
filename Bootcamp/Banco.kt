package digital.one.bank

data class Banco(
    val nome: String,
    val numero: Int,
){
    fun infoBanco() = "Banco: $nome Numero: $numero "
}
