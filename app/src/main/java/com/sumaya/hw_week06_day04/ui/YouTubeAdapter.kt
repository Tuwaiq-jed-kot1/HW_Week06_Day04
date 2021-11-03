package com.sumaya.hw_week06_day04.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sumaya.hw_week06_day04.R
import com.sumaya.hw_week06_day04.models.Videos

class YouTubeAdapter(val vidsData: List<Videos>) : RecyclerView.Adapter<CustomHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.youtube_recycleview_item,parent,false)

        return CustomHolder(view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val vids = vidsData[position]
        holder.idTV.text= vids.id.toString()
        holder.nameVidTV.text= vids.name
        holder.nameChannelTV.text= vids.channel.name
        holder.viewsNumber.text= vids.numberOfViews.toString()
        holder.imageIV.load(vids.imageUrl)

    }

    override fun getItemCount(): Int {
        return vidsData.size
    }

}

class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val idTV: TextView = itemView.findViewById(R.id.tvId)
    val imageIV: ImageView= itemView.findViewById(R.id.ivImage)
    val nameVidTV: TextView= itemView.findViewById(R.id.tvNameVid)
    val nameChannelTV: TextView= itemView.findViewById(R.id.tvNameChanel)
    val viewsNumber: TextView= itemView.findViewById(R.id.tvNumberViews)

}
