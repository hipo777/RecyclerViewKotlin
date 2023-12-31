package org.demre.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.demre.recyclerviewkotlin.databinding.ActivityMainBinding
/* Pasos para crear un RecyclerView

 [X] Item Layout
 [X] Agregar constraints
 [X] Altura del item layout a wrap content
 [X] Definir Id
 [ ] Layout con recycler view
 [ ] Asignar layout manager
 [ ] Adapter + ViewHolder
 [ ] Obtener los datos

*/


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()

    }

    private fun initAdapter() {
        val adapter = Adapter()
        val pokedex = Pokedex.getPokedex()
        adapter.setData(pokedex)
        binding.rVpokemon.adapter=adapter
    }
}