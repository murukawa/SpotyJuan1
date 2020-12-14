package com.example.ejemplost5

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplost5.Elementos.Cancion
import com.example.ejemplost5.adapters.RecycleAdapter

class ActivityRadios : AppCompatActivity() {
    lateinit var recyclerViewCanciones: RecyclerView
    private val recycleAdapter: RecycleAdapter = RecycleAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radios)
        setUpRecycleView()
    }

    fun setUpRecycleView() {
        recyclerViewCanciones = findViewById<RecyclerView>(R.id.recycleRadios)
        recyclerViewCanciones.setHasFixedSize(true)
        recyclerViewCanciones.layoutManager = LinearLayoutManager(this)
        recycleAdapter.RecycleAdapter(Cancion.canciones(), this)
        recyclerViewCanciones.adapter = recycleAdapter

    }
}
