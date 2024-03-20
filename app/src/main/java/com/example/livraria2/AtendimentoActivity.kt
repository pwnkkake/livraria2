package com.example.livraria2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AtendimentoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atendimento)

        val textoAtendimento = findViewById<TextView>(R.id.textoAtendimento)
        textoAtendimento.text = "Para atendimento, entre em contato via email: contato@livraria.com ou WhatsApp: (11) 99999-9999"
    }
}
