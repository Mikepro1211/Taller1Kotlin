package Numeros

class Numero {
    var num1: Int = 0
    var num2: Int = 0
    var num3: Int = 0

    fun tomaDatos() {
        println("Ingrese Primer digito")
        num1 = readln()!!.toInt()
        println("Ingrese segundo digito")
        num2 = readln()!!.toInt()
        println("Ingrese Tercer digito")
        num3 = readln()!!.toInt()
    }

    fun validacion() {

        if (num1 % 3 == 0 && num2 % 3 == 0 && num3 % 3 == 0) {
            if (num1 < 0 || num2 < 0 || num3 < 0) {
                println("Porfavor Ingrese numeros positivos")
                tomaDatos()
            } else if (num1 == 0 || num2 == 0 || num3 == 0) {
                println("Porfavor Ingrese numeros mayor a cero")
                tomaDatos()
            } else if (num1 == num2 || num2 == num3 || num1 == num3) {
                println("Pofavor Ingrese numeros diferentes")
                tomaDatos()
            } else if ((num1 == 9 || num2 == 9) || num3 == 9) {
                println("No se puede digitar el numero 9")
                tomaDatos()
            }

        } else {
            println("Ingrese digitos multiplos de 3")
        }
    }

    fun mayor() {
            if (num1 > num2 && num1 > num3) {
                println("El mayor de los numeros $num1 que $num2 y que $num3")
                //suma si el tercer digito es mayor que 10
                if (num3 > 10) {
                    println("Se efectua la suma debido a que $num3 es mayor a 10  ")
                    val suma = num1 + 10

                    println("Resultado es $num1 + 10 es $suma  con $num2 y $num3")
                } else {
                    println("No se efecuta  la suma debido a que $num3 no es mayor que 10")
                }
                //verificacion si segundo numero es mayor que los demas
            } else if (num2 > num3 && num2 > num1) {
                println("El numero mayor es $num2 que $num1 y que $num3")
                if (num3 > 10) {
                    println("Se efectua la suma debido a que $num3 es mayor a 10 ")
                    val suma = num2 + 10

                    println("Resultado es $num2 + 10 es $suma  con $num1 y $num3")
                } else {
                    println("No se efecuta  la suma debido a que $num3 no es mayor que 10")
                }
                // verificacion si tercer digito es mayor que los demas s
            } else {
                println("Numero mayor es $num3 que $num1 y que $num2")
                if (num3 > 10) {
                    println("Se efectua la suma debido a que $num3 es mayor a 10 ")
                    val suma = num3 + 10

                    println("Resultado es $num3 + 10 es $suma  con $num1 y $num2")
                } else {
                    println("No se efecuta  la suma debido a que $num3 no es mayor que 10")
                }

            }
            println("*******************Verificacion de numero menor*******************")

            //verificacion de numero menor
            if (num1 < num2 && num1 < num3) {
                println("El numero menor es $num1 que $num2 y $num3")
                if (num3 < 100) {
                    println("Se efectua resta de -5  ya que $num3 es menor que 100")
                    val resta = num1 - 5
                    println("Resultado $num1 - 5 es $resta queda con $num2 y $num3")
                }
            } else if (num2 < num1 && num2 < num3) {
                println("El numero menor es $num2 que $num1 y $num3")
                if (num3 < 100) {
                    println("Se efectua resta de -5  ya que $num3 es menor que 100")
                    val resta = num2 - 5
                    println("Resultado $num2 - 5 es $resta queda con $num1 y $num3")
                }
            } else {
                println("El numero menor es $num3 que $num1 y $num2")
                if (num3 < 100) {
                    println("Se efectua resta de -5  ya que $num3 es menor que 100")
                    val resta = num3 - 5
                    println("Resultado $num3 - 5 es $resta queda con $num1 y $num2")
                }
            }
        }


}





