package com.sumaya.hw_week06_day04

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sumaya.hw_week06_day04.data.models.Videos

class YouTubeAdapter(private val youTubeDataList: List<Videos>) :
    RecyclerView.Adapter<YouTubeAdapter.CustomHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.video_recycler_item, parent, false)
        return CustomHolder(view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val video = youTubeDataList[position]
        holder.txtId.text =video.id.toString()
        holder.txtName.text =video.name
        holder.imageView.load(video.imageUrl)
        holder.txtNumberOfViews.text =video.numberOfViews.toString()
        holder.txtNameOfChannel.text =video.channel.name
    }

    override fun getItemCount(): Int {
       return youTubeDataList.size
    }

    class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtId: TextView = itemView.findViewById(R.id.tv_id)
        var txtName: TextView = itemView.findViewById(R.id.tv_name)
        var imageView: ImageView = itemView.findViewById(R.id.iv_image)
        var txtNameOfChannel: TextView = itemView.findViewById(R.id.tv_nameOfChannel)
        var txtNumberOfViews: TextView = itemView.findViewById(R.id.tv_numberOfViews)
    }

}
