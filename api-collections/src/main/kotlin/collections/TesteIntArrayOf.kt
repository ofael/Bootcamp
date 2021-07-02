package collections

fun main(){
    //criando array sem iniciar com um valor fixo
    val values = intArrayOf(30 , 15 ,10 , 12 , 20)

    values.forEach {
        println(it)
    }
println("~~~~~~~~~~~~~~~")
    values.sort()
    for (valor in values){
        println(valor)
    }
}