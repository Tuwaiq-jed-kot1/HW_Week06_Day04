package com.sumaya.hw_week06_day04

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sumaya.hw_week06_day04.modle.Videos

class RecyclerViewAdapter(val videos: List<Videos>) : RecyclerView.Adapter<CustomeHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomeHolder {
        val view= LayoutInflater.from(parent.context)
            .inflate(R.layout.recycle_view_item,parent,false)

        return CustomeHolder(view)
    }

    override fun onBindViewHolder(holder: CustomeHolder, position: Int) {
val video=videos[position]
        holder.id.text=video.id.toString()
            holder.name.text=video.name
            holder.chanle.text=video.channel.name
            holder.views.text=video.numberOfViews.toString()
            holder.imageView.load(video.imageUrl)
    }

    override fun getItemCount(): Int {
return videos.size
    }

}

class CustomeHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
val id:TextView=itemView.findViewById(R.id.id)
val name:TextView=itemView.findViewById(R.id.name)
val chanle:TextView=itemView.findViewById(R.id.chanle)
val views:TextView=itemView.findViewById(R.id.views)
val imageView:ImageView=itemView.findViewById(R.id.imageView)

}
