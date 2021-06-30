package digital.one.bank

import java.math.BigDecimal

class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal
                  ) : Pessoas(nome, cpf) {

}