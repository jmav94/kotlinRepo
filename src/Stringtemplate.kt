//Concatenacion convencional:
/*val name = "leonel"
val age = 31
val sentence = "Hello my name is " + name + " and I'm" + age + " years old"*/

//Ejemplos de String templates

/*val name= "Leonel"
val age= 31
val sentence= "Hello my name is $name and I'm $age years old"
println(sentence)*/



//Ejemplo de String Templates con operaciones

/*val name= "Leonel"
val age= 31
val sentence= "Hello my name is $name and I'm ${age+1} years old"
println(sentence)*/

/*val text = """
Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
		quiuiiuis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
	consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
	proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
"""*/

val text = """
|Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
|tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
|quiuiiuis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
|consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
|cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
|proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
""" //para que el texto quede alineado.

fun main(args: Array<String>){
    println(text)

}

