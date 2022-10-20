fun main (args: Array<String>){
//    tipo("Victor")
//    tipo(5)
//    tipo(true)
//    tipo(Persona2("Alberto",20,"azules"))
//    acceso(tipoUsuario(name = "Juan",departamento = "sistemas" , permisos = 1))
    rango(10)

}
fun tipo(dato:Any){
    when (dato){
        is String -> println(dato.length)
        is Int -> println("{$dato*2}")
        is Boolean -> {
            println("es un booleano")
            println(dato)
        }
        is Persona2 -> println("{$dato.name} ${dato.age}")
        else -> println("no se que tipo de objeto es")
    }
}
fun acceso(Usuario: tipoUsuario){
    when(Usuario.permisos){
        1 -> println("${Usuario.name} usuario con permisos de adminsitrador")
        2 -> println("${Usuario.name} usuario con permisos de secretaria")
        3 -> println(" ${Usuario.name} usuario con permisos de vendedor")
        else -> println("${Usuario.name} Usuario sin permisos de acceso")
    }

}

data class tipoUsuario(val name: String,val departamento: String, val permisos: Int)

fun rango (numero:Int){
    when(numero){
        in 1 .. 9 -> println("$numero es Numero positivo entre 1 y 10")
        in 10..100 -> println("$numero Numero positivo entre 10 y 100")
        else -> println("$numero es un Numero fuera de rango")
    }
}