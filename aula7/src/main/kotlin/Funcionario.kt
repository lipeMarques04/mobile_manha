import java.time.LocalDate

class Funcionario(
    var salario:Float,
    var cargoHorariaDiaria:Byte,
    // Infos da classe mãe
    matricula:Short,
    endereco:String,
    telefone:String,
    email: String,
    cpf:String,
    rg:String,
    nomeCompleto:String,
    dataDeNascimento:LocalDate
):PessoaFisica(
    matricula = matricula,
    nomeCompleto = nomeCompleto,
    cpf = cpf,
    rg = rg,
    email = email,
    endereco = endereco,
    dataDeNascimento = dataDeNascimento,
    telefone = telefone
) {
    override fun toString(): String {
        return "Funcionario(salario=$salario, cargoHorariaDiaria=$cargoHorariaDiaria)"
    }
}