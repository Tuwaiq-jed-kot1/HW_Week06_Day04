package com.sumaya.hw_week06_day04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.shady.restandretrofit.ui.FlickrAdapter
import com.shady.restandretrofit.ui.MainVM

class MainActivity : AppCompatActivity() {
    private lateinit var YoutubeRV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vm = ViewModelProvider(this).get(MainVM::class.java)

        YoutubeRV = findViewById(R.id.rvYoutube)
        YoutubeRV.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)  //GridLayoutManager(this, 2)

        vm.fetchInterestingList().observe(this, {
            YoutubeRV.adapter = FlickrAdapter(it.videos)
            Log.d("YouTube Main Response", it.videos.toString())
        })
    }
}