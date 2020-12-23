package br.com.vinicius.objetoedittext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Criando ação para o botão enviar

        btnEnviar.setOnClickListener {

            //Armazena o que foi digitado no editText dentro de uma variavel
            var nome = edtNome.editableText.toString().trim()

            if(nome.isNotEmpty()){

                //Mostrar no textView
                txvResultado.text = nome

                //Limpando o editText
                edtNome.text.clear()

            }

            else{

                Toast.makeText(this,"Preencha o campo nome", Toast.LENGTH_LONG).show()

            }



            }

        //Criação do botão limpar

        btnLimpar.setOnClickListener {

            txvResultado.text = "Resultado"

        }





        }
    }

