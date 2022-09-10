package Salario

class Dato {
     var  salarioBruto = 0F
     var  nombre : String = ""
     val  iss = 0.03F
     val  afp = 0.04f
     val renta = 0.05f


   fun mostrarMensaje(){
       println("Ingrese su nombre")
       nombre = readln().toString()
       println("Ingrese Salario  bruto")
       salarioBruto = readln().toFloat()
   }
    fun  descuento (){

        var descuentoiss = (salarioBruto*iss)
        var descuentoafp = (salarioBruto*afp)
        var descuentorenta = (salarioBruto*renta)

        var subneto = (descuentoiss+descuentoafp+descuentorenta)
        var neto = (salarioBruto-subneto)
        println("$nombre \n Sueldo ingresado $salarioBruto \n descuento  ISS es de $descuentoiss \n Descuento afp es de $descuentoafp \n descuento renta es de $descuentorenta \n Total de descuento es de $subneto \n Total a pagar es de $neto")

    }
    }


