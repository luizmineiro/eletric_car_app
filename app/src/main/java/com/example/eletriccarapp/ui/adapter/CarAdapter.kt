package com.example.eletriccarapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccarapp.R
import com.example.eletriccarapp.domain.Carro

class CarAdapter(private val cars: List<Carro>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    // Cria uma nova view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)

        return ViewHolder(view)
    }

    // Pega o conteudo da view e troca pela informacao de item de uma lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.preco.text = cars[position].preco
        holder.bateria.text = cars[position].bateria
        holder.potencia.text = cars[position].potencia
        holder.recarga.text = cars[position].recarga
    }

    // Pega a quantidade de itens da lista
    override fun getItemCount(): Int = cars.size


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val preco: TextView
        val bateria: TextView
        val potencia: TextView
        val recarga: TextView


        init {
            itemView.apply {
                preco = findViewById(R.id.tv_bateria_value)
                bateria = findViewById(R.id.tv_bateria_value)
                potencia = findViewById(R.id.tv_potencia_value)
                recarga = findViewById(R.id.tv_recarga_value)
            }
        }
    }
}


