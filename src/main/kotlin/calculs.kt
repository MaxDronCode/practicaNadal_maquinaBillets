import java.math.BigDecimal
import java.math.RoundingMode

fun redondearADosDecimales(numero: Double): Double {
    val bd = BigDecimal(numero.toString())
    val redondeado = bd.setScale(2, RoundingMode.HALF_DOWN)
    return redondeado.toDouble()
}

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