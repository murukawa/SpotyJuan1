package com.example.ejemplost5

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejemplost5.Elementos.Cancion
import com.example.ejemplost5.Elementos.Disco.*
import com.example.ejemplost5.Elementos.Cancion.*
import com.example.ejemplost5.Elementos.Disco

import com.example.ejemplost5.adapters.AdapterDiscos
import kotlinx.android.synthetic.main.activity_discos.*
import kotlinx.android.synthetic.main.activity_main.*

public class ActivityDiscos : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        val discos: Array<Disco> = Disco.creardiscos()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discos)
        val adapterDiscos = AdapterDiscos(this, discos)
        gridDiscos.adapter = adapterDiscos

        gridDiscos.setOnItemClickListener() { _, _, position, _ ->
             val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("disco", discos[position].canciones)
            startActivity(intent)


        }


    }


}