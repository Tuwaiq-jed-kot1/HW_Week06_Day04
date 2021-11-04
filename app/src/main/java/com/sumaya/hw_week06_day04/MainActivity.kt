package com.sumaya.hw_week06_day04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sumaya.hw_week06_day04.modle.MainVM

class MainActivity : AppCompatActivity() {
    private lateinit var youtubeRV: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vm = ViewModelProvider(this).get(MainVM::class.java)

        youtubeRV=findViewById(R.id.recycle)
        youtubeRV.layoutManager = LinearLayoutManager(this)

        vm.fetchInterestingList().observe(this,{
            youtubeRV.adapter = RecyclerViewAdapter(it.videos)
            Log.d("main",it.videos.toString())
        })
    }
}