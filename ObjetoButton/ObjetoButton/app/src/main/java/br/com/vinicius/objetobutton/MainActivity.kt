package br.com.vinicius.objetobutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Faz a ligação\apresentação com o layout
        setContentView(R.layout.activity_main)


        //Primeira Forma de criar o Click do Botão
        btnEnviar.setOnClickListener {
            //Adicionando o texto ao componente
            txvResultado.text= "Seja bem vindo ao inferno"

        }
    }
}