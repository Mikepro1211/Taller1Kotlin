package Ejercicio1
import kotlin.math.sqrt

class EcuacionC {

    var a = 0;
    var b = 0;
    var c = 0;
    var X = 0;


    fun obtenciondatos() {

        println("Resolver la ecuacion cuadratica");

        println("ingrese el valor de a");
        a = readln()!!.toInt();
        println("ingrese el valor de b");
        b = readln()!!.toInt();
        println("ingrese el valor de c");
        c = readln()!!.toInt();





        X = ((b*(b))-4*(a)*(c));

        if (X < 0){
            println("La ecuacion no existe")
        }else {

            //RESULTADO X1

            val XRAIZ = sqrt(X.toDouble());
            val XSUMA =((-(b)) + XRAIZ);
            val X1 = XSUMA/2*(a);

            // RESULTADO X2

            val XRAIZ1 = sqrt(X.toDouble())
            val XSUMA1 =((-(b)) -XRAIZ1)
            val X2 =  XSUMA1   / (2*(a));




            println("Los resultados son X1= $X1  &  X2 = $X2");






        }

    }}