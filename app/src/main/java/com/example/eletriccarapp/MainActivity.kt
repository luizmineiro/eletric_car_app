package com.example.eletriccarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var preco : EditText;
    lateinit var btnCalcular : Button;
    lateinit var kmpercorrido : EditText;
    lateinit var resultado : TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews();
        setupListeners();
    }
    fun setupViews(){
        preco = findViewById(R.id.et_preco_kwh);
        kmpercorrido = findViewById(R.id.et_km_percorrido);
        btnCalcular = findViewById(R.id.btn_calcular);
        resultado = findViewById(R.id.tv_resultado);
    }

    fun setupListeners(){
        btnCalcular.setOnClickListener{
            calcular();
        }
    }

    fun calcular(){
        val precoDigitado = preco.text.toString().toFloat();
        val kmPercorridoDigitado = kmpercorrido.text.toString().toFloat();
        val result = precoDigitado/kmPercorridoDigitado;

        resultado.text = result.toString();

    }
}