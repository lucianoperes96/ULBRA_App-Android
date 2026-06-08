package com.lucianoperes.imc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val txtNome = findViewById<TextView>(R.id.txtNome)
        val txtIdade = findViewById<TextView>(R.id.txtIdade)
        val txtPeso = findViewById<TextView>(R.id.txtPeso)
        val txtAltura = findViewById<TextView>(R.id.txtAltura)
        val txtImc = findViewById<TextView>(R.id.txtImc)
        val txtClassificacao = findViewById<TextView>(R.id.txtClassificacao)
        val txtMensagem = findViewById<TextView>(R.id.txtMensagem)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        val nome = intent.getStringExtra("nome") ?: ""
        val idade = intent.getStringExtra("idade") ?: ""
        val peso = intent.getStringExtra("peso")?.toDoubleOrNull() ?: 0.0
        val altura = intent.getStringExtra("altura")?.toDoubleOrNull() ?: 0.0

        val imc = peso / (altura * altura)

        val classificacao = when {
            imc < 16 -> "Magreza Extrema"
            imc < 18.5 -> "Magreza"
            imc < 25 -> "Peso Normal"
            imc < 30 -> "Sobrepeso"
            imc < 35 -> "Obesidade Grau I"
            imc < 40 -> "Obesidade Grau II"
            else -> "Obesidade Grau III"
        }

        val mensagem = when {
            imc < 16 -> "🚨 Alerta! Seu IMC indica magreza extrema. Procure orientação médica especializada."
            imc < 18.5 -> "⚠️ Atenção! Você está abaixo do peso ideal."
            imc < 25 -> "🎉 Parabéns! Você está dentro da faixa considerada saudável."
            imc < 30 -> "⚠️ Atenção! Seu IMC indica sobrepeso. Considere hábitos mais saudáveis."
            imc < 35 -> "🚨 Alerta! Seu IMC indica obesidade grau I."
            imc < 40 -> "🚨 Alerta! Seu IMC indica obesidade grau II. É recomendável buscar acompanhamento profissional."
            else -> "🚨 Alerta! Seu IMC indica obesidade grau III. Procure orientação médica especializada."
        }

        txtNome.text = "$nome"
        txtIdade.text = "$idade anos"
        txtPeso.text = "$peso kg"
        txtAltura.text = "$altura m"
        txtImc.text = "IMC: ${String.format(Locale.US, "%.2f", imc)}"
        txtClassificacao.text = "Classificação: $classificacao"
        txtMensagem.text = mensagem

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}