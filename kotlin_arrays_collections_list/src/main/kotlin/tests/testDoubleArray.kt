package tests

fun testDoubleArray() {

    val salarioDouble = doubleArrayOf(1000.0, 1010.0, 1500.9, 1300.0)
    val aumento = 1.1

    salarioDouble.forEachIndexed { index, salario ->
        println("$index __ $salario")
    }

    println("novo salário após aumento: ")
    for (indice in salarioDouble.indices) {
        salarioDouble[indice] = salarioDouble[indice] * aumento
        println("${indice} ----- ${salarioDouble[indice]}")
    }

}