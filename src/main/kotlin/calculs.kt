import java.math.BigDecimal
import java.math.RoundingMode

/**
 * Funció que agafa qualssevol Double amb molts decimals, i el retorna només amb 2, arrodonint el tercer.
 * @author Max Dron
 * @since 27/12/2023
 * @param numero Es el double que rep la funció i amb el qual treballarà
 * @return La funció retorna el mateix Double però amb 2 decimals
 */
fun redondearADosDecimales(numero: Double): Double {
    val bd = BigDecimal(numero.toString())
    val redondeado = bd.setScale(2, RoundingMode.HALF_DOWN)
    return redondeado.toDouble()
}

/**
 * Aquesta funció rep per parametre el numero de bitllet i de zones que vol l'usuari, calcula i retorna el preu del bitllet.
 * @author Max Dron
 * @since 27/12/2023
 * @param bitlletEscollit El numero de bitllet que ha escollit l'usuari
 * @param zonaEscollida El numero de zona que ha escollit l'usuari
 * @return Retorna el preu del bitllet en format Double
 */
fun calculaPreuBitllet(bitlletEscollit:Int, zonaEscollida:Int) : Double{
    var preuBitllet:Double = 0.0
    var multiplicador:Double = 0.0
    var preuBitlletFinal:Double = 0.0

    when (bitlletEscollit){
        1 -> preuBitllet = 2.40
        2 -> preuBitllet = 11.35
        3 -> preuBitllet = 40.00
        4 -> preuBitllet = 10.00
        5 -> preuBitllet = 80.00
    }
    when (zonaEscollida){
        1 -> multiplicador = 1.0
        2 -> multiplicador = 1.3125
        3 -> multiplicador = 1.8443
    }

    preuBitlletFinal = preuBitllet * multiplicador

    return redondearADosDecimales(preuBitlletFinal)


}