package br.com.GustavoAlmeida.podedirigir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEntrar.setOnClickListener {

            val nome = edtNome.editableText.toString().trim()
            if (nome.isNotEmpty()){
                val intent = Intent(this, Resultado::class.java)
                intent.putExtra("nome",nome)
                startActivity(intent)

            }else{
                Toast.makeText(this, "Digite um nome!!!!", Toast.LENGTH_LONG).show()
            }
        }
    }
}
