package primera_evaluacion.trabajo_pizzas.entities

class Peperoni(nombreIngrediente: String, cantidad: Int) : Ingrediente(nombreIngrediente, cantidad){
init {
    super.precio = 1.00
}

}