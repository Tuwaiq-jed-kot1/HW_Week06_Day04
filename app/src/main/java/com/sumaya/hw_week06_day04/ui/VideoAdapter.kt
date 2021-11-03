package com.sumaya.hw_week06_day04.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sumaya.hw_week06_day04.R
import com.sumaya.hw_week06_day04.Video

class VideoAdapter(val videos :List<Video>) :RecyclerView.Adapter<CustomHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
val view= LayoutInflater.from(parent.context).inflate(R.layout.youtube_item,parent,false)
        return CustomHolder(view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
    val video= videos[position]
        holder.vId.text="video id:${video.id}"
        holder.vname.text="video name: ${video.name}"
        holder.channelName.text="channel name: ${video.channel.name}"
        holder.numOfViews.text="number of views: ${video.numberOfViews}"
        holder.vImage.load(video.imageUrl)

    }

    override fun getItemCount(): Int {
        return videos.size
    }

}

class CustomHolder(ItemView: View):RecyclerView.ViewHolder(ItemView) {
    val vId :TextView= ItemView.findViewById(R.id.id)
    val vname :TextView= ItemView.findViewById(R.id.nameOfvideo)
    val channelName :TextView= ItemView.findViewById(R.id.nameOfchannel)
    val numOfViews :TextView= ItemView.findViewById(R.id.numOfViews)
    val vImage : ImageView = ItemView.findViewById(R.id.IVimage)
}
