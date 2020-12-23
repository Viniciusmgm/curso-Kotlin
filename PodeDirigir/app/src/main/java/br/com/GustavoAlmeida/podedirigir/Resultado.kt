package br.com.GustavoAlmeida.podedirigir

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.content_resultado.*

class Resultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val nome = intent.getStringExtra("nome")

        txvNome.text = "Seja Bem Vindo(a) $nome"

        var listaIdades = arrayListOf<Int>()

        for(idade in 1..100) {
            listaIdades.add(idade)
        }

        var idadeAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listaIdades)

        spnIdades.adapter = idadeAdapter

        var idadeSelecionada = spnIdades.selectedItem as Int

        btnVerificar.setOnClickListener {
            var idadeSelecionada = spnIdades.selectedItem as Int
            if (idadeSelecionada < 18) {
                txvResultado.text = "Você não pode dirigir"
            } else {
                txvResultado.text = "Você pode dirigir"
            }



        }
    }

}
