import java.time.LocalDate

class PessoaJuridica(
    var cnpj: String,
    var dataDeFundacao:LocalDate,
    var razaoSocial:String,
    var nomeFantasia: String,
    // Propriedades da classe mãe
    matricula:Short,
    email: String,
    endereco: String,
    telefone:String
) : Pessoa(
    matricula,
    endereco,
    telefone,
    email
)