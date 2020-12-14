package com.example.ejemplost5.adapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.ejemplost5.Elementos.Cancion
import com.example.ejemplost5.R

class MyListAdapter(
    private val context: Activity,
    private val canciones: Array<Cancion>,
) : ArrayAdapter<Cancion>(context, R.layout.coustomlist, canciones) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.coustomlist, null, true)


        val tituloCancion: TextView = rowView.findViewById(R.id.tituloCancion) as TextView
        var portadaCancion: ImageView = rowView.findViewById(R.id.portadaCancion) as ImageView
        val artistaCancion: TextView = rowView.findViewById(R.id.artistaCancion) as TextView

        tituloCancion.text = canciones[position].titulo
        portadaCancion.setImageResource(canciones[position].portada)
        artistaCancion.text = canciones[position].artista



        return rowView
    }

}