package com.example.livraria2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class CarrinhoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrinho)

        // Exemplo: Exibir uma mensagem simples. Adapte conforme necessário.
        val textoCarrinho = findViewById<TextView>(R.id.textoCarrinho)
        textoCarrinho.text = "Itens no carrinho: (exemplo)"
    }
}
