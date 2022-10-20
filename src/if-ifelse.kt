fun esMayor(dato :Int){
    if (dato > 0 ){
        println("$dato")
        "true"
    }else{
        println("$dato")
        "false"
    }
}

fun defineTipo(obj: Any){
    if (obj is String){
        println(obj.length)
    }else if(obj is Int){
        println(obj * 3)
    }else if (obj is Persona2){
        print(obj.name)
    }
}


fun main (){
    esMayor(5)
    defineTipo("Soy un String")
    defineTipo(5)
    defineTipo(Persona2("Francisco",34,"cafes"))

    var j = "10"
    var a = 4
    j = if (a > 9) {
        j = "1"
        "0"
    } else {
        j = "4"
        "3"
    }
    println("$j hola este es el valor de j")

}

