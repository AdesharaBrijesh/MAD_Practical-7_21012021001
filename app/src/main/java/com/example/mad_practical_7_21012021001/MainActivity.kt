package com.example.mad_practical_7_21012021001

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.net.URI

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changeActivity: FloatingActionButton = findViewById(R.id.changeactivity)
        changeActivity.setOnClickListener {
            Intent(this@MainActivity, YoutubeActivity::class.java).also { startActivity(it) }
        }

        val mediaController = MediaController(this)
        val uri:Uri = Uri.parse("android.resource://" + packageName + "/" +R.raw.thestoryoflight)
        val myvideoview =findViewById<VideoView>(R.id.videoView)
            myvideoview.setVideoURI(uri)
            myvideoview.requestFocus()
            myvideoview.start()
    }



}

