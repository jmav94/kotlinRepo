data class Auto(var marca:String, private val puertas:Int){
    var numPuertas = puertas
        get() {
            return if (field > 0) field else 1
        }
}

data class Persona2(var name:String, val age:Int, val colorOjos:String)

fun main(args: Array<String>) {
    val auto = Auto("KIA", 0)

    var marca = auto.marca
    auto.marca = "Audi"

    auto.hashCode()
    auto.numPuertas = 3
    println(auto.toString())
    println(auto.numPuertas)

    val abraham = Persona2("abraham", 19, "cafes")
    val sergio = abraham.copy("Sergio")

    println(abraham)
    println(sergio)

    println("--------------------------------------")

    val miguel = abraham.copy()
    miguel.name = "Miguel"

    println(abraham)
    println(sergio)

    println(miguel)

}