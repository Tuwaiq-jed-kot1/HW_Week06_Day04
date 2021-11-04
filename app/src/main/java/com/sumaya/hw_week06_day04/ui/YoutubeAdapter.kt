package com.shady.restandretrofit.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.shady.restandretrofit.R
import com.shady.restandretrofit.data.models.Videos

class YoutubeAdapter(val videosData: List<Videos>) : RecyclerView.Adapter<CustomHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.youtube_recycleview_item, parent, false)
        return CustomHolder(view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val video = videosData[position]
        holder.videoID.text = video.id.toString()
        holder.videoName.text = video.name
        holder.channelName.text = video.channel
        holder.numberOfViews.text = video.numberOfViews.toString()
        holder.videoImage.load(video.imageUrl)
    }

    override fun getItemCount(): Int {
        return videosData.size
    }

}

class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val videoID: TextView = itemView.findViewById(R.id.idTV)
    val videoImage: ImageView = itemView.findViewById(R.id.imageURLView)
    val videoName: TextView = itemView.findViewById(R.id.videoNameTV)
    val channelName: TextView = itemView.findViewById(R.id.channelNameTV)
    val numberOfViews: TextView = itemView.findViewById(R.id.numberOfViewsTV)
}
