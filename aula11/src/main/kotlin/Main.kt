fun main(args: Array<String>) {
    val campeonato = Campeonato(2022)

    // Cadastrar um novo time
    campeonato.cadastrarTime(
        Time(
            nome = "Grêmio",
            estadoDeOrigem = "RS",
            divisao = Divisao.B,
            anoDeCriacao = 1903
        )
    )
    campeonato.cadastrarTime(
        Time(
            nome = "Internacional",
            estadoDeOrigem = "RS",
            anoDeCriacao = 1909,
            divisao = Divisao.A
        )
    )

    // Listar
    val times = campeonato.listarTodosOsTimes()
    val limite = times.size-1

    for (indice in 0..limite){
        println("Nome: ${times[indice].nome}\nDivisão: ${times[indice].divisao}")
    }

//    for(cont in 1..10 step 3){
//        println(cont)
//    }
}