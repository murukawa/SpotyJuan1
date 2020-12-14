package com.example.ejemplost5

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplost5.Elementos.Cancion
import com.example.ejemplost5.adapters.RecycleAdapter

class ActivityVideo : AppCompatActivity() {
    var simpleVideoView: VideoView? = null
    var mediaControls: MediaController? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        simpleVideoView = findViewById<View>(R.id.videoView) as VideoView

        if (mediaControls == null) {
            mediaControls = MediaController(this)
            mediaControls!!.setAnchorView(this.simpleVideoView)

        }
        simpleVideoView!!.setMediaController(mediaControls)
        simpleVideoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.king_for_a_day))
        simpleVideoView!!.requestFocus()

        simpleVideoView!!.start()

        simpleVideoView!!.setOnCompletionListener {
            Toast.makeText(
                applicationContext,
                "Video completed",
                Toast.LENGTH_LONG
            ).show()
        }
        simpleVideoView!!.setOnErrorListener { mp, what, extra ->
            Toast.makeText(
                applicationContext,
                "An Error ocurred while playing video",
                Toast.LENGTH_LONG
            ).show()
            false
        }


    }


}