fun main (args: Array<String>){
    val node=Node()
    node.getParent()

    fun foo(node: Node) {
        val parent = node.getParent()
    }
}
data class Node(val name:String = "pablo")

fun Node.getParent(){
    println(name)
}



    //val name = node.getParent() ?: throw IllegalArgumentException("name expected")
    // ...
