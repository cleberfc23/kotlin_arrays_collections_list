package model

data class Prateleira(
    val genero: String,
    val livros: List<Livro?>
) {

    fun organizarPorAutor(): MutableList<Livro?> {
        return livros.sortedBy { it?.autor }.toMutableList()
    }

    fun organizarPorAno(): MutableList<Livro?> {
        return livros.sortedBy { it?.ano }.toMutableList()
    }
}