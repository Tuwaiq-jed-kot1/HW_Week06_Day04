package com.sumaya.hw_week06_day04

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class YoutubeAdapter (val videosData: List<YoutubeAdapter>) : RecyclerView.Adapter<CustomHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.youtube_recyclerview_item, parent, false)
        return CustomHolder(view)
    }
//--------------------------------------------------
    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val video = videosData[position]
//       holder.
//       holder.
//       holder.
//       holder.
//       holder.
    }

    override fun getItemCount(): Int {
        return videosData.size
    }


}
class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

