package com.example.eletriccarapp.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eletriccarapp.R

class CalcularAutonomia : AppCompatActivity() {
    lateinit var kmpercorrido : EditText;
    lateinit var resultado : TextView;
    lateinit var preco : EditText;
    lateinit var btnCalcular : Button;
    lateinit var btnClose : ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupViews();
        setupListeners();
    }

    fun setupViews(){
        preco = findViewById(R.id.et_preco_kwh);
        kmpercorrido = findViewById(R.id.et_km_percorrido);
        resultado = findViewById(R.id.tv_resultado);
        btnCalcular = findViewById(R.id.btn_calcular);
        btnClose = findViewById(R.id.iv_close);
    }

    fun calcular(){
        val precoDigitado = preco.text.toString().toFloat();
        val kmPercorridoDigitado = kmpercorrido.text.toString().toFloat();
        val result = precoDigitado/kmPercorridoDigitado;

        resultado.text = result.toString();
    }

    fun setupListeners(){
        btnCalcular.setOnClickListener{
           calcular();
        }
        btnClose.setOnClickListener{
            finish();
        }
    }

}