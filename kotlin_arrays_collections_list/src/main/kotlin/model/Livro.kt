package model

data class Livro(
    val titulo: String,
    val autor: String,
    val ano: Long,
    val editora: String? = null
) : Comparable<Livro> {

    override fun compareTo(other: Livro): Int {
        return this.ano.compareTo(other.ano)
    }

}