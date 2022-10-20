fun main(args: Array<String>) {
    "Probando extension function".print()
    //println(4.multiply(2))
    println(8 multiply 5)
    val listaNombres = mutableListOf("Sergio","Dhonella","Mery","Angelica")
    listaNombres.swap(0,3)
    listaNombres[0].print()
}

fun String.print(){
    println(this)
}

/*fun Int.multiply(a:Int):Int{
    return this*a
}*/


infix fun Int.multiply(a:Int):Int{
    return this*a
}

fun <T> MutableList<T>.swap(index1:Int,index2:Int){
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}