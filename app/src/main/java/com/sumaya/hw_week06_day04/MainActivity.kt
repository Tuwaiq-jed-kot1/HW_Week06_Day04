package com.sumaya.hw_week06_day04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var flickrRV:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vm = ViewModelProvider(this).get(MainVM::class.java)

        flickrRV = findViewById(R.id.rvFlickr)
        flickrRV.layoutManager = GridLayoutManager(this,1) // يترك مسافات بين العناصر

        vm.fetchInterestingList().observe(this, {
            flickrRV.adapter = FlickrAdapter(it.videos)
            Log.d("Flicker main Response", it.videos.toString())
        })
    }
}