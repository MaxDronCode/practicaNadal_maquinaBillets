fun menuBitllets(){
    println("-----------------------------")
    println("Quin bitllet desitja adquirir?\n" +
            "1 - Bitllet senzill\n" +
            "2 - TCasual\n" +
            "3 - TUsual\n" +
            "4 - TFamiliar\n" +
            "5 - TJove")
    println("-----------------------------")
}

fun menuZona(){
    println("-----------------------------")
    println("Quina zona vol viatjar?\n" +
            "- Zona 1\n" +
            "- Zona 2\n" +
            "- Zona 3")
    println("-----------------------------")
}

fun tarjetaEscollida(bittlet: Int, zona: Int) :String {
    var resultat = ""

    when(bittlet){
        1 -> resultat += "Bitllet senzill, "
        2 -> resultat += "TCasual, "
        3 -> resultat += "TUsual, "
        4 -> resultat += "TFamiliar, "
        5 -> resultat += "TJove, "
    }

    when (zona){
        1 -> resultat+="zona1"
        2 -> resultat+="zona2"
        3 -> resultat+="zona3"
    }
    return resultat
}


fun tiquetMenu(bitlletsArray: ArrayList<String>) {
    println("------TIQUET------")
    for (i in 0..bitlletsArray.size-1){
        println(bitlletsArray[i])
    }
    println("------------------\n")
}

fun menuPagament(preuBitllets:Double) {
    var importAPagar:Double = preuBitllets
    var canvi:Double = 0.0
    do {

        println("Introdueixi monedes o bitllets vàlids d'Euro.")
        var dinersIntroduits = llegirDinersDeCursLegal("Teclegi un import vàlid siusplau.", "No es un import vàlid")
        importAPagar -= dinersIntroduits
        if (importAPagar > 0.0){
            println("Ha introduit $dinersIntroduits, li resta per pagar: ${redondearADosDecimales(importAPagar)}." )
        }else if (importAPagar == 0.0){
            println("Ha introduit $dinersIntroduits, la operació ha sigut efectuada.")
            println("Reculli el seu bitllet.")
        }else{
            canvi = importAPagar * -1
            println("Ha introduit $dinersIntroduits, reculli el seu bitllet i el canvi: ${redondearADosDecimales(canvi)}")
        }

    }while (importAPagar > 0.0)
}
