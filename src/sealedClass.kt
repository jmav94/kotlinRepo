/*sealed class Intent {
  class Refresh : Intent()
  class RefreshPlus: Intent()
}

fun main(args: Array<String>){
  val intent : Intent = Intent.Refresh()

  val output = when (intent){
      is Intent.Refresh -> "Refrescar"
      is Intent.RefreshPlus -> "Refrescar con otros datos"
  }

  println(output)
}*/

sealed class Intent {
    object RefreshPlus: Intent(){
        override  fun log(){
            println("Cargando mas datos")
        }
    }
    object Refresh : Intent(){
        override fun log(){
            println("Cargando datos")
        }
    }

    data class Error(val razon : String): Intent(){
        override fun  log(){
            println("$razon")
        }
    }
    abstract fun log()
}

fun main(args: Array<String>){
    val intent : Intent = Intent.Error("Problemas de conexion")
    val output = when (intent){
        is Intent.Refresh -> "Refrescar"
        is Intent.RefreshPlus -> "Refrescar con otros datos"
        is Intent.Error -> "Eror"
    }
    intent.log()
    println(output)
}


/*sealed class Operation {
    class Add(val value: Int) : Operation()
    class Substract(val value: Int) : Operation()
    class Multiply(val value: Int) : Operation()
    class Divide(val value: Int) : Operation()

    class Increment() : Operation()
    class Decrement() : Operation()
}

fun execute(x: Int, op: Operation) = when (op) {
    is Operation.Add -> x + op.value
    is Operation.Substract -> x - op.value
    is Operation.Multiply -> x * op.value
    is Operation.Divide -> x / op.value

    is Operation.Increment -> x + 1
    is Operation.Decrement -> x - 1
}

fun main(args: Array<String>){


}*/

// vimos como crear un sealed class, crear funciones que se ejecuten despues, y como utilizarlo para hacer decisiones