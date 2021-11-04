package com.sumaya.hw_week06_day04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.RVVideoInfo)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val vm = ViewModelProvider(this).get(MainViewModel::class.java)

        vm.youTubeInfo().observe(this, {
            recyclerView.adapter = VideoInfoRecyclerViewAdapter(it.videos)
            Log.d("Youtube main Response", it.videos.toString())
        })
    }
}