package collections

fun main(){
    //declarando variavel values em um array de int - (capacidade do array)
    val values = IntArray(5)

    //iniciando array de 5 pos.
    values[0] = 1
    values[1] = 3
    values[2] = 6
    values[3] = 9
    values[4] = 2

    //passando pelos valores com for
    for (valor in values){
        println (valor)
    }
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    //passando pelos valores com forEach
    values.forEach {
        println(it)
    }
    //passando pelos valores por index
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    for(index in values.indices){
        println(values[1])
    }
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

    //ordenando os valores com sort
    values.sort()
    for (valor in values){
        println(valor)
    }
}
