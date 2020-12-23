package br.com.vinicius.prefernciacompartilhada

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Declarar
    //Elementos para o editor de gravação de preferências
    lateinit var minhaPreferencia : SharedPreferences
    lateinit var meuEditor : SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Vincular ou instanciar
        minhaPreferencia  = getSharedPreferences("meusDados", Context.MODE_PRIVATE)
        meuEditor = minhaPreferencia.edit()

    }

    fun gravar(view: View){

        val texto = edtDigitenome.editableText.toString().trim()
        if (texto.isEmpty()){
            Toast.makeText(this, "Preencha o campo", Toast.LENGTH_LONG).show()
        }else{
            meuEditor.putString("textoDigitado",texto).commit()
        }

    }

    fun recuperar(view: View){

        txvResultado.text = minhaPreferencia.getString("textoDigitado","Deu ruim")

    }

}
