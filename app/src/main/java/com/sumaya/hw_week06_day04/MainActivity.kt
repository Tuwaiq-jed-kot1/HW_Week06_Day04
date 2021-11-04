package com.sumaya.hw_week06_day04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var youtubeRV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vm = ViewModelProvider(this).get(MainVM::class.java)

        youtubeRV = findViewById(R.id.rvYoutube)
        youtubeRV.layoutManager = StaggeredGridLayoutManager(2,
            StaggeredGridLayoutManager.VERTICAL)//GridLayoutManager(this, 2)

        vm.fetchInterestingList().observe(this, {
            youtubeRV.adapter = YoutubeAdapter(it.videos.video)
            Log.d("Flickr Main Response", it.videos.toString())
        })
    }
}

