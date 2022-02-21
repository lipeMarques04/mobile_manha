fun main(args: Array<String>) {
//    val rodada = Rodada()
//    println("Digite um número de 0 até 10")
//    val palpite = readLine()!!.toInt()
//
//    rodada.sortearNumero()
//
//    println(rodada.verificarGanhador(palpite))

    val jokepo = Jokepo()
    println("Escolha uma opção:\n1-Pedra\n2- Papel\n3-Tesoura")
    val jogada = readLine()!!.toInt()

    println(jokepo.jogar(jogada))
}

fun atividade1():Unit{
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toFloat()
    println("Digite o segundo número:")
    val num2 = readLine()!!.toFloat()

    // Se for verdade
    if(num1 > num2){
        println("O número $num1 é maior que o número $num2")
    // Se NÃO for verdade
    }else{
        println("O número $num2 é maior que o número $num1")
    }
}

fun atividade2():Unit{
    println("Digite um número qualquer:")
    val num = readLine()!!.toFloat()

    if(num>1){
        println("O número $num é positivo!!!")
    }else{
        println("O número $num é negativo!!!")
    }
}

fun atividade3():Unit{
    println("Digite uma letra:")
    val letra = readLine()

    if(letra != null){
        if(
            letra.equals("a",true) || letra.equals("e",true) || letra.equals("i",true) || letra.equals("o",true) || letra.equals("u",true)
        ){
           println("A letra $letra é uma vogal")
        }else{
            println("A letra $letra é uma consoante")
        }
    }
}