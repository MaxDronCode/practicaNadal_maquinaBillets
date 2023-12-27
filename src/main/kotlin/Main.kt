fun main() {
    var bitllets = 0
    var preuBitlletsAcomulats = 0.0
    var flag = true
    do{
        do {
            var bitlletEscollit:Int
            do {

                menuBitllets()
                bitlletEscollit = llegirInt()
                var validacioBitllet = validarBitlletEscollit("Número introduit erroni", bitlletEscollit)

            }while (!validacioBitllet)

            var zonaEscollida:Int
            do {

                menuZona()
                zonaEscollida = llegirInt()
                var validacioZona = validarZonaEscollida("Número de zona erroni", zonaEscollida)

            }while (!validacioZona)

            var bitlletFinal = tarjetaEscollida(bitlletEscollit,zonaEscollida)

            println("Ha escollit la opcio: $bitlletFinal")
            bitllets++

            var preuBitllet = calculaPreuBitllet(bitlletEscollit, zonaEscollida)

            preuBitlletsAcomulats += preuBitllet

            println("El preu del bitllet es: $preuBitllet€")

            println("Vol seguir comprant? (S/N)")

        }while(flag || bitllets<3)
    }while(true)

}