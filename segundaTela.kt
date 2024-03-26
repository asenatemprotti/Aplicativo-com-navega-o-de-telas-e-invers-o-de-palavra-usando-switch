package com.example.asenaterick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val chave = findViewById<Switch>(R.id.chaveReverso)
        val escondida = findViewById<TextView>(R.id.textoSegundaTela)
        val adivinha = intent.extras
        var palavraprimeiratela = adivinha?.getString("texto").toString()

        println(palavraprimeiratela)
        escondida.setText(palavraprimeiratela)

        chave.setOnClickListener(){
            if (chave.isChecked) {
                val reversedPalavra = palavraprimeiratela.reversed()
                println(reversedPalavra)
                escondida.setText(reversedPalavra)
            }

            else {
                println(palavraprimeiratela)
                escondida.setText(palavraprimeiratela)
            }
        }


    }
}
