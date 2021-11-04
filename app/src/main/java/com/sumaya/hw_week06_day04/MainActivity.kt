package com.sumaya.hw_week06_day04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sumaya.hw_week06_day04.ui.MainVM
import com.sumaya.hw_week06_day04.ui.YouTubeAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var youTubeRV: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        youTubeRV= findViewById(R.id.rvYouTube)
        youTubeRV.layoutManager= LinearLayoutManager(this)

        val vm = ViewModelProvider(this).get(MainVM::class.java)
        vm.youTubeInfo().observe(this,{
            youTubeRV.adapter= YouTubeAdapter(it.videos)
            Log.d("YouTube Main Response",it.videos.toString())
        })
    }
}