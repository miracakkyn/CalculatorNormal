package com.miracakkoyun.lessonfivecalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var button0: Button
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var buttonBolme: Button
    private lateinit var buttonCarpma: Button
    private lateinit var buttonCikarma: Button
    private lateinit var buttonToplama: Button
    private lateinit var buttonEsittir: Button
    private lateinit var buttonTemizle: Button
    private lateinit var buttonSilme: Button
    private lateinit var buttonVirgul: Button
    private lateinit var textViewİslem: TextView
    private lateinit var textViewSonuc: TextView
    var sonucSayi=0
    var sayi1=0
    var sayi2=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        button0=findViewById(R.id.button0)
        button1=findViewById(R.id.button1)
        button2=findViewById(R.id.button2)
        button3=findViewById(R.id.button3)
        button4=findViewById(R.id.button4)
        button5=findViewById(R.id.button5)
        button6=findViewById(R.id.button6)
        button7=findViewById(R.id.button7)
        button8=findViewById(R.id.button8)
        button9=findViewById(R.id.button9)
        buttonBolme=findViewById(R.id.buttonBolme)
        buttonCarpma=findViewById(R.id.buttonCarpma)
        buttonCikarma=findViewById(R.id.buttonCikarma)
        buttonToplama=findViewById(R.id.buttonToplama)
        buttonEsittir=findViewById(R.id.buttonEsittir)
        buttonTemizle=findViewById(R.id.buttonTemizleme)
        buttonSilme=findViewById(R.id.button)
        buttonVirgul=findViewById(R.id.buttonVirgul)
        textViewSonuc=findViewById(R.id.textViewSonuc)
        textViewİslem=findViewById(R.id.textViewİslem)


    }
    fun button7(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "7"


    }
    fun button8(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "8"

    }fun button9(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "9"

    }fun button4(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "4"

    }fun button5(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "5"

    }fun button6(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "6"

    }fun button1(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "1"

    }fun button2(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "2"

    }fun button3(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "3"

    }fun button0(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "0"

    }fun buttonVirgul(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ ","

    }fun buttonSilme(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "7"

    }fun buttonBolme(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "7"

    }fun buttonCarpma(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "7"

    }fun buttonCikarma(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "7"

    }fun buttonToplama(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "7"

    }fun buttonEsittir(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "7"

    }fun buttonTemizleme(View:View){

        textViewİslem.text=textViewİslem.text.toString()+ "7"

    }


}