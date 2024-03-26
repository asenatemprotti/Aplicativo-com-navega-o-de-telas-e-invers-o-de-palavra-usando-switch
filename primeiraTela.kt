package com.example.asenaterick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonsegundatela = findViewById<Button>(R.id.buttonsegundatela)

        buttonsegundatela.setOnClickListener { // atribuindo função do botao
            irsegundatela ()

        }
    }

    private fun irsegundatela() {

        val segundatela = Intent(this, segundaTela::class.java ) // ir para a segunda tela


        val nome = findViewById<EditText>(R.id.caixadetexto)
        val envianome = nome.text.toString()

segundatela.putExtra("texto", envianome)
        startActivity(segundatela)


    }
}
