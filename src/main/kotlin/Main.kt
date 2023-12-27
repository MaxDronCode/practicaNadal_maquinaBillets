import javax.print.attribute.standard.PrinterInfo

fun main() {
    var bitllets:Int
    var preuBitlletsAcomulats = 0.0
    var flag:Boolean

    var num = 0
    do{
        flag = false
        bitllets=0
        var bitlletsArray=arrayListOf<String>()
        while(bitllets<3 && !flag) {

            menuBitllets()
            var bitlletEscollit = readInt("Introdueixi un numero siusplau.", "Introdueixi un número del 1 al 5 siusplau.", 1, 5)

            menuZona()
            var zonaEscollida = readInt("Introdueixi un numero siusplau.", "Introdueixi un número del 1 al 5 siusplau.", 1 , 3)

            var bitlletFinal = tarjetaEscollida(bitlletEscollit,zonaEscollida)

            println("Ha escollit la opcio: $bitlletFinal")


            var preuBitllet = calculaPreuBitllet(bitlletEscollit, zonaEscollida)

            preuBitlletsAcomulats += preuBitllet
            preuBitlletsAcomulats = redondearADosDecimales(preuBitlletsAcomulats)

            println("El preu del bitllet es: $preuBitllet€")


            bitlletsArray.add("$bitlletFinal - Preu: $preuBitllet")
            bitllets++

            if (bitllets<3){
                println("Vol seguir comprant? (S/N)")

                var seguirComprant = readYesNo("Introdueixi un caracter (S/N)","Introdueix una -S o una -N", 'S', 'N')

                if (seguirComprant=='N') {
                    flag = true
                    println("Has adquirit $bitllets bitllets.")
                    println("Has de pagar $preuBitlletsAcomulats€ en total")

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