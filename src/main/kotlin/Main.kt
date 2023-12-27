fun main() {
    var bitllets:Int
    var preuBitlletsAcomulats = 0.0
    var flag:Boolean
    var bitlletsArray=arrayListOf<String>()
    var num = 0
    do{
        flag = false
        bitllets=1
        num++
        while(bitllets<3 && !flag) {

            println("Esto es el intento numero $num de comprar billetes")
            menuBitllets()
            var bitlletEscollit = readInt("Introdueixi un numero siusplau.", "Introdueixi un número del 1 al 5 siusplau.", 1, 5)

            menuZona()
            var zonaEscollida = readInt("Introdueixi un numero siusplau.", "Introdueixi un número del 1 al 5 siusplau.", 1 , 3)

            var bitlletFinal = tarjetaEscollida(bitlletEscollit,zonaEscollida)

            println("Ha escollit la opcio: $bitlletFinal")


            var preuBitllet = calculaPreuBitllet(bitlletEscollit, zonaEscollida)

            preuBitlletsAcomulats += preuBitllet

            println("El preu del bitllet es: $preuBitllet€")

            if (bitllets<3){
                println("Vol seguir comprant? (S/N)")

                var seguirComprant = readYesNo("Introdueixi un caracter (S/N)","Introdueix una -S o una -N", 'S', 'N')

                if (seguirComprant=='N') flag=true
            }else{
                println("ya no pueds comprar mas billetes")
                println("tienes que pagar $preuBitlletsAcomulats")
            }
            bitlletsArray.add("$bitlletFinal - Preu: $preuBitllet")
            bitllets++
        }
        println("adeu")

        println("------TIQUET------")
        for (i in 0..bitlletsArray.size-1){
            println(bitlletsArray[i])
        }
        println("------------------\n")
    }while(true)
}