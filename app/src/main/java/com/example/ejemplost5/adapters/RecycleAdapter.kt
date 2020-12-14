package com.example.ejemplost5.adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplost5.Elementos.Cancion
import com.example.ejemplost5.R
import kotlinx.android.synthetic.main.activity_radio.view.*

class RecycleAdapter : RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {
    lateinit var canciones: Array<Cancion>
    lateinit var context: Context

    fun RecycleAdapter(canciones: Array<Cancion>, context: Context) {
        this.canciones = canciones
        this.context = context

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val portada = view.findViewById(R.id.portadaRadio) as ImageView
        val titulo = view.findViewById(R.id.nombreRadio) as TextView
        val autor = view.findViewById(R.id.artistaRadio) as TextView

        fun bind(cancion: Cancion, context: Context) {
            portada.setImageResource(cancion.portada)
            titulo.text = cancion.titulo
            autor.text = cancion.artista


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.activity_radio, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = canciones[position]
        holder.bind(item, context)

    }

    override fun getItemCount(): Int {
        return canciones.size
    }

}