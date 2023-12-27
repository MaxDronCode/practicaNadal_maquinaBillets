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