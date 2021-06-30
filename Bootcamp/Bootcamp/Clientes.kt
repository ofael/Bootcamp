package digital.one.bank

class Clientes {
    var name:String = "Rafael"
    var lastName:String = "Fontes"
    var cpf:String = "120.780.657-91"
    private set

    constructor()

    fun fullInfo() = "Nome: $name $lastName Cpf: $cpf"
}

fun main(){
    val rafael = Clientes()
    println(rafael.fullInfo())
}