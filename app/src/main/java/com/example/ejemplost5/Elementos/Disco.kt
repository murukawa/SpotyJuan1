package com.example.ejemplost5.Elementos

import java.io.Serializable

class Disco (
    val canciones: Array<Cancion>,
    var titulo: String,
    var artista: String,
    var portada: Int
):Serializable {
    companion object {
        fun creardiscos(): Array<Disco> {
            val titulosDiscos = arrayOf<String>(
                "Bringer of Pain",
                "8",
                "El dia es hoy",
                "Too Fast For Love",
                "Hysteria",
                "Metal Health",
                "Love at First Sting",
                "Pangea",
                "Queremos rock",
                "Stressed Out"
            )

            val cancionesDisp = Cancion.canciones()

            val discos = arrayOf(
                Disco(
                    cancionesDisp,
                    titulosDiscos[0],
                    cancionesDisp[0].artista,
                    cancionesDisp[0].portada
                ),
                Disco(
                    cancionesDisp,
                    titulosDiscos[1],
                    cancionesDisp[1].artista,
                    cancionesDisp[1].portada
                ),
                Disco(
                    cancionesDisp,
                    titulosDiscos[2],
                    cancionesDisp[2].artista,
                    cancionesDisp[2].portada
                ),
                Disco(
                    cancionesDisp,
                    titulosDiscos[3],
                    cancionesDisp[3].artista,
                    cancionesDisp[3].portada
                ),
                Disco(
                    cancionesDisp,
                    titulosDiscos[4],
                    cancionesDisp[4].artista,
                    cancionesDisp[4].portada
                ),
                Disco(
                    cancionesDisp,
                    titulosDiscos[5],
                    cancionesDisp[5].artista,
                    cancionesDisp[5].portada
                ),
                Disco(
                    cancionesDisp,
                    titulosDiscos[6],
                    cancionesDisp[6].artista,
                    cancionesDisp[6].portada
                ),
                Disco(
                    cancionesDisp,
                    titulosDiscos[7],
                    cancionesDisp[7].artista,
                    cancionesDisp[7].portada
                ),
                Disco(
                    cancionesDisp,
                    titulosDiscos[8],
                    cancionesDisp[8].artista,
                    cancionesDisp[8].portada
                ),
                Disco(
                    cancionesDisp,
                    titulosDiscos[9],
                    cancionesDisp[9].artista,
                    cancionesDisp[9].portada
                ),
            )
            return discos


        }

    }
}