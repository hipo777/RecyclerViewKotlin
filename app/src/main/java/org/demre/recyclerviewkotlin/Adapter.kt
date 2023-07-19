package org.demre.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.demre.recyclerviewkotlin.databinding.ItemLayoutBinding

/*
    Heredar RecyclerView.Adapter
    creaciones de los métodos: los 3
    crear clase anidada ViewHolder, que hereda de la clase ViewHolder
    agregar constructor
    crear objeto, data class
    crear lista
    asignar tamaño de la lista en getItemCount

 */

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>(){

    val pokemones = mutableListOf<Pokemon>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    class ViewHolder(binding: ItemLayoutBinding) :RecyclerView.ViewHolder(binding.root) {

    }

}