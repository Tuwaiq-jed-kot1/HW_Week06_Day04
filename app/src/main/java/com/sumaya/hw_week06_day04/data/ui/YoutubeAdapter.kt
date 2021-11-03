package com.sumaya.hw_week06_day04.data.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sumaya.hw_week06_day04.R
import com.sumaya.hw_week06_day04.data.models.Videos

class YoutubeAdapter(val videoData : List<Videos> ) : RecyclerView.Adapter<CustomHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item,parent,false)
        return CustomHolder(view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val video = videoData[position]
        holder.nameVideo.text = video.name
        holder.idTV.text = video.id.toString()
        holder.nameChannel.text = video.channel.name
        holder.nameViews.text = video.numberOfViews.toString()
        holder.imageUrl.load(video.imageUrl)
    }

    override fun getItemCount(): Int {
        return videoData.size
    }

}
class CustomHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
    val idTV : TextView = itemView.findViewById(R.id.id)
    val nameChannel : TextView = itemView.findViewById(R.id.name_Of_The_Channel)
    val nameViews : TextView = itemView.findViewById(R.id.number_Of_Views)
    val nameVideo : TextView = itemView.findViewById(R.id.name_Of_Video)
    val imageUrl : ImageView = itemView.findViewById(R.id.image_Url)
}
