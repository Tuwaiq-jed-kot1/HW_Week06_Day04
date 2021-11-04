package com.sumaya.hw_week06_day04.UI

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sumaya.hw_week06_day03.data.Videos
import com.sumaya.hw_week06_day04.R

class YoutubeAdapter(val videossData: List<Videos>) : RecyclerView.Adapter<CustomHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.youtube_item_rv,parent, false)
        return CustomHolder(view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val video = videossData[position]
        holder.vidID.text = video.id.toString()
        holder.vidName.text = video.name
        holder.vidChannel.text = "channel ${video.channel.name}"
        holder.vidViews.text = video.numberOfViews.toString()
        holder.vidImage.load(video.imageUrl)

    }

    override fun getItemCount(): Int {
        return videossData.size
    }

}

class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val vidID: TextView= itemView.findViewById(R.id.tvId)
    val vidChannel: TextView= itemView.findViewById(R.id.tvChannel)
    val vidName: TextView= itemView.findViewById(R.id.tvName)
    val vidViews: TextView= itemView.findViewById(R.id.tvViews)
    val vidImage: ImageView= itemView.findViewById(R.id.ivURL)


}
