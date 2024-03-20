import java.io.Serializable

data class Livro(
    val titulo: String,
    val autor: String,
    val quantidade: Int,
    val disponivel: Boolean,
    val tema: String,
    val valor: Double
) : Serializable
