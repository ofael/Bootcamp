package collections

fun main(){
    val rafael = Funcionarios("Rafael", 1500.0, "CLT")
    val ghessica = Funcionarios("Ghessica",2500.0, "PJ")
    val maria = Funcionarios("Maria",8000.0,"CLT")

    val repositorio = Repositorio<Funcionarios>()
    repositorio.create(rafael.nome,rafael)
    repositorio.create(maria.nome,maria)
    repositorio.create(ghessica.nome,ghessica)

    println(repositorio.findById(rafael.nome))
}