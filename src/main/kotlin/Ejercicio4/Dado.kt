package Ejercicio4

import kotlin.random.Random

class Dado {

    var x = Random.nextInt(1, 100)

    /*
          fun aleatorio(){


              println(x);

          }
         fun palabras(){

          var unidades = arrayOf("","uno", "dos","tres","cuatro","cinco","seis","siete","ocho","nueve");
          var decenas = arrayOf("", "dieci", "veinti", "treinta y", "cuarenta y", "cincuenta y", "sesenta y", "ochenta y", "noventa y");

             var numero1 = x.toString();
             var numero2= (numero1.length)-3;
             var numero = 0 * numero2+x;



            var Num1 = numero.toInt();


             var a = this.deleteZerosLeft(numero)

         }

        private fun deleteZerosLeft(numero: Int) {
             var i=0;
             var escero= true;
             for (i== 0; i<numero.length; i++){
                 if (numero.toChar(i) !=0){
                     escero =false;
                 }
            }
       }
    */


    fun comparar() {

        println("El numero aleatorio es $x");
        println("en letras: ")

        when (x) {
            1 -> {
                println("uno")
            }

            2 -> {
                println("dos")
            }

            3 -> {
                println("tres")
            }

            4 -> {
                println("cuatro")
            }

            5 -> {
                println("cinco")
            }

            6 -> {
                println("seis")
            }

            7 -> {
                println("siete")
            }

            8 -> {
                println("ocho")
            }

            9 -> {
                println("nueve")
            }

            10 -> {
                println("diez")
            }

            11 -> {
                println("once")
            }

            12 -> {
                println("doce")
            }

            13 -> {
                println("trece")
            }

            14 -> {
                println("catorce")
            }

            15 -> {
                println("quince")
            }

            16 -> {
                println("dieciseis")
            }

            17 -> {
                println("diecisiete")
            }

            18 -> {
                println("dieciocho")
            }

            19 -> {
                println("diecinueve")
            }

            20 -> {
                println("veinte")
            }

            21 -> {
                println("veinteuno")
            }

            22 -> {
                println("veintidos")
            }

            23 -> {
                println("veintitres")
            }

            24 -> {
                println("veinticuatro")
            }

            25 -> {
                println("veinticinco")
            }

            26 -> {
                println("veintiseis")
            }

            27 -> {
                println("veintisiete")
            }

            28 -> {
                println("veintiocho")
            }

            29 -> {
                println("veintinueve")
            }

            30 -> {
                println("treinta")
            }

            31 -> {
                println("treinta y uno")
            }

            32 -> {
                println("treinta y dos")
            }

            33 -> {
                println("treinta y tres")
            }

            34 -> {
                println("treinta y cuatro")
            }

            35 -> {
                println("treinta y cinco")
            }

            36 -> {
                println("treinta y seis")
            }

            37 -> {
                println("treinta y siete")
            }

            38 -> {
                println("treinta y ocho")
            }

            39 -> {
                println("treinta y nueve")
            }

            40 -> {
                println("cuarenta")
            }

            41 -> {
                println("cuarenta y uno")
            }

            42 -> {
                println("cuarenta y dos")
            }

            43 -> {
                println("cuarenta y tres")
            }

            44 -> {
                println("cuarenta y cuatro")
            }

            45 -> {
                println("cuarenta y cinco")
            }

            46 -> {
                println("cuarenta y seis")
            }

            47 -> {
                println("cuarenta y siete")
            }

            48 -> {
                println("cuarenta y ocho")
            }

            49 -> {
                println("cuarenta y nueve")
            }

            50 -> {
                println("cincuenta")
            }

            51 -> {
                println("cincuenta y uno")
            }

            52 -> {
                println("cincuenta y dos")
            }

            53 -> {
                println("cincuenta y tres")
            }

            54 -> {
                println("cincuneta y cuatro")
            }

            55 -> {
                println("cincuneta y cinco")
            }

            56 -> {
                println("cincuneta y seis")
            }

            57 -> {
                println("cincuneta y siete")
            }

            58 -> {
                println("cincuneta y ocho")
            }

            59 -> {
                println("cincuneta y nueve")
            }

            60 -> {
                println("sesenta")
            }

            61 -> {
                println("sesenta y uno")
            }

            62 -> {
                println("sesenta y dos")
            }

            63 -> {
                println("sesenta y tres")
            }

            64 -> {
                println("sesenta y cuatro")
            }

            65 -> {
                println("sesenta y cinco")
            }

            66 -> {
                println("sesenta y seis")
            }

            67 -> {
                println("sesenta y siete")
            }

            68 -> {
                println("sesenta y ocho")
            }

            69 -> {
                println("sesenta y nueve")
            }

            70 -> {
                println("setenta")
            }

            71 -> {
                println("setenta y uno")
            }

            72 -> {
                println("setenta y dos")
            }

            73 -> {
                println("setenta y tres")
            }

            74 -> {
                println("setenta y cuatro")
            }

            75 -> {
                println("setenta y cinco")
            }

            76 -> {
                println("setenta y seis")
            }

            77 -> {
                println("setenta y siete")
            }

            78 -> {
                println("setenta y ocho")
            }

            79 -> {
                println("setenta y nueve")
            }

            80 -> {
                println("ochenta")
            }

            81 -> {
                println("ochenta y uno")
            }

            82 -> {
                println("ochenta y dos")
            }

            83 -> {
                println("ochenta y tres")
            }

            84 -> {
                println("ochenta y cuatro")
            }

            85 -> {
                println("ochenta y cinco")
            }

            86 -> {
                println("ochenta y tres")
            }

            87 -> {
                println("ochenta y siete")
            }

            88 -> {
                println("ochenta y ocho")
            }

            89 -> {
                println("ochenta y nueve")
            }

            90 -> {
                println("noventa")
            }

            91 -> {
                println("noventa y uno")
            }

            92 -> {
                println("noventa y dos")
            }

            93 -> {
                println("noventa y tres")
            }

            94 -> {
                println("noventa y cuatro")
            }

            95 -> {
                println("noventa y cinco")
            }

            96 -> {
                println("noventa y seis")
            }

            97 -> {
                println("noventa y siete")
            }

            98 -> {
                println("noventa y ocho")
            }

            99 -> {
                println("noventa y nueve")
            }

            100 -> {
                println("cien")
            }

            else -> {
                println("valor invalido")
            }
        }
    }


}