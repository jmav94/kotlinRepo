object Validador{
    fun passValid(pss:String):Boolean{
        return pss.isNotEmpty() && pss.length > 10
    }
    fun isNum(obj:Any){
        obj is Int
    }

}

class universaslClass{
    companion object {
        fun create(): universaslClass = universaslClass()
    }
}

fun unaFuncion(){
    val universalenFun = universaslClass.create()
}
fun main(args: Array<String>){
    println("Ingresa una Contraseña")
    val pass: String = readLine()!!
    println(Validador.passValid(pass))



    val universalenMain = universaslClass.create()
    println("Ingresa un Numero")
    val num = readLine()?.toInt() ?:0
    println(Validador.isNum(num))
    /*try{
        println("Ingresa un Numero")
        val num = readLine()?.toInt() ?:0
        println(Validador.isNum(num))
    }catch(e: NumberFormatException){
        println(e)
    }*/

}