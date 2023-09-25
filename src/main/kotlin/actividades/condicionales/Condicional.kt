package actividades.condicionales

//Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.
fun comprobarSueldo(){
    var sueldo: Int = 0;
    println("Ingresa tu sueldo")
    sueldo = readln().toInt();
    if (sueldo> 3000){
        println("Debe abonar impuestos.")
    }
}

//Realizar un programa que solicite ingresar dos números enteros distintos y muestre por pantalla el mayor de ellos
fun comprobarNumMayor() {
    var mayor: Int = 0;
    var num1: Int = 0;
    var num2: Int = 0;
    println("Ingresa un numero")
    num1 = readln().toInt();
    mayor = num1;
    println("Ingresa otro numero")
    num2 = readln().toInt();
    if (num2 > num1) {
        mayor = num2;
    }
    println("El numero mayor es: $mayor")
}

//Se ingresan por teclado 2 valores enteros. Si el primero es menor al segundo calcular la suma y la resta, luego mostrarlos, sino calcular el producto y la división.

fun calculoMenorMayor(){
    var num1: Int = 0;
    var num2: Int = 0;
    var suma: Int = 0;
    var resta: Int = 0;
    var mult: Int = 0;
    var div: Double = 0.0;
    println("Ingresa un numero")
    num1 = readln().toInt();
    println("Ingresa otro numero")
    num2 = readln().toInt();
    if (num1<num2){
        suma = num1 + num2
        resta = num1 - num2
        println("La suma de $num1 + $num2 es: $suma")
        println("La resta de $num1 - $num2 es: $resta")
    }else{
            mult = num1 * num2
            div = num1.toDouble() / num2.toDouble()
            println("El producto de $num1 * $num2 es: $mult")
            println("La division de $num1 / $num2 es: $div")
    }
}

//Se ingresan tres notas de un alumno, si el promedio es mayor o igual a cinco mostrar un mensaje "Apto".
fun comprobarNotas(){
    var nota: Int = 0;
    var sum : Int = 0;
    var promedio: Double = 0.0;
    var cont: Int = 0;
    for (i in 1..3){
        println("Ingresa una nota")
        nota = readln().toInt()
        sum += nota;
        cont++
    }
    promedio = sum.toDouble()/cont;
    if (promedio >= 5){
        println("Apto")
    }else println("No Apto")
}

//Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un mensaje indicando si el número tiene uno o dos dígitos.
fun comprobarDigitos(){

}










