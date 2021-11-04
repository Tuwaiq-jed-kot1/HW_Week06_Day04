package com.sumaya.hw_week06_day04.UI

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sumaya.hw_week06_day04.Data.VideoData
import com.sumaya.hw_week06_day04.Data.youtyubeV
import com.sumaya.hw_week06_day04.R

class videoAdapter (val vidoeData:List<VideoData>):RecyclerView.Adapter<CustomeHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomeHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.videos_recycle_view,parent,false)
        return CustomeHolder(view)
    }

    override fun onBindViewHolder(holder: CustomeHolder, position: Int) {
       val currentViedos = vidoeData[position]
        holder.imageView.load(currentViedos.imageUrl)
        holder.id.text= currentViedos.id.toString()
        holder.nameofchannel.text = currentViedos.channel.toString()
        holder.vidoeName.text=currentViedos.name
        holder.number.text=currentViedos.numberOfViews.toString()


    }

    override fun getItemCount(): Int {
        return vidoeData.size
    }


}
class CustomeHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val imageView:ImageView = itemView.findViewById(R.id.ivVideos)
    val id : TextView = itemView.findViewById(R.id.id)
    val vidoeName:TextView = itemView.findViewById(R.id.nameOfVideos)
    val nameofchannel:TextView = itemView.findViewById(R.id.nameOfChannel)
    val number :TextView = itemView.findViewById(R.id.NumberOfViewer)

}