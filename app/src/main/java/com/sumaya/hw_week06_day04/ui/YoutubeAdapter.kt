package com.sumaya.hw_week06_day04.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sumaya.hw_week06_day04.R
import com.sumaya.hw_week06_day04.data.modules.Videos

class YoutubeAdapter(val videosData: List<Videos>) : RecyclerView.Adapter<CustomHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.youtube_recyclerview_item, parent, false)
        return CustomHolder(view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val video = videosData[position]
        holder.id.text = video.id.toString()
        holder.vidName.text = video.name
        holder.channelName.text = video.channel.name
        holder.viewsNum.text = video.numberOfViews.toString()
        holder.img.load(video.imageUrl)

      /*  holder.itemView.setOnClickListener { view ->
            val action
        }*/
    }

    override fun getItemCount(): Int {
       return videosData.size
    }
}


class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val id: TextView = itemView.findViewById(R.id.tvID)
    val vidName: TextView = itemView.findViewById(R.id.tvVidName)
    val channelName: TextView = itemView.findViewById(R.id.tvChannelName)
    val viewsNum: TextView = itemView.findViewById(R.id.tvViewsNum)
    val img: ImageView = itemView.findViewById(R.id.imgUrl)

}


