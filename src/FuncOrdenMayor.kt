fun suma (n1: Int, n2: Int, func: () -> Unit): Unit{
    println("La suma de $n1 y $n2: es ${n1+n2}")
    func()
}

/*Las funciones de orden mayor pueden extender*/
fun String.funcion(func: () -> Unit){
    func()
    println("Tu String tiene ${this.length} caracteres")
}

fun String.fun2 (func: (String) -> Unit){
    func(this)
    println(this.length)
}

fun String.fun3 (func: String.()-> Unit){
    this.func()
    println(this.length)
}


fun main(args: Array<String>){
    //si el ultimo parametro de la funcion es otra funcion puede no declararse
    suma(10,4){
        /*estos brakets hacen referencia a la funcion declarada como parametro
        y se va a ejecutar despues del prinline de la suma*/
        println("Asi funciona una funcion de orden mayor.")
        /*Podemos hacer todas las operaciones que querramos dentro de los brakets*/
    }

    "Soy de orden Mayor".funcion {
        println("Kotlin la esta rompiendo")
    }
    "Otra funcion".fun2{ println(it)}
    "Una mas".fun3{println(length-1)}
    //esta ultima es similiar al with de kotlin
    with("MiString"){
        println(length)
        //mostrar como llegar a la declararacion de esta funcion ctrl+b
    }

}