package com.sumaya.hw_week06_day04

import android.provider.MediaStore



data class Channel (
    var name: String

)
    data class YoutubeVideos(
        var id:Int,
        var name:String,
        var link:String,
        var imageUrl:String,
        var channel: Channel ,
        var numberOfViews: Int
    )

data class youtubeData (

    val videos: List<YoutubeVideos>
)
