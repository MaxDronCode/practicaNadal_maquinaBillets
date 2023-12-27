fun main() {
    var bitllets = 0
    var flag = true
    do{
        do {
            menuBitllets()
            var bittletEscollit = llegirInt()

            menuZona()
            var zonaEscollida = llegirInt()

            var bitlletFinal = tarjetaEscollida(bittletEscollit,zonaEscollida)

            println("Ha escollit la opcio: $bitlletFinal")
            bitllets++

            var preuBitllet = calculaPreuBitllet(bittletEscollit, zonaEscollida)
            println("El preu del bitllet es: $preuBitllet€")
        }while(flag || bitllets<3)
    }while(true)

}