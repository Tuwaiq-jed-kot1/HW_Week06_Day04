package com.sumaya.hw_week06_day04

import android.provider.MediaStore
import java.nio.channels.Channel

data  class YouTube_Data(val viedo:List<MediaStore.Video>)


data class Video(val id:Int,

                 val name :String,
                 val link :String,
                 val image_Url:String,
                 val channel : Channel,
                 val num_of_view:Int)



data class YouTube_Channel( val name:String)







