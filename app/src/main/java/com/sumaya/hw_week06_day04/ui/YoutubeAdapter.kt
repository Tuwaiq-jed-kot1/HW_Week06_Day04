package com.sumaya.hw_week06_day04.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sumaya.hw_week06_day04.R
import com.sumaya.hw_week06_day04.data.models.Videos
import androidx.core.content.ContextCompat.startActivity

import android.content.Intent
import android.net.Uri
import androidx.core.content.ContextCompat


class YoutubeAdapter(val videoData: List<Videos>) : RecyclerView.Adapter<CustomHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycleview_item, parent, false)
        return CustomHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val video = videoData[position]
        holder.nameVideoTV.text ="Video Name: ${video.name}"
        holder.idTV.text = "Id: ${video.id.toString()}"
        holder.numberViewsTV.text = "Number of vies: ${video.numberOfViews.toString()}"
        holder.nameChannalTV.text = "Channal :${video.channel.name}"
        holder.imageIV.load(video.imageUrl)

        holder.imageIV.setOnClickListener {

            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.youtube.com/")
            Toast.makeText(holder.itemView.context,"${holder.idTV.text}" +
                    " ${holder.idTV.text}" +
                    "${holder.nameVideoTV.text}" +
                    "${holder.numberViewsTV.text} ${holder.nameChannalTV.text}",Toast.LENGTH_SHORT).show()
        }

    }




    override fun getItemCount(): Int {
        return videoData.size
    }

}

class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val nameVideoTV: TextView = itemView.findViewById(R.id.nameVideo)
    val idTV: TextView = itemView.findViewById(R.id.id)
    val numberViewsTV: TextView = itemView.findViewById(R.id.numberViews)
    val nameChannalTV: TextView = itemView.findViewById(R.id.nameChannal)
    val imageIV: ImageView = itemView.findViewById(R.id.imageView)
}
