import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class LivroAdapter(private val context: Context, private val listaLivros: List<Livro>) : ArrayAdapter<Livro>(context, 0, listaLivros) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false)
        }

        val livroAtual = listaLivros[position]
        val textView = listItemView!!.findViewById<TextView>(android.R.id.text1)
        textView.text = livroAtual.titulo

        return listItemView
    }
}
