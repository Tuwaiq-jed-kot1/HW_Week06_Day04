package com.sumaya.hw_week06_day04

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(private val videoTitles: List<YoutubeData>
                //,private val view: View
                ): RecyclerView.Adapter<VideoAdapter>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoAdapter {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return VideoAdapter(cellForRow)
    }
    override fun onBindViewHolder(holder: VideoAdapter, position: Int) {
        val videoTitle = videoTitles[position]
        videoTitle.videos.video[position].let {
            it.imgUrl = "$position imgUrl"
            it.nameOfChannel="$position NameOfChannel"
            it.videoId = position
            it.videoName = "Name of Video #$position"
            it.numberOfViews = position
        }
    }
    //override fun getItemCount(): Int = itemCount
    override fun getItemCount(): Int = videoTitles.size
}

class VideoAdapter(val itemView: View): RecyclerView.ViewHolder(itemView) {
    val videoTitle:TextView = itemView.findViewById(R.id.videoTitle)
}