package primera_evaluacion.trabajo_pizzas

import primera_evaluacion.trabajo_pizzas.entities.BasePizza
import primera_evaluacion.trabajo_pizzas.entities.Pizza

/**
 * Clase que muestra el menú para:
 * -Crear una pizza
 * -Crear un pedido
 * -Añadir la pizza al pedido
 * -Mostrar los pedidos
 */
class Dialog {

    fun start(){
        val dibujoPizza = """
***************************
BIENVENIDO A LA PIZZERIA!!!
***************************
 ____                   
/    \			                
  u  u|      _______    
    \ |  .-''#%&#&%#``-.   
   = /  ((%&#&#&%&VK&%&))  
    |    `-._#%&##&%_.-'   
 /\/\`--.   `-."".-'
 |  |    \   /`./          
 |\/|  \  `-'  /
 || |   \     / 

    """.trimIndent()

val menu = """
***************************************************
¿Que deseas hacer? Introduce el número de la opción
***************************************************
""".trimIndent()
        println(dibujoPizza)
        println(menu)

        var opt : Int;
        var pizza: Pizza? = null
        var pedido: Pedido? = null
        do {
            println("1. -----> Crea tu propia pizza")
            println("2. -----> Tus pedidos")
            println("0. -----> Salir")
            opt = readln().toInt()

            when(opt){
                1 -> {

                        pizza = Pizza()
                        pizza.anhadirIngredienteALaPizza()
                        pedido = Pedido(pizza)
                        pedido.mostrarPedido()
                }
                2 -> {
                    pedido?.mostrarPedidos()
                }
                0->{
                    println("Saliendo del programa")
                }
                else -> {
                    println("La opción seleccionada es incorrecta!!!")
                }

            }
        }while (opt!=0)

    }

}