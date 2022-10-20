/*class Persona(val nombre:String){
    init{
        println("Nombre: $nombre")
    }
    constructor(name:String,edad:Int):this(name){
        println("Nombre: $nombre, Edad: $edad")
    }
}*/

open class Persona(val nombre: String, val edad: Int) {
    open fun imprimir() {
        println("Nombre: $nombre")
        println("Edad: $edad")
    }
}
class Empleado(nombre: String, edad: Int, val sueldo: Double): Persona(nombre, edad) {
    override fun imprimir() {
        super.imprimir()
        println("Sueldo: $sueldo")
    }
    fun pagaImpuestos() = if (sueldo > 48000)
        println("El empleado $nombre paga impuestos")
    else
        println("El empleado $nombre no paga impuestos")
}



fun main(args: Array<String>){
    val persona = Persona("Juan",24)
    persona.imprimir()
    val empleado = Empleado("Pedro",32,2500.50)
    empleado.imprimir()
    empleado.pagaImpuestos()
}