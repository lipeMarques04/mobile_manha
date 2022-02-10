import java.lang.Exception

fun main(args: Array<String>) {
//    val medico = Medico()
//
//    println(medico.crm)
//    println(medico.endereco!!.logradouro)

    try{
        println("Digite um número:")
        val numeroDoUsuario:Float = readLine()!!.toFloat()
        val dobro = numeroDoUsuario * 2f
        println(dobro)
    }catch (excecao:Exception){
        println("Digite um número válido seu abestado!!!")
    }

    println("Continuando...")
}