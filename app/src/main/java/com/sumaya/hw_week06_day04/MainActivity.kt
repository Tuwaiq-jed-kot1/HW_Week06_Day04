package com.sumaya.hw_week06_day04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {
    lateinit var rvRecyclerView: RecyclerView
    //lateinit var yVList: List<YoutubeData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvRecyclerView = findViewById(R.id.rvRecyclerView)
        //rvRecyclerView.setBackgroundColor(Color.RED)
        rvRecyclerView.layoutManager = LinearLayoutManager(this)
        rvRecyclerView.adapter = RVAdapter()
        fetchJson()
    }

    private fun fetchJson() {
        println("Attempting to JSON")

        val url = "https://api.letsbuildthatapp.com/youtube/home_feed"
        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()

        client.newCall(request).enqueue(object: Callback{
            override fun onFailure(call: Call, e: IOException) {
                println("Failed to execute request")
            }
            override fun onResponse(call: Call, response: Response) {
                val body = response.body()?.string()
                println(body)
            }
        })
    }
}