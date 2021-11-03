package com.sumaya.hw_week06_day04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.rv)
        recyclerView.layoutManager= LinearLayoutManager(this)
        val viewModel = ViewModelProvider(this).get(MainVM::class.java)

        viewModel.fetchInterestingList().observe(this, {
            recyclerView.adapter=youtubeAdapter(it.videos)
            Log.d("youtube main response ",it.videos.toString())
        })
    }
}