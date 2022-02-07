fun main() {
    val minhaCalc = Calculadora()

    println("Digite o primeiro número:")
    val num1:Float = readLine()!!.toFloat()
    println("Digite o segundo número:")
    val num2:Float = readLine()!!.toFloat()

    val soma = minhaCalc.somar(num1,num2)
    val subtracao = minhaCalc.subtrair(num1,num2)
    val multiplicao = minhaCalc.multiplicar(num1,num2)
    val divisao = minhaCalc.dividir(num1,num2)
    val potencia = minhaCalc.potencia(num1.toDouble(),num2.toDouble())
    val raizQuad = minhaCalc.raizQuadrada(num1.toDouble())
    val restoDaDivisao = minhaCalc.restoDaDivisao(num1,num2)

    println("O resultado da soma é $soma")
    println("O resultado da subtração é $subtracao")
    println("O resultado da multiplicação é $multiplicao")
    println("O resultado da divisão é $divisao")
    println("O resultado da potência é $potencia")
    println("O resultado da raiz quadrada de $num1 é $raizQuad")
    println("O resto da divisão é $restoDaDivisao")
}