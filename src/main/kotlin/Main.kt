import javax.print.attribute.standard.PrinterInfo
/**
* Esta funcion main controla el programa. Desde esta funcion se llama a las demas,
 * principalmente a las funciones de menu para las impresiones de pantalla i comprovacion de datos.
 * @author Max Dron i Hugo Alonso
* */
fun main() {
    var bitllets:Int
    var preuBitlletsAcomulats:Double
    var flag:Boolean
    println("Aixo es una maquina de venda de tiquets de tren!!\n" +
            "      __        __________\n" +
            "     /  \\         ========   _____________\n" +
            "      ||          =      =  /           ]\n" +
            "  ___==============      = /            ]\n" +
            "  \\_[            ========= [            ]\n" +
            "    [=====================^==============\n" +
            "___//_(_)_(_)_(_)___\\__/_____(_)_(_)_(_)\n" +
            "========================================")

    var num = 0
    do{
        flag = false
        bitllets=0
        preuBitlletsAcomulats = 0.0
        var bitlletsArray=arrayListOf<String>()
        while(bitllets<3 && !flag) {

            menuBitllets()
            var bitlletEscollit = readInt("Introdueixi un numero siusplau.", "Introdueixi un número del 1 al 5 siusplau.", 1, 5)

            menuZona()
            var zonaEscollida = readInt("Introdueixi un numero siusplau.", "Introdueixi un número del 1 al 5 siusplau.", 1 , 3)

            var bitlletFinal = tarjetaEscollida(bitlletEscollit,zonaEscollida)

            println(GREEN_BOLD + "Ha escollit la opcio: $YELLOW_BOLD $bitlletFinal" + RESET)


            var preuBitllet = calculaPreuBitllet(bitlletEscollit, zonaEscollida)

            preuBitlletsAcomulats += preuBitllet
            preuBitlletsAcomulats = redondearADosDecimales(preuBitlletsAcomulats)

            println("El preu del bitllet es: $preuBitllet€")


            bitlletsArray.add("$bitlletFinal - Preu: " + YELLOW_BOLD + preuBitllet + RESET)
            bitllets++

            if (bitllets<3){
                println("Vol seguir comprant? $YELLOW_BOLD (S/N)" + RESET)

                var seguirComprant = readYesNo("Introdueixi un caracter (S/N)","Introdueix una -S o una -N", 'S', 'N')

                if (seguirComprant=='N') {
                    flag = true
                    println(YELLOW_BOLD + "Has adquirit $bitllets bitllets.")
                    println("Has de pagar $preuBitlletsAcomulats€ en total" + RESET)

                }
            }else{
                println("Limit de compra 3 bitllets.")
                println("Has de pagar $preuBitlletsAcomulats€")
            }
        } // fin bucle while, vuelve al menu billetes

        println()

        menuPagament(preuBitlletsAcomulats)

        println("Vols veure el tiquet? (S/N)")

        var veureTiquet = readYesNo("Introdueixi un caracter (S/N)","Introdueix una -S o una -N", 'S', 'N')

        if (veureTiquet=='S') tiquetMenu(bitlletsArray)

    }while(true)
}