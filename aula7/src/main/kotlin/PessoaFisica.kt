import java.time.LocalDate

class PessoaFisica(
    var nomeCompleto: String,
    var cpf: String,
    var dataDeNascimento: LocalDate,
    var rg: String,
    // Atributos da classe mãe
    matricula: Short,
    email: String,
    telefone: String,
    endereco: String
) : Pessoa(
    email = email,
    telefone = telefone,
    endereco = endereco,
    matricula = matricula,
)