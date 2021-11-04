package com.shady.restandretrofit.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sumaya.hw_week06_day04.R
import com.sumaya.hw_week06_day04.Videos
import com.sumaya.hw_week06_day04.YoutubeData

class FlickrAdapter(val vidioData: List<Videos>) : RecyclerView.Adapter<CustomHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.youtube_recycleview_item, parent, false)
        return CustomHolder(view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val photo = vidioData[position]
        holder.titleTV.text =photo.name
        holder.imageIV.load(photo.imageUrl)
    }


    override fun getItemCount(): Int {
        return vidioData.size
    }

}

class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleTV: TextView = itemView.findViewById(R.id.tvFlickr)
    val imageIV: ImageView = itemView.findViewById(R.id.ivFlickr)
}
