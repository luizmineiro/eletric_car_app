package com.example.eletriccarapp.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccarapp.R

class CarAdapter(private val cars: List<String>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    // Cria uma nova view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)

        return ViewHolder(view)
    }

    // Pega o conteudo da view e troca pela informacao de item de uma lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = cars[position]
    }

    // Pega a quantidade de itens da lista
    override fun getItemCount(): Int = cars.size


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView

        init {
            textView = itemView.findViewById(R.id.tv_bateria_value)
        }
    }
}


