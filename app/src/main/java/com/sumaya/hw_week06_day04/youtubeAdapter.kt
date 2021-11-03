package com.sumaya.hw_week06_day04

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load

class youtubeAdapter (val  vidoeData: List<YoutubeVideos>) : RecyclerView.Adapter<CustomHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {

        val view= LayoutInflater.from(parent.context).inflate(R.layout.video_recycle_info,parent, false,)
        return CustomHolder(view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val video = vidoeData[position]
        holder.id.text = "video id:${video.id}"
        holder.name.text = "video name: ${video.name}"
        holder.chanel.text = "channel name: ${video.channel.name}"
        holder.nView.text = "number of views: ${video.numberOfViews}"
        holder.imageIV.load(video.imageUrl)
    }

    override fun getItemCount(): Int {
        return vidoeData.size
    }

}

class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val id : TextView = itemView.findViewById(R.id.tvId)
    val name : TextView = itemView.findViewById(R.id.tvname)
    val chanel : TextView = itemView.findViewById(R.id.tvChanel)
    val nView : TextView = itemView.findViewById(R.id.tvNumber)
    val imageIV : ImageView = itemView.findViewById(R.id.ivVideo)

}

