package primera_evaluacion.trabajo_pizzas.entities

class Pimiento(nombreIngrediente: String, cantidad: Int) : Ingrediente(nombreIngrediente, cantidad){

    init {
        super.precio = 0.50
    }
}