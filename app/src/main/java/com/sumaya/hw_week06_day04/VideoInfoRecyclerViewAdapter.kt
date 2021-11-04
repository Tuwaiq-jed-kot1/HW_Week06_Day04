package com.sumaya.hw_week06_day04

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load

class VideoInfoRecyclerViewAdapter(val videoInfo: List<Video>) :
    RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.video_info_recyclerview_item,
            parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val video = videoInfo[position]
        holder.id.text = video.id.toString()
        holder.videoName.text = video.name
        holder.imgUrl.load(video.imageUrl)
        holder.channelName.text = video.channel.name
        holder.numberOfViews.text = video.numberOfViews.toString()

    }

    override fun getItemCount(): Int {
        return videoInfo.size
    }

}

class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val id: TextView = itemView.findViewById(R.id.videoID)
    val videoName: TextView = itemView.findViewById(R.id.videoName)
    val imgUrl: ImageView = itemView.findViewById(R.id.imageURL)
    val channelName: TextView = itemView.findViewById(R.id.channelName)
    val numberOfViews: TextView = itemView.findViewById(R.id.numberOfViews)
}
