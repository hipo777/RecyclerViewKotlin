package org.demre.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.demre.recyclerviewkotlin.databinding.ItemLayoutBinding

/*
    implementar clase adapter
    Heredar RecyclerView.Adapter
    creaciones de los métodos: los 3
    crear clase anidada ViewHolder, que hereda de la clase ViewHolder
    agregar constructor
    crear objeto, data class
    crear lista
    asignar tamaño de la lista en getItemCount
    definir Binding class del item
    en el constructor cambiar el view por el binding
 */

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {

    var pokemones = mutableListOf<Pokemon>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = pokemones[position]
        holder.bind(item)

    }

    fun setData(pokedex: List<Pokemon>) {
        this.pokemones=pokedex.toMutableList()

    }

    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(pokemon: Pokemon) {
            binding.tVnombre.text = pokemon.nombre
            binding.tVtipo.text = pokemon.tipo

        }
    }
}

