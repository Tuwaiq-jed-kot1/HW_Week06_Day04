package com.sumaya.hw_week06_day04

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load

class FlickrAdapter(val channelData:List<FlickrData> ) : RecyclerView.Adapter<CustomHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycleview_item,parent,false)
        return CustomHolder(view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val channelTV = channelData[position]
        holder.id.text = channelTV.id.toString()
        holder.nameOfVideo.text = channelTV.name
        holder.imageUrl.load(channelTV.imageUrl)
        holder.nameOfTheChannel.text = channelTV.channel.name
        holder.numberOfviews.text = channelTV.numberOfViews.toString()


    }

    override fun getItemCount(): Int {
        return channelData.size
    }
}

class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
val id : TextView = itemView.findViewById(R.id.txtId)
val nameOfVideo : TextView = itemView.findViewById(R.id.txtNameOfVideo)
val imageUrl : ImageView = itemView.findViewById(R.id.imageView)
var nameOfTheChannel : TextView = itemView.findViewById(R.id.txtChannelName)
var numberOfviews : TextView = itemView.findViewById(R.id.txtNoOfView)

}
