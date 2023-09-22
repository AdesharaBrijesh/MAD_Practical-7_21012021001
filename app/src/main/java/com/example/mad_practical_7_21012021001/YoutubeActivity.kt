package com.example.mad_practical_7_21012021001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Website
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val changeActivity: FloatingActionButton = findViewById(R.id.changeactivity)
        changeActivity.setOnClickListener {
            Intent(this@YoutubeActivity, MainActivity::class.java).also { startActivity(it) }
        }

        val youtubeId = "watch?v=jk6thMe6Vq8"
        val webSettings: WebSettings =
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
            .loadUrl("https://www.youtube.com/$youtubeId")
    }
}