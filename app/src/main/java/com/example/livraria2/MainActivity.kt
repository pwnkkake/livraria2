package com.example.livraria2

import Livro
import LivroAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaLivros = getListaLivros()
        val adapter = LivroAdapter(this, listaLivros)
        val listView = findViewById<ListView>(R.id.listaLivros)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetalhesLivroActivity::class.java)
            intent.putExtra("livro", listaLivros[position])
            startActivity(intent)
        }
    }

    private fun getListaLivros(): List<Livro> {
        return listOf(
            Livro("Dom Quixote", "Miguel de Cervantes", 5, true, "Romance", 39.90),
            Livro("Guerra e Paz", "Leo Tolstoy", 3, true, "Ficção Histórica", 59.90),
            Livro("A Montanha Mágica", "Thomas Mann", 4, true, "Ficção", 45.00),
            Livro("Cem Anos de Solidão", "Gabriel García Márquez", 6, true, "Realismo Mágico", 50.00),
            Livro("Ulysses", "James Joyce", 7, true, "Modernismo", 70.00),
            Livro("A Divina Comédia", "Dante Alighieri", 2, true, "Épico", 65.00),
            Livro("Em Busca do Tempo Perdido", "Marcel Proust", 4, false, "Modernismo", 80.00),
            Livro("Moby Dick", "Herman Melville", 5, true, "Aventura", 40.00),
            Livro("O Processo", "Franz Kafka", 3, true, "Ficção", 33.90),
            Livro("A Ilíada", "Homero", 2, true, "Poema Épico", 55.00)
        )
    }
}
