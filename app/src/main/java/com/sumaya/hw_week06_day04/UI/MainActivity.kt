package com.sumaya.hw_week06_day04.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.sumaya.hw_week06_day04.Data.MainMV
import com.sumaya.hw_week06_day04.R

class MainActivity : AppCompatActivity() {
    private lateinit var videosRv:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vm = ViewModelProvider(this).get(MainMV::class.java)


        videosRv=findViewById(R.id.rvVideos)
        videosRv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        vm.fetchIntrestingList().observe(this){
            videosRv.adapter = videoAdapter(it.videos)
            Log.d("Main",it.videos.toString())
        }

    }
}