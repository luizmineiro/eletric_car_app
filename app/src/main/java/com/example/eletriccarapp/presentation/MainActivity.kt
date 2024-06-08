package com.example.eletriccarapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.eletriccarapp.R

class MainActivity : AppCompatActivity() {
    lateinit var btnCalcular : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews();
        setupListeners();
    }
    fun setupViews(){
          btnCalcular = findViewById(R.id.btn_calcular);
    }

    fun setupListeners(){
        btnCalcular.setOnClickListener{
            startActivity(Intent(this,CalcularAutonomia::class.java))
        }
    }


}