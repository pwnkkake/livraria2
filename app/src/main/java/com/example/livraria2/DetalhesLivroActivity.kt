package com.example.livraria2

import Livro
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesLivroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_livro)

        // Recupere o livro enviado pela MainActivity
        val livro = intent.getSerializableExtra("livro") as Livro

        // Configurar os elementos da UI com os dados do livro
        val tituloTextView = findViewById<TextView>(R.id.tituloLivro)
        tituloTextView.text = livro.titulo

        val autorTextView = findViewById<TextView>(R.id.autorLivro)
        autorTextView.text = "Autor: ${livro.autor}"

        val temaTextView = findViewById<TextView>(R.id.temaLivro)
        temaTextView.text = "Tema: ${livro.tema}"

        val quantidadeTextView = findViewById<TextView>(R.id.quantidadeLivro)
        quantidadeTextView.text = "Quantidade: ${livro.quantidade}"

        val disponivelTextView = findViewById<TextView>(R.id.disponivelLivro)
        disponivelTextView.text = "Disponível: ${if (livro.disponivel) "Sim" else "Não"}"

        val valorTextView = findViewById<TextView>(R.id.valorLivro)
        valorTextView.text = "Valor: R$ ${livro.valor}"

    }
}
