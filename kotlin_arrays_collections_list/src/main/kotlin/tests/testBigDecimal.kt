package tests

import java.math.BigDecimal
import java.math.RoundingMode

fun testBigDecimal() {

    val salario = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    val aumento: BigDecimal = "1.1".toBigDecimal()
    val salarioAumentado = salario.map { salario ->
        if (salario < "5000.00".toBigDecimal()) salario + "500.00".toBigDecimal()
        else (salario * aumento).setScale(2, RoundingMode.UP)
    }.toTypedArray()
    println(salario.contentToString())
    println(salarioAumentado.contentToString())

}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    val array = Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
    return array
}

fun aumento() {

}