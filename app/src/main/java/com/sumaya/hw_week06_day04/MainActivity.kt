package com.sumaya.hw_week06_day04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    /*
    id, name of video, imageUrl, name of the channel, and numberOfViews.
    */

    private lateinit var txtId : TextView
    private lateinit var txtName : TextView
    private lateinit var imageView: ImageView
    private lateinit var txtNameOfChannel : TextView
    private lateinit var txtNumberOfViews : TextView
    private lateinit var youTubeRV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        youTubeRV = findViewById(R.id.rv_main)
        youTubeRV.layoutManager = LinearLayoutManager(this)
        val mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.fetchVideos().observe(this){
            youTubeRV.adapter = YouTubeAdapter(it.videos)
        }
    }
}