import java.util.*

fun main(){
    // Variável
    var nome:String = "Anderson"
    var idade:Byte = 30
    var teste = 14

    nome = "Marco"
    idade = 20
    teste = 34

    // Constante
    val nomeCompleto = "Anderson Choren"
//    nomeCompleto = "Anderson Coimbra Choren"

    val bob:Compositor = Compositor()
    println("Qual o nome do compositor?")
//    bob.nome = readLine()
    println("Qual a idade do compositor?")
//    bob.idade = readLine()!!.toByte()
//    print(bob.toString())
    println("O ${bob.nome} tem ${bob.idade} anos")

    print(bob.nome?.uppercase())
}