//data class Tiempo(val years:Int, val days:Int)
//
//data class Contador(private var index: Int){
//    operator fun inc():Contador{
//        return Contador(index + 1)
//    }
//}
//
//operator fun Tiempo.plus(other:Tiempo):Tiempo{
//    return Tiempo(this.years + other.years,this.days + other.days)
//}
//
//fun main(args: Array<String>) {
//
//    val tiempo1 = Tiempo(2017,17)
//    val tiempo2 = Tiempo(1991,20)
//
//    val sumaTiempo = tiempo1 + tiempo2
//    println(sumaTiempo)
//
//    var contador = Contador(5)
//    println(contador.inc())
//    println(++contador)
//}

data class Pedidos(var cantidad: Int, var precio: Int)

class Facturacion {

    private var listPedidos: MutableList<Pedidos> = ArrayList<Pedidos>()

    // Permite sobreescribir el operador suma para agregar mas objetos a calcular
    operator fun Pedidos.plus(other: Pedidos): Pedidos {
        return Pedidos(this.cantidad + other.cantidad,
            this.precio + other.precio)
    }

    fun add(pedido: Pedidos) = listPedidos.add(pedido)

    fun calcular(): Pedidos {
        var calculoPedido: Pedidos = Pedidos(0, 0)
        listPedidos?.let {
            for (pedido in it) {
                calculoPedido += pedido
            }
        }
        return calculoPedido
    }
}

fun main(args: Array<String>) {
    var ped1 = Pedidos(1, 2)
    var ped2 = Pedidos(1, 2)

    var facturacion = Facturacion()

    facturacion.add(ped1)
    facturacion.add(ped2)
    println(facturacion.calcular())
}
