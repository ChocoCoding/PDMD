package primera_evaluacion.trabajo_pizzas.entities

class Pizza() {
    var ingredientes : MutableList<Ingrediente> = mutableListOf()
    var idPedido : Long = 0;

    fun anhadirIngredienteALaPizza(){
    var optIn : Int = 0
    var cant : Int = 0;
    println("Selecciona los ingredientes que quieres añadir a tu pizza: ")
    println("Todas las pizza deben tener minimo 1 base pizza")

    //Añadimos base pizza a la lista de ingredientes
    var basePizza = BasePizza("Base Pizza",1)
    ingredientes.add(basePizza)
    do {
        println("1. -----> Pollo: $3")
        println("2. -----> Pimiento $0.50")
        println("3. -----> Peperoni $0.50")
        println("0. -----> Pagar pedido")
        optIn = readln().toInt()


        when(optIn){
            1 -> {
                println("Introduce la cantidad: ")
                cant = readln().toInt()
                var pollo = Pollo("Pollo",cant)
                ingredientes.add(pollo)
            }
            2 -> {
                println("Introduce la cantidad: ")
                cant = readln().toInt()
                var pimiento = Pimiento("Pimiento",cant)
                ingredientes.add(pimiento)
            }
            3 -> {
                println("Introduce la cantidad: ")
                cant = readln().toInt()
                var peperoni = Peperoni("Peperoni",cant)
                ingredientes.add(peperoni);
            }
            0 ->{

            }

            else ->{
                println("La opción marcada no correspone a ningún ingrediente")
            }

        }
    }while (optIn!=0)

}
}