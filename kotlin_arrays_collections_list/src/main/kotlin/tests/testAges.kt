package tests


fun testAges() {
    val ages = intArrayOf(3, 4, 5, 6, 7, 8, 9, 10, 44)
    val max = ages.max()
    println(max.toString())

    ages.forEach {
        println(it.toString())
    }

    for (age in ages) {
        println(age.toString())
    }
}