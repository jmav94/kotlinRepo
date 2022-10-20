fun main(args: Array<String>)
{
    val listaNumeros:IntArray = intArrayOf(1,2,3,4,5,6,7)

    for(i  in listaNumeros)
    {
        println(i)
    }

    var frutas : List<String> = listOf("Manzana", "Piña", "Pera", "Mandarina")

    //Ejemplo de  FOR
    for (cadena in frutas)
    {
        println(cadena)
    }

    var x = 3

    //Ejemplo de  WHILE
    while(x>0)
    {
        println(x)
        x--
    }


    var suma: Int = 0
    var input: String

    //Ejemplo de  DO
    do
    {
        println("Ingrese un numero :  ")
        input = readLine()!!
        suma += input.toInt()
        println(suma)

    } while(input != "0")

    println("La suma es  :  $suma")
}