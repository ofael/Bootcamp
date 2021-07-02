package collections

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("~~~SOMA DO SALARIO~~~")
    println(salarios.somatoria())
    println("~~~MEDIA DO SALARIO~~~")
    println(salarios.media())
}