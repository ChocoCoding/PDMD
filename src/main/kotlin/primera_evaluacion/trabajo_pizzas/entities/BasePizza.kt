package primera_evaluacion.trabajo_pizzas.entities

class BasePizza(nombreIngrediente: String, cantidad: Int) : Ingrediente(nombreIngrediente, cantidad){

    init {
        super.precio = 10.00
    }

}