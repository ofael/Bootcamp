package collections

fun main(){
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "Leo"

    nomes.forEach {
        println(it)
    }
    println("~~~~~~~~~~")
    nomes.sort()
    for (nome in nomes){
        println(nome)
    }
    println("~~~~~~~~~~")
    val otherNames = arrayOf("Rafael","Maria","Ghessica")

    otherNames.forEach {
        println(it)
    }
    println("~~~~~~~~~~")
    otherNames.sort()
    for(name in otherNames){
        println(name)
    }
}