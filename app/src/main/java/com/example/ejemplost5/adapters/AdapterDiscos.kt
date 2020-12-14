package com.example.ejemplost5.adapters

import android.app.Activity
import android.media.Image
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.ejemplost5.Elementos.Disco
import com.example.ejemplost5.R
import kotlinx.android.synthetic.main.activity_disco.view.*
import org.w3c.dom.Text

class AdapterDiscos(
    private val context: Activity,
    private val discos: Array<Disco>
) : ArrayAdapter<Disco>(context, R.layout.coustomlist, discos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val cardView = inflater.inflate(R.layout.activity_disco, null, true)

        var portada: ImageView = cardView.portadaDisco
        var titulo: TextView = cardView.tituloDisco
        var artista: TextView = cardView.artistaDisco
        titulo.text = discos[position].titulo
        portada.setImageResource(discos[position].portada)
        artista.text = discos[position].artista



        return cardView
    }

}

