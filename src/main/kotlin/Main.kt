fun main() {
    var bitllets = 0
    var preuBitlletsAcomulats = 0.0
    var comprarMesBitllets = false
    do{
        do {

            menuBitllets()
            var bitlletEscollit = readInt("Introdueixi un numero siusplau.", "Introdueixi un número del 1 al 5 siusplau.", 1, 5)


            menuZona()
            var zonaEscollida = readInt("Introdueixi un numero siusplau.", "Introdueixi un número del 1 al 5 siusplau.", 1 , 3)


            var bitlletFinal = tarjetaEscollida(bitlletEscollit,zonaEscollida)

            println("Ha escollit la opcio: $bitlletFinal")
            bitllets++

            var preuBitllet = calculaPreuBitllet(bitlletEscollit, zonaEscollida)

            preuBitlletsAcomulats += preuBitllet

            println("El preu del bitllet es: $preuBitllet€")

            println("Vol seguir comprant? (S/N)")

            var seguirComprant = readYesNo("Introdueixi un caracter (S/N)","Introdueix una -S o una -N", 'S', 'N')

            println(seguirComprant)

        }while(comprarMesBitllets && bitllets<3)
        println("adeu")
    }while(true)

}