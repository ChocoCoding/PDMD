package actividades.consola

fun consola() {
    var suma : Int = 0;
    var num : Int = 0;
    var mult : Int = 1;
    for (i in 1..4){
        println("Introduce un numero entero")
        num = readln().toInt();
        if (i == 1 || i == 2){
            suma += num
        }else if (i == 3 || i == 4){
            mult *= num;
        }
    }

    println("La suma es: $suma" )
    println("La multiplicacion es: $mult")

}