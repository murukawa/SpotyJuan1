package com.example.ejemplost5.Elementos

import android.app.Activity
import com.example.ejemplost5.R
import java.io.Serializable

public class Cancion(
    val artista: String,
    val titulo: String,
    val portada: Int,
    val sonido: Int,
) : Serializable {
    companion object {
        public fun canciones(): Array<Cancion> {

            val artistas = arrayOf<String>(
                "BattleBeast",
                "Caramelos de cianuro",
                "Viniloversus",
                "MotleyCrue",
                "DefLeppard",
                "Quiet Riot",
                "Scorpions",
                "Los Mesoneros",
                "Moderato",
                "Twenty One Pilots"
            )
            var titulos: Array<String> = arrayOf<String>(
                "King For A Day",
                "Tocado Por Un Angel",
                "Dos Secretos",
                "Live Wire",
                "Pour Some Suggar On Me",
                "Cum On Feel The Noize",
                "Rocke you like a hurricane",
                "Dime Como Tu Quieras",
                "Ya Lo Veia Venir",
                "Stressed Out"
            )
            val portadas = arrayOf<Int>(
                R.drawable.battlebeast,
                R.drawable.caramelosdecianuro,
                R.drawable.viniloversus,
                R.drawable.motleycrue,
                R.drawable.deflepard,
                R.drawable.quiet,
                R.drawable.scorpions,
                R.drawable.losmesoneros,
                R.drawable.moderato,
                R.drawable.twentyonepilots
            )
            val sonidos = arrayOf<Int>(
                R.raw.kingforada,
                R.raw.tocadoporunange,
                R.raw.dossecreto,
                R.raw.livewir,
                R.raw.poursomesuga,
                R.raw.cumon,
                R.raw.rockyoulikeahurrican,
                R.raw.dimecomotuquiera,
                R.raw.yaloveiaveni,
                R.raw.stressedou
            )
            val canciones: Array<Cancion> = arrayOf<Cancion>(


                Cancion(artistas[0], titulos[0], portadas[0], sonidos[0]),
                Cancion(artistas[1], titulos[1], portadas[1], sonidos[1]),
                Cancion(artistas[2], titulos[2], portadas[2], sonidos[2]),
                Cancion(artistas[3], titulos[3], portadas[3], sonidos[3]),
                Cancion(artistas[4], titulos[4], portadas[4], sonidos[4]),
                Cancion(artistas[5], titulos[5], portadas[5], sonidos[5]),
                Cancion(artistas[6], titulos[6], portadas[6], sonidos[6]),
                Cancion(artistas[7], titulos[7], portadas[7], sonidos[7]),
                Cancion(artistas[8], titulos[8], portadas[8], sonidos[8]),
                Cancion(artistas[9], titulos[9], portadas[9], sonidos[9]),
            )

            return canciones
        }

    }
}