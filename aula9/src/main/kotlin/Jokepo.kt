import kotlin.random.Random

class Jokepo {
    private var numeroSorteado: Int? = null

    private fun sortearNumero() {
        numeroSorteado = Random.nextInt(1, 3)
    }

    fun jogar(jogada: Int): String {
        sortearNumero()

        /*
        1 - pedra
        2 - papel
        3 - tesoura
         */
        if (jogada == 1 && numeroSorteado == 3 || jogada == 3 && numeroSorteado == 2 || jogada == 2 && numeroSorteado == 1){
            return "O jogador ganhou!!!"
        }
        return "O computador ganhou!!!"
    }
}