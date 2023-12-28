import java.util.*
/**
 * Esta funcion, como su propio nombre indica, lee valores int
 * y, hasta que no has introducido un valor int, no devuelve
 * ningun valor.
 * @author Hugo Alonso
 * @return retorna el numero int.
 */
fun llegirInt(): Int {
    var bool = false
    var result=0
    do {
        if (scan.hasNextInt()){
            bool=true
            result=scan.nextInt()
        }
    }while(!bool)
    return result
}
/**
 * Esta funcion, como su propio nombre indica, lee valores Double
 * y, hasta que no has introducido un valor Double, no devuelve
 * ningun valor.
 * @author Hugo Alonso
 * @return retorna el numero Double.
 */
fun llegirDouble(): Double {
    var bool = false
    var result=0.0
    do {
        if (scan.hasNextDouble()){
            bool=true
            result=scan.nextDouble()
        }
    }while(!bool)
    return result
}
/**
 * Esta funcion, como su propio nombre indica, lee valores Long
 * y, hasta que no has introducido un valor Long, no devuelve
 * ningun valor.
 * @author Hugo Alonso
 * @return retorna el numero Long.
 */
fun llegirLong(): Long {
    var bool:Boolean = false
    var result:Long=0
    do {
        if (scan.hasNextLong()){
            bool=true
            result=scan.nextLong()
        }
    }while(!bool)
    return result
}

/**
 * Funció que llegeix un Double (diners que introdueix l'usuari en la màquina) i mira si son diners de curs legal
 * @author Max Dron
 * @since 27/12/23
 * @param pMessageErrorDT Missatge que es mostra a l'usuari per pantalla en cas de que introdueixi un tipus de dades erroni
 * @param pMessageErrorDV Missatge que es mostra a l'usuari per pantalla en cas de que introdueixi un valor incorrecte
 * @return Es retorna l'import introduit en la maquina sabent que es correcte
 */
fun llegirDinersDeCursLegal(pMessageErrorDT:String, pMessageErrorDV:String):Double{
    var outputValue:Double = 0.0
    var correctDataType:Boolean = false
    var dinersDeCursLegal = arrayOf(0.05, 0.10, 0.20, 0.50, 1.00, 2.00, 5.00, 10.00, 20.00, 50.00)
    do {
        correctDataType = scan.hasNextDouble()
        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextDouble()

            if (outputValue !in dinersDeCursLegal){
                println(YELLOW_BOLD_BRIGHT + "WARNING: " + pMessageErrorDV + RESET)
                correctDataType = false
            }
        }
        scan.nextLine()
    }while (!correctDataType)
    return outputValue
}