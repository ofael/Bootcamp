package digital.one.bank

class Clientes {
    var name:String = "Rafael"
    var cpf:String = "120.780.657-91"
    private set
}

fun main(){
    val rafael = Clientes()
    println(rafael.name)
    println(rafael.cpf)
}