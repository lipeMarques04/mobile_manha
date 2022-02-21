import kotlin.random.Random

class Rodada {
    private var numeroSorteado:Int? = null

    fun sortearNumero(){
        numeroSorteado = Random.nextInt(0,10)
    }

    fun verificarGanhador(palpite:Int):String = if(palpite == numeroSorteado) "Jogador ganhou" else "Computador ganhou com o número $numeroSorteado"
}