import java.time.LocalDate

fun main(args: Array<String>) {
    val qi = PessoaJuridica(
        nomeFantasia = "QI Escolas e Faculdades",
        razaoSocial = "QI Escolas e Faculdades LTDA.",
        endereco = "Assis Brasil 3423 - Porto Alegre/RS",
        matricula = 13,
        cnpj = "98766690/0001",
        dataDeFundacao = LocalDate.now(),
        telefone = "(51) 3041-0001",
        email = "fl02@qi.edu.br"
    )

    println(qi.matricula)

    val paula = PessoaFisica(
        nomeCompleto = "Paula Fernanda Silva da Silva",
        cpf = "0000000",
        rg = "00000000",
        matricula = 14,
        dataDeNascimento = LocalDate.of(1999, 8, 16),
        email = "paula@gmail.com",
        telefone = "(51) 111111111",
        endereco = "Rua A n° 22 - Porto Alegre/RS"
    )

    println(paula.matricula)

    val mauricio = Funcionario(
        salario = 2000f,
        nomeCompleto = "Mauricio Silva da Silva",
        cpf = "000000",
        rg = "000000",
        dataDeNascimento = LocalDate.of(1987,12,3),
        telefone = "8888888",
        endereco = "Rua A n° 22",
        email = "mauricio.silva@gmail.com",
        matricula = 12,
        cargoHorariaDiaria = 8
    )
}