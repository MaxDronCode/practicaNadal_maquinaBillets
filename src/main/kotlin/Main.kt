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
        }while(flag || bitllets<3)
    }while(true)

}