package tests

fun testRanges() {
    var range: IntRange = 1.rangeTo(10)

    val series = 0..100 step 2
    val series2 = 0.until(100) step 2
    val series3 = 100 downTo 0 step 2
    for (s in series3) {
//        print("$s ")
    }


    val series4 = 1500.0..5000.0
    val salario = 4000.0
//    if (salario in series4) println(true) else println(false)

    val alfabeto = "a".."z"
//    if ("C" in alfabeto) println(true) else println(false)

    val idadeArray = intArrayOf(11, 23, 44, 22, 56, 12, 19)
    println(idadeArray.max())
    println(idadeArray.min())
    println(idadeArray.average())
    val all = idadeArray.all { it > 18 }
    println(all)
    val any = idadeArray.any { it > 18 }
    println(any)
    val filter = idadeArray.filter { it > 18 }
    println(filter)
    val value = idadeArray.find { it == 19 }
    println(value)


}