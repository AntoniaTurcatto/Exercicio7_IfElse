import java.util.Scanner

fun main() {

    val entrada = Scanner(System.`in`)
/*
    1 - Faça um programa que receba duas notas de um aluno e calcule a média. Se a média
for maior ou igual a 7, exiba "Aprovado". Caso contrário, exiba "Reprovado". Use if/else.
*/

    println("Informe a nota 1 do aluno: ")
    val nota1 : Float = entrada.nextFloat()
   // println("Valor informado: $nota1")
    println("Informe a nota 2 do aluno: ")
    val nota2 : Float = entrada.nextFloat()
  //  println("Valor informado: $nota2")
    val media = (nota1+nota2)/2
    if (media>=7){
        println("Aprovado!")
    } else {
        println("Reprovado!")
    }

/*
    2 - Faça um programa que receba um número inteiro e verifique se ele é par ou ímpar
usando if/else.
*/

    println("Informe um número: ")
    val numeroImparPar=entrada.nextInt()
    //println("numero informado: $numeroImparPar") //teste
    if(numeroImparPar%2==0){
        println("$numeroImparPar é par!")
    } else {
        println("$numeroImparPar é ímpar!")
    }

/*
    3 - Faça um programa que receba um número inteiro e verifique se ele é positivo, negativo
ou zero usando if/else.
*/

    println("Informe um numero: ")
    val numeroSinal : Int=entrada.nextInt()
    //println("Número informado: $numeroSinal") //teste
    if (numeroSinal>0){
        println("O número é positivo!")
    } else if (numeroSinal<0) {
        println("O número é negativo")
    } else {
        println("O numero informado é igual a 0")
    }

/*
    4 - Faça um programa que verifique se uma pessoa é maior de idade (18 anos ou mais)
usando if/else.
*/

    println("Informe a sua idade: ")
    val idade:Int=entrada.nextInt()
    println("Idade informada: $idade") //teste
    if (idade<18){
        println("Você é menor de idade.")
    } else {
        println("Você é maior de idade.")
    }
}