package com.example.eletriccarapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccarapp.R
import com.example.eletriccarapp.data.CarFactory
import com.example.eletriccarapp.ui.adapter.CarAdapter

class MainActivity : AppCompatActivity() {
    lateinit var btnCalcular: Button;
    lateinit var listaCarros: RecyclerView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews();
        setupListeners();
        setupLista();
    }

    fun setupViews() {
        btnCalcular = findViewById(R.id.btn_calcular);
        listaCarros = findViewById(R.id.rv_lista_carros);
    }

    fun setupLista() {
        val adapter = CarAdapter(CarFactory.list)
        listaCarros.adapter = adapter
    }

    fun setupListeners() {
        btnCalcular.setOnClickListener {
            startActivity(Intent(this, CalcularAutonomia::class.java))
        }
    }


}