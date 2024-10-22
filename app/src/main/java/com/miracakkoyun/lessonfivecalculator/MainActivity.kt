package com.miracakkoyun.lessonfivecalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
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
    var sonucSayi=0.0
    var sayi1=0.0
    var sayi2=0.0
    var ustIslem=""
    var altIslem="0"
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
        textViewSonuc.text=altIslem

    }
    fun button7(View:View){

        ekle(button7)


    }
    fun button8(View:View){

        ekle(button8)

    }fun button9(View:View){

        ekle(button9)


    }fun button4(View:View){

        ekle(button4)


    }fun button5(View:View){

        ekle(button5)


    }fun button6(View:View){

        ekle(button6)


    }fun button1(View:View){

        ekle(button1)


    }fun button2(View:View){

        ekle(button2)


    }fun button3(View:View){

        ekle(button3)


    }fun button0(View:View){
        ekle(button0)


    }fun buttonVirgul(View:View){
        if (!textViewSonuc.text.toString().contains(".")) {
            textViewSonuc.text = textViewSonuc.text.toString() + "."
        }

    }fun buttonSilme(View:View){
        var text=textViewSonuc.text.toString()
        if(text.isNotEmpty()){
            var newText=text.dropLast(1)
            textViewSonuc.text=newText
        }

    }fun buttonBolme(View:View){

        sayiKapsulle(buttonBolme)


    }fun buttonCarpma(View:View){

        sayiKapsulle(buttonCarpma)


    }fun buttonCikarma(View:View){

        sayiKapsulle(buttonCikarma)


    }fun buttonToplama(View:View){
        sayiKapsulle(buttonToplama)



    }fun buttonEsittir(View:View){
        if(textViewİslem.text.toString().isNotEmpty()&&textViewSonuc.text.toString().isNotEmpty()){
            var yedekIslem=textViewİslem.text.toString().last()
            var ustTextSayi=textViewİslem.text.toString()
            ustTextSayi=ustTextSayi.dropLast(1)
            sayi1=ustTextSayi.toDouble()
            sayi2=textViewSonuc.text.toString().toDouble()
            println("Merhaba")
            if(yedekIslem=='+'){
                sonucSayi=sayi1+sayi2
            }else if (yedekIslem=='-'){
                sonucSayi=sayi1-sayi2
            }else if(yedekIslem=='×'){
                sonucSayi=sayi1*sayi2
            }else if(yedekIslem=='÷'){
                if(sayi2!=0.0){
                    sonucSayi=sayi1/sayi2
                }else{
                    Toast.makeText(this,"SAYILAR SIFIRA BÖLÜNEMEZ",Toast.LENGTH_LONG).show()
                }
            }
            textViewİslem.text=""
            textViewSonuc.text=sonucSayi.toString()
            sonucSayi=0.0
        }


    }fun buttonTemizleme(View:View){

        textViewİslem.text=""
        textViewSonuc.text="0"
        sonucSayi=0.0


    }
    fun ekle(button: Button){
        if(textViewSonuc.text.toString()=="0"){
            altIslem=button.text.toString()
            textViewSonuc.text=altIslem
        }else{
            altIslem=button.text.toString()
            textViewSonuc.text=textViewSonuc.text.toString()+altIslem
        }
    }
    fun sayiKapsulle(button: Button){
        altIslem=button.text.toString()
        if(textViewSonuc.text.toString().isNotEmpty() && textViewSonuc.text.toString()!="0"){
            var yedekSayi=textViewSonuc.text.toString().toDouble()
            if(altIslem=="+"){
                sonucSayi+=yedekSayi
                textViewİslem.text=sonucSayi.toString()+altIslem
                textViewSonuc.text=""
            }else if(altIslem=="-"){
                if(sonucSayi==0.0){
                    sonucSayi=yedekSayi
                }else{
                    sonucSayi-=yedekSayi
                }
                textViewİslem.text=sonucSayi.toString()+altIslem
                textViewSonuc.text=""

            }else if(altIslem=="×"){
                if(textViewİslem.text.toString().isNotEmpty()){
                    sonucSayi*=yedekSayi
                    textViewİslem.text=sonucSayi.toString()+altIslem
                    textViewSonuc.text=""
                }else{
                    textViewİslem.text=textViewSonuc.text.toString()+altIslem
                    sonucSayi=textViewSonuc.text.toString().toDouble()
                    textViewSonuc.text=""
                }


            }else if(altIslem=="÷"){
                if(textViewİslem.text.toString().isNotEmpty()){
                    if(textViewSonuc.text.toString().toInt()==0){

                        Toast.makeText(this,"TANIMSIZ OLUYOR",Toast.LENGTH_LONG).show()

                    }else{
                        var gecici=textViewİslem.text.toString().dropLast(1)
                        sonucSayi=gecici.toDouble()
                        yedekSayi=textViewSonuc.text.toString().toDouble()
                        sonucSayi=sonucSayi/yedekSayi
                        textViewİslem.text=sonucSayi.toString()+altIslem
                        textViewSonuc.text=""

                    }
                }else{

                    sonucSayi=sonucSayi/yedekSayi
                    textViewİslem.text=textViewSonuc.text.toString()+altIslem.toString()
                    textViewSonuc.text=""
                }

            }else if(altIslem=="="){
                textViewSonuc.text=sonucSayi.toString()
                textViewİslem.text=""
            }else if(altIslem=="C"){
                textViewSonuc.text="0"
                textViewİslem.text=""
            }else if(altIslem=="⌫"){
                if(textViewSonuc.text.toString().isNotEmpty()){
                    var yedek=textViewSonuc.text.dropLast(1)
                    textViewSonuc.text=yedek
                }


            }else if(altIslem==","){
                textViewSonuc.text=textViewSonuc.text.toString()+","
            }

        }else{
            textViewİslem.text=textViewİslem.text.toString().dropLast(1)+altIslem
        }




    }
















    /*fun ekle(buton: Button){

        if(textViewSonuc.text.toString()=="0"){
            textViewSonuc.text=buton.text
        }else{
            textViewSonuc.text=textViewSonuc.text.toString()+buton.text
        }
    }
    fun sayiKapsulle(buton:Button){
        if(textViewSonuc.text.toString()!=""){
            sayi1=textViewSonuc.text.toString().toInt()
            if(buton.text=="+"){
                sonucSayi+=sayi1
            }else if(buton.text=="-"){
                sonucSayi-=sayi1
            }else if(buton.text=="×"){
                sonucSayi*=sayi1
            }else if(buton.text=="÷"){
                if(sonucSayi==0){
                    sonucSayi=sayi1
                }else{
                    sonucSayi/sayi1
                }
            }
            textViewİslem.text=sonucSayi.toString()+buton.text
            textViewSonuc.text=""
        }

    }*/







    /*fun ekleMetin(buton:Button){
        textViewİslem.text=textViewİslem.text.toString()+buton.text
    }*/


}