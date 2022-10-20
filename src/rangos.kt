fun main (args: Array<String>){
    for (i in 1..4) {
        println(i)
    }
    //Usando el operador downTo
            for (i in 4 downTo 1) {
                println(i)
            }
    //Usando el operador step
            for (i in 1..4 step 2) {
                println(i)
            }
    //Usando diferentes operadores: in, downTo y step
    for (i in 4 downTo 1 step 2){
        println(i)
    }
    //Usando el operador in
            for (i in 1 until 10) {
                println(i)
            }

    val valida = (1..50 step 2).last == 50
    println (valida)


}