package org.demre.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.demre.recyclerviewkotlin.databinding.ActivityMainBinding
/* Pasos para crear un RecyclerView

 [ ] Item Layout
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

    }
}