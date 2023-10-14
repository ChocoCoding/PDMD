package primera_evaluacion.trabajo_pizzas.entities

class Pollo(nombreIngrediente: String, cantidad: Int) : Ingrediente(nombreIngrediente, cantidad){
    init {
        super.precio = 3.00
    }

}