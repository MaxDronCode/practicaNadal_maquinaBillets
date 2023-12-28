/**
 * L'unic que fa la funcio es imprimir per pantalla el menu principal d'eleccio de bitllets.
 * @author Hugo Alonso
 */
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

/**
 * L'unic que fa aquesta funcio es imprimir el menu de zones per escollir.
 * @author Hugo Alonso
 */
fun menuZona(){
    println("-----------------------------")
    println("Quina zona vol viatjar?\n" +
            "- Zona 1\n" +
            "- Zona 2\n" +
            "- Zona 3")
    println("-----------------------------")
}

/**
 * Es una funcio que retorna un string amb el tipus de tarjeta i zona que has escollit.
 * @author Hugo Alonso
 * @param bitllet El que fa es, amb el numero que ha introduir l'usuari, donar el valor de la tarjeta que vol.
 * @param zona El que fa aquesta variable es, a partir del numero introduit per pantalla, escollir la zona.
 * @return resultat: El que retorna es l'string amb la zona i la tarjeta per despres afellir-lo a un array de tiquets.
 */
fun tarjetaEscollida(bitllet: Int, zona: Int) :String {
    var resultat = ""

    when(bitllet){
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

/**
 * La funcio printa per pantalla el tiquet amb els diferents tiquets que has comprat.
 * @param bitlletsArray Es un array amb els diferents bitllets amb zones que has escollit.
 */
fun tiquetMenu(bitlletsArray: ArrayList<String>) {
    println("------TIQUET------")
    for (i in 0..bitlletsArray.size-1){
        println(bitlletsArray[i])
    }
    println("------------------\n")
}

/**
 * La funcio utiliza la variable del preu acumulat per fer a l'usuari pagar. A partir de la dada introduida (numeric) i una funcio comprova si es un bitllet o una moneda i la resta al preu.
 * @param preuBitllets Es la variable de la funcio main on es sumen tots els preus del bitllets comprats (3 com a maxim).
 */
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
