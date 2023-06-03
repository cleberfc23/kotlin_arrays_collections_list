package tests

import model.Livro

fun testLists() {

    val livro1 = Livro(
        titulo = "Grande Sertão Veredas",
        autor = "João Guimarães Rosa",
        ano = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        ano = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        ano = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        ano = 1865,
        editora = "Editora B"
    )

    val listaLivros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)
//    listaLivros.imprimeFormatado()
    val listaLivrosOrdenada = listaLivros.sorted().toMutableList()
//    listaLivrosOrdenada.imprimeFormatado()

    val listaLivrosOrdenadaTitulo = listaLivros.sortedBy {
        it.titulo
    }.toMutableList()
//    listaLivrosOrdenadaTitulo.imprimeFormatado()

    val listaFiltrada = listaLivros.filter {
        it.titulo == "Iracema"
    }.sortedBy {
        it.titulo
    }.toMutableList()

    val listaFiltrada2 = listaLivros.filter {
        it.titulo.startsWith("M")
    }.sortedBy {
        it.titulo
    }.toMutableList()
//    listaFiltrada2.imprimeFormatado()


    val listaFiltrada3 = listaLivros.filter {
        it.titulo.startsWith("M")
    }.sortedBy {
        it.ano
    }.map { it.titulo }.toMutableList()

    println(listaFiltrada3)


}


fun MutableList<Livro>.imprimeFormatado() {
    val joinToString = this.joinToString(separator = "\n") {
        " >${it.titulo} - ${it.autor} - ${it.ano}"
    }
    println(joinToString)
    println("----")
}