import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>){
    val num:Int? = null
    val result= sum(2,3)
    println(result)
    val result2 = masdeCinco("tengomuchasletras")
    println(result2)

    //ya habiamos visto let... es como un if pero sin else
    val unAuto = Carro("A7","Audi","2.5",false)
    unAuto?.let {
        it.marca

    }
    with(unAuto){
        marca
        turbo
        model

    }
    // nos permite utilizar los atributos del objeto enviado
    unAuto.apply {
        marca
        model
    }

}
val sum:(Int,Int)-> Int ={x,y -> x + y}

val masdeCinco: (String) -> Boolean = { it.length >5 }

data class Carro (val model :String, val marca :String , val motor :String, val turbo :Boolean)