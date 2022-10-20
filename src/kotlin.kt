fun  suma(a:Int,b:Int){
    println("La suma de $a mas $b es ${a+b}")
    println("La suma de " + a +" mas "+ b +" es " + (a+b))
}

/*fun max (a:Int,b:Int):Int{
    return if (a > b)
        a
    else
        b
}*/

//funcion inline
fun max(a:Int,b:Int)= if (a >b ) a else b

fun main(args: Array<String>){
    println(max(4,6))
    println(suma(5,15))

}

