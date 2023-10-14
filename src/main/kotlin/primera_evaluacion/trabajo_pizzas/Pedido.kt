package primera_evaluacion.trabajo_pizzas

import primera_evaluacion.trabajo_pizzas.entities.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Pedido(var pizza : Pizza) {
    private var id: Long = 0

    companion object {
        var incremental: Long = 0;
        var pizzasEnPedido : MutableList<Pizza> = mutableListOf()
    }

    init {
        incremental++
        id = incremental
    }

    fun calcularPrecioTotal(pizza: Pizza): Double {
        var total: Double = 0.0
        pizza.ingredientes.forEach{
            if (it is BasePizza) {
                total += (it.precio * it.cantidad)
            }else if (it is Pimiento) {
                total += (it.precio * it.cantidad)
            } else if (it is Pollo) {
                total += (it.precio * it.cantidad)
            } else if (it is Peperoni) {
                total += (it.precio * it.cantidad)

            }
        }
        return total
    }

    fun anhadirPizzaAPedidos(){
        pizzasEnPedido.add(pizza)
    }


        fun mostrarPedido(){
            println("Pedido # $id")
            pizza.ingredientes.forEach{
                when (it) {
                    is BasePizza -> {
                        println(it.nombreIngrediente)
                        println("Precio: \$${it.precio}")
                        println("Cantidad: ${it.cantidad}")
                        println("\n")
                    }

                    is Pimiento -> {
                        println(it.nombreIngrediente)
                        println("Precio: \$${it.precio}")
                        println("Cantidad: ${it.cantidad}")
                        println("\n")
                    }

                    is Pollo -> {
                        println(it.nombreIngrediente)
                        println("Precio: \$${it.precio}")
                        println("Cantidad: ${it.cantidad}")
                        println("\n")
                    }

                    is Peperoni -> {
                        println(it.nombreIngrediente)
                        println("Precio: \$${it.precio}")
                        println("Cantidad: ${it.cantidad}")
                        println("\n")
                    }
                }
            }
            //Asignamos la ID del pedido a la pizza
            pizza.idPedido = id;
            anhadirPizzaAPedidos()
            println("TOTAL: \$${calcularPrecioTotal(pizza)}")
            println("\n")
        }

        fun mostrarPedidos(){
            pizzasEnPedido.forEach{
                println("Pedido # ${it.idPedido}")
                var precioTotal = 0.0
                it.ingredientes.forEach{
                    when (it) {
                        is BasePizza -> {
                            println(it.nombreIngrediente)
                            println("Precio: \$${it.precio}")
                            println("Cantidad: ${it.cantidad}")
                            println("\n")
                        }

                        is Pimiento -> {
                            println(it.nombreIngrediente)
                            println("Precio: \$${it.precio}")
                            println("Cantidad: ${it.cantidad}")
                            println("\n")
                        }

                        is Pollo -> {
                            println(it.nombreIngrediente)
                            println("Precio: \$${it.precio}")
                            println("Cantidad: ${it.cantidad}")
                            println("\n")
                        }

                        is Peperoni -> {
                            println(it.nombreIngrediente)
                            println("Precio: \$${it.precio}")
                            println("Cantidad: ${it.cantidad}")
                            println("\n")
                        }

                    }
                }
                precioTotal = calcularPrecioTotal(it);
                println("TOTAL: \$$precioTotal")
                println("\n")

            }



        }



}