package com.lucianoperes.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome = findViewById<EditText>(R.id.edtNome)
        val edtIdade = findViewById<EditText>(R.id.edtIdade)
        val edtPeso = findViewById<EditText>(R.id.edtPeso)
        val edtAltura = findViewById<EditText>(R.id.edtAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {

            val intent = Intent(this, ResultadoActivity::class.java)

            intent.putExtra("nome", edtNome.text.toString())
            intent.putExtra("idade", edtIdade.text.toString())
            intent.putExtra("peso", edtPeso.text.toString())
            intent.putExtra("altura", edtAltura.text.toString())

            startActivity(intent)
        }
    }
}