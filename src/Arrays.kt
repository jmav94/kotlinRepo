fun main(args: Array<String>) {

    /*al declarar el arreglo en automatico el ide nos pedira que especifiquemos el tipo de dato que tendra cada uno de los elementos del arreglo, pero lo puedes omitir, ya que kotlin cuando le mandes los datos inferira el tipo en automatico.*/
    val arrA = intArrayOf(1,234,32,43,45,543,7)
    val listA = arrayListOf("Hola", "Kotlin", "Java", "Android")


    /*val num = arrA.get(0)*/
    val num = arrA[0]
    /*arrA.set(2,10)*/
    arrA[2] = 10

    val mutableList = mutableListOf(2,3,4,5,6,7)
    mutableList.add(9)
    mutableList.add(2,10)
    //mutableList.set(0,1)
    mutableList[0] = 1

    /*En Kotlin tamien podemos utilizar mapas, por ejemplo declaramos
    un mapa <String,Int> esto quiere decir que la llave de mi mapa es
    un string pero el arreglo debe recibir enteros	*/

    val map = mutableMapOf<String,Int>(Pair("Key", 30))
    map.put("Key2", 40)

    /*En el map.put("Key2", 40) se puede simplificar de la
    misma forma que los arreglos. con [] reemplazando el “put”*/

    map["key2"] = 40

    val arrayAny = arrayOf("abcd",1,2.5,true,false)


}