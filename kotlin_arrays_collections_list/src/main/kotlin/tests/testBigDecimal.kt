package tests

import java.math.BigDecimal
import java.math.RoundingMode

/*----------------------------------------------------------------------------------------------------------------------
- Criação de extension functions
- Utilizar outras funções da linguagem, como reduce() e fold()
- Compor chamadas de funções para chegar a um resultado
----------------------------------------------------------------------------------------------------------------------*/

fun testBigDecimal() {

    val salario = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    val aumento: BigDecimal = "1.1".toBigDecimal()
    val salarioAumentado = salario.map { salario ->
        calculaAumento(salario, aumento)
    }.toTypedArray()
    println(salario.contentToString())
    println(salarioAumentado.contentToString())
    println("Gasto inicial: R$${salarioAumentado.somatoria()}")

    val meses = "6".toBigDecimal()
    val gastoSemestral = salarioAumentado.fold(salarioAumentado.somatoria()) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto semestral: R$${gastoSemestral}")

    val salariosOrdenados = salarioAumentado.sorted()
    val tresMaioresSalarios = salariosOrdenados.takeLast(3).toTypedArray()
    println("Media dos tres maiores salarios: R$${tresMaioresSalarios.media()}")

}

private fun calculaAumento(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000.00".toBigDecimal()) salario + "500.00".toBigDecimal()
    else (salario * aumento).setScale(2, RoundingMode.UP)

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    val array = Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
    return array
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isNotEmpty()) {
        (this.somatoria()) / this.size.toBigDecimal()

    } else {
        BigDecimal.ZERO
    }
}


fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}



