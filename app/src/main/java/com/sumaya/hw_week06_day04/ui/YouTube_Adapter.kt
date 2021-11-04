package com.sumaya.hw_week06_day04.ui


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sumaya.hw_week06_day04.R



class YouTube_Adapter(val vediosData: List<YouTubeVideo>) : RecyclerView.Adapter<CustomHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.youtube_recycleview_item, parent, false)
        return CustomHolder(view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val vedios = vediosData[position]
        holder.titleTV.text = vedios.title
        holder.videIV.load(vedios.url)
    }

    override fun getItemCount(): Int {
        return vediosData.size
    }

}

class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleTV: TextView = itemView.findViewById(R.id.tvYoutube)
    val videIV: ImageView = itemView.findViewById(R.id.ivYoutube)
}
