package br.com.vinicius.multitelas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ação para o clique do botão entrar

        btnEntrar.setOnClickListener {

            //Captando os dados digitados na editText usuário e senha

            var usuario = edtUsuario.editableText.toString().trim()
            var senha = edtSenha.editableText.toString().trim()


            //Verificando se o usuario e a senha existem

            if (usuario == "Vinicius" && senha== "1234"){

                //Trocando de tela
                val intent = Intent(this,ResultadoActivity::class.java)


                //Executando a activity
                startActivity(intent)

            }

            else{

            Toast.makeText(this, "ACESSO NEGADO",Toast.LENGTH_LONG).show()

            }


        }



    }
}
