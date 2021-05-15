package br.com.prynoa.calculatop

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var prNmr: String
    lateinit var sgdNmr: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        prNmr +=


        fun Numero(view: View) {


            while(operador=="") {

                var prNmr = "0"
                btn0.setOnClickListener {
                    prNmr += "0"
                }
                btn1.setOnClickListener {
                    prNmr += "1"
                }
                btn2.setOnClickListener {
                    prNmr += "2"
                }
                btn3.setOnClickListener {
                    prNmr += "3"
                }
                btn4.setOnClickListener {
                    prNmr += "4"
                }
                btn5.setOnClickListener {
                    prNmr += "5"
                }
                btn6.setOnClickListener {
                    prNmr += "6"
                }
                btn7.setOnClickListener {
                    prNmr += "7"
                }
                btn8.setOnClickListener {
                    prNmr += "8"
                }
                btn9.setOnClickListener {
                    prNmr += "9"
                }
                btnPonto.setOnClickListener {
                    if (txvResult.text.contains(.))
                    else{
                    prNmr+="."
                }

                }
            }

        }

        }



        fun operador(view: View) {

            btnSoma.setOnClickListener {
                if (prNmr != "") {
                    return 1

                }
            }

            btnSub.setOnClickListener {
                if (prNmr != "") {
                    return 2
                }
            }

            btnDiv.setOnClickListener {
                if (prNmr != "") {
                    return 3
                }
            }

            btnMulti.setOnClickListener{
                if (prNmr != "") {
                    return 4
                }
            }

            btnPorc.setOnClickListener{
                if (prNmr != "") {
                    return 5
                }
            }

        }

        fun igual(view: View) {
            btnIgual.setOnClickListener {

                if(operador==1) {
                    resultado = prNmr + sgdNmr
                }else if(operador==2) {
                    resultado = prNmr - sgdNmr
                }else if(operador==3) {
                    resultado = prNmr / sgdNmr
                }else if(operador==4) {
                    resultado = prNmr * sgdNmr
                }else if(operador==5){
                    resultado = (prNmr * sgdNmr)




                val alerta = AlertDialog.Builder(this)
                alerta.setTitle("Resultado")
                alerta.setMessage("O seu resultado é $resultado")
                alerta.setPositiveButton("OK") {
                    //setar variavel pra zero
                }


            }


        }
    }


}
