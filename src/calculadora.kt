fun main(args: Array<String>) {

    println("Digite o primeiro número: ")
    val x = readLine()!!.toInt()
    println("Digite o segundo valor: ")
    val y = readLine()!!.toInt()

    val rsoma = soma(x,y)
    println("O resultado da soma é: $rsoma.")

    val rmultiplica = multiplica(x,y)
    println("O resultado da multiplicação é: $rmultiplica.")

    val rdividir = dividir(x,y)
    println("O resultado da divisão é: $rdividir.")

    val rsubtrair = subtrair(x,y)
    println("O resultado da subtração é: $rsubtrair.")

}
// Formas de codar Funções
//Método Soma
fun soma(x: Int, y:Int):Int{
    return x+y
}

//Método multiplicação de dois números
fun multiplica(x:Int, y: Int) = x*y

fun dividir(x:Int, y:Int) = x/y

fun subtrair(x:Int, y:Int) = x-y