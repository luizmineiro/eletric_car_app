package com.example.eletriccarapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccarapp.R

class MainActivity : AppCompatActivity() {
    lateinit var btnCalcular : Button;
    lateinit var listaCarros : RecyclerView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews();
        setupListeners();
        setupLista();
    }
    fun setupViews(){
        btnCalcular = findViewById(R.id.btn_calcular);
        listaCarros = findViewById(R.id.rv_lista_carros);
    }

    fun setupLista(){
        var dados = arrayOf(
            "Tiramisu", "Snow Cone", "Red Velvet Cake", "Quince Tar", "Pistachio Ice Cream", "Oreo", "Nougat", "Marshmallow", "Lollipop", "KitKat",
        )
        //var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dados)
        //listaCarros.adapter = adapter
    }

    fun setupListeners(){
        btnCalcular.setOnClickListener{
            startActivity(Intent(this,CalcularAutonomia::class.java))
        }
    }


}