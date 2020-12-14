package com.example.ejemplost5

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.ejemplost5.Elementos.Cancion
import com.example.ejemplost5.adapters.MyListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_web.*

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    private var reproduciendo: MediaPlayer = MediaPlayer()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = intent.getSerializableExtra("disco") as? Array<*>
        val canciones = Cancion.canciones()
        val MyListAdapter = MyListAdapter(this, canciones)
        list.adapter = MyListAdapter
        var numcancion = 0



        buttGrid.setOnClickListener() {
            val intent = Intent(this, ActivityDiscos::class.java)
            startActivity(intent)

        }

        buttRecycle.setOnClickListener() {
            val intent = Intent(this, ActivityRadios::class.java)
            startActivity(intent)
        }
        buttVideo.setOnClickListener() {
            val intent = Intent(this, ActivityVideo::class.java)
            startActivity(intent)
        }
        buttWeb.setOnClickListener() {
            val intent = Intent(this, ActivityWeb::class.java)
            startActivity(intent)
        }
        list.setOnItemClickListener() { adapterView, view, position, id ->
            if (reproduciendo.isPlaying) {
                reproduciendo.stop()
                println(canciones.size.toString() + " " + numcancion)

            }

            reproduciendo = MediaPlayer.create(this, canciones[position].sonido)
            numcancion = position


            reproduciendo.start()

        }
        play.setOnClickListener() { view ->

            reproduciendo.start()

        }
        pause.setOnClickListener() { view ->
            if (reproduciendo.isPlaying) {

                reproduciendo.pause()
            }
        }
        next.setOnClickListener { view ->
            if (reproduciendo?.isPlaying) {
                reproduciendo.stop()
                println(canciones.size.toString() + " " + numcancion)
                if (numcancion < canciones.size - 1) {
                    numcancion += 1
                    reproduciendo = MediaPlayer.create(this, canciones[numcancion].sonido)

                } else {
                    numcancion = 0
                    reproduciendo = MediaPlayer.create(this, canciones[numcancion].sonido)

                }

                reproduciendo.start()
            }
        }
        back.setOnClickListener { view ->
            if (reproduciendo?.isPlaying) {
                reproduciendo.stop()
                if (numcancion == 0) {

                    numcancion = canciones.size - 1

                    reproduciendo = MediaPlayer.create(this, canciones[numcancion].sonido)
                } else {

                    reproduciendo = MediaPlayer.create(this, canciones[numcancion - 1].sonido)

                }
                numcancion -= 1
                reproduciendo.start()
            }
        }

    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        if (fromUser) reproduciendo?.seekTo(progress)
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        TODO("Not yet implemented")
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        TODO("Not yet implemented")
    }


}