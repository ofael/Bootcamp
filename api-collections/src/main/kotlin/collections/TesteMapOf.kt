package collections

fun main(){
    //atribuindo dois 'valores' a uma variavel
    val rafael : Pair<String,Double> = Pair("Rafael", 1500.0)
    val ghe:Pair<Double,Int> = Pair(50.0,10)
    val map1 = mapOf(rafael, ghe)

    map1.forEach { c, v -> println("Chave: $c  Valor: $v")}

    //outro metodo de criar mapOf
    val map2 = mapOf(
        "Pedro" to 1300.0,
        "João" to 2500.0
    )

    map2.forEach{(n,s) -> println("Nome: $n Salario: $s")}
}