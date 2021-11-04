package com.sumaya.hw_week06_day04.UI


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.sumaya.hw_week06_day04.R

class MainActivity : AppCompatActivity() {
    private lateinit var youtubeRV: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        youtubeRV= findViewById(R.id.rvYoutube)
        youtubeRV.layoutManager = LinearLayoutManager(this)


        val vm = ViewModelProvider(this).get(MainVM::class.java)
        vm.fetchVideos().observe(this, {
            youtubeRV.adapter= YoutubeAdapter(it.videos)
            Log.d("Youtube main Response", it.videos.toString())
        })

    }
}