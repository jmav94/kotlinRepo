fun saludar(saludo: String = "Hola") {
    println(saludo)
}

data class Persona3(val nombre: String = "Juan")

/*fun main(args: Array<String>) {
    // Crea el objeto persona con el nombre de "Juan” por defecto
    val persona = Persona3()
    println(persona)
}*/
//Manejo de los valores por defecto con más de 1 campo

fun otrafuncion(edad: Int = 0, esAdulto: Boolean = false, esSoltero: Boolean = true) {

}

fun main(args: Array<String>) {

    otrafuncion(esAdulto = true, edad = 39, esSoltero = true)
    // Se les pasa valores a 2 campos
    otrafuncion(esAdulto = true, esSoltero = true)
    // Se les pasa valores a 2 campos distintos en diferente orden
    otrafuncion(esAdulto = true, edad = 39)
    otrafuncion(edad = 39, esSoltero = true)
    otrafuncion(30, true, false)
    // Esto no se puede hacer
    otrafuncion(30, esAdulto = true)

}

