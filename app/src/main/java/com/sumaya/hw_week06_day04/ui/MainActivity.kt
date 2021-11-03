package com.sumaya.hw_week06_day04.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.sumaya.hw_week06_day04.R

class MainActivity : AppCompatActivity() {
    private lateinit var RV: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RV=findViewById(R.id.Rv)
        RV.layoutManager= LinearLayoutManager(this)
        val vm = ViewModelProvider(this).get(VMVideos ::class.java)

        vm.fetchIntrestingList().observe(this,{
            RV.adapter=VideoAdapter(it.videos)
            Log.d("youtube main response ",it.videos.toString())
        })
    }
}